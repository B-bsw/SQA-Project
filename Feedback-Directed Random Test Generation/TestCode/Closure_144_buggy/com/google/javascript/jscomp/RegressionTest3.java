package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder18.withParamsNode(node19);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder18.withTemplateName("hi!");
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
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withTemplateName("");
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withReturnType(jSType13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder12.withParamsNode(node15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder12.withInferredReturnType(jSType17);
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
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withName("Not declared as a type name");
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder12.withParamsNode(node15);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder13.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder13.withTypeOfThis(objectType15);
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
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withInferredReturnType(jSType17);
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder16.copyFromOtherFunction(functionType19);
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
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
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
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withParamsNode(node13);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withTemplateName("hi!");
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder14.withSourceNode(node19);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder14.withTemplateName("");
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
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder21.withReturnType(jSType22);
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
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder17.withParamsNode(node20);
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
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withSourceNode(node3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder4.withInferredReturnType(jSType6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder4.withReturnType(jSType8);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder13.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder13.withTypeOfThis(objectType17);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder9.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder9.withTypeOfThis(objectType11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.forConstructor();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withParamsNode(node14);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder8.withName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withName("");
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
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.forConstructor();
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder18.withParamsNode(node19);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withTypeOfThis(objectType9);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withTypeOfThis(objectType11);
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
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
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
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder17.withReturnType(jSType22);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder25 = functionBuilder17.withTypeOfThis(objectType24);
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
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder6.withReturnType(jSType9);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
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
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder18.withSourceNode(node21);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder24 = functionBuilder18.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType25 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder26 = functionBuilder24.withTypeOfThis(objectType25);
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
        org.junit.Assert.assertNotNull(functionBuilder26);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
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
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withParamsNode(node16);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder15.withParams(functionParamBuilder18);
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
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withReturnType(jSType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withReturnType(jSType6);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withParamsNode(node20);
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
        org.junit.Assert.assertNotNull(functionBuilder21);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
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
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder24 = functionBuilder17.withSourceNode(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder26 = functionBuilder24.withParamsNode(node25);
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
        org.junit.Assert.assertNotNull(functionBuilder24);
        org.junit.Assert.assertNotNull(functionBuilder26);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
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
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder10.withReturnType(jSType13);
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
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder18.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withTypeOfThis(objectType20);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder21.withName("");
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder25 = functionBuilder23.withParamsNode(node24);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder27 = functionBuilder25.withInferredReturnType(jSType26);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder29 = functionBuilder27.withInferredReturnType(jSType28);
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
        org.junit.Assert.assertNotNull(functionBuilder21);
        org.junit.Assert.assertNotNull(functionBuilder23);
        org.junit.Assert.assertNotNull(functionBuilder25);
        org.junit.Assert.assertNotNull(functionBuilder27);
        org.junit.Assert.assertNotNull(functionBuilder29);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withSourceNode(node3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTemplateName("hi!");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withSourceNode(node8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder5.withTemplateName("");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withSourceNode(node12);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
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
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withInferredReturnType(jSType12);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder1.withSourceNode(node5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
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
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder13.withTypeOfThis(objectType18);
        java.lang.Class<?> wildcardClass20 = functionBuilder13.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
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
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withReturnType(jSType12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withInferredReturnType(jSType14);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder13.withTypeOfThis(objectType16);
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
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
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
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder10.withSourceNode(node13);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder10.withParams(functionParamBuilder15);
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
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
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
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder7.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withName("hi!");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
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
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withName("");
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder9.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withTypeOfThis(objectType15);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withTypeOfThis(objectType17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder14.withParamsNode(node19);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder20.forConstructor();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
        org.junit.Assert.assertNotNull(functionBuilder21);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withSourceNode(node6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder7.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withInferredReturnType(jSType11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder10.withParamsNode(node13);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withName("hi!");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withSourceNode(node17);
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
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withReturnType(jSType5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTemplateName("");
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder4.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder4.withInferredReturnType(jSType11);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withInferredReturnType(jSType6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withParamsNode(node8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder7.forConstructor();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder10);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withReturnType(jSType12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withReturnType(jSType14);
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
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder4.withSourceNode(node13);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder3.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withTypeOfThis(objectType11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder10.withReturnType(jSType13);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder10.withParams(functionParamBuilder15);
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
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder6.forConstructor();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withParamsNode(node8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withReturnType(jSType10);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
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
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder18.withReturnType(jSType19);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder20.withTemplateName("Unknown class name");
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
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
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
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withParamsNode(node13);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder18.withName("");
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder18.withParamsNode(node21);
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
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder18.withTemplateName("");
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder18.withParamsNode(node21);
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
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder5.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder5.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder5.withName("Not declared as a constructor");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder5.withParamsNode(node11);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
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
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder18.withTypeOfThis(objectType21);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder24 = functionBuilder22.withInferredReturnType(jSType23);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder25 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder26 = functionBuilder22.withParams(functionParamBuilder25);
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
        org.junit.Assert.assertNotNull(functionBuilder22);
        org.junit.Assert.assertNotNull(functionBuilder24);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
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
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withReturnType(jSType14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withInferredReturnType(jSType16);
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
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
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
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder9.withSourceNode(node14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder15.forConstructor();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withParamsNode(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder18.withParamsNode(node19);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
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
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withReturnType(jSType14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder13.forConstructor();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withTypeOfThis(objectType15);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType17 = functionBuilder16.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder1.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withParamsNode(node13);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withTypeOfThis(objectType15);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withTemplateName("Not declared as a constructor");
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
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder6.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.forConstructor();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder6.withSourceNode(node9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder6.withReturnType(jSType11);
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder6.withTypeOfThis(objectType13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withParamsNode(node15);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder16.forConstructor();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
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
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder21.withReturnType(jSType22);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder25 = functionBuilder21.withName("Not declared as a constructor");
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
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
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
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withName("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder2.withTypeOfThis(objectType7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder2.withParamsNode(node9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder10.withName("hi!");
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withReturnType(jSType20);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder19.withInferredReturnType(jSType22);
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
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withSourceNode(node3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder5.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withTypeOfThis(objectType9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withInferredReturnType(jSType11);
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
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
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
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withTypeOfThis(objectType20);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder19.withInferredReturnType(jSType22);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder24 = functionBuilder19.forConstructor();
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
        org.junit.Assert.assertNotNull(functionBuilder24);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
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
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder24 = functionBuilder16.withInferredReturnType(jSType23);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder26 = functionBuilder16.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder28 = functionBuilder26.withReturnType(jSType27);
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
        org.junit.Assert.assertNotNull(functionBuilder26);
        org.junit.Assert.assertNotNull(functionBuilder28);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withTemplateName("");
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder11.withInferredReturnType(jSType16);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withName("Not declared as a type name");
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
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
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
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withTypeOfThis(objectType11);
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
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder11.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withInferredReturnType(jSType13);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder12.forConstructor();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
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
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withTypeOfThis(objectType13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder12.withSourceNode(node15);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withTypeOfThis(objectType17);
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
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withSourceNode(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withParamsNode(node8);
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
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withSourceNode(node12);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
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
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
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
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withTypeOfThis(objectType20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder19.withSourceNode(node22);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder25 = functionBuilder19.withParams(functionParamBuilder24);
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
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
        org.junit.Assert.assertNotNull(functionBuilder23);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
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
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withSourceNode(node15);
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
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
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
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder16.withParams(functionParamBuilder19);
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
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
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
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withTypeOfThis(objectType20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder21.withSourceNode(node22);
        java.lang.Class<?> wildcardClass24 = functionBuilder21.getClass();
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
        org.junit.Assert.assertNotNull(functionBuilder21);
        org.junit.Assert.assertNotNull(functionBuilder23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withName("");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withReturnType(jSType17);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder18.forConstructor();
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
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
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
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withSourceNode(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder9.withSourceNode(node14);
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
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withSourceNode(node3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder5.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withTypeOfThis(objectType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder10.withReturnType(jSType13);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withInferredReturnType(jSType14);
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
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withName("");
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder14.withReturnType(jSType19);
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
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withName("");
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
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder4.withParamsNode(node8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.copyFromOtherFunction(functionType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withTemplateName("Not declared as a constructor");
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
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
        java.lang.Class<?> wildcardClass18 = functionBuilder15.getClass();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder8.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withTemplateName("Not declared as a constructor");
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder6.forConstructor();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withParamsNode(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withSourceNode(node10);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withReturnType(jSType15);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withTemplateName("Unknown class name");
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder18.withParamsNode(node19);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder20.withTemplateName("");
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
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
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
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withParamsNode(node13);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withTemplateName("");
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withTypeOfThis(objectType17);
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
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder24 = functionBuilder16.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.ObjectType objectType25 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder26 = functionBuilder24.withTypeOfThis(objectType25);
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
        org.junit.Assert.assertNotNull(functionBuilder26);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withName("hi!");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder2.withSourceNode(node7);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder2.withName("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withTypeOfThis(objectType11);
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withTypeOfThis(objectType13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder12.withReturnType(jSType15);
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
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder7.forConstructor();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder8);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
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
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withSourceNode(node16);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withName("Not declared as a constructor");
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
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withSourceNode(node6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder5.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withTypeOfThis(objectType11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withTemplateName("Not declared as a constructor");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withReturnType(jSType11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withSourceNode(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder8.withSourceNode(node15);
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
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
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
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
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
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withInferredReturnType(jSType15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withParamsNode(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder18.withSourceNode(node19);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder20.withTemplateName("hi!");
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder24 = functionBuilder20.withSourceNode(node23);
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
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
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
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
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
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder10.withTypeOfThis(objectType16);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withName("");
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
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
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
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withParamsNode(node17);
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
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder18.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withTypeOfThis(objectType20);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder21.withName("");
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder25 = functionBuilder23.withParamsNode(node24);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder27 = functionBuilder25.withInferredReturnType(jSType26);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType28 = functionBuilder27.build();
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
        org.junit.Assert.assertNotNull(functionBuilder21);
        org.junit.Assert.assertNotNull(functionBuilder23);
        org.junit.Assert.assertNotNull(functionBuilder25);
        org.junit.Assert.assertNotNull(functionBuilder27);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
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
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withParamsNode(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder19.withParamsNode(node22);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder24 = functionBuilder19.forConstructor();
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
        org.junit.Assert.assertNotNull(functionBuilder24);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withName("hi!");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder2.withSourceNode(node7);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder2.withName("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withTypeOfThis(objectType11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withTemplateName("Not declared as a constructor");
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
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder10.withParamsNode(node13);
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder10.withTypeOfThis(objectType15);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withTemplateName("Unknown class name");
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
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withTemplateName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType16 = functionBuilder15.build();
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
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
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
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withInferredReturnType(jSType15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withSourceNode(node17);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder18.withTypeOfThis(objectType19);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder18.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder21.withReturnType(jSType22);
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
        org.junit.Assert.assertNotNull(functionBuilder21);
        org.junit.Assert.assertNotNull(functionBuilder23);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withSourceNode(node3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder4.withInferredReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Not declared as a type name");
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
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder1.withSourceNode(node5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder1.withName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withTemplateName("hi!");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withSourceNode(node11);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder19.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder19.withInferredReturnType(jSType21);
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
        org.junit.Assert.assertNotNull(functionBuilder20);
        org.junit.Assert.assertNotNull(functionBuilder22);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
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
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withReturnType(jSType12);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder9.withTypeOfThis(objectType14);
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
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
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
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withReturnType(jSType17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder18.withParamsNode(node19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder20.withReturnType(jSType21);
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
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder7.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder20.withInferredReturnType(jSType21);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder24 = functionBuilder22.withInferredReturnType(jSType23);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder20);
        org.junit.Assert.assertNotNull(functionBuilder22);
        org.junit.Assert.assertNotNull(functionBuilder24);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withReturnType(jSType14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withReturnType(jSType16);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withTemplateName("hi!");
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder17.withParamsNode(node20);
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
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
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
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withSourceNode(node11);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
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
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withInferredReturnType(jSType15);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withTypeOfThis(objectType17);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder18.withTemplateName("Named type with empty name component");
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
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder8.withSourceNode(node15);
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
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder10.withName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder10.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder10.withParamsNode(node18);
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
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
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
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withReturnType(jSType17);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder18.withTypeOfThis(objectType19);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
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
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withParamsNode(node13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder8.withReturnType(jSType15);
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
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder4.withSourceNode(node10);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder13.forConstructor();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder18.withName("hi!");
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withSourceNode(node3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withSourceNode(node6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withTemplateName("Not declared as a type name");
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
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
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder12.withSourceNode(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder12.withSourceNode(node17);
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder12.copyFromOtherFunction(functionType19);
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
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
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
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withInferredReturnType(jSType20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder19.withParamsNode(node22);
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
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withInferredReturnType(jSType14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withSourceNode(node16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder15.withReturnType(jSType18);
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
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.forConstructor();
        java.lang.Class<?> wildcardClass13 = functionBuilder12.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
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
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withReturnType(jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder16.withReturnType(jSType19);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
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
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withParams(functionParamBuilder17);
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
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withSourceNode(node3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder5.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder5.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withName("Named type with empty name component");
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withName("hi!");
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
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
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
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder4.withTypeOfThis(objectType11);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType13 = functionBuilder4.build();
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
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
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
        java.lang.Class<?> wildcardClass11 = functionBuilder4.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
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
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withTypeOfThis(objectType16);
        java.lang.Class<?> wildcardClass18 = functionBuilder15.getClass();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withName("hi!");
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
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
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder20.withParamsNode(node21);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType23 = functionBuilder20.build();
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
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
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
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder13.withReturnType(jSType20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder21.withSourceNode(node22);
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
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withName("");
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder18.withSourceNode(node19);
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
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
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
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withParamsNode(node14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder15.forConstructor();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withName("hi!");
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withParamsNode(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder10.withParamsNode(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder10.withParamsNode(node15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withReturnType(jSType17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder18.withSourceNode(node19);
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
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
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
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder11.withReturnType(jSType13);
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
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withReturnType(jSType5);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withName("");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withParamsNode(node11);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder1.withSourceNode(node5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder1.withName("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withTypeOfThis(objectType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withReturnType(jSType13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withParamsNode(node15);
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
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTypeOfThis(objectType10);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
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
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder11.withInferredReturnType(jSType13);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
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
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withTypeOfThis(objectType13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder12.withSourceNode(node15);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder12.withTemplateName("Not declared as a constructor");
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
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
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
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withTypeOfThis(objectType14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder11.withSourceNode(node16);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder11.withTemplateName("Not declared as a type name");
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
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
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
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder8.withSourceNode(node16);
        java.lang.Class<?> wildcardClass18 = functionBuilder17.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder4.withParamsNode(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withParamsNode(node13);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder12.withName("Not declared as a constructor");
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
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder15.forConstructor();
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
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withSourceNode(node6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder7.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withInferredReturnType(jSType11);
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder10.withTypeOfThis(objectType13);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
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
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withSourceNode(node12);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
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
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
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
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withTypeOfThis(objectType13);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder12.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withTemplateName("hi!");
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
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
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
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withTypeOfThis(objectType14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withReturnType(jSType16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withSourceNode(node18);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withInferredReturnType(jSType20);
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
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withParamsNode(node10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder11.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.forConstructor();
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
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder5.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder5.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder5.withName("Not declared as a constructor");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType11 = functionBuilder5.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withInferredReturnType(jSType14);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder13.withTypeOfThis(objectType16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder13.withInferredReturnType(jSType18);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
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
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder5.forConstructor();
        java.lang.Class<?> wildcardClass9 = functionBuilder5.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
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
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder15.withReturnType(jSType17);
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
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
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
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withParamsNode(node13);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
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
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder8.withTypeOfThis(objectType15);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder8.withTypeOfThis(objectType17);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder18.withName("Unknown class name");
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
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withSourceNode(node3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder5.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withTypeOfThis(objectType9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withInferredReturnType(jSType11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withReturnType(jSType13);
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
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
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
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withTypeOfThis(objectType11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder10.withName("Named type with empty name component");
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
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
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder8.withTypeOfThis(objectType14);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withParams(functionParamBuilder16);
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
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
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
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withTypeOfThis(objectType13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withSourceNode(node15);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
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
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder6.withInferredReturnType(jSType13);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withTemplateName("Not declared as a constructor");
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
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder24 = functionBuilder20.withTemplateName("");
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder26 = functionBuilder20.withInferredReturnType(jSType25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder28 = functionBuilder20.withInferredReturnType(jSType27);
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
        org.junit.Assert.assertNotNull(functionBuilder26);
        org.junit.Assert.assertNotNull(functionBuilder28);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder6.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder13.withTemplateName("hi!");
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
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withTypeOfThis(objectType11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withReturnType(jSType13);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
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
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withTypeOfThis(objectType11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withParamsNode(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withParamsNode(node15);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withTypeOfThis(objectType17);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
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
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withSourceNode(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder12.withParamsNode(node15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withInferredReturnType(jSType17);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder16.forConstructor();
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
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
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
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withName("Unknown class name");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withInferredReturnType(jSType14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withTemplateName("Unknown class name");
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
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder3.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withTemplateName("Unknown class name");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withSourceNode(node5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withName("hi!");
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
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
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder25 = functionBuilder23.withTypeOfThis(objectType24);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder27 = functionBuilder25.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder29 = functionBuilder25.withName("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder31 = functionBuilder25.withInferredReturnType(jSType30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder33 = functionBuilder31.withSourceNode(node32);
        com.google.javascript.rhino.jstype.FunctionType functionType34 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder35 = functionBuilder31.copyFromOtherFunction(functionType34);
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
        org.junit.Assert.assertNotNull(functionBuilder27);
        org.junit.Assert.assertNotNull(functionBuilder29);
        org.junit.Assert.assertNotNull(functionBuilder31);
        org.junit.Assert.assertNotNull(functionBuilder33);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
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
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withInferredReturnType(jSType14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder11.withInferredReturnType(jSType16);
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
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder6.withParamsNode(node13);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withSourceNode(node3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTemplateName("hi!");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withSourceNode(node8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder5.withReturnType(jSType10);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder4.withParamsNode(node11);
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder4.withTypeOfThis(objectType13);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder4.withTemplateName("");
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
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withSourceNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder6.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder6.withReturnType(jSType11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder6.withSourceNode(node13);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder6.withName("Unknown class name");
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
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
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
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withInferredReturnType(jSType15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withSourceNode(node17);
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
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
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
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder21.withParamsNode(node22);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder25 = functionBuilder23.withTypeOfThis(objectType24);
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
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withTypeOfThis(objectType15);
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
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
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
        java.lang.Class<?> wildcardClass12 = functionBuilder3.getClass();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
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
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withSourceNode(node15);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType17 = functionBuilder14.build();
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
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withSourceNode(node11);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder14.withParams(functionParamBuilder19);
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
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder10.withName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder10.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder16.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder16.withTemplateName("");
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder20.withReturnType(jSType21);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
        org.junit.Assert.assertNotNull(functionBuilder22);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder7.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder20.withInferredReturnType(jSType21);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder24 = functionBuilder22.withReturnType(jSType23);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder20);
        org.junit.Assert.assertNotNull(functionBuilder22);
        org.junit.Assert.assertNotNull(functionBuilder24);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
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
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder11.withReturnType(jSType13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder11.withInferredReturnType(jSType15);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
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
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withSourceNode(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withSourceNode(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withParamsNode(node16);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withInferredReturnType(jSType14);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder13.withTypeOfThis(objectType16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder13.withParamsNode(node18);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
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
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
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
        java.lang.Class<?> wildcardClass16 = functionBuilder15.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
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
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withTypeOfThis(objectType13);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
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
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withSourceNode(node14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder13.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withTypeOfThis(objectType18);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder17.withName("Unknown class name");
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
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
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
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withTypeOfThis(objectType13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder12.withSourceNode(node15);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder16.forConstructor();
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withSourceNode(node18);
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
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder4.withParamsNode(node8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTypeOfThis(objectType12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withParamsNode(node14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder11.withTemplateName("Unknown class name");
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
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
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withReturnType(jSType13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withSourceNode(node15);
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
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder24 = functionBuilder23.forConstructor();
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
        org.junit.Assert.assertNotNull(functionBuilder24);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
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
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder6.withReturnType(jSType13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder6.withSourceNode(node15);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder6.forConstructor();
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
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
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
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withInferredReturnType(jSType15);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withTypeOfThis(objectType17);
        java.lang.Class<?> wildcardClass19 = functionBuilder18.getClass();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder4.forConstructor();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType10 = functionBuilder4.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder9);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
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
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withInferredReturnType(jSType20);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType22 = functionBuilder19.build();
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
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withTemplateName("");
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder19.withSourceNode(node22);
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
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
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
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withReturnType(jSType17);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType19 = functionBuilder14.build();
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
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withReturnType(jSType7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withParamsNode(node9);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder4.withName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder4.withName("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder4.withReturnType(jSType13);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
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
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withParamsNode(node12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withTemplateName("Not declared as a constructor");
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
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withName("Not declared as a constructor");
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
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
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withReturnType(jSType20);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder19.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder24 = functionBuilder19.forConstructor();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder26 = functionBuilder19.copyFromOtherFunction(functionType25);
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
        org.junit.Assert.assertNotNull(functionBuilder21);
        org.junit.Assert.assertNotNull(functionBuilder23);
        org.junit.Assert.assertNotNull(functionBuilder24);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder1.withSourceNode(node5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder1.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder1.withInferredReturnType(jSType9);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withSourceNode(node8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder1.withName("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTypeOfThis(objectType12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withName("");
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withInferredReturnType(jSType16);
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
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
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
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withReturnType(jSType20);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder19.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder24 = functionBuilder19.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder26 = functionBuilder19.withReturnType(jSType25);
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
        org.junit.Assert.assertNotNull(functionBuilder21);
        org.junit.Assert.assertNotNull(functionBuilder23);
        org.junit.Assert.assertNotNull(functionBuilder24);
        org.junit.Assert.assertNotNull(functionBuilder26);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withReturnType(jSType7);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withTemplateName("Not declared as a type name");
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withName("Unknown class name");
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
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
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withTypeOfThis(objectType14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder11.withName("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withTypeOfThis(objectType18);
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
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder6.withInferredReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder6.copyFromOtherFunction(functionType11);
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
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withReturnType(jSType17);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder14.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder14.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder21.withReturnType(jSType22);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder25 = functionBuilder21.withParams(functionParamBuilder24);
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
        org.junit.Assert.assertNotNull(functionBuilder21);
        org.junit.Assert.assertNotNull(functionBuilder23);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
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
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.copyFromOtherFunction(functionType13);
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
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withTemplateName("hi!");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withParamsNode(node11);
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
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withInferredReturnType(jSType15);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder14.withInferredReturnType(jSType19);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder14.withName("Not declared as a constructor");
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
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
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
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder1.withTypeOfThis(objectType12);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder16.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionType functionType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.copyFromOtherFunction(functionType20);
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
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withReturnType(jSType17);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder14.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder14.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder21.withParams(functionParamBuilder22);
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
        org.junit.Assert.assertNotNull(functionBuilder21);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withSourceNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder6.withReturnType(jSType9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder6.withSourceNode(node11);
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
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withReturnType(jSType16);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withTypeOfThis(objectType18);
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
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withTemplateName("Named type with empty name component");
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withReturnType(jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder6.withReturnType(jSType9);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
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
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withInferredReturnType(jSType15);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder14.forConstructor();
        java.lang.Class<?> wildcardClass20 = functionBuilder14.getClass();
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
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withReturnType(jSType7);
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
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withParamsNode(node13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withReturnType(jSType15);
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
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withTemplateName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType15 = functionBuilder14.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder15.forConstructor();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType17 = functionBuilder15.build();
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
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withSourceNode(node7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder6.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder6.withReturnType(jSType11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder6.withSourceNode(node13);
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder6.withTypeOfThis(objectType15);
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
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.ObjectType objectType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withTypeOfThis(objectType2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withInferredReturnType(jSType4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withInferredReturnType(jSType8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withInferredReturnType(jSType10);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder10.withSourceNode(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder10.withSourceNode(node15);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withName("hi!");
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
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder15.withInferredReturnType(jSType18);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder15.forConstructor();
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder15.withParams(functionParamBuilder21);
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
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder20);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder19.withName("Not declared as a constructor");
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
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder4.withParamsNode(node11);
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder4.withTypeOfThis(objectType13);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder4.forConstructor();
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
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder7.forConstructor();
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
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder4.withTemplateName("");
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withReturnType(jSType15);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
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
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder20.withTypeOfThis(objectType21);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder24 = functionBuilder20.withInferredReturnType(jSType23);
        java.lang.Class<?> wildcardClass25 = functionBuilder24.getClass();
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
        org.junit.Assert.assertNotNull(functionBuilder22);
        org.junit.Assert.assertNotNull(functionBuilder24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withReturnType(jSType3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withParamsNode(node5);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withInferredReturnType(jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder6.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder6.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder6.withInferredReturnType(jSType12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withTemplateName("Not declared as a constructor");
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
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTypeOfThis(objectType5);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withReturnType(jSType7);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withTypeOfThis(objectType11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder10.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withInferredReturnType(jSType15);
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
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
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
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withInferredReturnType(jSType14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder13.withName("Not declared as a constructor");
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
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
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
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder25 = functionBuilder23.withTypeOfThis(objectType24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder27 = functionBuilder25.withSourceNode(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder29 = functionBuilder25.withParamsNode(node28);
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
        org.junit.Assert.assertNotNull(functionBuilder27);
        org.junit.Assert.assertNotNull(functionBuilder29);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Not declared as a type name");
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
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withReturnType(jSType3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withSourceNode(node5);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder2.withInferredReturnType(jSType7);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withName("Not declared as a type name");
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder3.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder3.withReturnType(jSType11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder3.forConstructor();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withName("");
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
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
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
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withInferredReturnType(jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder18.withReturnType(jSType19);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder20.withTypeOfThis(objectType21);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder24 = functionBuilder22.withInferredReturnType(jSType23);
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
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTypeOfThis(objectType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withInferredReturnType(jSType9);
        java.lang.Class<?> wildcardClass11 = functionBuilder10.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withInferredReturnType(jSType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withName("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder4.withTypeOfThis(objectType9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withInferredReturnType(jSType11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder10.withName("Not declared as a type name");
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
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
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withParamsNode(node20);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder21.withReturnType(jSType22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder25 = functionBuilder21.withSourceNode(node24);
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
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
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
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withInferredReturnType(jSType17);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder18.forConstructor();
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
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withReturnType(jSType5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder4.withTemplateName("");
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder4.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withName("hi!");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withParamsNode(node3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder1.withInferredReturnType(jSType5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder6.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withInferredReturnType(jSType8);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
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
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder12.withInferredReturnType(jSType17);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder12.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder12.withTemplateName("");
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
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder16.forConstructor();
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
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
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
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withParamsNode(node13);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder12.withTemplateName("Named type with empty name component");
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withSourceNode(node3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder4.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTemplateName("hi!");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withSourceNode(node8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder5.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withName("Named type with empty name component");
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
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.forConstructor();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder2.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTemplateName("hi!");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withParamsNode(node14);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withTypeOfThis(objectType16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder15.withReturnType(jSType18);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder15.withTemplateName("");
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
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
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
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withInferredReturnType(jSType15);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withName("");
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder18.withSourceNode(node19);
        java.lang.Class<?> wildcardClass21 = functionBuilder18.getClass();
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
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withTemplateName("Unknown class name");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType22 = functionBuilder19.build();
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
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder10.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder10.withTypeOfThis(objectType15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withInferredReturnType(jSType17);
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
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder24 = functionBuilder22.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder26 = functionBuilder24.withName("");
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
        org.junit.Assert.assertNotNull(functionBuilder24);
        org.junit.Assert.assertNotNull(functionBuilder26);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
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
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder20.withReturnType(jSType21);
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
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder12.withName("Not declared as a type name");
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
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
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
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withParamsNode(node11);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
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
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder7.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder7.withReturnType(jSType16);
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
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
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
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withParamsNode(node11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder10.withTemplateName("Not declared as a type name");
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
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
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder9.withParamsNode(node13);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType15 = functionBuilder14.build();
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
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
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
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withParamsNode(node12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder13.forConstructor();
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
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
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
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withTypeOfThis(objectType20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder19.withSourceNode(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder25 = functionBuilder19.withSourceNode(node24);
        com.google.javascript.rhino.jstype.FunctionType functionType26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder27 = functionBuilder19.copyFromOtherFunction(functionType26);
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
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
        org.junit.Assert.assertNotNull(functionBuilder23);
        org.junit.Assert.assertNotNull(functionBuilder25);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
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
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withTypeOfThis(objectType20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder21.withParamsNode(node22);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder25 = functionBuilder21.withInferredReturnType(jSType24);
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
        org.junit.Assert.assertNotNull(functionBuilder21);
        org.junit.Assert.assertNotNull(functionBuilder23);
        org.junit.Assert.assertNotNull(functionBuilder25);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
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
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withInferredReturnType(jSType15);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withTypeOfThis(objectType17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder14.withParamsNode(node19);
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
}

