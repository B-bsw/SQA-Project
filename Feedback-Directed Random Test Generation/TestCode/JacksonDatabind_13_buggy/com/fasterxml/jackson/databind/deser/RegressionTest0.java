package com.fasterxml.jackson.databind.deser;

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
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl impl0 = null;
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.InjectableValues injectableValues3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl impl4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(impl0, deserializationConfig1, jsonParser2, injectableValues3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl impl0 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl impl2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(impl0, deserializerFactory1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl impl1 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(deserializerFactory0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not pass null DeserializerFactory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader0 = null;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty objectIdValueProperty2 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(objectIdReader0, propertyMetadata1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl impl0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl impl1 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(impl0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

