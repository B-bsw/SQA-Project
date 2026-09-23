package com.fasterxml.jackson.databind.type;

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_COMPARABLE;
        org.junit.Assert.assertNotNull(simpleType0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_CLASS;
        org.junit.Assert.assertNotNull(simpleType0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_LONG;
        java.lang.Class<?> wildcardClass1 = simpleType0.getClass();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_BOOL;
        org.junit.Assert.assertNotNull(simpleType0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.fasterxml.jackson.databind.type.TypeParser typeParser0 = null;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray2 = new com.fasterxml.jackson.databind.type.TypeModifier[] { typeModifier1 };
        java.lang.ClassLoader classLoader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = new com.fasterxml.jackson.databind.type.TypeFactory(typeParser0, typeModifierArray2, classLoader3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeModifierArray2);
        org.junit.Assert.assertArrayEquals(typeModifierArray2, new com.fasterxml.jackson.databind.type.TypeModifier[] { null });
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.fasterxml.jackson.databind.JavaType javaType0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        java.lang.Class<?> wildcardClass1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType0);
        java.lang.Class<?> wildcardClass2 = javaType0.getClass();
        org.junit.Assert.assertNotNull(javaType0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = typeFactory4.classForName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.Class<?> wildcardClass2 = typeFactory0._findPrimitive("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = typeFactory0.classForName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(wildcardClass2);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory0._modifiers;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = typeFactory0.classForName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = typeFactory0._classLoader;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = typeFactory0.findClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(classLoader3);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory4.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory0._modifiers;
        java.lang.ClassLoader classLoader4 = typeFactory0.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory6.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNotNull(typeFactory6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = typeFactory2.classForName("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory4._modifiers;
        java.lang.ClassLoader classLoader6 = typeFactory4.getClassLoader();
        com.fasterxml.jackson.databind.type.ClassStack classStack7 = null;
        java.lang.reflect.ParameterizedType parameterizedType8 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory4._fromParamType(classStack7, parameterizedType8, typeBindings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNull(classLoader6);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap5 = typeFactory4._typeCache;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory4._unknownType();
        java.lang.reflect.Type type7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory4.constructType(type7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unrecognized Type: [null]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap5);
        org.junit.Assert.assertNotNull(javaType6);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.reflect.Type type0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(type0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unrecognized Type: [null]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory4._modifiers;
        java.lang.ClassLoader classLoader6 = typeFactory4.getClassLoader();
        com.fasterxml.jackson.databind.type.ClassStack classStack7 = null;
        java.lang.reflect.WildcardType wildcardType8 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory4._fromWildcard(classStack7, wildcardType8, typeBindings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNull(classLoader6);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory0._modifiers;
        java.lang.ClassLoader classLoader4 = typeFactory0.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory0.withClassLoader(classLoader7);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        java.lang.ClassLoader classLoader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = typeFactory2.classForName("", true, classLoader7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = typeFactory2.findClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = typeFactory0.findClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory2._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory2._parser;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = typeFactory2.findClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNotNull(typeParser6);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = typeFactory0._modifiers;
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withClassLoader(classLoader5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = typeFactory0.findClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNull(typeModifierArray4);
        org.junit.Assert.assertNotNull(typeFactory6);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory2._unknownType();
        java.lang.Class<?> wildcardClass6 = typeFactory2.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = typeFactory0._classLoader;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(classLoader1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory0._modifiers;
        java.lang.ClassLoader classLoader4 = typeFactory0.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        java.lang.Class<?> wildcardClass8 = typeFactory0._findPrimitive("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = typeFactory0.classForName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(wildcardClass8);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_ENUM;
        java.lang.Class<?> wildcardClass1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory0._modifiers;
        java.lang.ClassLoader classLoader4 = typeFactory0.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.type.ClassStack classStack7 = null;
        java.lang.reflect.GenericArrayType genericArrayType8 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings9 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6._fromArrayType(classStack7, genericArrayType8, typeBindings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeBindings9);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory2.withModifier(typeModifier6);
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory2.withClassLoader(classLoader8);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory2.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeFactory9);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.Class<?> wildcardClass3 = typeFactory0.getClass();
        java.lang.Class<?> wildcardClass4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) wildcardClass3);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory2.withModifier(typeModifier6);
        java.lang.ClassLoader classLoader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = typeFactory7.classForName("", false, classLoader10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory7);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        java.lang.Class<?> wildcardClass5 = typeFactory2.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory2.withModifier(typeModifier5);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory6.constructFromCanonical("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = typeFactory6.findClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        java.lang.Class<?> wildcardClass1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) simpleType0);
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory4._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory4._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory4._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray8 = typeFactory4._modifiers;
        java.lang.Class<?> wildcardClass9 = typeFactory4.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNull(typeModifierArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory4._modifiers;
        java.lang.Class<?> wildcardClass7 = typeFactory4._findPrimitive("");
        java.lang.Class<?> wildcardClass8 = typeFactory4.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory4._modifiers;
        java.lang.ClassLoader classLoader6 = typeFactory4.getClassLoader();
        java.lang.ClassLoader classLoader7 = typeFactory4.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory4.withModifier(typeModifier8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = typeFactory9.findClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNull(classLoader6);
        org.junit.Assert.assertNull(classLoader7);
        org.junit.Assert.assertNotNull(typeFactory9);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        typeFactory0.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap5 = typeFactory4._typeCache;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = typeFactory4.findClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap5);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory0._modifiers;
        java.lang.ClassLoader classLoader4 = typeFactory0.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        java.lang.Class<?> wildcardClass8 = typeFactory0._findPrimitive("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = typeFactory0.findClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(wildcardClass8);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory4._unknownType();
        java.lang.ClassLoader classLoader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = typeFactory4.classForName("hi!", false, classLoader8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(javaType5);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap5 = typeFactory4._typeCache;
        java.lang.Class<?> wildcardClass6 = typeFactory4.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory4._modifiers;
        java.lang.ClassLoader classLoader6 = typeFactory4.getClassLoader();
        java.lang.ClassLoader classLoader7 = typeFactory4.getClassLoader();
        typeFactory4.clearCache();
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory4.withClassLoader(classLoader9);
        com.fasterxml.jackson.databind.type.TypeParser typeParser11 = typeFactory10._parser;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = typeFactory10.classForName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNull(classLoader6);
        org.junit.Assert.assertNull(classLoader7);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeParser11);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = typeFactory0._modifiers;
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withClassLoader(classLoader5);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap7 = typeFactory6._typeCache;
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory6.withClassLoader(classLoader8);
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.ArrayType arrayType11 = typeFactory6.constructArrayType(javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNull(typeModifierArray4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap7);
        org.junit.Assert.assertNotNull(typeFactory9);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory4._modifiers;
        java.lang.ClassLoader classLoader6 = typeFactory4.getClassLoader();
        java.lang.ClassLoader classLoader7 = typeFactory4.getClassLoader();
        typeFactory4.clearCache();
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory4.withClassLoader(classLoader9);
        com.fasterxml.jackson.databind.type.TypeParser typeParser11 = typeFactory10._parser;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = typeFactory10.findClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNull(classLoader6);
        org.junit.Assert.assertNull(classLoader7);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeParser11);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap5 = typeFactory4._typeCache;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory4._unknownType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory4.constructFromCanonical("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap5);
        org.junit.Assert.assertNotNull(javaType6);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory4._modifiers;
        java.lang.ClassLoader classLoader6 = typeFactory4.getClassLoader();
        java.lang.ClassLoader classLoader7 = typeFactory4.getClassLoader();
        java.lang.ClassLoader classLoader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = typeFactory4.classForName("", false, classLoader10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNull(classLoader6);
        org.junit.Assert.assertNull(classLoader7);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = typeFactory0._modifiers;
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withClassLoader(classLoader5);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray7 = typeFactory0._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNull(typeModifierArray4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(typeModifierArray7);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = typeFactory0._modifiers;
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withClassLoader(classLoader5);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap7 = typeFactory0._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNull(typeModifierArray4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap7);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap5 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory2.withModifier(typeModifier6);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap5);
        org.junit.Assert.assertNotNull(typeFactory7);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        typeFactory0.clearCache();
        java.lang.Class<?> wildcardClass2 = typeFactory0.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory2.withModifier(typeModifier5);
        java.lang.ClassLoader classLoader7 = typeFactory6._classLoader;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory8.withModifier(typeModifier9);
        java.lang.ClassLoader classLoader11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeFactory10.withClassLoader(classLoader11);
        com.fasterxml.jackson.databind.type.SimpleType simpleType13 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_OBJECT;
        com.fasterxml.jackson.databind.JavaType javaType14 = typeFactory10.constructType((java.lang.reflect.Type) simpleType13);
        com.fasterxml.jackson.databind.type.ArrayType arrayType15 = typeFactory6.constructArrayType(javaType14);
        java.lang.Class<?> wildcardClass16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType14);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(classLoader7);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNotNull(simpleType13);
        org.junit.Assert.assertNotNull(javaType14);
        org.junit.Assert.assertNotNull(arrayType15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        java.lang.ClassLoader classLoader7 = typeFactory4.getClassLoader();
        java.lang.Class<?> wildcardClass9 = typeFactory4._findPrimitive("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = typeFactory4.classForName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(classLoader7);
        org.junit.Assert.assertNull(wildcardClass9);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_INT;
        java.lang.Class<?> wildcardClass1 = simpleType0.getClass();
        java.lang.Class<?> wildcardClass2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = typeFactory0.findClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory2.withModifier(typeModifier6);
        java.lang.ClassLoader classLoader8 = typeFactory2._classLoader;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = typeFactory2.classForName("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNull(classLoader8);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory2.withModifier(typeModifier6);
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory2._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNotNull(typeParser8);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory4.withClassLoader(classLoader7);
        com.fasterxml.jackson.databind.type.ClassStack classStack9 = null;
        java.lang.reflect.GenericArrayType genericArrayType10 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory4._fromArrayType(classStack9, genericArrayType10, typeBindings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = typeFactory0._classLoader;
        typeFactory0.clearCache();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = typeFactory0.classForName("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(classLoader1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory0.withModifier(typeModifier3);
        java.lang.ClassLoader classLoader5 = typeFactory0._classLoader;
        com.fasterxml.jackson.databind.type.ClassStack classStack6 = null;
        java.lang.reflect.ParameterizedType parameterizedType7 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory0._fromParamType(classStack6, parameterizedType7, typeBindings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(classLoader5);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory2.withModifier(typeModifier5);
        typeFactory6.clearCache();
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory6.withClassLoader(classLoader8);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory9);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        typeFactory2.clearCache();
        java.lang.ClassLoader classLoader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = typeFactory2.classForName("hi!", false, classLoader8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap5 = typeFactory4._typeCache;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory4._unknownType();
        java.lang.Class<?> wildcardClass7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType6);
        java.lang.Class<?> wildcardClass8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType6);
        java.lang.Class<?> wildcardClass9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) wildcardClass8);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap1 = typeFactory0._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap1);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory2._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory2._parser;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory2._unknownType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory2.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(javaType7);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory0.withModifier(typeModifier3);
        java.lang.ClassLoader classLoader5 = typeFactory0._classLoader;
        typeFactory0.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(classLoader5);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        typeFactory2.clearCache();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = typeFactory2.classForName("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory2._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory2._unknownType();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray7 = typeFactory2._modifiers;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = typeFactory2.findClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNull(typeModifierArray7);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.Class<?> wildcardClass2 = typeFactory0._findPrimitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory0.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(wildcardClass2);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory2.withModifier(typeModifier6);
        java.lang.ClassLoader classLoader8 = typeFactory2._classLoader;
        java.lang.ClassLoader classLoader9 = typeFactory2.getClassLoader();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNull(classLoader9);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.Class<?> wildcardClass2 = typeFactory0._findPrimitive("hi!");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(wildcardClass2);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = typeFactory0._classLoader;
        typeFactory0.clearCache();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = typeFactory0.findClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(classLoader1);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = typeFactory0._modifiers;
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withClassLoader(classLoader5);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap7 = typeFactory6._typeCache;
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory6.withClassLoader(classLoader8);
        typeFactory9.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNull(typeModifierArray4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap7);
        org.junit.Assert.assertNotNull(typeFactory9);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        java.lang.ClassLoader classLoader7 = typeFactory6._classLoader;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(classLoader7);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory4._modifiers;
        java.lang.ClassLoader classLoader6 = typeFactory4.getClassLoader();
        java.lang.ClassLoader classLoader7 = typeFactory4.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory4.withModifier(typeModifier8);
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory9._parser;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = typeFactory9.findClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNull(classLoader6);
        org.junit.Assert.assertNull(classLoader7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(typeParser10);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory0._modifiers;
        java.lang.ClassLoader classLoader4 = typeFactory0.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        java.lang.Class<?> wildcardClass8 = typeFactory0._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = typeFactory0._modifiers;
        java.lang.Class<?> wildcardClass11 = typeFactory0._findPrimitive("");
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory0.withModifier(typeModifier12);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray14 = typeFactory0._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNull(typeModifierArray9);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNull(typeModifierArray14);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        java.lang.ClassLoader classLoader7 = typeFactory4.getClassLoader();
        java.lang.Class<?> wildcardClass9 = typeFactory4._findPrimitive("");
        java.lang.ClassLoader classLoader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = typeFactory4.classForName("", false, classLoader12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(classLoader7);
        org.junit.Assert.assertNull(wildcardClass9);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory2._unknownType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = typeFactory2.classForName("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(javaType5);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory4.withModifier(typeModifier7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = typeFactory4.classForName("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap5 = typeFactory4._typeCache;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory4._unknownType();
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory4._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(javaType7);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        typeFactory2.clearCache();
        java.lang.ClassLoader classLoader6 = typeFactory2.getClassLoader();
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory2.withClassLoader(classLoader7);
        typeFactory2.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(classLoader6);
        org.junit.Assert.assertNotNull(typeFactory8);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        typeFactory2.clearCache();
        java.lang.Class<?> wildcardClass7 = typeFactory2._findPrimitive("hi!");
        java.lang.Class<?> wildcardClass8 = typeFactory2.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory4.withModifier(typeModifier7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = typeFactory4.findClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory4._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory4._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNotNull(typeParser6);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory4.withModifier(typeModifier7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = typeFactory8.findClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        typeFactory2.clearCache();
        java.lang.ClassLoader classLoader6 = typeFactory2.getClassLoader();
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory2.withClassLoader(classLoader7);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory8.withModifier(typeModifier9);
        java.lang.Class<?> wildcardClass11 = typeFactory10.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(classLoader6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = typeFactory2._modifiers;
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory2.withClassLoader(classLoader7);
        java.lang.ClassLoader classLoader9 = typeFactory2._classLoader;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNull(classLoader9);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory0._modifiers;
        java.lang.ClassLoader classLoader4 = typeFactory0.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        java.lang.Class<?> wildcardClass8 = typeFactory0._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = typeFactory0._modifiers;
        java.lang.ClassLoader classLoader10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeFactory0.withClassLoader(classLoader10);
        java.lang.ClassLoader classLoader12 = typeFactory11.getClassLoader();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNull(typeModifierArray9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNull(classLoader12);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        typeFactory2.clearCache();
        java.lang.ClassLoader classLoader6 = typeFactory2.getClassLoader();
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory2.withClassLoader(classLoader7);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory8.withModifier(typeModifier9);
        java.lang.ClassLoader classLoader11 = typeFactory10.getClassLoader();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(classLoader6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNull(classLoader11);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = typeFactory2._modifiers;
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory2.withClassLoader(classLoader7);
        java.lang.ClassLoader classLoader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = typeFactory8.classForName("", false, classLoader11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray6);
        org.junit.Assert.assertNotNull(typeFactory8);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = typeFactory2._modifiers;
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory2.withClassLoader(classLoader7);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory2.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray6);
        org.junit.Assert.assertNotNull(typeFactory8);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory4._modifiers;
        java.lang.ClassLoader classLoader6 = typeFactory4.getClassLoader();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = typeFactory4.classForName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNull(classLoader6);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory4._modifiers;
        java.lang.ClassLoader classLoader6 = typeFactory4.getClassLoader();
        java.lang.ClassLoader classLoader7 = typeFactory4.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory4.withModifier(typeModifier8);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap10 = typeFactory9._typeCache;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = typeFactory9.classForName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNull(classLoader6);
        org.junit.Assert.assertNull(classLoader7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap10);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory0._modifiers;
        java.lang.ClassLoader classLoader4 = typeFactory0.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        java.lang.Class<?> wildcardClass8 = typeFactory0._findPrimitive("");
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory0.withClassLoader(classLoader9);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray11 = typeFactory10._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNull(typeModifierArray11);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory0._modifiers;
        java.lang.ClassLoader classLoader4 = typeFactory0.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        java.lang.Class<?> wildcardClass8 = typeFactory0._findPrimitive("");
        java.lang.Class<?> wildcardClass9 = typeFactory0.getClass();
        java.lang.Class<?> wildcardClass10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) wildcardClass10);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory2._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory2._unknownType();
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory2.withClassLoader(classLoader7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = typeFactory8.classForName("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeFactory8);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory4._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory4._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory4._parser;
        java.lang.Class<?> wildcardClass9 = typeFactory4._findPrimitive("");
        java.lang.ClassLoader classLoader10 = typeFactory4.getClassLoader();
        java.lang.ClassLoader classLoader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = typeFactory4.classForName("", true, classLoader13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertNull(classLoader10);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap7 = typeFactory6._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory6.withModifier(typeModifier8);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray10 = typeFactory9._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNull(typeModifierArray10);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory0.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory0._modifiers;
        java.lang.ClassLoader classLoader4 = typeFactory0.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        java.lang.Class<?> wildcardClass8 = typeFactory0._findPrimitive("");
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory0.withClassLoader(classLoader9);
        java.lang.ClassLoader classLoader11 = typeFactory10.getClassLoader();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap12 = typeFactory10._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNull(classLoader11);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap12);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap3 = typeFactory0._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap3);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.fasterxml.jackson.databind.type.SimpleType simpleType0 = com.fasterxml.jackson.databind.type.TypeFactory.CORE_TYPE_STRING;
        java.lang.Class<?> wildcardClass1 = simpleType0.getClass();
        org.junit.Assert.assertNotNull(simpleType0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory2._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory2._unknownType();
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory2.withClassLoader(classLoader7);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = typeFactory8._modifiers;
        java.lang.ClassLoader classLoader10 = typeFactory8.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeParser typeParser11 = typeFactory8._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNull(typeModifierArray9);
        org.junit.Assert.assertNull(classLoader10);
        org.junit.Assert.assertNotNull(typeParser11);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory4.withClassLoader(classLoader7);
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory8._parser;
        java.lang.ClassLoader classLoader10 = typeFactory8.getClassLoader();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNull(classLoader10);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory4.withModifier(typeModifier7);
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory4._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeParser9);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = typeFactory2.findClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier6 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = typeFactory2.withModifier(typeModifier6);
        java.lang.ClassLoader classLoader8 = typeFactory2._classLoader;
        com.fasterxml.jackson.databind.type.ClassStack classStack9 = null;
        java.lang.reflect.WildcardType wildcardType10 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory2._fromWildcard(classStack9, wildcardType10, typeBindings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory7);
        org.junit.Assert.assertNull(classLoader8);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        typeFactory0.clearCache();
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory0.withClassLoader(classLoader2);
        java.lang.ClassLoader classLoader4 = typeFactory0.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeParser typeParser5 = typeFactory0._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNotNull(typeParser5);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = typeFactory2._modifiers;
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory2.withClassLoader(classLoader7);
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory8._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory8._parser;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = typeFactory8.findClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeParser10);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = typeFactory0._modifiers;
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withClassLoader(classLoader5);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap7 = typeFactory6._typeCache;
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory6.withClassLoader(classLoader8);
        java.lang.ClassLoader classLoader10 = typeFactory9._classLoader;
        typeFactory9.clearCache();
        java.lang.ClassLoader classLoader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = typeFactory9.classForName("hi!", true, classLoader14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNull(typeModifierArray4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNull(classLoader10);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory0._modifiers;
        java.lang.ClassLoader classLoader4 = typeFactory0.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        java.lang.Class<?> wildcardClass8 = typeFactory0._findPrimitive("");
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory0.withClassLoader(classLoader9);
        java.lang.ClassLoader classLoader11 = typeFactory10.getClassLoader();
        typeFactory10.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNull(classLoader11);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        typeFactory2.clearCache();
        java.lang.ClassLoader classLoader6 = typeFactory2.getClassLoader();
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory2.withClassLoader(classLoader7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = typeFactory2.findClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(classLoader6);
        org.junit.Assert.assertNotNull(typeFactory8);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory4._modifiers;
        java.lang.Class<?> wildcardClass7 = typeFactory4._findPrimitive("");
        com.fasterxml.jackson.databind.type.TypeParser typeParser8 = typeFactory4._parser;
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory4.withClassLoader(classLoader9);
        java.lang.ClassLoader classLoader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = typeFactory10.classForName("", false, classLoader13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNotNull(typeParser8);
        org.junit.Assert.assertNotNull(typeFactory10);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory4._unknownType();
        java.lang.Class<?> wildcardClass7 = typeFactory4._findPrimitive("");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNull(wildcardClass7);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory4._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory4._unknownType();
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory4._unknownType();
        java.lang.Class<?> wildcardClass8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType7);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory0.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap5 = typeFactory0._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap5);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory0._modifiers;
        java.lang.ClassLoader classLoader4 = typeFactory0.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        java.lang.Class<?> wildcardClass8 = typeFactory0._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = typeFactory0._modifiers;
        java.lang.Class<?> wildcardClass11 = typeFactory0._findPrimitive("");
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory0.withModifier(typeModifier12);
        java.lang.Class<?> wildcardClass15 = typeFactory13._findPrimitive("hi!");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNull(typeModifierArray9);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertNotNull(typeFactory13);
        org.junit.Assert.assertNull(wildcardClass15);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory2._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory2._parser;
        java.lang.ClassLoader classLoader7 = typeFactory2.getClassLoader();
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory2.withClassLoader(classLoader8);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNull(classLoader7);
        org.junit.Assert.assertNotNull(typeFactory9);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory4._modifiers;
        java.lang.ClassLoader classLoader6 = typeFactory4.getClassLoader();
        java.lang.ClassLoader classLoader7 = typeFactory4.getClassLoader();
        typeFactory4.clearCache();
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory4.withClassLoader(classLoader9);
        com.fasterxml.jackson.databind.type.TypeParser typeParser11 = typeFactory10._parser;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = typeFactory10._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNull(classLoader6);
        org.junit.Assert.assertNull(classLoader7);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeParser11);
        org.junit.Assert.assertNull(typeModifierArray12);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = typeFactory2.classForName("hi!", false, classLoader5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap7 = typeFactory6._typeCache;
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory6.withClassLoader(classLoader8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = typeFactory6.findClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap7);
        org.junit.Assert.assertNotNull(typeFactory9);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = typeFactory0._modifiers;
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withClassLoader(classLoader5);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap7 = typeFactory6._typeCache;
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory6.withClassLoader(classLoader8);
        java.lang.ClassLoader classLoader10 = typeFactory9._classLoader;
        com.fasterxml.jackson.databind.type.TypeParser typeParser11 = typeFactory9._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNull(typeModifierArray4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNull(classLoader10);
        org.junit.Assert.assertNotNull(typeParser11);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.Class<?> wildcardClass2 = typeFactory0._findPrimitive("");
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0._unknownType();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap4 = typeFactory0._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap4);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = typeFactory2._modifiers;
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory2.withClassLoader(classLoader7);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap9 = typeFactory8._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap9);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = typeFactory0.classForName("hi!", false, classLoader3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        typeFactory2.clearCache();
        java.lang.ClassLoader classLoader6 = typeFactory2.getClassLoader();
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory2.withClassLoader(classLoader7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = typeFactory8.findClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(classLoader6);
        org.junit.Assert.assertNotNull(typeFactory8);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap7 = typeFactory6._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory6.withModifier(typeModifier8);
        java.lang.ClassLoader classLoader10 = typeFactory6._classLoader;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNull(classLoader10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory4._modifiers;
        java.lang.ClassLoader classLoader6 = typeFactory4.getClassLoader();
        java.lang.ClassLoader classLoader7 = typeFactory4.getClassLoader();
        typeFactory4.clearCache();
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory4.withClassLoader(classLoader9);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray11 = typeFactory4._modifiers;
        java.lang.ClassLoader classLoader12 = typeFactory4._classLoader;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNull(classLoader6);
        org.junit.Assert.assertNull(classLoader7);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNull(typeModifierArray11);
        org.junit.Assert.assertNull(classLoader12);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = typeFactory2._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray7 = typeFactory2._modifiers;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = typeFactory2.findClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray6);
        org.junit.Assert.assertNull(typeModifierArray7);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap7 = typeFactory6._typeCache;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = typeFactory6.findClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap7);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        java.lang.ClassLoader classLoader7 = typeFactory4.getClassLoader();
        java.lang.Class<?> wildcardClass9 = typeFactory4._findPrimitive("");
        java.lang.ClassLoader classLoader10 = typeFactory4._classLoader;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray11 = typeFactory4._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(classLoader7);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertNull(classLoader10);
        org.junit.Assert.assertNull(typeModifierArray11);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory4._modifiers;
        java.lang.ClassLoader classLoader6 = typeFactory4.getClassLoader();
        java.lang.ClassLoader classLoader7 = typeFactory4.getClassLoader();
        typeFactory4.clearCache();
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory4.withClassLoader(classLoader9);
        java.lang.ClassLoader classLoader11 = typeFactory4._classLoader;
        java.lang.ClassLoader classLoader12 = typeFactory4.getClassLoader();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNull(classLoader6);
        org.junit.Assert.assertNull(classLoader7);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNull(classLoader11);
        org.junit.Assert.assertNull(classLoader12);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap3 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = typeFactory2._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap3);
        org.junit.Assert.assertNull(typeModifierArray4);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        java.lang.ClassLoader classLoader1 = typeFactory0._classLoader;
        typeFactory0.clearCache();
        java.lang.Class<?> wildcardClass4 = typeFactory0._findPrimitive("");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(classLoader1);
        org.junit.Assert.assertNull(wildcardClass4);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.Class<?> wildcardClass2 = typeFactory0._findPrimitive("");
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0._unknownType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory0.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory2._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory2._parser;
        com.fasterxml.jackson.databind.JavaType javaType7 = typeFactory2._unknownType();
        java.lang.ClassLoader classLoader8 = typeFactory2.getClassLoader();
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory2._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(classLoader8);
        org.junit.Assert.assertNotNull(javaType9);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap7 = typeFactory6._typeCache;
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory6.withClassLoader(classLoader8);
        java.lang.ClassLoader classLoader10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeFactory6.withClassLoader(classLoader10);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(typeFactory11);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory4._modifiers;
        java.lang.Class<?> wildcardClass7 = typeFactory4._findPrimitive("");
        java.lang.Class<?> wildcardClass9 = typeFactory4._findPrimitive("");
        java.lang.ClassLoader classLoader10 = typeFactory4._classLoader;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertNull(classLoader10);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory4._modifiers;
        java.lang.ClassLoader classLoader6 = typeFactory4.getClassLoader();
        java.lang.ClassLoader classLoader7 = typeFactory4.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory4.withModifier(typeModifier8);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeFactory9.withModifier(typeModifier10);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNull(classLoader6);
        org.junit.Assert.assertNull(classLoader7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(typeFactory11);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory2._unknownType();
        java.lang.ClassLoader classLoader6 = typeFactory2.getClassLoader();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = typeFactory2.classForName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNull(classLoader6);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory4.withModifier(typeModifier7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory4._unknownType();
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory4._unknownType();
        java.lang.ClassLoader classLoader11 = typeFactory4.getClassLoader();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(javaType10);
        org.junit.Assert.assertNull(classLoader11);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withClassLoader(classLoader5);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeParser typeParser1 = typeFactory0._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeParser1);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory2._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory2._unknownType();
        java.lang.Class<?> wildcardClass7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType6);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory0._modifiers;
        java.lang.ClassLoader classLoader4 = typeFactory0.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        java.lang.ClassLoader classLoader7 = typeFactory0.getClassLoader();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(classLoader7);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory6.withModifier(typeModifier7);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory4.withClassLoader(classLoader7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory8._unknownType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = typeFactory8.classForName("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType9);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory4._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory4._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory4._parser;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory4._unknownType();
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory4.withClassLoader(classLoader9);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier11 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory12 = typeFactory4.withModifier(typeModifier11);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier13 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory14 = typeFactory4.withModifier(typeModifier13);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeFactory12);
        org.junit.Assert.assertNotNull(typeFactory14);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory2.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray7 = typeFactory2._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(typeModifierArray7);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap5 = typeFactory4._typeCache;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory4._unknownType();
        com.fasterxml.jackson.databind.type.ClassStack classStack7 = null;
        java.lang.reflect.GenericArrayType genericArrayType8 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings9 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory4._fromArrayType(classStack7, genericArrayType8, typeBindings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeBindings9);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = typeFactory2._modifiers;
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory2.withClassLoader(classLoader7);
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory8._parser;
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory8._parser;
        typeFactory8.clearCache();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeParser10);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory4._modifiers;
        java.lang.ClassLoader classLoader6 = typeFactory4.getClassLoader();
        java.lang.ClassLoader classLoader7 = typeFactory4.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory4.withModifier(typeModifier8);
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory4._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNull(classLoader6);
        org.junit.Assert.assertNull(classLoader7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(javaType10);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory2._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory2._unknownType();
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory2.withClassLoader(classLoader7);
        com.fasterxml.jackson.databind.type.ClassStack classStack9 = null;
        java.lang.reflect.GenericArrayType genericArrayType10 = null;
        com.fasterxml.jackson.databind.type.TypeBindings typeBindings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType12 = typeFactory2._fromArrayType(classStack9, genericArrayType10, typeBindings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeFactory8);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = typeFactory2.findClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory0._modifiers;
        java.lang.ClassLoader classLoader4 = typeFactory0.getClassLoader();
        java.lang.ClassLoader classLoader5 = typeFactory0._classLoader;
        java.lang.ClassLoader classLoader6 = typeFactory0.getClassLoader();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNull(classLoader5);
        org.junit.Assert.assertNull(classLoader6);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory4._modifiers;
        java.lang.ClassLoader classLoader6 = typeFactory4.getClassLoader();
        java.lang.ClassLoader classLoader7 = typeFactory4.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory4.withModifier(typeModifier8);
        com.fasterxml.jackson.databind.type.TypeParser typeParser10 = typeFactory9._parser;
        java.lang.ClassLoader classLoader11 = typeFactory9.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray12 = typeFactory9._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNull(classLoader6);
        org.junit.Assert.assertNull(classLoader7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(typeParser10);
        org.junit.Assert.assertNull(classLoader11);
        org.junit.Assert.assertNull(typeModifierArray12);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory0._modifiers;
        java.lang.ClassLoader classLoader4 = typeFactory0.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        java.lang.Class<?> wildcardClass8 = typeFactory0._findPrimitive("");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap9 = typeFactory0._typeCache;
        java.lang.ClassLoader classLoader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = typeFactory0.classForName("hi!", false, classLoader12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap9);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory4._modifiers;
        java.lang.ClassLoader classLoader6 = typeFactory4.getClassLoader();
        java.lang.ClassLoader classLoader7 = typeFactory4.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory4.withModifier(typeModifier8);
        java.lang.ClassLoader classLoader10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeFactory9.withClassLoader(classLoader10);
        java.lang.ClassLoader classLoader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = typeFactory9.classForName("", false, classLoader14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNull(classLoader6);
        org.junit.Assert.assertNull(classLoader7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(typeFactory11);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.Class<?> wildcardClass2 = typeFactory0._findPrimitive("");
        com.fasterxml.jackson.databind.JavaType javaType3 = typeFactory0._unknownType();
        typeFactory0.clearCache();
        java.lang.Class<?> wildcardClass5 = typeFactory0.getClass();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(javaType3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = typeFactory0._modifiers;
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withClassLoader(classLoader5);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap7 = typeFactory6._typeCache;
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory6.withClassLoader(classLoader8);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap10 = typeFactory6._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNull(typeModifierArray4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap10);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        typeFactory0.clearCache();
        java.lang.ClassLoader classLoader2 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = typeFactory0.withClassLoader(classLoader2);
        java.lang.ClassLoader classLoader4 = typeFactory0.getClassLoader();
        java.lang.Class<?> wildcardClass6 = typeFactory0._findPrimitive("hi!");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNull(wildcardClass6);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        typeFactory2.clearCache();
        java.lang.Class<?> wildcardClass7 = typeFactory2._findPrimitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = typeFactory2.classForName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(wildcardClass7);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = typeFactory0._modifiers;
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withClassLoader(classLoader5);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap7 = typeFactory6._typeCache;
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory6.withClassLoader(classLoader8);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeFactory9.withModifier(typeModifier10);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNull(typeModifierArray4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(typeFactory11);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory2._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory2._unknownType();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray7 = typeFactory2._modifiers;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = typeFactory2.classForName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNull(typeModifierArray7);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory4._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory4._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory4._parser;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory4._unknownType();
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory4.withClassLoader(classLoader9);
        com.fasterxml.jackson.databind.type.TypeParser typeParser11 = typeFactory4._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(typeFactory10);
        org.junit.Assert.assertNotNull(typeParser11);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory2.withModifier(typeModifier5);
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory6.withClassLoader(classLoader7);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory0._modifiers;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray4 = typeFactory0._modifiers;
        java.lang.ClassLoader classLoader5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withClassLoader(classLoader5);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap7 = typeFactory6._typeCache;
        java.lang.ClassLoader classLoader8 = typeFactory6._classLoader;
        java.lang.ClassLoader classLoader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = typeFactory6.classForName("", false, classLoader11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNull(typeModifierArray4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap7);
        org.junit.Assert.assertNull(classLoader8);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.ClassLoader classLoader1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withClassLoader(classLoader1);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory4._modifiers;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory4._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser7 = typeFactory4._parser;
        com.fasterxml.jackson.databind.JavaType javaType8 = typeFactory4._unknownType();
        java.lang.ClassLoader classLoader9 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory10 = typeFactory4.withClassLoader(classLoader9);
        java.lang.ClassLoader classLoader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = typeFactory10.classForName("", false, classLoader13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(typeParser7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(typeFactory10);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap3 = typeFactory2._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier4 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory5 = typeFactory2.withModifier(typeModifier4);
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory5._unknownType();
        java.lang.Class<?> wildcardClass8 = typeFactory5._findPrimitive("");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap3);
        org.junit.Assert.assertNotNull(typeFactory5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNull(wildcardClass8);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        java.lang.ClassLoader classLoader7 = typeFactory4.getClassLoader();
        java.lang.Class<?> wildcardClass9 = typeFactory4._findPrimitive("");
        java.lang.Class<?> wildcardClass11 = typeFactory4._findPrimitive("hi!");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(classLoader7);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertNull(wildcardClass11);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
        java.lang.Class<?> wildcardClass2 = typeFactory0._findPrimitive("");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap3 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.JavaType javaType4 = typeFactory0._unknownType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory0.constructFromCanonical("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type 'hi!' (remaining: ''): Can not locate class 'hi!', problem: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap3);
        org.junit.Assert.assertNotNull(javaType4);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray5 = typeFactory4._modifiers;
        java.lang.ClassLoader classLoader6 = typeFactory4.getClassLoader();
        java.lang.ClassLoader classLoader7 = typeFactory4.getClassLoader();
        typeFactory4.clearCache();
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory4._unknownType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = typeFactory4.classForName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray5);
        org.junit.Assert.assertNull(classLoader6);
        org.junit.Assert.assertNull(classLoader7);
        org.junit.Assert.assertNotNull(javaType9);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap7 = typeFactory6._typeCache;
        java.lang.ClassLoader classLoader8 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory9 = typeFactory6.withClassLoader(classLoader8);
        com.fasterxml.jackson.databind.JavaType javaType10 = typeFactory6._unknownType();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap7);
        org.junit.Assert.assertNotNull(typeFactory9);
        org.junit.Assert.assertNotNull(javaType10);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory0._modifiers;
        java.lang.ClassLoader classLoader4 = typeFactory0.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        java.lang.Class<?> wildcardClass8 = typeFactory0._findPrimitive("");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap10 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.JavaType javaType11 = typeFactory0._unknownType();
        java.lang.ClassLoader classLoader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = typeFactory0.classForName("", false, classLoader14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap9);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap10);
        org.junit.Assert.assertNotNull(javaType11);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        com.fasterxml.jackson.databind.JavaType javaType5 = typeFactory2._unknownType();
        com.fasterxml.jackson.databind.type.TypeParser typeParser6 = typeFactory2._parser;
        java.lang.Class<?> wildcardClass8 = typeFactory2._findPrimitive("");
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(javaType5);
        org.junit.Assert.assertNotNull(typeParser6);
        org.junit.Assert.assertNull(wildcardClass8);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory4.withModifier(typeModifier7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory4._unknownType();
        java.lang.ClassLoader classLoader10 = typeFactory4.getClassLoader();
        java.lang.ClassLoader classLoader11 = typeFactory4._classLoader;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNull(classLoader10);
        org.junit.Assert.assertNull(classLoader11);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeParser typeParser3 = typeFactory2._parser;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeParser3);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory0._modifiers;
        java.lang.ClassLoader classLoader4 = typeFactory0.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        java.lang.Class<?> wildcardClass8 = typeFactory0._findPrimitive("");
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap9 = typeFactory0._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray10 = typeFactory0._modifiers;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = typeModifierArray10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap9);
        org.junit.Assert.assertNull(typeModifierArray10);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap5 = typeFactory4._typeCache;
        com.fasterxml.jackson.databind.JavaType javaType6 = typeFactory4._unknownType();
        java.lang.Class<?> wildcardClass7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) javaType6);
        java.lang.Class<?> wildcardClass8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass((java.lang.reflect.Type) wildcardClass7);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap5);
        org.junit.Assert.assertNotNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        java.lang.ClassLoader classLoader5 = typeFactory4.getClassLoader();
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(classLoader5);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray3 = typeFactory0._modifiers;
        java.lang.ClassLoader classLoader4 = typeFactory0.getClassLoader();
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory0.withModifier(typeModifier5);
        java.lang.Class<?> wildcardClass8 = typeFactory0._findPrimitive("hi!");
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray9 = typeFactory0._modifiers;
        java.lang.Class<?> wildcardClass11 = typeFactory0._findPrimitive("");
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory0.withModifier(typeModifier12);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType15 = typeFactory13.constructFromCanonical("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse type '' (remaining: ''): Unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNull(typeModifierArray3);
        org.junit.Assert.assertNull(classLoader4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNull(typeModifierArray9);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertNotNull(typeFactory13);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = typeFactory2._modifiers;
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory2.withClassLoader(classLoader7);
        java.lang.ClassLoader classLoader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = typeFactory8.classForName("", true, classLoader11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray6);
        org.junit.Assert.assertNotNull(typeFactory8);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap5 = typeFactory4._typeCache;
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = typeFactory4._modifiers;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap5);
        org.junit.Assert.assertNull(typeModifierArray6);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        java.lang.ClassLoader classLoader3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withClassLoader(classLoader3);
        typeFactory2.clearCache();
        com.fasterxml.jackson.databind.type.TypeModifier[] typeModifierArray6 = typeFactory2._modifiers;
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory2.withClassLoader(classLoader7);
        com.fasterxml.jackson.databind.JavaType javaType9 = typeFactory8._unknownType();
        com.fasterxml.jackson.databind.util.LRUMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JavaType> wildcardClassLRUMap10 = typeFactory8._typeCache;
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNull(typeModifierArray6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(javaType9);
        org.junit.Assert.assertNotNull(wildcardClassLRUMap10);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory0 = com.fasterxml.jackson.databind.type.TypeFactory.instance;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier1 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = typeFactory0.withModifier(typeModifier1);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier3 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = typeFactory2.withModifier(typeModifier3);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier5 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory6 = typeFactory4.withModifier(typeModifier5);
        java.lang.ClassLoader classLoader7 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory8 = typeFactory4.withClassLoader(classLoader7);
        com.fasterxml.jackson.databind.type.TypeParser typeParser9 = typeFactory8._parser;
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier10 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory11 = typeFactory8.withModifier(typeModifier10);
        com.fasterxml.jackson.databind.type.TypeModifier typeModifier12 = null;
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = typeFactory11.withModifier(typeModifier12);
        org.junit.Assert.assertNotNull(typeFactory0);
        org.junit.Assert.assertNotNull(typeFactory2);
        org.junit.Assert.assertNotNull(typeFactory4);
        org.junit.Assert.assertNotNull(typeFactory6);
        org.junit.Assert.assertNotNull(typeFactory8);
        org.junit.Assert.assertNotNull(typeParser9);
        org.junit.Assert.assertNotNull(typeFactory11);
        org.junit.Assert.assertNotNull(typeFactory13);
    }
}

