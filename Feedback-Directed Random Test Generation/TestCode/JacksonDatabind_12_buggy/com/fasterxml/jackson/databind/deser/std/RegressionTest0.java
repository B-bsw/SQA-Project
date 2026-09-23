package com.fasterxml.jackson.databind.deser.std;

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
        com.fasterxml.jackson.databind.deser.std.MapDeserializer mapDeserializer0 = null;
        com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer3 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.HashSet<java.lang.String> strSet6 = new java.util.HashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.std.MapDeserializer mapDeserializer8 = new com.fasterxml.jackson.databind.deser.std.MapDeserializer(mapDeserializer0, keyDeserializer1, objJsonDeserializer2, typeDeserializer3, strSet6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.fasterxml.jackson.databind.deser.std.MapDeserializer mapDeserializer0 = null;
        com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer3 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.HashSet<java.lang.String> strSet6 = new java.util.HashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.std.MapDeserializer mapDeserializer8 = new com.fasterxml.jackson.databind.deser.std.MapDeserializer(mapDeserializer0, keyDeserializer1, objJsonDeserializer2, typeDeserializer3, strSet6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.fasterxml.jackson.databind.deser.std.MapDeserializer mapDeserializer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.std.MapDeserializer mapDeserializer1 = new com.fasterxml.jackson.databind.deser.std.MapDeserializer(mapDeserializer0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator1 = null;
        com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.std.MapDeserializer mapDeserializer5 = new com.fasterxml.jackson.databind.deser.std.MapDeserializer(javaType0, valueInstantiator1, keyDeserializer2, objJsonDeserializer3, typeDeserializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.fasterxml.jackson.databind.deser.std.MapDeserializer mapDeserializer0 = null;
        com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.util.HashSet<java.lang.String> strSet7 = new java.util.HashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.std.MapDeserializer mapDeserializer9 = new com.fasterxml.jackson.databind.deser.std.MapDeserializer(mapDeserializer0, keyDeserializer1, objJsonDeserializer2, typeDeserializer3, strSet7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.fasterxml.jackson.databind.deser.std.MapDeserializer mapDeserializer0 = null;
        com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.HashSet<java.lang.String> strSet7 = new java.util.HashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.std.MapDeserializer mapDeserializer9 = new com.fasterxml.jackson.databind.deser.std.MapDeserializer(mapDeserializer0, keyDeserializer1, objJsonDeserializer2, typeDeserializer3, strSet7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.fasterxml.jackson.databind.deser.std.MapDeserializer mapDeserializer0 = null;
        com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
        java.util.HashSet<java.lang.String> strSet7 = new java.util.HashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.std.MapDeserializer mapDeserializer9 = new com.fasterxml.jackson.databind.deser.std.MapDeserializer(mapDeserializer0, keyDeserializer1, objJsonDeserializer2, typeDeserializer3, strSet7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.fasterxml.jackson.databind.deser.std.MapDeserializer mapDeserializer0 = null;
        com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "" };
        java.util.HashSet<java.lang.String> strSet7 = new java.util.HashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.std.MapDeserializer mapDeserializer9 = new com.fasterxml.jackson.databind.deser.std.MapDeserializer(mapDeserializer0, keyDeserializer1, objJsonDeserializer2, typeDeserializer3, strSet7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.fasterxml.jackson.databind.deser.std.MapDeserializer mapDeserializer0 = null;
        com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer3 = null;
        java.util.HashSet<java.lang.String> strSet4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.std.MapDeserializer mapDeserializer5 = new com.fasterxml.jackson.databind.deser.std.MapDeserializer(mapDeserializer0, keyDeserializer1, objJsonDeserializer2, typeDeserializer3, strSet4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

