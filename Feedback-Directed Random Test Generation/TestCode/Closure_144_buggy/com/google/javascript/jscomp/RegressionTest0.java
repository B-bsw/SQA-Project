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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        com.google.javascript.jscomp.DiagnosticType diagnosticType0 = com.google.javascript.jscomp.FunctionTypeBuilder.EXTENDS_NON_OBJECT;
        org.junit.Assert.assertNotNull(diagnosticType0);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
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
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
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
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("hi!", abstractCompiler1, node2, "hi!", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.google.javascript.jscomp.DiagnosticType diagnosticType0 = com.google.javascript.jscomp.FunctionTypeBuilder.EXTENDS_WITHOUT_TYPEDEF;
        org.junit.Assert.assertNotNull(diagnosticType0);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.google.javascript.jscomp.DiagnosticType diagnosticType0 = com.google.javascript.jscomp.FunctionTypeBuilder.IMPLEMENTS_WITHOUT_CONSTRUCTOR;
        org.junit.Assert.assertNotNull(diagnosticType0);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.google.javascript.jscomp.DiagnosticType diagnosticType0 = com.google.javascript.jscomp.TypedScopeCreator.ENUM_INITIALIZER;
        java.lang.Class<?> wildcardClass1 = diagnosticType0.getClass();
        org.junit.Assert.assertNotNull(diagnosticType0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        boolean boolean2 = com.google.javascript.rhino.jstype.JSType.isEquivalent(jSType0, jSType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        int int0 = com.google.javascript.rhino.jstype.JSType.NOT_ENUMDECL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.google.javascript.jscomp.DiagnosticType diagnosticType0 = com.google.javascript.jscomp.FunctionTypeBuilder.OPTIONAL_ARG_AT_END;
        org.junit.Assert.assertNotNull(diagnosticType0);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        int int0 = com.google.javascript.rhino.jstype.JSType.ENUMDECL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("", abstractCompiler1, node2, "", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.google.javascript.jscomp.DiagnosticType diagnosticType0 = com.google.javascript.jscomp.FunctionTypeBuilder.TEMPLATE_TYPE_EXPECTED;
        org.junit.Assert.assertNotNull(diagnosticType0);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.google.javascript.jscomp.DiagnosticType diagnosticType0 = com.google.javascript.jscomp.FunctionTypeBuilder.INEXISTANT_PARAM;
        org.junit.Assert.assertNotNull(diagnosticType0);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = com.google.javascript.jscomp.FunctionTypeBuilder.isFunctionTypeDeclaration(jSDocInfo0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = com.google.javascript.rhino.jstype.ObjectType.cast(jSType0);
        org.junit.Assert.assertNull(objectType1);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.lang.String str0 = com.google.javascript.rhino.jstype.JSType.EMPTY_TYPE_COMPONENT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Named type with empty name component" + "'", str0, "Named type with empty name component");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.google.javascript.jscomp.DiagnosticType diagnosticType0 = com.google.javascript.jscomp.TypedScopeCreator.CONSTRUCTOR_EXPECTED;
        org.junit.Assert.assertNotNull(diagnosticType0);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.lang.String str0 = com.google.javascript.rhino.jstype.JSType.NOT_A_CLASS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Not declared as a constructor" + "'", str0, "Not declared as a constructor");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        java.lang.Class<?> wildcardClass3 = functionBuilder1.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withParams(functionParamBuilder3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.FunctionType functionType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.copyFromOtherFunction(functionType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.lang.String str0 = com.google.javascript.rhino.jstype.JSType.UNKNOWN_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Unknown class name" + "'", str0, "Unknown class name");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("Not declared as a constructor", abstractCompiler1, node2, "", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        java.lang.Class<?> wildcardClass3 = functionBuilder2.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("Not declared as a constructor", abstractCompiler1, node2, "hi!", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType4 = functionBuilder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.lang.String str0 = com.google.javascript.rhino.jstype.JSType.NOT_A_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Not declared as a type name" + "'", str0, "Not declared as a type name");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withName("hi!");
        java.lang.Class<?> wildcardClass7 = functionBuilder2.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder1.withParams(functionParamBuilder5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.google.javascript.jscomp.DiagnosticType diagnosticType0 = com.google.javascript.jscomp.FunctionTypeBuilder.TEMPLATE_TYPE_DUPLICATED;
        org.junit.Assert.assertNotNull(diagnosticType0);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType7 = functionBuilder4.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withName("hi!");
        java.lang.Class<?> wildcardClass13 = functionBuilder12.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.google.javascript.jscomp.DiagnosticType diagnosticType0 = com.google.javascript.jscomp.FunctionTypeBuilder.TYPE_REDEFINITION;
        java.lang.Class<?> wildcardClass1 = diagnosticType0.getClass();
        org.junit.Assert.assertNotNull(diagnosticType0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType2 = functionBuilder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = functionBuilder7.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("", abstractCompiler1, node2, "hi!", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType6 = functionBuilder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("Named type with empty name component", abstractCompiler1, node2, "", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        java.lang.Class<?> wildcardClass5 = functionBuilder4.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder1.withSourceNode(node5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder1.withName("Not declared as a constructor");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType9 = functionBuilder8.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder4.withParams(functionParamBuilder9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withTypeOfThis(objectType9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withReturnType(jSType11);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withParams(functionParamBuilder13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withTemplateName("Named type with empty name component");
        java.lang.Class<?> wildcardClass9 = functionBuilder6.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder4.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder4.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withParams(functionParamBuilder10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withParams(functionParamBuilder3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withReturnType(jSType13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder8.withInferredReturnType(jSType15);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType17 = functionBuilder16.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withName("hi!");
        java.lang.Class<?> wildcardClass13 = functionBuilder8.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.FunctionType functionType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.copyFromOtherFunction(functionType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        java.lang.Class<?> wildcardClass7 = functionBuilder4.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withParams(functionParamBuilder5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        java.lang.Class<?> wildcardClass6 = functionBuilder1.getClass();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        java.lang.Class<?> wildcardClass2 = functionBuilder1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withParams(functionParamBuilder12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("", abstractCompiler1, node2, "Not declared as a constructor", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withTypeOfThis(objectType9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withReturnType(jSType11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withReturnType(jSType13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withReturnType(jSType15);
        java.lang.Class<?> wildcardClass17 = functionBuilder16.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("Named type with empty name component", abstractCompiler1, node2, "Not declared as a constructor", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withParams(functionParamBuilder10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("Unknown class name", abstractCompiler1, node2, "Named type with empty name component", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionType functionType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.copyFromOtherFunction(functionType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withTemplateName("Not declared as a constructor");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType10 = functionBuilder9.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withSourceNode(node3);
        com.google.javascript.rhino.jstype.FunctionType functionType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder1.copyFromOtherFunction(functionType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withName("Not declared as a constructor");
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withSourceNode(node4);
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.copyFromOtherFunction(functionType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder4.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder4.withTypeOfThis(objectType8);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType10 = functionBuilder9.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withSourceNode(node6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withInferredReturnType(jSType10);
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.copyFromOtherFunction(functionType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder6.withParamsNode(node9);
        java.lang.Class<?> wildcardClass11 = functionBuilder6.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType4 = functionBuilder3.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withParamsNode(node3);
        java.lang.Class<?> wildcardClass5 = functionBuilder4.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withParams(functionParamBuilder5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withSourceNode(node3);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder1.withParams(functionParamBuilder5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withTypeOfThis(objectType9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withReturnType(jSType11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withReturnType(jSType13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withReturnType(jSType15);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withParams(functionParamBuilder17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.copyFromOtherFunction(functionType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        java.lang.Class<?> wildcardClass7 = functionBuilder6.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        java.lang.Class<?> wildcardClass8 = functionBuilder7.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withTemplateName("Named type with empty name component");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType10 = functionBuilder9.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withSourceNode(node13);
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.copyFromOtherFunction(functionType15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withInferredReturnType(jSType13);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withParams(functionParamBuilder15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withName("Named type with empty name component");
        java.lang.Class<?> wildcardClass14 = functionBuilder13.getClass();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder8.forConstructor();
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.copyFromOtherFunction(functionType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder8.withParams(functionParamBuilder15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withParamsNode(node3);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType5 = functionBuilder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("Not declared as a type name", abstractCompiler1, node2, "hi!", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.copyFromOtherFunction(functionType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder4.withName("Named type with empty name component");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType11 = functionBuilder4.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder4.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder4.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder9.copyFromOtherFunction(functionType14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder1.withSourceNode(node5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder1.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder1.withTypeOfThis(objectType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.copyFromOtherFunction(functionType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("Not declared as a type name", abstractCompiler1, node2, "Not declared as a type name", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withInferredReturnType(jSType11);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        java.lang.Class<?> wildcardClass13 = functionBuilder12.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withParams(functionParamBuilder9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParams(functionParamBuilder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withName("Named type with empty name component");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder7.withSourceNode(node14);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withParams(functionParamBuilder16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder8.forConstructor();
        java.lang.Class<?> wildcardClass12 = functionBuilder11.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("hi!", abstractCompiler1, node2, "Not declared as a constructor", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder4.withName("Named type with empty name component");
        java.lang.Class<?> wildcardClass11 = functionBuilder10.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("hi!", abstractCompiler1, node2, "Named type with empty name component", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withTemplateName("");
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withReturnType(jSType13);
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.copyFromOtherFunction(functionType15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withParamsNode(node12);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withTypeOfThis(objectType14);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder8.forConstructor();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType14 = functionBuilder13.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withTypeOfThis(objectType9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withReturnType(jSType11);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.copyFromOtherFunction(functionType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        java.lang.Class<?> wildcardClass6 = functionBuilder5.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withReturnType(jSType13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder8.withInferredReturnType(jSType15);
        com.google.javascript.rhino.jstype.FunctionType functionType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.copyFromOtherFunction(functionType17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withParamsNode(node9);
        java.lang.Class<?> wildcardClass11 = functionBuilder10.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withReturnType(jSType12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withSourceNode(node14);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withParams(functionParamBuilder16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withReturnType(jSType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withSourceNode(node10);
        java.lang.Class<?> wildcardClass12 = functionBuilder11.getClass();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("Not declared as a constructor", abstractCompiler1, node2, "Not declared as a constructor", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder4.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder4.withTypeOfThis(objectType8);
        java.lang.Class<?> wildcardClass10 = functionBuilder4.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("Unknown class name", abstractCompiler1, node2, "Not declared as a constructor", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("Unknown class name", abstractCompiler1, node2, "", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withReturnType(jSType10);
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.copyFromOtherFunction(functionType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withReturnType(jSType3);
        java.lang.Class<?> wildcardClass5 = functionBuilder4.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withName("Named type with empty name component");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType14 = functionBuilder7.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder8.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder8.withInferredReturnType(jSType12);
        java.lang.Class<?> wildcardClass14 = functionBuilder13.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withSourceNode(node3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withReturnType(jSType5);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType7 = functionBuilder6.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withSourceNode(node7);
        java.lang.Class<?> wildcardClass9 = functionBuilder4.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("Not declared as a type name", abstractCompiler1, node2, "Not declared as a constructor", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder6.withParamsNode(node9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withParams(functionParamBuilder13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("Not declared as a type name", abstractCompiler1, node2, "", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withName("Named type with empty name component");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder7.withSourceNode(node14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder15.forConstructor();
        java.lang.Class<?> wildcardClass17 = functionBuilder15.getClass();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withInferredReturnType(jSType8);
        java.lang.Class<?> wildcardClass10 = functionBuilder7.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withInferredReturnType(jSType13);
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withTypeOfThis(objectType15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withSourceNode(node17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder16.withReturnType(jSType19);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withTypeOfThis(objectType9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.copyFromOtherFunction(functionType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withSourceNode(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder4.withParamsNode(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withSourceNode(node11);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withParams(functionParamBuilder13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withTemplateName("hi!");
        java.lang.Class<?> wildcardClass17 = functionBuilder16.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withParams(functionParamBuilder8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        java.lang.Class<?> wildcardClass6 = functionBuilder4.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("Not declared as a constructor", abstractCompiler1, node2, "Unknown class name", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder4.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder4.withTypeOfThis(objectType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder4.withParamsNode(node10);
        java.lang.Class<?> wildcardClass12 = functionBuilder4.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("", abstractCompiler1, node2, "Not declared as a type name", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withName("Named type with empty name component");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withSourceNode(node13);
        java.lang.Class<?> wildcardClass15 = functionBuilder14.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder6.forConstructor();
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.copyFromOtherFunction(functionType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder7);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder8.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.forConstructor();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType13 = functionBuilder8.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder4.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder4.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder11.forConstructor();
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.copyFromOtherFunction(functionType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withParams(functionParamBuilder13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("Named type with empty name component", abstractCompiler1, node2, "Named type with empty name component", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParams(functionParamBuilder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder14.forConstructor();
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.copyFromOtherFunction(functionType16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withReturnType(jSType13);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withName("hi!");
        java.lang.Class<?> wildcardClass17 = functionBuilder16.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withSourceNode(node3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder5.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.forConstructor();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder9);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withTemplateName("");
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withReturnType(jSType13);
        java.lang.Class<?> wildcardClass15 = functionBuilder14.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder14.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder14.withTypeOfThis(objectType18);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType20 = functionBuilder19.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("");
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withParams(functionParamBuilder10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        java.lang.Class<?> wildcardClass5 = functionBuilder4.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.copyFromOtherFunction(functionType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withParamsNode(node11);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder10.withParams(functionParamBuilder13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("", abstractCompiler1, node2, "Unknown class name", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withInferredReturnType(jSType15);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType17 = functionBuilder16.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withSourceNode(node3);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType5 = functionBuilder4.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withReturnType(jSType13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder8.withParamsNode(node15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder8.withInferredReturnType(jSType17);
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder8.copyFromOtherFunction(functionType19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withSourceNode(node6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder5.forConstructor();
        java.lang.Class<?> wildcardClass9 = functionBuilder5.getClass();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withSourceNode(node7);
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder6.copyFromOtherFunction(functionType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withName("Named type with empty name component");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder7.withSourceNode(node14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder15.forConstructor();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withParamsNode(node17);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder18.withName("Unknown class name");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType21 = functionBuilder18.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType7 = functionBuilder4.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder8.forConstructor();
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder8.withParams(functionParamBuilder12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withSourceNode(node3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder5.forConstructor();
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder5.copyFromOtherFunction(functionType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder8);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withSourceNode(node12);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withTypeOfThis(objectType14);
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.copyFromOtherFunction(functionType16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withSourceNode(node7);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder4.withTemplateName("Not declared as a type name");
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withName("hi!");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder2.withSourceNode(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder2.withParamsNode(node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder2.copyFromOtherFunction(functionType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withInferredReturnType(jSType13);
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withTypeOfThis(objectType15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withSourceNode(node17);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType19 = functionBuilder18.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withReturnType(jSType13);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType17 = functionBuilder16.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withName("hi!");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder2.withSourceNode(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder2.withParamsNode(node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.copyFromOtherFunction(functionType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder10.withTemplateName("Unknown class name");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType14 = functionBuilder13.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withName("Named type with empty name component");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder7.withSourceNode(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder7.withParamsNode(node16);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder7.withTemplateName("");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType20 = functionBuilder19.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withName("Named type with empty name component");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder7.withSourceNode(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder7.withParamsNode(node16);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withInferredReturnType(jSType20);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType22 = functionBuilder21.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder6.withParamsNode(node9);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType11 = functionBuilder10.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withName("Named type with empty name component");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withParamsNode(node13);
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder12.copyFromOtherFunction(functionType15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder4.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder4.withInferredReturnType(jSType11);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.copyFromOtherFunction(functionType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withReturnType(jSType8);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withTypeOfThis(objectType9);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withTypeOfThis(objectType11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder8.copyFromOtherFunction(functionType15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withTypeOfThis(objectType9);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withTypeOfThis(objectType11);
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withTypeOfThis(objectType13);
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder8.copyFromOtherFunction(functionType15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("hi!", abstractCompiler1, node2, "Unknown class name", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withName("Named type with empty name component");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder7.withSourceNode(node14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder15.forConstructor();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withParamsNode(node17);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder18.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder20.withParams(functionParamBuilder21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withReturnType(jSType12);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType14 = functionBuilder11.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withParams(functionParamBuilder9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("Unknown class name", abstractCompiler1, node2, "Not declared as a type name", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("Unknown class name", abstractCompiler1, node2, "Unknown class name", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        java.lang.Class<?> wildcardClass4 = functionBuilder3.getClass();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withReturnType(jSType8);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder1.copyFromOtherFunction(functionType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withSourceNode(node3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType7 = functionBuilder4.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.copyFromOtherFunction(functionType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("Not declared as a constructor", abstractCompiler1, node2, "Named type with empty name component", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withSourceNode(node13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder8.withInferredReturnType(jSType15);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withName("Named type with empty name component");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder7.withSourceNode(node14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder15.forConstructor();
        com.google.javascript.rhino.jstype.FunctionType functionType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.copyFromOtherFunction(functionType17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("Named type with empty name component", abstractCompiler1, node2, "hi!", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withReturnType(jSType3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withSourceNode(node5);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType7 = functionBuilder6.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.copyFromOtherFunction(functionType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withName("Named type with empty name component");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder7.withSourceNode(node14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder15.forConstructor();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withParamsNode(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder18.copyFromOtherFunction(functionType19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withName("Named type with empty name component");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder7.withSourceNode(node14);
        java.lang.Class<?> wildcardClass16 = functionBuilder15.getClass();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder8.withReturnType(jSType15);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder8.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder8.withParamsNode(node19);
        com.google.javascript.rhino.jstype.FunctionType functionType21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder20.copyFromOtherFunction(functionType21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withInferredReturnType(jSType10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withSourceNode(node12);
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.copyFromOtherFunction(functionType14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withInferredReturnType(jSType8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withInferredReturnType(jSType10);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType12 = functionBuilder7.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder10.withReturnType(jSType12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder10.withTemplateName("Unknown class name");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType16 = functionBuilder15.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withParamsNode(node9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withReturnType(jSType11);
        java.lang.Class<?> wildcardClass13 = functionBuilder12.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withParamsNode(node11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder10.forConstructor();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withParams(functionParamBuilder5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withReturnType(jSType12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withSourceNode(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder13.withParamsNode(node16);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder13.withName("Unknown class name");
        java.lang.Class<?> wildcardClass20 = functionBuilder19.getClass();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withTypeOfThis(objectType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withInferredReturnType(jSType8);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType10 = functionBuilder9.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withName("Named type with empty name component");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder7.withSourceNode(node14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder15.forConstructor();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withParamsNode(node17);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder16.withTemplateName("Named type with empty name component");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withReturnType(jSType3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withSourceNode(node5);
        java.lang.Class<?> wildcardClass7 = functionBuilder2.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withInferredReturnType(jSType13);
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withTypeOfThis(objectType15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withInferredReturnType(jSType17);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType19 = functionBuilder18.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withReturnType(jSType12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withSourceNode(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder13.withParamsNode(node16);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType18 = functionBuilder17.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.copyFromOtherFunction(functionType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withName("Unknown class name");
        java.lang.Class<?> wildcardClass5 = functionBuilder4.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder4.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder4.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withParams(functionParamBuilder12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withParamsNode(node11);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withParams(functionParamBuilder13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder4.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withParams(functionParamBuilder11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withParamsNode(node8);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.copyFromOtherFunction(functionType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withReturnType(jSType13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder8.withParamsNode(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withSourceNode(node17);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType19 = functionBuilder16.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withTemplateName("Not declared as a constructor");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType14 = functionBuilder13.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withSourceNode(node7);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.copyFromOtherFunction(functionType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder14.forConstructor();
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder14.withParams(functionParamBuilder18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withInferredReturnType(jSType11);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withSourceNode(node3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTemplateName("hi!");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withParamsNode(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder5.withSourceNode(node10);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder10.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withTypeOfThis(objectType14);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType16 = functionBuilder13.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withTemplateName("");
        java.lang.Class<?> wildcardClass13 = functionBuilder12.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withParamsNode(node9);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withTypeOfThis(objectType11);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType13 = functionBuilder12.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withSourceNode(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withParamsNode(node15);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType17 = functionBuilder16.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder6.forConstructor();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder9);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder5.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder5.withInferredReturnType(jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder5.withReturnType(jSType9);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder10.withReturnType(jSType12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder10.withTemplateName("Unknown class name");
        java.lang.Class<?> wildcardClass16 = functionBuilder10.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withTypeOfThis(objectType9);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withTypeOfThis(objectType11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.copyFromOtherFunction(functionType15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withName("");
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.copyFromOtherFunction(functionType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withInferredReturnType(jSType13);
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withTypeOfThis(objectType15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withSourceNode(node17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder16.withInferredReturnType(jSType19);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType21 = functionBuilder20.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder8.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder8.withInferredReturnType(jSType12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder13.forConstructor();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder13.withParamsNode(node15);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("hi!", abstractCompiler1, node2, "", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withParamsNode(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withSourceNode(node5);
        java.lang.Class<?> wildcardClass7 = functionBuilder6.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withInferredReturnType(jSType13);
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withTypeOfThis(objectType15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withInferredReturnType(jSType17);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder14.withTemplateName("Not declared as a type name");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType21 = functionBuilder14.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withParams(functionParamBuilder6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withTemplateName("Named type with empty name component");
        java.lang.Class<?> wildcardClass12 = functionBuilder9.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withParamsNode(node5);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType7 = functionBuilder4.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder8.forConstructor();
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.copyFromOtherFunction(functionType14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withReturnType(jSType13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withInferredReturnType(jSType15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withSourceNode(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder14.copyFromOtherFunction(functionType19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("Named type with empty name component", abstractCompiler1, node2, "Unknown class name", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withParamsNode(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withSourceNode(node13);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withTypeOfThis(objectType9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withReturnType(jSType11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withReturnType(jSType13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withReturnType(jSType15);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withTypeOfThis(objectType17);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder16.withTypeOfThis(objectType19);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withName("Unknown class name");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withSourceNode(node13);
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.copyFromOtherFunction(functionType15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withTemplateName("");
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withReturnType(jSType13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder12.withInferredReturnType(jSType15);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withName("hi!");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder2.withSourceNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withSourceNode(node13);
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.copyFromOtherFunction(functionType15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withSourceNode(node3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTemplateName("hi!");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withParamsNode(node8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder5.withInferredReturnType(jSType10);
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.copyFromOtherFunction(functionType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder8.forConstructor();
        java.lang.Class<?> wildcardClass12 = functionBuilder8.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTemplateName("hi!");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withParamsNode(node8);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder5.withParams(functionParamBuilder10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withName("Named type with empty name component");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder7.withSourceNode(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder7.withParamsNode(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withParamsNode(node18);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder17.withReturnType(jSType20);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder17.forConstructor();
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder23 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder24 = functionBuilder17.withParams(functionParamBuilder23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
        org.junit.Assert.assertNotNull(functionBuilder22);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withName("Named type with empty name component");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder7.withSourceNode(node14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withTemplateName("Not declared as a constructor");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder4.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder4.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder13.forConstructor();
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withParams(functionParamBuilder15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.google.javascript.jscomp.DiagnosticType diagnosticType0 = com.google.javascript.jscomp.TypedScopeCreator.MALFORMED_TYPEDEF;
        java.lang.Class<?> wildcardClass1 = diagnosticType0.getClass();
        org.junit.Assert.assertNotNull(diagnosticType0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder8.withReturnType(jSType15);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder8.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder8.withName("Named type with empty name component");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType21 = functionBuilder8.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withTemplateName("");
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withReturnType(jSType13);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType15 = functionBuilder14.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder4.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withTemplateName("Not declared as a type name");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType13 = functionBuilder12.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withTypeOfThis(objectType7);
        java.lang.Class<?> wildcardClass9 = functionBuilder8.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withSourceNode(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withParamsNode(node15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withReturnType(jSType17);
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder18.copyFromOtherFunction(functionType19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withTypeOfThis(objectType9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withReturnType(jSType11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withReturnType(jSType13);
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder12.copyFromOtherFunction(functionType15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withInferredReturnType(jSType13);
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder8.copyFromOtherFunction(functionType15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParams(functionParamBuilder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withTypeOfThis(objectType9);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withTypeOfThis(objectType11);
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withTypeOfThis(objectType13);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder14.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder14.withTypeOfThis(objectType16);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withReturnType(jSType13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withInferredReturnType(jSType15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withSourceNode(node17);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder18.forConstructor();
        java.lang.Class<?> wildcardClass20 = functionBuilder19.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withReturnType(jSType13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withInferredReturnType(jSType15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withSourceNode(node17);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder18.forConstructor();
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder18.withParams(functionParamBuilder20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder19);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withSourceNode(node7);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType9 = functionBuilder8.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withTypeOfThis(objectType9);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withTypeOfThis(objectType11);
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withTypeOfThis(objectType13);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder14.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder14.withReturnType(jSType16);
        java.lang.Class<?> wildcardClass18 = functionBuilder17.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withTypeOfThis(objectType9);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withTypeOfThis(objectType11);
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withTypeOfThis(objectType13);
        java.lang.Class<?> wildcardClass15 = functionBuilder8.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("", abstractCompiler1, node2, "Named type with empty name component", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withTypeOfThis(objectType9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withReturnType(jSType11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withReturnType(jSType13);
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder12.withTypeOfThis(objectType15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withParamsNode(node17);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withInferredReturnType(jSType10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withSourceNode(node12);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withParams(functionParamBuilder14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withInferredReturnType(jSType11);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withParams(functionParamBuilder13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withParamsNode(node8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withReturnType(jSType10);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType12 = functionBuilder9.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withName("Not declared as a type name");
        java.lang.Class<?> wildcardClass15 = functionBuilder8.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder8.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder8.withReturnType(jSType12);
        java.lang.Class<?> wildcardClass14 = functionBuilder13.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withTypeOfThis(objectType9);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withTypeOfThis(objectType11);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType13 = functionBuilder12.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder4.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder4.withInferredReturnType(jSType8);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.copyFromOtherFunction(functionType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withInferredReturnType(jSType13);
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withTypeOfThis(objectType15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withInferredReturnType(jSType17);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder14.withTemplateName("Not declared as a type name");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType21 = functionBuilder20.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder10.copyFromOtherFunction(functionType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withInferredReturnType(jSType15);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder16.forConstructor();
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder16.withSourceNode(node18);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withParamsNode(node11);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType13 = functionBuilder12.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder10.withReturnType(jSType12);
        java.lang.Class<?> wildcardClass14 = functionBuilder13.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("Not declared as a type name", abstractCompiler1, node2, "Named type with empty name component", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder4.withInferredReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder4.withParams(functionParamBuilder11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withTypeOfThis(objectType9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withReturnType(jSType11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withReturnType(jSType13);
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder12.withTypeOfThis(objectType15);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType17 = functionBuilder12.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withSourceNode(node3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withSourceNode(node6);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = functionBuilder5.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder6.withParamsNode(node9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder10.withSourceNode(node12);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder10.withParams(functionParamBuilder14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder8.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder8.withReturnType(jSType12);
        java.lang.Class<?> wildcardClass14 = functionBuilder8.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withReturnType(jSType12);
        java.lang.Class<?> wildcardClass14 = functionBuilder11.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withSourceNode(node7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withTypeOfThis(objectType9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withInferredReturnType(jSType11);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType13 = functionBuilder12.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withReturnType(jSType12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withSourceNode(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder13.withParamsNode(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withParamsNode(node18);
        java.lang.Class<?> wildcardClass20 = functionBuilder17.getClass();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withParamsNode(node8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withReturnType(jSType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder11.forConstructor();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder11.withSourceNode(node13);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType15 = functionBuilder11.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withTemplateName("Unknown class name");
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withName("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withInferredReturnType(jSType13);
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withTypeOfThis(objectType15);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder4.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder4.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder13.forConstructor();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType15 = functionBuilder14.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withInferredReturnType(jSType11);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.copyFromOtherFunction(functionType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withSourceNode(node6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withInferredReturnType(jSType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder7.forConstructor();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withParamsNode(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder12.withParamsNode(node15);
        java.lang.Class<?> wildcardClass17 = functionBuilder12.getClass();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder10.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withTypeOfThis(objectType14);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder13.withParams(functionParamBuilder16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withParams(functionParamBuilder8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder8.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder8.withInferredReturnType(jSType12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withInferredReturnType(jSType14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder13.withInferredReturnType(jSType16);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withName("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder17.withTypeOfThis(objectType20);
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder17.withTypeOfThis(objectType22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder25 = functionBuilder17.withSourceNode(node24);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder27 = functionBuilder25.withParams(functionParamBuilder26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
        org.junit.Assert.assertNotNull(functionBuilder23);
        org.junit.Assert.assertNotNull(functionBuilder25);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withSourceNode(node6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder5.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder5.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.copyFromOtherFunction(functionType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withSourceNode(node13);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder8.withParams(functionParamBuilder15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withParamsNode(node9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withReturnType(jSType11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withInferredReturnType(jSType13);
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.copyFromOtherFunction(functionType15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder6.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.forConstructor();
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder6.withParams(functionParamBuilder9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder8);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        java.lang.Class<?> wildcardClass8 = functionBuilder1.getClass();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("Not declared as a constructor", abstractCompiler1, node2, "Not declared as a type name", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withSourceNode(node3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withName("hi!");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withParamsNode(node7);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType9 = functionBuilder8.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withName("Not declared as a type name");
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withParamsNode(node15);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder16.withName("");
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withReturnType(jSType13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withInferredReturnType(jSType15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withSourceNode(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder18.copyFromOtherFunction(functionType19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder1.withParamsNode(node10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.copyFromOtherFunction(functionType14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withSourceNode(node3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder4.withInferredReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withParams(functionParamBuilder8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder10.withTypeOfThis(objectType12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withInferredReturnType(jSType14);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder4.withTemplateName("hi!");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withParamsNode(node11);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder10.copyFromOtherFunction(functionType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withName("Named type with empty name component");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withParamsNode(node13);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder12.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder12.withSourceNode(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder12.withSourceNode(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder20.withParamsNode(node21);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
        org.junit.Assert.assertNotNull(functionBuilder22);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withName("Named type with empty name component");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder7.withSourceNode(node14);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withTypeOfThis(objectType16);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder17.withSourceNode(node20);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder17.withParams(functionParamBuilder22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withName("Not declared as a type name");
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withParamsNode(node9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withName("hi!");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withSourceNode(node13);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withReturnType(jSType3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withParamsNode(node5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder4.copyFromOtherFunction(functionType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder7);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withSourceNode(node12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder13.forConstructor();
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.copyFromOtherFunction(functionType15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder7.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withTypeOfThis(objectType13);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder8.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder8.withInferredReturnType(jSType12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withInferredReturnType(jSType14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder13.withInferredReturnType(jSType16);
        com.google.javascript.rhino.jstype.FunctionType functionType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.copyFromOtherFunction(functionType18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withSourceNode(node3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder5.forConstructor();
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.copyFromOtherFunction(functionType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder8);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder10.withReturnType(jSType12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder10.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder10.withName("Not declared as a constructor");
        java.lang.Class<?> wildcardClass18 = functionBuilder10.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withName("Named type with empty name component");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder7.withSourceNode(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder7.withParamsNode(node16);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder7.withTemplateName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType20 = functionBuilder19.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withTypeOfThis(objectType11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder12.forConstructor();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withSourceNode(node14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder13.withReturnType(jSType16);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType18 = functionBuilder13.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withTypeOfThis(objectType9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withReturnType(jSType11);
        java.lang.Class<?> wildcardClass13 = functionBuilder12.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder6.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder6.withSourceNode(node11);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder6.copyFromOtherFunction(functionType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder9.forConstructor();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder9.withParamsNode(node11);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType13 = functionBuilder12.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withSourceNode(node6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withInferredReturnType(jSType10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withTypeOfThis(objectType12);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder4.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder4.withTypeOfThis(objectType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withSourceNode(node10);
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.copyFromOtherFunction(functionType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withReturnType(jSType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withSourceNode(node6);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = functionBuilder5.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withParamsNode(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder3.withSourceNode(node10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder3.withTypeOfThis(objectType12);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withParams(functionParamBuilder14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withReturnType(jSType7);
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.copyFromOtherFunction(functionType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withReturnType(jSType3);
        java.lang.Class<?> wildcardClass5 = functionBuilder2.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withReturnType(jSType7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withParamsNode(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withParamsNode(node11);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder10.copyFromOtherFunction(functionType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withSourceNode(node7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withTypeOfThis(objectType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder12.withParams(functionParamBuilder15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder10.withName("Named type with empty name component");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType14 = functionBuilder13.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder8.withReturnType(jSType15);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder8.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder8.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionType functionType21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder20.copyFromOtherFunction(functionType21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder4.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder4.withInferredReturnType(jSType11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder4.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.copyFromOtherFunction(functionType15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder9.forConstructor();
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder9.copyFromOtherFunction(functionType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder10);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withSourceNode(node3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTemplateName("hi!");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withParamsNode(node8);
        java.lang.Class<?> wildcardClass10 = functionBuilder5.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder5.forConstructor();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withParamsNode(node9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withName("Not declared as a constructor");
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder8.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder8.withInferredReturnType(jSType12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withInferredReturnType(jSType14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder13.withInferredReturnType(jSType16);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withName("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder17.withTypeOfThis(objectType20);
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder17.withTypeOfThis(objectType22);
        java.lang.Class<?> wildcardClass24 = functionBuilder17.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
        org.junit.Assert.assertNotNull(functionBuilder23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.copyFromOtherFunction(functionType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder13.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withTypeOfThis(objectType15);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder16.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder16.withInferredReturnType(jSType18);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withSourceNode(node6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder5.forConstructor();
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder5.copyFromOtherFunction(functionType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder8);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withReturnType(jSType13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder8.withParamsNode(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withSourceNode(node17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder18.withInferredReturnType(jSType19);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType21 = functionBuilder18.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withInferredReturnType(jSType4);
        java.lang.Class<?> wildcardClass6 = functionBuilder3.getClass();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withReturnType(jSType12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withSourceNode(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder13.withParamsNode(node16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder13.withReturnType(jSType18);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType20 = functionBuilder19.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withSourceNode(node3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder1.withInferredReturnType(jSType5);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder10.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withTypeOfThis(objectType14);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType16 = functionBuilder15.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder1.withSourceNode(node5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder1.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.copyFromOtherFunction(functionType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder4.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder4.withTypeOfThis(objectType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder4.withParamsNode(node10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTypeOfThis(objectType12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withSourceNode(node14);
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.copyFromOtherFunction(functionType16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withReturnType(jSType12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withSourceNode(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder13.withParamsNode(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withParamsNode(node18);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder21.withTemplateName("Unknown class name");
        java.lang.Class<?> wildcardClass24 = functionBuilder21.getClass();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
        org.junit.Assert.assertNotNull(functionBuilder23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withReturnType(jSType12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withReturnType(jSType14);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType16 = functionBuilder11.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withParamsNode(node11);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder10.copyFromOtherFunction(functionType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withReturnType(jSType7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withParamsNode(node9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withInferredReturnType(jSType11);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withParams(functionParamBuilder13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withTypeOfThis(objectType11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withParamsNode(node13);
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.copyFromOtherFunction(functionType15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.copyFromOtherFunction(functionType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.copyFromOtherFunction(functionType14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder5.forConstructor();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withParamsNode(node9);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withParams(functionParamBuilder11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withTypeOfThis(objectType11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder12.forConstructor();
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.copyFromOtherFunction(functionType14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder4.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder4.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder4.withParams(functionParamBuilder11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder10);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withTypeOfThis(objectType9);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withTypeOfThis(objectType11);
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withTypeOfThis(objectType13);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder14.forConstructor();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder14.withParamsNode(node16);
        java.lang.Class<?> wildcardClass18 = functionBuilder14.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("Not declared as a type name", abstractCompiler1, node2, "Unknown class name", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder8.forConstructor();
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withParams(functionParamBuilder14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withReturnType(jSType13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder8.withInferredReturnType(jSType15);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withParams(functionParamBuilder17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withSourceNode(node7);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder6.withTemplateName("");
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder6.withInferredReturnType(jSType11);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withReturnType(jSType13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder8.withParamsNode(node15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder8.withInferredReturnType(jSType17);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder8.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder20.withParams(functionParamBuilder21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withTypeOfThis(objectType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withParamsNode(node11);
        java.lang.Class<?> wildcardClass13 = functionBuilder10.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withInferredReturnType(jSType10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withTypeOfThis(objectType12);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType14 = functionBuilder13.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withTemplateName("Not declared as a type name");
        java.lang.Class<?> wildcardClass15 = functionBuilder12.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withSourceNode(node6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withInferredReturnType(jSType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder7.forConstructor();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withParamsNode(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder12.withParamsNode(node15);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder12.withTypeOfThis(objectType17);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withSourceNode(node3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTemplateName("hi!");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withParamsNode(node8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder5.withInferredReturnType(jSType10);
        java.lang.Class<?> wildcardClass12 = functionBuilder5.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder8.withReturnType(jSType15);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder8.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder8.withParamsNode(node19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder20.withInferredReturnType(jSType21);
        com.google.javascript.rhino.jstype.FunctionType functionType23 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder24 = functionBuilder22.copyFromOtherFunction(functionType23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
        org.junit.Assert.assertNotNull(functionBuilder22);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder6.withParamsNode(node9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder6.withName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withName("Unknown class name");
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withName("Named type with empty name component");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder7.withSourceNode(node14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withReturnType(jSType16);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = functionBuilder7.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withInferredReturnType(jSType10);
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.copyFromOtherFunction(functionType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withSourceNode(node6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withName("Named type with empty name component");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType10 = functionBuilder5.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder6.withInferredReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder6.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withSourceNode(node13);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withTypeOfThis(objectType9);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withTypeOfThis(objectType11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withName("Not declared as a constructor");
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withInferredReturnType(jSType10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTypeOfThis(objectType12);
        java.lang.Class<?> wildcardClass14 = functionBuilder11.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withParamsNode(node7);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder4.withParams(functionParamBuilder9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        java.lang.Class<?> wildcardClass6 = functionBuilder3.getClass();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withParamsNode(node12);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType14 = functionBuilder13.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withReturnType(jSType11);
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withTypeOfThis(objectType13);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder4.withName("Not declared as a type name");
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder8.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder8.withReturnType(jSType14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withReturnType(jSType16);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withTypeOfThis(objectType18);
        java.lang.Class<?> wildcardClass20 = functionBuilder19.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withReturnType(jSType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTemplateName("Not declared as a type name");
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.Scope scope4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionTypeBuilder functionTypeBuilder5 = new com.google.javascript.jscomp.FunctionTypeBuilder("Unknown class name", abstractCompiler1, node2, "hi!", scope4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withName("Named type with empty name component");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withSourceNode(node13);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType15 = functionBuilder12.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withName("hi!");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder2.withSourceNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        java.lang.Class<?> wildcardClass13 = functionBuilder8.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder4.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder4.withTypeOfThis(objectType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder4.withParamsNode(node10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTypeOfThis(objectType12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withSourceNode(node14);
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder11.copyFromOtherFunction(functionType16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withName("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withInferredReturnType(jSType13);
        java.lang.Class<?> wildcardClass15 = functionBuilder14.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        java.lang.Class<?> wildcardClass11 = functionBuilder10.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withParamsNode(node12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder11.forConstructor();
        java.lang.Class<?> wildcardClass15 = functionBuilder14.getClass();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withTypeOfThis(objectType9);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withTypeOfThis(objectType11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder12.withParams(functionParamBuilder15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder4.withInferredReturnType(jSType9);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType11 = functionBuilder10.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withReturnType(jSType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withSourceNode(node6);
        java.lang.Class<?> wildcardClass8 = functionBuilder5.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder4.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withInferredReturnType(jSType11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder10.withInferredReturnType(jSType13);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withTypeOfThis(objectType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withParamsNode(node11);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType13 = functionBuilder12.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder11.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder12.forConstructor();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withSourceNode(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder4.withParamsNode(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withSourceNode(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withSourceNode(node13);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionType functionType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.copyFromOtherFunction(functionType17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder4.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder4.withTypeOfThis(objectType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder4.withParamsNode(node10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTypeOfThis(objectType12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withParamsNode(node14);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType16 = functionBuilder15.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withInferredReturnType(jSType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withName("");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withParamsNode(node14);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withSourceNode(node3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTemplateName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = functionBuilder7.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withInferredReturnType(jSType12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withParamsNode(node14);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withSourceNode(node6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withInferredReturnType(jSType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder7.forConstructor();
        java.lang.Class<?> wildcardClass13 = functionBuilder12.getClass();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withInferredReturnType(jSType10);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withParams(functionParamBuilder12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withSourceNode(node12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder13.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withTemplateName("");
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withSourceNode(node17);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder1.withSourceNode(node5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder1.withName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder1.copyFromOtherFunction(functionType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder5.forConstructor();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType9 = functionBuilder5.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder8);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withSourceNode(node6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder5.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder5.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder5.withReturnType(jSType11);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withName("Named type with empty name component");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder7.withSourceNode(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder7.withParamsNode(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withParamsNode(node18);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withParams(functionParamBuilder20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withName("Named type with empty name component");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withParamsNode(node13);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType15 = functionBuilder12.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType13 = functionBuilder8.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withName("Named type with empty name component");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withParamsNode(node13);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder12.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder12.withSourceNode(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder12.withSourceNode(node19);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder12.withName("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder24 = functionBuilder22.withTypeOfThis(objectType23);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
        org.junit.Assert.assertNotNull(functionBuilder22);
        org.junit.Assert.assertNotNull(functionBuilder24);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withName("hi!");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder2.withSourceNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withSourceNode(node13);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionType functionType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.copyFromOtherFunction(functionType17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder9.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder9.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder12.forConstructor();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder5.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder5.withInferredReturnType(jSType7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder5.withSourceNode(node9);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withReturnType(jSType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withParams(functionParamBuilder6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withSourceNode(node12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder13.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withTemplateName("Not declared as a constructor");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder4.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder4.withTypeOfThis(objectType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withSourceNode(node10);
        java.lang.Class<?> wildcardClass12 = functionBuilder11.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder10.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withTypeOfThis(objectType14);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withTypeOfThis(objectType9);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withTypeOfThis(objectType11);
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withTypeOfThis(objectType13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder8.withInferredReturnType(jSType15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withSourceNode(node17);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder18.withParams(functionParamBuilder19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withTypeOfThis(objectType11);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withParams(functionParamBuilder13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder10.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder10.copyFromOtherFunction(functionType14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withInferredReturnType(jSType10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withTypeOfThis(objectType12);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withName("Named type with empty name component");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withParamsNode(node13);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder12.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder12.withParams(functionParamBuilder17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder4.withReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder4.withParamsNode(node11);
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withTypeOfThis(objectType13);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder9.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withParams(functionParamBuilder13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder10.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withTypeOfThis(objectType14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder13.withInferredReturnType(jSType16);
        java.lang.Class<?> wildcardClass18 = functionBuilder17.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder4.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder4.withTypeOfThis(objectType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder4.withParamsNode(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder4.withSourceNode(node12);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType14 = functionBuilder4.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder1.withSourceNode(node5);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder1.withInferredReturnType(jSType7);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType7 = functionBuilder6.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withInferredReturnType(jSType4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withParamsNode(node6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder7.forConstructor();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder8);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withSourceNode(node7);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withName("Not declared as a type name");
        java.lang.Class<?> wildcardClass11 = functionBuilder10.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder5.withParams(functionParamBuilder10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder8.forConstructor();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder4.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder4.withInferredReturnType(jSType11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder4.withTemplateName("");
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withReturnType(jSType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.copyFromOtherFunction(functionType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withName("hi!");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder2.withSourceNode(node7);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder2.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder2.withTemplateName("");
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withReturnType(jSType13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder8.withParamsNode(node15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder8.withInferredReturnType(jSType17);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder8.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder20.withTypeOfThis(objectType21);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder24 = functionBuilder20.withReturnType(jSType23);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
        org.junit.Assert.assertNotNull(functionBuilder22);
        org.junit.Assert.assertNotNull(functionBuilder24);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withName("Named type with empty name component");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder7.withSourceNode(node14);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withTypeOfThis(objectType16);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder17.withSourceNode(node20);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder21.withReturnType(jSType22);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder25 = functionBuilder23.withName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType26 = functionBuilder23.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
        org.junit.Assert.assertNotNull(functionBuilder23);
        org.junit.Assert.assertNotNull(functionBuilder25);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.copyFromOtherFunction(functionType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withName("Named type with empty name component");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withParamsNode(node13);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder12.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder12.withSourceNode(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder12.withSourceNode(node19);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder12.withName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType23 = functionBuilder12.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
        org.junit.Assert.assertNotNull(functionBuilder22);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withParamsNode(node9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withReturnType(jSType11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withInferredReturnType(jSType13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder12.withInferredReturnType(jSType15);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder12.withParams(functionParamBuilder17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder1.withSourceNode(node5);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType7 = functionBuilder6.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder6.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder6.withSourceNode(node11);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType13 = functionBuilder12.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withInferredReturnType(jSType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withName("");
        java.lang.Class<?> wildcardClass14 = functionBuilder13.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withName("Named type with empty name component");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder7.withSourceNode(node14);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withTypeOfThis(objectType16);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder17.withSourceNode(node20);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder21.withReturnType(jSType22);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder25 = functionBuilder23.withName("hi!");
        java.lang.Class<?> wildcardClass26 = functionBuilder25.getClass();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
        org.junit.Assert.assertNotNull(functionBuilder23);
        org.junit.Assert.assertNotNull(functionBuilder25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withTemplateName("Not declared as a constructor");
        java.lang.Class<?> wildcardClass12 = functionBuilder11.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder10.forConstructor();
        java.lang.Class<?> wildcardClass12 = functionBuilder11.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withName("Named type with empty name component");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder7.withSourceNode(node14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder15.forConstructor();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withParamsNode(node17);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder18.withTemplateName("");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType21 = functionBuilder20.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withSourceNode(node7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withTypeOfThis(objectType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withTemplateName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType15 = functionBuilder12.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withSourceNode(node5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder4.forConstructor();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder7);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder1.withParamsNode(node10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTemplateName("Not declared as a constructor");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType14 = functionBuilder13.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withName("Named type with empty name component");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withParamsNode(node13);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder12.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder12.withSourceNode(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder12.withSourceNode(node19);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder12.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder23 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder24 = functionBuilder12.withParams(functionParamBuilder23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
        org.junit.Assert.assertNotNull(functionBuilder22);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withInferredReturnType(jSType13);
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withTypeOfThis(objectType15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withInferredReturnType(jSType17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder18.withParamsNode(node19);
        java.lang.Class<?> wildcardClass21 = functionBuilder20.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withInferredReturnType(jSType11);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType13 = functionBuilder12.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder1.withParamsNode(node10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withTemplateName("Not declared as a type name");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withTypeOfThis(objectType9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withReturnType(jSType11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withReturnType(jSType13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withReturnType(jSType15);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withTypeOfThis(objectType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder16.withInferredReturnType(jSType19);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder16.withName("");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType23 = functionBuilder16.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
        org.junit.Assert.assertNotNull(functionBuilder22);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder4.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withInferredReturnType(jSType11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder10.withReturnType(jSType13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withInferredReturnType(jSType15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withSourceNode(node17);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType19 = functionBuilder18.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder7.withInferredReturnType(jSType14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withInferredReturnType(jSType16);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder15.withName("Named type with empty name component");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withName("hi!");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder2.withSourceNode(node7);
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder2.copyFromOtherFunction(functionType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTemplateName("Named type with empty name component");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType14 = functionBuilder13.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder4.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withInferredReturnType(jSType11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder10.withName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder10.withTemplateName("hi!");
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder4.withSourceNode(node9);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder4.withTypeOfThis(objectType11);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder1.withSourceNode(node5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder1.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder1.withTemplateName("Not declared as a constructor");
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder6.withInferredReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withTemplateName("hi!");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withSourceNode(node13);
        java.lang.Class<?> wildcardClass15 = functionBuilder12.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withTypeOfThis(objectType5);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType7 = functionBuilder2.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withInferredReturnType(jSType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType16 = functionBuilder13.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder1.withSourceNode(node5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder1.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder1.withTypeOfThis(objectType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder1.withName("Named type with empty name component");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType13 = functionBuilder12.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder9.forConstructor();
        java.lang.Class<?> wildcardClass11 = functionBuilder9.getClass();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withInferredReturnType(jSType15);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder16.forConstructor();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType18 = functionBuilder17.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withSourceNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withSourceNode(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withParamsNode(node13);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder14.forConstructor();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder4.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withParamsNode(node11);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withParams(functionParamBuilder13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder1.withParamsNode(node10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder13.withTemplateName("Not declared as a constructor");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withInferredReturnType(jSType7);
        java.lang.Class<?> wildcardClass9 = functionBuilder8.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder12.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder12.withName("Named type with empty name component");
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder12.withParamsNode(node19);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder8.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder8.withReturnType(jSType14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder15.withTypeOfThis(objectType18);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withName("Not declared as a constructor");
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder4.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withInferredReturnType(jSType11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder10.withReturnType(jSType13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withInferredReturnType(jSType15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withReturnType(jSType17);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder6.withInferredReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withTemplateName("hi!");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withSourceNode(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withParamsNode(node15);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withName("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withInferredReturnType(jSType13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder8.withParamsNode(node15);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder4.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder4.withTemplateName("");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder4.withParamsNode(node10);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder4.withParams(functionParamBuilder12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withSourceNode(node12);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withParams(functionParamBuilder14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder6.withInferredReturnType(jSType9);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType11 = functionBuilder10.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withTypeOfThis(objectType9);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withTypeOfThis(objectType11);
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withTypeOfThis(objectType13);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder14.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withReturnType(jSType16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withReturnType(jSType18);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder8.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder8.withInferredReturnType(jSType12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder13.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.forConstructor();
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder13.copyFromOtherFunction(functionType16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withReturnType(jSType13);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder8.withName("Named type with empty name component");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType17 = functionBuilder8.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder4.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder4.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder4.withName("Not declared as a type name");
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder5.forConstructor();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder8);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder3.forConstructor();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType11 = functionBuilder3.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder10);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withInferredReturnType(jSType12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withSourceNode(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder11.withSourceNode(node16);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder11.forConstructor();
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder11.withParamsNode(node19);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withReturnType(jSType12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder13.forConstructor();
        java.lang.Class<?> wildcardClass15 = functionBuilder14.getClass();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder7.forConstructor();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder8);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withSourceNode(node7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder4.withTypeOfThis(objectType9);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType11 = functionBuilder10.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder8.withReturnType(jSType15);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder8.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder8.withName("Not declared as a constructor");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType21 = functionBuilder20.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withTypeOfThis(objectType9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withReturnType(jSType11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withReturnType(jSType13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withReturnType(jSType15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withSourceNode(node17);
        java.lang.Class<?> wildcardClass19 = functionBuilder14.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withParamsNode(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withSourceNode(node13);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder5.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder5.withInferredReturnType(jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder5.withInferredReturnType(jSType9);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withSourceNode(node12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder13.forConstructor();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder13.withParamsNode(node15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withReturnType(jSType17);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withSourceNode(node3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.copyFromOtherFunction(functionType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder1.withSourceNode(node5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder1.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder1.withTypeOfThis(objectType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder1.forConstructor();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder10.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withTemplateName("");
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder8.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder8.withInferredReturnType(jSType12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withInferredReturnType(jSType14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder13.withInferredReturnType(jSType16);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withName("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder17.withTypeOfThis(objectType20);
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder17.withTypeOfThis(objectType22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder25 = functionBuilder17.withSourceNode(node24);
        com.google.javascript.rhino.jstype.FunctionType functionType26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder27 = functionBuilder17.copyFromOtherFunction(functionType26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
        org.junit.Assert.assertNotNull(functionBuilder23);
        org.junit.Assert.assertNotNull(functionBuilder25);
    }
}

