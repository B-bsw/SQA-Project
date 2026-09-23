package com.google.gson;

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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        java.lang.reflect.Field field0 = null;
        java.lang.reflect.Type type1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.TypeInfo typeInfo2 = com.google.gson.TypeInfoFactory.getTypeInfoForField(field0, type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type 'null' is not a Class, ParameterizedType, or GenericArrayType. Can't extract class.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.TypeInfoArray typeInfoArray2 = com.google.gson.TypeInfoFactory.getTypeInfoForArray((java.lang.reflect.Type) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition failed: false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.TypeInfo typeInfo3 = com.google.gson.TypeInfoFactory.getTypeInfoForField(field0, (java.lang.reflect.Type) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        java.lang.reflect.Type type0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.TypeInfoArray typeInfoArray1 = com.google.gson.TypeInfoFactory.getTypeInfoForArray(type0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition failed: false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

