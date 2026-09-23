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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.CollectionLikeType collectionLikeType2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(javaType0, javaType1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        com.fasterxml.jackson.databind.type.TypeBase typeBase0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.SimpleType simpleType1 = new com.fasterxml.jackson.databind.type.SimpleType(typeBase0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        com.fasterxml.jackson.databind.type.TypeBase typeBase0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.CollectionType collectionType2 = new com.fasterxml.jackson.databind.type.CollectionType(typeBase0, javaType1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.MapLikeType mapLikeType3 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(javaType0, javaType1, javaType2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        com.fasterxml.jackson.databind.type.TypeBase typeBase0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.type.MapType mapType3 = new com.fasterxml.jackson.databind.type.MapType(typeBase0, javaType1, javaType2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

