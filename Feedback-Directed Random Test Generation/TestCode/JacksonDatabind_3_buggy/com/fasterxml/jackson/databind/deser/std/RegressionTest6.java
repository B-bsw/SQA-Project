package com.fasterxml.jackson.databind.deser.std;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.String[] strArray7 = stringArrayDeserializer1.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer9 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer10 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer12 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer15 = stringArrayDeserializer13.unwrappingDeserializer(nameTransformer14);
        java.lang.Class<?> wildcardClass16 = stringArrayDeserializer13.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer17 = stringArrayDeserializer13.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType18 = stringArrayDeserializer13.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader19 = stringArrayDeserializer13.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer20 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer21 = null;
        stringArrayDeserializer20._elementDeserializer = strJsonDeserializer21;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer23 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer20);
        com.fasterxml.jackson.databind.JavaType javaType24 = stringArrayDeserializer23.getValueType();
        java.lang.String[] strArray25 = stringArrayDeserializer23.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType26 = stringArrayDeserializer23.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer27 = stringArrayDeserializer23._elementDeserializer;
        stringArrayDeserializer13._elementDeserializer = strJsonDeserializer27;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer27;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer30 = stringArrayDeserializer1._elementDeserializer;
        boolean boolean31 = stringArrayDeserializer1.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer32 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer9);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer12);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(wildcardJsonDeserializer17);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNull(objectIdReader19);
        org.junit.Assert.assertNull(javaType24);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertNull(javaType26);
        org.junit.Assert.assertNotNull(strJsonDeserializer27);
        org.junit.Assert.assertNotNull(strJsonDeserializer30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        java.lang.Class<?> wildcardClass3 = stringArrayDeserializer1.handledType();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer1.handledType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = stringArrayDeserializer5.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer7 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer5);
        java.lang.String[] strArray8 = stringArrayDeserializer5.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType9 = stringArrayDeserializer5.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer10 = stringArrayDeserializer5._elementDeserializer;
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNotNull(strJsonDeserializer10);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = stringArrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType4 = stringArrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer5 = stringArrayDeserializer0._elementDeserializer;
        java.lang.String[] strArray6 = stringArrayDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = stringArrayDeserializer0.deserialize(jsonParser7, deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(strJsonDeserializer5);
        org.junit.Assert.assertNull(strArray6);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = stringArrayDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = stringArrayDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass8 = stringArrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer10 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer9);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer10);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer4 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer4);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        java.lang.Class<?> wildcardClass2 = stringArrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = stringArrayDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.handledType();
        java.lang.String[] strArray5 = stringArrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer7 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(strArray5);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = stringArrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = stringArrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer5);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = stringArrayDeserializer6.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer8 = null;
        stringArrayDeserializer6._elementDeserializer = strJsonDeserializer8;
        boolean boolean10 = stringArrayDeserializer6.isCachable();
        java.lang.Class<?> wildcardClass11 = stringArrayDeserializer6.handledType();
        java.lang.String[] strArray12 = stringArrayDeserializer6.getNullValue();
        java.lang.String[] strArray13 = stringArrayDeserializer6.getEmptyValue();
        java.lang.Class<?> wildcardClass14 = stringArrayDeserializer6.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer15 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer16 = null;
        stringArrayDeserializer15._elementDeserializer = strJsonDeserializer16;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer18 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer15);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader19 = stringArrayDeserializer18.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer20 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer21 = null;
        stringArrayDeserializer20._elementDeserializer = strJsonDeserializer21;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer23 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer20);
        java.lang.String[] strArray24 = stringArrayDeserializer23.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer25 = stringArrayDeserializer23._elementDeserializer;
        stringArrayDeserializer18._elementDeserializer = strJsonDeserializer25;
        java.lang.String[] strArray27 = stringArrayDeserializer18.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer28 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer29 = stringArrayDeserializer18.unwrappingDeserializer(nameTransformer28);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer30 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer31 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer30);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer32 = stringArrayDeserializer31.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer33 = null;
        stringArrayDeserializer31._elementDeserializer = strJsonDeserializer33;
        boolean boolean35 = stringArrayDeserializer31.isCachable();
        java.lang.Class<?> wildcardClass36 = stringArrayDeserializer31.handledType();
        java.lang.String[] strArray37 = stringArrayDeserializer31.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer38 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer31);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer39 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer40 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer41 = stringArrayDeserializer39.unwrappingDeserializer(nameTransformer40);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer42 = stringArrayDeserializer39.getDelegatee();
        java.lang.Class<?> wildcardClass43 = stringArrayDeserializer39.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer44 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer45 = null;
        stringArrayDeserializer44._elementDeserializer = strJsonDeserializer45;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer47 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer44);
        java.lang.String[] strArray48 = stringArrayDeserializer47.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer49 = stringArrayDeserializer47._elementDeserializer;
        stringArrayDeserializer39._elementDeserializer = strJsonDeserializer49;
        stringArrayDeserializer31._elementDeserializer = strJsonDeserializer49;
        stringArrayDeserializer18._elementDeserializer = strJsonDeserializer49;
        stringArrayDeserializer6._elementDeserializer = strJsonDeserializer49;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer49;
        java.util.Collection<java.lang.Object> objCollection55 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader56 = stringArrayDeserializer0.getObjectIdReader();
        java.lang.String[] strArray57 = stringArrayDeserializer0.getNullValue();
        java.lang.String[] strArray58 = stringArrayDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass59 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer60 = stringArrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer61 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType62 = stringArrayDeserializer61.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer63 = null;
        stringArrayDeserializer61._elementDeserializer = strJsonDeserializer63;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader65 = stringArrayDeserializer61.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer66 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer67 = stringArrayDeserializer61.unwrappingDeserializer(nameTransformer66);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer68 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer69 = null;
        stringArrayDeserializer68._elementDeserializer = strJsonDeserializer69;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer71 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer68);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader72 = stringArrayDeserializer71.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer73 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer74 = null;
        stringArrayDeserializer73._elementDeserializer = strJsonDeserializer74;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer76 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer73);
        java.lang.String[] strArray77 = stringArrayDeserializer76.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer78 = stringArrayDeserializer76._elementDeserializer;
        stringArrayDeserializer71._elementDeserializer = strJsonDeserializer78;
        stringArrayDeserializer61._elementDeserializer = strJsonDeserializer78;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer78;
        com.fasterxml.jackson.core.JsonParser jsonParser82 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext83 = null;
        java.lang.String[] strArray84 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray85 = stringArrayDeserializer0.deserialize(jsonParser82, deserializationContext83, strArray84);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type [Ljava.lang.String; (by deserializer of type com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(objectIdReader19);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNotNull(strJsonDeserializer25);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer29);
        org.junit.Assert.assertNull(wildcardJsonDeserializer32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNull(strArray37);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer41);
        org.junit.Assert.assertNull(wildcardJsonDeserializer42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNull(strArray48);
        org.junit.Assert.assertNotNull(strJsonDeserializer49);
        org.junit.Assert.assertNull(objCollection55);
        org.junit.Assert.assertNull(objectIdReader56);
        org.junit.Assert.assertNull(strArray57);
        org.junit.Assert.assertNull(strArray58);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNull(wildcardJsonDeserializer60);
        org.junit.Assert.assertNull(javaType62);
        org.junit.Assert.assertNull(objectIdReader65);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer67);
        org.junit.Assert.assertNull(objectIdReader72);
        org.junit.Assert.assertNull(strArray77);
        org.junit.Assert.assertNotNull(strJsonDeserializer78);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] {});
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        java.lang.Class<?> wildcardClass2 = stringArrayDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = stringArrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.handledType();
        java.lang.String[] strArray5 = stringArrayDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(strArray5);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = stringArrayDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        java.lang.String[] strArray6 = stringArrayDeserializer5.getEmptyValue();
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(strArray6);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = stringArrayDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection2 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType3 = stringArrayDeserializer0.getValueType();
        boolean boolean4 = stringArrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer5);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = stringArrayDeserializer6.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection8 = stringArrayDeserializer6.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer9 = stringArrayDeserializer6._elementDeserializer;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer9;
        boolean boolean11 = stringArrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType12 = stringArrayDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stringArrayDeserializer0.deserializeWithType(jsonParser13, deserializationContext14, typeDeserializer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNotNull(strJsonDeserializer9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(javaType12);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        java.util.Collection<java.lang.Object> objCollection3 = stringArrayDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer5 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer5;
        java.lang.Class<?> wildcardClass7 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = stringArrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer10 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer9);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer10);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        java.lang.Class<?> wildcardClass3 = stringArrayDeserializer1.handledType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer4 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer5 = stringArrayDeserializer3.unwrappingDeserializer(nameTransformer4);
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer3.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stringArrayDeserializer3.deserializeWithType(jsonParser7, deserializationContext8, typeDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.String[] strArray7 = stringArrayDeserializer1.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer9 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer11 = stringArrayDeserializer9.unwrappingDeserializer(nameTransformer10);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = stringArrayDeserializer9.getDelegatee();
        java.lang.Class<?> wildcardClass13 = stringArrayDeserializer9.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer14 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer15 = null;
        stringArrayDeserializer14._elementDeserializer = strJsonDeserializer15;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer17 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer14);
        java.lang.String[] strArray18 = stringArrayDeserializer17.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer19 = stringArrayDeserializer17._elementDeserializer;
        stringArrayDeserializer9._elementDeserializer = strJsonDeserializer19;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer19;
        java.util.Collection<java.lang.Object> objCollection22 = stringArrayDeserializer1.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer23 = stringArrayDeserializer1._elementDeserializer;
        java.lang.String[] strArray24 = stringArrayDeserializer1.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer25 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer26 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer25);
        boolean boolean27 = stringArrayDeserializer1.isCachable();
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer11);
        org.junit.Assert.assertNull(wildcardJsonDeserializer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNotNull(strJsonDeserializer19);
        org.junit.Assert.assertNull(objCollection22);
        org.junit.Assert.assertNotNull(strJsonDeserializer23);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer5 = stringArrayDeserializer3.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer7 = strArrayJsonDeserializer5.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = strArrayJsonDeserializer5.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer9 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(strArrayJsonDeserializer5);
        com.fasterxml.jackson.databind.JavaType javaType10 = stringArrayDeserializer9.getValueType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer12 = null;
        stringArrayDeserializer11._elementDeserializer = strJsonDeserializer12;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer14 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer11);
        com.fasterxml.jackson.databind.JavaType javaType15 = stringArrayDeserializer14.getValueType();
        java.lang.String[] strArray16 = stringArrayDeserializer14.getNullValue();
        java.lang.String[] strArray17 = stringArrayDeserializer14.getNullValue();
        java.lang.Class<?> wildcardClass18 = stringArrayDeserializer14.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer19 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer20 = stringArrayDeserializer14.unwrappingDeserializer(nameTransformer19);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer21 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer22 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer21);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer23 = stringArrayDeserializer22.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer24 = null;
        stringArrayDeserializer22._elementDeserializer = strJsonDeserializer24;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer26 = null;
        stringArrayDeserializer22._elementDeserializer = strJsonDeserializer26;
        java.lang.String[] strArray28 = stringArrayDeserializer22.getNullValue();
        java.lang.Class<?> wildcardClass29 = stringArrayDeserializer22.handledType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer30 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        java.lang.Class<?> wildcardClass31 = stringArrayDeserializer30.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer32 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer33 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer32);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer34 = stringArrayDeserializer33.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer35 = null;
        stringArrayDeserializer33._elementDeserializer = strJsonDeserializer35;
        boolean boolean37 = stringArrayDeserializer33.isCachable();
        java.lang.Class<?> wildcardClass38 = stringArrayDeserializer33.handledType();
        java.lang.String[] strArray39 = stringArrayDeserializer33.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer40 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer33);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer41 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer42 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer43 = stringArrayDeserializer41.unwrappingDeserializer(nameTransformer42);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer44 = stringArrayDeserializer41.getDelegatee();
        java.lang.Class<?> wildcardClass45 = stringArrayDeserializer41.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer46 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer47 = null;
        stringArrayDeserializer46._elementDeserializer = strJsonDeserializer47;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer49 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer46);
        java.lang.String[] strArray50 = stringArrayDeserializer49.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer51 = stringArrayDeserializer49._elementDeserializer;
        stringArrayDeserializer41._elementDeserializer = strJsonDeserializer51;
        stringArrayDeserializer33._elementDeserializer = strJsonDeserializer51;
        stringArrayDeserializer30._elementDeserializer = strJsonDeserializer51;
        stringArrayDeserializer22._elementDeserializer = strJsonDeserializer51;
        stringArrayDeserializer14._elementDeserializer = strJsonDeserializer51;
        stringArrayDeserializer9._elementDeserializer = strJsonDeserializer51;
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer5);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer20);
        org.junit.Assert.assertNull(wildcardJsonDeserializer23);
        org.junit.Assert.assertNull(strArray28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(stringArrayDeserializer30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNull(wildcardJsonDeserializer34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNull(strArray39);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer43);
        org.junit.Assert.assertNull(wildcardJsonDeserializer44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNull(strArray50);
        org.junit.Assert.assertNotNull(strJsonDeserializer51);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = stringArrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer2 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer2;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer4 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        java.lang.String[] strArray5 = stringArrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer6 = stringArrayDeserializer0._elementDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer7 = stringArrayDeserializer0._elementDeserializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer9 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer8);
        java.lang.String[] strArray10 = stringArrayDeserializer0.getNullValue();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(strJsonDeserializer6);
        org.junit.Assert.assertNull(strJsonDeserializer7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer9);
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.String[] strArray7 = stringArrayDeserializer1.getNullValue();
        java.lang.String[] strArray8 = stringArrayDeserializer1.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType9 = stringArrayDeserializer1.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer11 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer10);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer13 = strArrayJsonDeserializer11.unwrappingDeserializer(nameTransformer12);
        java.lang.String[] strArray14 = strArrayJsonDeserializer13.getNullValue();
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer11);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer13);
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer5 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer5;
        java.lang.String[] strArray7 = stringArrayDeserializer1.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType8 = stringArrayDeserializer1.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray18 = stringArrayDeserializer1.deserialize(jsonParser9, deserializationContext10, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type [Ljava.lang.String; (by deserializer of type com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "", "", "", "hi!", "" });
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer2);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = stringArrayDeserializer3.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer5 = null;
        stringArrayDeserializer3._elementDeserializer = strJsonDeserializer5;
        boolean boolean7 = stringArrayDeserializer3.isCachable();
        java.lang.Class<?> wildcardClass8 = stringArrayDeserializer3.handledType();
        java.lang.String[] strArray9 = stringArrayDeserializer3.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer10 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer3);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer13 = stringArrayDeserializer11.unwrappingDeserializer(nameTransformer12);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = stringArrayDeserializer11.getDelegatee();
        java.lang.Class<?> wildcardClass15 = stringArrayDeserializer11.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer16 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer17 = null;
        stringArrayDeserializer16._elementDeserializer = strJsonDeserializer17;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer19 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer16);
        java.lang.String[] strArray20 = stringArrayDeserializer19.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer21 = stringArrayDeserializer19._elementDeserializer;
        stringArrayDeserializer11._elementDeserializer = strJsonDeserializer21;
        stringArrayDeserializer3._elementDeserializer = strJsonDeserializer21;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer21;
        java.lang.Class<?> wildcardClass25 = stringArrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer26 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer27 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer26);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer28 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer29 = strArrayJsonDeserializer27.unwrappingDeserializer(nameTransformer28);
        java.lang.Class<?> wildcardClass30 = strArrayJsonDeserializer29.getClass();
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer13);
        org.junit.Assert.assertNull(wildcardJsonDeserializer14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNotNull(strJsonDeserializer21);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer27);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JavaType javaType4 = stringArrayDeserializer3.getValueType();
        java.lang.String[] strArray5 = stringArrayDeserializer3.getNullValue();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer3.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer7 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer8 = null;
        stringArrayDeserializer7._elementDeserializer = strJsonDeserializer8;
        java.lang.String[] strArray10 = stringArrayDeserializer7.getEmptyValue();
        java.lang.Class<?> wildcardClass11 = stringArrayDeserializer7.getValueClass();
        java.lang.Class<?> wildcardClass12 = stringArrayDeserializer7.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader13 = stringArrayDeserializer7.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection14 = stringArrayDeserializer7.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer15 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType16 = stringArrayDeserializer15.getValueType();
        java.util.Collection<java.lang.Object> objCollection17 = stringArrayDeserializer15.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType18 = stringArrayDeserializer15.getValueType();
        boolean boolean19 = stringArrayDeserializer15.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer20 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer21 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer20);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer22 = stringArrayDeserializer21.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection23 = stringArrayDeserializer21.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer24 = stringArrayDeserializer21._elementDeserializer;
        stringArrayDeserializer15._elementDeserializer = strJsonDeserializer24;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer26 = stringArrayDeserializer15._elementDeserializer;
        stringArrayDeserializer7._elementDeserializer = strJsonDeserializer26;
        stringArrayDeserializer3._elementDeserializer = strJsonDeserializer26;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer29 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer3);
        java.lang.String[] strArray30 = stringArrayDeserializer29.getNullValue();
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(objectIdReader13);
        org.junit.Assert.assertNull(objCollection14);
        org.junit.Assert.assertNull(javaType16);
        org.junit.Assert.assertNull(objCollection17);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer22);
        org.junit.Assert.assertNull(objCollection23);
        org.junit.Assert.assertNotNull(strJsonDeserializer24);
        org.junit.Assert.assertNotNull(strJsonDeserializer26);
        org.junit.Assert.assertNull(strArray30);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = stringArrayDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection2 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType3 = stringArrayDeserializer0.getValueType();
        boolean boolean4 = stringArrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer5);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = stringArrayDeserializer6.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection8 = stringArrayDeserializer6.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer9 = stringArrayDeserializer6._elementDeserializer;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer9;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer11 = stringArrayDeserializer0._elementDeserializer;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer12 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        java.lang.String[] strArray13 = stringArrayDeserializer12.getNullValue();
        java.lang.Class<?> wildcardClass14 = stringArrayDeserializer12.getValueClass();
        java.lang.Class<?> wildcardClass15 = stringArrayDeserializer12.getClass();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNotNull(strJsonDeserializer9);
        org.junit.Assert.assertNotNull(strJsonDeserializer11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.String[] strArray7 = stringArrayDeserializer1.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer9 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer10 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer12 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer15 = stringArrayDeserializer13.unwrappingDeserializer(nameTransformer14);
        java.lang.Class<?> wildcardClass16 = stringArrayDeserializer13.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer17 = stringArrayDeserializer13.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType18 = stringArrayDeserializer13.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader19 = stringArrayDeserializer13.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer20 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer21 = null;
        stringArrayDeserializer20._elementDeserializer = strJsonDeserializer21;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer23 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer20);
        com.fasterxml.jackson.databind.JavaType javaType24 = stringArrayDeserializer23.getValueType();
        java.lang.String[] strArray25 = stringArrayDeserializer23.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType26 = stringArrayDeserializer23.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer27 = stringArrayDeserializer23._elementDeserializer;
        stringArrayDeserializer13._elementDeserializer = strJsonDeserializer27;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer27;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer30 = stringArrayDeserializer1._elementDeserializer;
        java.lang.Class<?> wildcardClass31 = stringArrayDeserializer1.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer32 = stringArrayDeserializer1.getDelegatee();
        java.lang.String[] strArray33 = stringArrayDeserializer1.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser34 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray36 = stringArrayDeserializer1._deserializeCustom(jsonParser34, deserializationContext35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer9);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer12);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(wildcardJsonDeserializer17);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNull(objectIdReader19);
        org.junit.Assert.assertNull(javaType24);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertNull(javaType26);
        org.junit.Assert.assertNotNull(strJsonDeserializer27);
        org.junit.Assert.assertNotNull(strJsonDeserializer30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNull(wildcardJsonDeserializer32);
        org.junit.Assert.assertNull(strArray33);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        java.lang.Class<?> wildcardClass1 = stringArrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = stringArrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = stringArrayDeserializer0.handledType();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.String[] strArray7 = stringArrayDeserializer1.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer9 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer10 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = stringArrayDeserializer10.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = stringArrayDeserializer10.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection13 = stringArrayDeserializer10.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader14 = stringArrayDeserializer10.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType15 = stringArrayDeserializer10.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType16 = stringArrayDeserializer10.getValueType();
        java.lang.Class<?> wildcardClass17 = stringArrayDeserializer10.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer18 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer19 = null;
        stringArrayDeserializer18._elementDeserializer = strJsonDeserializer19;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer21 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer18);
        com.fasterxml.jackson.databind.JavaType javaType22 = stringArrayDeserializer21.getValueType();
        java.lang.Class<?> wildcardClass23 = stringArrayDeserializer21.handledType();
        java.lang.Class<?> wildcardClass24 = stringArrayDeserializer21.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer25 = null;
        stringArrayDeserializer21._elementDeserializer = strJsonDeserializer25;
        java.util.Collection<java.lang.Object> objCollection27 = stringArrayDeserializer21.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer28 = stringArrayDeserializer21._elementDeserializer;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer29 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer30 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer29);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer31 = stringArrayDeserializer30.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer32 = null;
        stringArrayDeserializer30._elementDeserializer = strJsonDeserializer32;
        boolean boolean34 = stringArrayDeserializer30.isCachable();
        java.lang.Class<?> wildcardClass35 = stringArrayDeserializer30.handledType();
        java.lang.String[] strArray36 = stringArrayDeserializer30.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer37 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer38 = stringArrayDeserializer30.unwrappingDeserializer(nameTransformer37);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer39 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer30);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer40 = stringArrayDeserializer30.getDelegatee();
        java.lang.String[] strArray41 = stringArrayDeserializer30.getEmptyValue();
        java.lang.String[] strArray42 = stringArrayDeserializer30.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer43 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer44 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer45 = stringArrayDeserializer43.unwrappingDeserializer(nameTransformer44);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer46 = stringArrayDeserializer43.getDelegatee();
        java.lang.Class<?> wildcardClass47 = stringArrayDeserializer43.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer48 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer49 = null;
        stringArrayDeserializer48._elementDeserializer = strJsonDeserializer49;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer51 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer48);
        java.lang.String[] strArray52 = stringArrayDeserializer51.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer53 = stringArrayDeserializer51._elementDeserializer;
        stringArrayDeserializer43._elementDeserializer = strJsonDeserializer53;
        java.lang.Class<?> wildcardClass55 = stringArrayDeserializer43.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer56 = stringArrayDeserializer43._elementDeserializer;
        stringArrayDeserializer30._elementDeserializer = strJsonDeserializer56;
        stringArrayDeserializer21._elementDeserializer = strJsonDeserializer56;
        stringArrayDeserializer10._elementDeserializer = strJsonDeserializer56;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer60 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer61 = stringArrayDeserializer10.unwrappingDeserializer(nameTransformer60);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
        org.junit.Assert.assertNull(wildcardJsonDeserializer12);
        org.junit.Assert.assertNull(objCollection13);
        org.junit.Assert.assertNull(objectIdReader14);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertNull(javaType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(javaType22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNull(objCollection27);
        org.junit.Assert.assertNull(strJsonDeserializer28);
        org.junit.Assert.assertNull(wildcardJsonDeserializer31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNull(strArray36);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer38);
        org.junit.Assert.assertNull(wildcardJsonDeserializer40);
        org.junit.Assert.assertNull(strArray41);
        org.junit.Assert.assertNull(strArray42);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer45);
        org.junit.Assert.assertNull(wildcardJsonDeserializer46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNull(strArray52);
        org.junit.Assert.assertNotNull(strJsonDeserializer53);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(strJsonDeserializer56);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer61);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = stringArrayDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection2 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType3 = stringArrayDeserializer0.getValueType();
        boolean boolean4 = stringArrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer5);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = stringArrayDeserializer6.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection8 = stringArrayDeserializer6.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer9 = stringArrayDeserializer6._elementDeserializer;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer9;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer12 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer11);
        java.lang.String[] strArray13 = stringArrayDeserializer12.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader14 = stringArrayDeserializer12.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = stringArrayDeserializer12.getDelegatee();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNotNull(strJsonDeserializer9);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(objectIdReader14);
        org.junit.Assert.assertNull(wildcardJsonDeserializer15);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = stringArrayDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection2 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType3 = stringArrayDeserializer0.getValueType();
        boolean boolean4 = stringArrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer5);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = stringArrayDeserializer6.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection8 = stringArrayDeserializer6.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer9 = stringArrayDeserializer6._elementDeserializer;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer9;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        java.lang.Class<?> wildcardClass12 = stringArrayDeserializer11.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader13 = stringArrayDeserializer11.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer14 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer11);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty16 = stringArrayDeserializer14.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNotNull(strJsonDeserializer9);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(objectIdReader13);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JavaType javaType3 = stringArrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = stringArrayDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass5 = stringArrayDeserializer0.handledType();
        boolean boolean6 = stringArrayDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = stringArrayDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection2 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType3 = stringArrayDeserializer0.getValueType();
        boolean boolean4 = stringArrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer6 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.JavaType javaType7 = stringArrayDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass8 = stringArrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer9 = stringArrayDeserializer0._elementDeserializer;
        java.lang.Class<?> wildcardClass10 = stringArrayDeserializer0.handledType();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(strJsonDeserializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        java.lang.String[] strArray1 = stringArrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType3 = stringArrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer4 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType5 = stringArrayDeserializer4.getValueType();
        java.util.Collection<java.lang.Object> objCollection6 = stringArrayDeserializer4.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType7 = stringArrayDeserializer4.getValueType();
        boolean boolean8 = stringArrayDeserializer4.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer9 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer10 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer9);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = stringArrayDeserializer10.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection12 = stringArrayDeserializer10.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer13 = stringArrayDeserializer10._elementDeserializer;
        stringArrayDeserializer4._elementDeserializer = strJsonDeserializer13;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer15 = stringArrayDeserializer4._elementDeserializer;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer16 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer4);
        java.lang.String[] strArray17 = stringArrayDeserializer16.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer18 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer16);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer19 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer20 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer19);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer21 = stringArrayDeserializer20.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer22 = null;
        stringArrayDeserializer20._elementDeserializer = strJsonDeserializer22;
        boolean boolean24 = stringArrayDeserializer20.isCachable();
        java.lang.Class<?> wildcardClass25 = stringArrayDeserializer20.handledType();
        java.lang.String[] strArray26 = stringArrayDeserializer20.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer27 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer28 = stringArrayDeserializer20.unwrappingDeserializer(nameTransformer27);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer29 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer20);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer30 = stringArrayDeserializer20.getDelegatee();
        boolean boolean31 = stringArrayDeserializer20.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer32 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer33 = null;
        stringArrayDeserializer32._elementDeserializer = strJsonDeserializer33;
        java.util.Collection<java.lang.Object> objCollection35 = stringArrayDeserializer32.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass36 = stringArrayDeserializer32.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer37 = null;
        stringArrayDeserializer32._elementDeserializer = strJsonDeserializer37;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer39 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer40 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer41 = stringArrayDeserializer39.unwrappingDeserializer(nameTransformer40);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer42 = stringArrayDeserializer39.getDelegatee();
        java.lang.Class<?> wildcardClass43 = stringArrayDeserializer39.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer44 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer45 = null;
        stringArrayDeserializer44._elementDeserializer = strJsonDeserializer45;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer47 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer44);
        java.lang.String[] strArray48 = stringArrayDeserializer47.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer49 = stringArrayDeserializer47._elementDeserializer;
        stringArrayDeserializer39._elementDeserializer = strJsonDeserializer49;
        stringArrayDeserializer32._elementDeserializer = strJsonDeserializer49;
        stringArrayDeserializer20._elementDeserializer = strJsonDeserializer49;
        stringArrayDeserializer16._elementDeserializer = strJsonDeserializer49;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer49;
        java.util.Collection<java.lang.Object> objCollection55 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer56 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer57 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer56);
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
        org.junit.Assert.assertNull(objCollection12);
        org.junit.Assert.assertNotNull(strJsonDeserializer13);
        org.junit.Assert.assertNotNull(strJsonDeserializer15);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(wildcardJsonDeserializer21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer28);
        org.junit.Assert.assertNull(wildcardJsonDeserializer30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(objCollection35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer41);
        org.junit.Assert.assertNull(wildcardJsonDeserializer42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNull(strArray48);
        org.junit.Assert.assertNotNull(strJsonDeserializer49);
        org.junit.Assert.assertNull(objCollection55);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer57);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.String[] strArray7 = stringArrayDeserializer1.getNullValue();
        java.lang.String[] strArray8 = stringArrayDeserializer1.getEmptyValue();
        java.lang.String[] strArray9 = stringArrayDeserializer1.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer10 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer10);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = stringArrayDeserializer11.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection13 = stringArrayDeserializer11.getKnownPropertyNames();
        java.lang.String[] strArray14 = stringArrayDeserializer11.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer15 = stringArrayDeserializer11._elementDeserializer;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer15;
        java.lang.Class<?> wildcardClass17 = stringArrayDeserializer1.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty19 = stringArrayDeserializer1.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer12);
        org.junit.Assert.assertNull(objCollection13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(strJsonDeserializer15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JavaType javaType4 = stringArrayDeserializer3.getValueType();
        java.lang.Class<?> wildcardClass5 = stringArrayDeserializer3.handledType();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer3.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer7 = null;
        stringArrayDeserializer3._elementDeserializer = strJsonDeserializer7;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = stringArrayDeserializer3.getObjectIdReader();
        java.lang.Class<?> wildcardClass10 = stringArrayDeserializer3.handledType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer3);
        java.util.Collection<java.lang.Object> objCollection12 = stringArrayDeserializer11.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType14 = stringArrayDeserializer13.getValueType();
        java.util.Collection<java.lang.Object> objCollection15 = stringArrayDeserializer13.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer16 = stringArrayDeserializer13.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer17 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer18 = null;
        stringArrayDeserializer17._elementDeserializer = strJsonDeserializer18;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer20 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer17);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader21 = stringArrayDeserializer20.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer22 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer23 = null;
        stringArrayDeserializer22._elementDeserializer = strJsonDeserializer23;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer25 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer22);
        java.lang.String[] strArray26 = stringArrayDeserializer25.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer27 = stringArrayDeserializer25._elementDeserializer;
        stringArrayDeserializer20._elementDeserializer = strJsonDeserializer27;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer29 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer30 = null;
        stringArrayDeserializer29._elementDeserializer = strJsonDeserializer30;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer32 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer29);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader33 = stringArrayDeserializer32.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer34 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer35 = null;
        stringArrayDeserializer34._elementDeserializer = strJsonDeserializer35;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer37 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer34);
        java.lang.String[] strArray38 = stringArrayDeserializer37.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer39 = stringArrayDeserializer37._elementDeserializer;
        stringArrayDeserializer32._elementDeserializer = strJsonDeserializer39;
        stringArrayDeserializer20._elementDeserializer = strJsonDeserializer39;
        java.util.Collection<java.lang.Object> objCollection42 = stringArrayDeserializer20.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType43 = stringArrayDeserializer20.getValueType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer44 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer45 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer46 = stringArrayDeserializer44.unwrappingDeserializer(nameTransformer45);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer47 = stringArrayDeserializer44.getDelegatee();
        java.lang.Class<?> wildcardClass48 = stringArrayDeserializer44.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer49 = stringArrayDeserializer44._elementDeserializer;
        boolean boolean50 = stringArrayDeserializer44.isCachable();
        java.lang.String[] strArray51 = stringArrayDeserializer44.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer52 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        java.lang.Class<?> wildcardClass53 = stringArrayDeserializer52.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer54 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer55 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer54);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer56 = stringArrayDeserializer55.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer57 = null;
        stringArrayDeserializer55._elementDeserializer = strJsonDeserializer57;
        boolean boolean59 = stringArrayDeserializer55.isCachable();
        java.lang.Class<?> wildcardClass60 = stringArrayDeserializer55.handledType();
        java.lang.String[] strArray61 = stringArrayDeserializer55.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer62 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer55);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer63 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer64 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer65 = stringArrayDeserializer63.unwrappingDeserializer(nameTransformer64);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer66 = stringArrayDeserializer63.getDelegatee();
        java.lang.Class<?> wildcardClass67 = stringArrayDeserializer63.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer68 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer69 = null;
        stringArrayDeserializer68._elementDeserializer = strJsonDeserializer69;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer71 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer68);
        java.lang.String[] strArray72 = stringArrayDeserializer71.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer73 = stringArrayDeserializer71._elementDeserializer;
        stringArrayDeserializer63._elementDeserializer = strJsonDeserializer73;
        stringArrayDeserializer55._elementDeserializer = strJsonDeserializer73;
        stringArrayDeserializer52._elementDeserializer = strJsonDeserializer73;
        stringArrayDeserializer44._elementDeserializer = strJsonDeserializer73;
        stringArrayDeserializer20._elementDeserializer = strJsonDeserializer73;
        stringArrayDeserializer13._elementDeserializer = strJsonDeserializer73;
        stringArrayDeserializer11._elementDeserializer = strJsonDeserializer73;
        java.util.Collection<java.lang.Object> objCollection81 = stringArrayDeserializer11.getKnownPropertyNames();
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(objCollection12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNull(objCollection15);
        org.junit.Assert.assertNull(wildcardJsonDeserializer16);
        org.junit.Assert.assertNull(objectIdReader21);
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertNotNull(strJsonDeserializer27);
        org.junit.Assert.assertNull(objectIdReader33);
        org.junit.Assert.assertNull(strArray38);
        org.junit.Assert.assertNotNull(strJsonDeserializer39);
        org.junit.Assert.assertNull(objCollection42);
        org.junit.Assert.assertNull(javaType43);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer46);
        org.junit.Assert.assertNull(wildcardJsonDeserializer47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNull(strJsonDeserializer49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(strArray51);
        org.junit.Assert.assertNotNull(stringArrayDeserializer52);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNull(wildcardJsonDeserializer56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNull(strArray61);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer65);
        org.junit.Assert.assertNull(wildcardJsonDeserializer66);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNull(strArray72);
        org.junit.Assert.assertNotNull(strJsonDeserializer73);
        org.junit.Assert.assertNull(objCollection81);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        java.lang.String[] strArray3 = stringArrayDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass5 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = stringArrayDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection7 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType9 = stringArrayDeserializer8.getValueType();
        java.util.Collection<java.lang.Object> objCollection10 = stringArrayDeserializer8.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType11 = stringArrayDeserializer8.getValueType();
        boolean boolean12 = stringArrayDeserializer8.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer14 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer13);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = stringArrayDeserializer14.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection16 = stringArrayDeserializer14.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer17 = stringArrayDeserializer14._elementDeserializer;
        stringArrayDeserializer8._elementDeserializer = strJsonDeserializer17;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer19 = stringArrayDeserializer8._elementDeserializer;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer19;
        java.util.Collection<java.lang.Object> objCollection21 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer22 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer23 = null;
        stringArrayDeserializer22._elementDeserializer = strJsonDeserializer23;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer25 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer22);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader26 = stringArrayDeserializer25.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer27 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer28 = null;
        stringArrayDeserializer27._elementDeserializer = strJsonDeserializer28;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer30 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer27);
        java.lang.String[] strArray31 = stringArrayDeserializer30.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer32 = stringArrayDeserializer30._elementDeserializer;
        stringArrayDeserializer25._elementDeserializer = strJsonDeserializer32;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer34 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer35 = null;
        stringArrayDeserializer34._elementDeserializer = strJsonDeserializer35;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer37 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer34);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader38 = stringArrayDeserializer37.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer39 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer40 = null;
        stringArrayDeserializer39._elementDeserializer = strJsonDeserializer40;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer42 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer39);
        java.lang.String[] strArray43 = stringArrayDeserializer42.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer44 = stringArrayDeserializer42._elementDeserializer;
        stringArrayDeserializer37._elementDeserializer = strJsonDeserializer44;
        stringArrayDeserializer25._elementDeserializer = strJsonDeserializer44;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer44;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer48 = stringArrayDeserializer0._elementDeserializer;
        java.lang.String[] strArray49 = stringArrayDeserializer0.getNullValue();
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer15);
        org.junit.Assert.assertNull(objCollection16);
        org.junit.Assert.assertNotNull(strJsonDeserializer17);
        org.junit.Assert.assertNotNull(strJsonDeserializer19);
        org.junit.Assert.assertNull(objCollection21);
        org.junit.Assert.assertNull(objectIdReader26);
        org.junit.Assert.assertNull(strArray31);
        org.junit.Assert.assertNotNull(strJsonDeserializer32);
        org.junit.Assert.assertNull(objectIdReader38);
        org.junit.Assert.assertNull(strArray43);
        org.junit.Assert.assertNotNull(strJsonDeserializer44);
        org.junit.Assert.assertNotNull(strJsonDeserializer48);
        org.junit.Assert.assertNull(strArray49);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        java.lang.Class<?> wildcardClass3 = stringArrayDeserializer1.handledType();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer1.handledType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer7 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        java.lang.Class<?> wildcardClass8 = stringArrayDeserializer1.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer10 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = stringArrayDeserializer1.getObjectIdReader();
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer10);
        org.junit.Assert.assertNull(objectIdReader11);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = stringArrayDeserializer1.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType6 = stringArrayDeserializer1.getValueType();
        java.lang.Class<?> wildcardClass7 = stringArrayDeserializer1.handledType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        java.lang.String[] strArray9 = stringArrayDeserializer8.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray12 = stringArrayDeserializer8.deserialize(jsonParser10, deserializationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = stringArrayDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer5 = stringArrayDeserializer0._elementDeserializer;
        boolean boolean6 = stringArrayDeserializer0.isCachable();
        boolean boolean7 = stringArrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType8 = stringArrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer9 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer10 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer9);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer10);
        boolean boolean12 = stringArrayDeserializer10.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer13 = stringArrayDeserializer10._elementDeserializer;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer14 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer15 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer14);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer16 = stringArrayDeserializer15.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer17 = null;
        stringArrayDeserializer15._elementDeserializer = strJsonDeserializer17;
        boolean boolean19 = stringArrayDeserializer15.isCachable();
        java.lang.Class<?> wildcardClass20 = stringArrayDeserializer15.handledType();
        java.lang.String[] strArray21 = stringArrayDeserializer15.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer22 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer15);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer23 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer24 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer25 = stringArrayDeserializer23.unwrappingDeserializer(nameTransformer24);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer26 = stringArrayDeserializer23.getDelegatee();
        java.lang.Class<?> wildcardClass27 = stringArrayDeserializer23.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer28 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer29 = null;
        stringArrayDeserializer28._elementDeserializer = strJsonDeserializer29;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer31 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer28);
        java.lang.String[] strArray32 = stringArrayDeserializer31.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer33 = stringArrayDeserializer31._elementDeserializer;
        stringArrayDeserializer23._elementDeserializer = strJsonDeserializer33;
        stringArrayDeserializer15._elementDeserializer = strJsonDeserializer33;
        stringArrayDeserializer10._elementDeserializer = strJsonDeserializer33;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer33;
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(strJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strJsonDeserializer13);
        org.junit.Assert.assertNull(wildcardJsonDeserializer16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer25);
        org.junit.Assert.assertNull(wildcardJsonDeserializer26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNull(strArray32);
        org.junit.Assert.assertNotNull(strJsonDeserializer33);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = stringArrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType4 = stringArrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        java.util.Collection<java.lang.Object> objCollection6 = stringArrayDeserializer0.getKnownPropertyNames();
        java.lang.String[] strArray7 = stringArrayDeserializer0.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = strArray7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(strArray7);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        java.lang.String[] strArray3 = stringArrayDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass5 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = stringArrayDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection7 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType9 = stringArrayDeserializer8.getValueType();
        java.util.Collection<java.lang.Object> objCollection10 = stringArrayDeserializer8.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType11 = stringArrayDeserializer8.getValueType();
        boolean boolean12 = stringArrayDeserializer8.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer14 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer13);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = stringArrayDeserializer14.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection16 = stringArrayDeserializer14.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer17 = stringArrayDeserializer14._elementDeserializer;
        stringArrayDeserializer8._elementDeserializer = strJsonDeserializer17;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer19 = stringArrayDeserializer8._elementDeserializer;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer19;
        java.util.Collection<java.lang.Object> objCollection21 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer22 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer23 = null;
        stringArrayDeserializer22._elementDeserializer = strJsonDeserializer23;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer25 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer22);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader26 = stringArrayDeserializer25.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer27 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer28 = null;
        stringArrayDeserializer27._elementDeserializer = strJsonDeserializer28;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer30 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer27);
        java.lang.String[] strArray31 = stringArrayDeserializer30.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer32 = stringArrayDeserializer30._elementDeserializer;
        stringArrayDeserializer25._elementDeserializer = strJsonDeserializer32;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer34 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer35 = null;
        stringArrayDeserializer34._elementDeserializer = strJsonDeserializer35;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer37 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer34);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader38 = stringArrayDeserializer37.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer39 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer40 = null;
        stringArrayDeserializer39._elementDeserializer = strJsonDeserializer40;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer42 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer39);
        java.lang.String[] strArray43 = stringArrayDeserializer42.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer44 = stringArrayDeserializer42._elementDeserializer;
        stringArrayDeserializer37._elementDeserializer = strJsonDeserializer44;
        stringArrayDeserializer25._elementDeserializer = strJsonDeserializer44;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer44;
        boolean boolean48 = stringArrayDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection49 = stringArrayDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass50 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer51 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JavaType javaType52 = stringArrayDeserializer0.getValueType();
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer15);
        org.junit.Assert.assertNull(objCollection16);
        org.junit.Assert.assertNotNull(strJsonDeserializer17);
        org.junit.Assert.assertNotNull(strJsonDeserializer19);
        org.junit.Assert.assertNull(objCollection21);
        org.junit.Assert.assertNull(objectIdReader26);
        org.junit.Assert.assertNull(strArray31);
        org.junit.Assert.assertNotNull(strJsonDeserializer32);
        org.junit.Assert.assertNull(objectIdReader38);
        org.junit.Assert.assertNull(strArray43);
        org.junit.Assert.assertNotNull(strJsonDeserializer44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(objCollection49);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNull(javaType52);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.String[] strArray7 = stringArrayDeserializer1.getNullValue();
        java.lang.String[] strArray8 = stringArrayDeserializer1.getEmptyValue();
        java.lang.String[] strArray9 = stringArrayDeserializer1.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType10 = stringArrayDeserializer1.getValueType();
        java.lang.String[] strArray11 = stringArrayDeserializer1.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer12 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer14 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer13);
        java.lang.Class<?> wildcardClass15 = stringArrayDeserializer1.getValueClass();
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = stringArrayDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.handledType();
        java.lang.String[] strArray5 = stringArrayDeserializer0.getNullValue();
        java.lang.String[] strArray6 = stringArrayDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection7 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType9 = stringArrayDeserializer8.getValueType();
        java.util.Collection<java.lang.Object> objCollection10 = stringArrayDeserializer8.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType11 = stringArrayDeserializer8.getValueType();
        boolean boolean12 = stringArrayDeserializer8.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer14 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer13);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = stringArrayDeserializer14.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection16 = stringArrayDeserializer14.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer17 = stringArrayDeserializer14._elementDeserializer;
        stringArrayDeserializer8._elementDeserializer = strJsonDeserializer17;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader19 = stringArrayDeserializer8.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader20 = stringArrayDeserializer8.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer21 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType22 = stringArrayDeserializer21.getValueType();
        java.util.Collection<java.lang.Object> objCollection23 = stringArrayDeserializer21.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType24 = stringArrayDeserializer21.getValueType();
        boolean boolean25 = stringArrayDeserializer21.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer26 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer27 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer26);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer28 = stringArrayDeserializer27.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection29 = stringArrayDeserializer27.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer30 = stringArrayDeserializer27._elementDeserializer;
        stringArrayDeserializer21._elementDeserializer = strJsonDeserializer30;
        stringArrayDeserializer8._elementDeserializer = strJsonDeserializer30;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer30;
        com.fasterxml.jackson.core.JsonParser jsonParser34 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext35 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = stringArrayDeserializer0.deserializeWithType(jsonParser34, deserializationContext35, typeDeserializer36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer15);
        org.junit.Assert.assertNull(objCollection16);
        org.junit.Assert.assertNotNull(strJsonDeserializer17);
        org.junit.Assert.assertNull(objectIdReader19);
        org.junit.Assert.assertNull(objectIdReader20);
        org.junit.Assert.assertNull(javaType22);
        org.junit.Assert.assertNull(objCollection23);
        org.junit.Assert.assertNull(javaType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer28);
        org.junit.Assert.assertNull(objCollection29);
        org.junit.Assert.assertNotNull(strJsonDeserializer30);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        java.lang.Class<?> wildcardClass3 = stringArrayDeserializer1.handledType();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer1.handledType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = stringArrayDeserializer1.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray10 = stringArrayDeserializer1.deserialize(jsonParser8, deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objectIdReader7);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = stringArrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer0.getDelegatee();
        java.lang.String[] strArray3 = stringArrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer4 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        java.lang.Class<?> wildcardClass5 = stringArrayDeserializer4.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer7 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer6);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = stringArrayDeserializer7.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer9 = null;
        stringArrayDeserializer7._elementDeserializer = strJsonDeserializer9;
        boolean boolean11 = stringArrayDeserializer7.isCachable();
        java.lang.Class<?> wildcardClass12 = stringArrayDeserializer7.handledType();
        java.lang.String[] strArray13 = stringArrayDeserializer7.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer14 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer7);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer15 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer17 = stringArrayDeserializer15.unwrappingDeserializer(nameTransformer16);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer18 = stringArrayDeserializer15.getDelegatee();
        java.lang.Class<?> wildcardClass19 = stringArrayDeserializer15.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer20 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer21 = null;
        stringArrayDeserializer20._elementDeserializer = strJsonDeserializer21;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer23 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer20);
        java.lang.String[] strArray24 = stringArrayDeserializer23.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer25 = stringArrayDeserializer23._elementDeserializer;
        stringArrayDeserializer15._elementDeserializer = strJsonDeserializer25;
        stringArrayDeserializer7._elementDeserializer = strJsonDeserializer25;
        stringArrayDeserializer4._elementDeserializer = strJsonDeserializer25;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer25;
        java.lang.String[] strArray30 = stringArrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser31 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext32 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer33 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = stringArrayDeserializer0.deserializeWithType(jsonParser31, deserializationContext32, typeDeserializer33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(stringArrayDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer17);
        org.junit.Assert.assertNull(wildcardJsonDeserializer18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNotNull(strJsonDeserializer25);
        org.junit.Assert.assertNull(strArray30);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        java.lang.Class<?> wildcardClass2 = stringArrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = stringArrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = stringArrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = stringArrayDeserializer0.createContextual(deserializationContext5, beanProperty6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = stringArrayDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer5);
        java.lang.String[] strArray7 = stringArrayDeserializer5.getNullValue();
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(strArray7);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = stringArrayDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer7 = null;
        stringArrayDeserializer6._elementDeserializer = strJsonDeserializer7;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer9 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer6);
        java.lang.String[] strArray10 = stringArrayDeserializer9.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer11 = stringArrayDeserializer9._elementDeserializer;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer11;
        java.util.Collection<java.lang.Object> objCollection13 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer15 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer14);
        com.fasterxml.jackson.databind.JavaType javaType16 = stringArrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer17 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(strJsonDeserializer11);
        org.junit.Assert.assertNull(objCollection13);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer15);
        org.junit.Assert.assertNull(javaType16);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = stringArrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType4 = stringArrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer6 = stringArrayDeserializer5._elementDeserializer;
        boolean boolean7 = stringArrayDeserializer5.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType8 = stringArrayDeserializer5.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer9 = null;
        stringArrayDeserializer5._elementDeserializer = strJsonDeserializer9;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer11 = stringArrayDeserializer5._elementDeserializer;
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(strJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(strJsonDeserializer11);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = stringArrayDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer6 = null;
        stringArrayDeserializer5._elementDeserializer = strJsonDeserializer6;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer5);
        java.lang.String[] strArray9 = stringArrayDeserializer8.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer10 = stringArrayDeserializer8._elementDeserializer;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer10;
        java.lang.Class<?> wildcardClass12 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer13 = stringArrayDeserializer0._elementDeserializer;
        java.lang.Class<?> wildcardClass14 = stringArrayDeserializer0.getClass();
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strJsonDeserializer10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(strJsonDeserializer13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JavaType javaType4 = stringArrayDeserializer3.getValueType();
        java.lang.Class<?> wildcardClass5 = stringArrayDeserializer3.handledType();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer3.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer7 = null;
        stringArrayDeserializer3._elementDeserializer = strJsonDeserializer7;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = stringArrayDeserializer3.getObjectIdReader();
        java.lang.Class<?> wildcardClass10 = stringArrayDeserializer3.handledType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer3);
        java.util.Collection<java.lang.Object> objCollection12 = stringArrayDeserializer11.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType14 = stringArrayDeserializer13.getValueType();
        java.util.Collection<java.lang.Object> objCollection15 = stringArrayDeserializer13.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer16 = stringArrayDeserializer13.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer17 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer18 = null;
        stringArrayDeserializer17._elementDeserializer = strJsonDeserializer18;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer20 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer17);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader21 = stringArrayDeserializer20.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer22 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer23 = null;
        stringArrayDeserializer22._elementDeserializer = strJsonDeserializer23;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer25 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer22);
        java.lang.String[] strArray26 = stringArrayDeserializer25.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer27 = stringArrayDeserializer25._elementDeserializer;
        stringArrayDeserializer20._elementDeserializer = strJsonDeserializer27;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer29 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer30 = null;
        stringArrayDeserializer29._elementDeserializer = strJsonDeserializer30;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer32 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer29);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader33 = stringArrayDeserializer32.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer34 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer35 = null;
        stringArrayDeserializer34._elementDeserializer = strJsonDeserializer35;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer37 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer34);
        java.lang.String[] strArray38 = stringArrayDeserializer37.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer39 = stringArrayDeserializer37._elementDeserializer;
        stringArrayDeserializer32._elementDeserializer = strJsonDeserializer39;
        stringArrayDeserializer20._elementDeserializer = strJsonDeserializer39;
        java.util.Collection<java.lang.Object> objCollection42 = stringArrayDeserializer20.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType43 = stringArrayDeserializer20.getValueType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer44 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer45 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer46 = stringArrayDeserializer44.unwrappingDeserializer(nameTransformer45);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer47 = stringArrayDeserializer44.getDelegatee();
        java.lang.Class<?> wildcardClass48 = stringArrayDeserializer44.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer49 = stringArrayDeserializer44._elementDeserializer;
        boolean boolean50 = stringArrayDeserializer44.isCachable();
        java.lang.String[] strArray51 = stringArrayDeserializer44.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer52 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        java.lang.Class<?> wildcardClass53 = stringArrayDeserializer52.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer54 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer55 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer54);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer56 = stringArrayDeserializer55.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer57 = null;
        stringArrayDeserializer55._elementDeserializer = strJsonDeserializer57;
        boolean boolean59 = stringArrayDeserializer55.isCachable();
        java.lang.Class<?> wildcardClass60 = stringArrayDeserializer55.handledType();
        java.lang.String[] strArray61 = stringArrayDeserializer55.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer62 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer55);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer63 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer64 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer65 = stringArrayDeserializer63.unwrappingDeserializer(nameTransformer64);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer66 = stringArrayDeserializer63.getDelegatee();
        java.lang.Class<?> wildcardClass67 = stringArrayDeserializer63.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer68 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer69 = null;
        stringArrayDeserializer68._elementDeserializer = strJsonDeserializer69;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer71 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer68);
        java.lang.String[] strArray72 = stringArrayDeserializer71.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer73 = stringArrayDeserializer71._elementDeserializer;
        stringArrayDeserializer63._elementDeserializer = strJsonDeserializer73;
        stringArrayDeserializer55._elementDeserializer = strJsonDeserializer73;
        stringArrayDeserializer52._elementDeserializer = strJsonDeserializer73;
        stringArrayDeserializer44._elementDeserializer = strJsonDeserializer73;
        stringArrayDeserializer20._elementDeserializer = strJsonDeserializer73;
        stringArrayDeserializer13._elementDeserializer = strJsonDeserializer73;
        stringArrayDeserializer11._elementDeserializer = strJsonDeserializer73;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty82 = stringArrayDeserializer11.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(objCollection12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNull(objCollection15);
        org.junit.Assert.assertNull(wildcardJsonDeserializer16);
        org.junit.Assert.assertNull(objectIdReader21);
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertNotNull(strJsonDeserializer27);
        org.junit.Assert.assertNull(objectIdReader33);
        org.junit.Assert.assertNull(strArray38);
        org.junit.Assert.assertNotNull(strJsonDeserializer39);
        org.junit.Assert.assertNull(objCollection42);
        org.junit.Assert.assertNull(javaType43);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer46);
        org.junit.Assert.assertNull(wildcardJsonDeserializer47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNull(strJsonDeserializer49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(strArray51);
        org.junit.Assert.assertNotNull(stringArrayDeserializer52);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNull(wildcardJsonDeserializer56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNull(strArray61);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer65);
        org.junit.Assert.assertNull(wildcardJsonDeserializer66);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNull(strArray72);
        org.junit.Assert.assertNotNull(strJsonDeserializer73);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = stringArrayDeserializer1.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType6 = stringArrayDeserializer1.getValueType();
        java.lang.Class<?> wildcardClass7 = stringArrayDeserializer1.handledType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer10 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer12 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer13 = stringArrayDeserializer12._elementDeserializer;
        java.lang.Class<?> wildcardClass14 = strJsonDeserializer13.getClass();
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer10);
        org.junit.Assert.assertNotNull(strJsonDeserializer13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer7 = null;
        stringArrayDeserializer6._elementDeserializer = strJsonDeserializer7;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer9 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = stringArrayDeserializer9.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer12 = null;
        stringArrayDeserializer11._elementDeserializer = strJsonDeserializer12;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer14 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer11);
        java.lang.String[] strArray15 = stringArrayDeserializer14.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer16 = stringArrayDeserializer14._elementDeserializer;
        stringArrayDeserializer9._elementDeserializer = strJsonDeserializer16;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer18 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer19 = null;
        stringArrayDeserializer18._elementDeserializer = strJsonDeserializer19;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer21 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer18);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader22 = stringArrayDeserializer21.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer23 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer24 = null;
        stringArrayDeserializer23._elementDeserializer = strJsonDeserializer24;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer26 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer23);
        java.lang.String[] strArray27 = stringArrayDeserializer26.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer28 = stringArrayDeserializer26._elementDeserializer;
        stringArrayDeserializer21._elementDeserializer = strJsonDeserializer28;
        stringArrayDeserializer9._elementDeserializer = strJsonDeserializer28;
        stringArrayDeserializer5._elementDeserializer = strJsonDeserializer28;
        com.fasterxml.jackson.databind.JavaType javaType32 = stringArrayDeserializer5.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext33 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty34 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer35 = stringArrayDeserializer5.createContextual(deserializationContext33, beanProperty34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectIdReader10);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(strJsonDeserializer16);
        org.junit.Assert.assertNull(objectIdReader22);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertNotNull(strJsonDeserializer28);
        org.junit.Assert.assertNull(javaType32);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = stringArrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer0.getDelegatee();
        java.lang.String[] strArray3 = stringArrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = stringArrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer6 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = stringArrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType8 = stringArrayDeserializer0.getValueType();
        java.lang.String[] strArray9 = stringArrayDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass10 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = stringArrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = stringArrayDeserializer0.createContextual(deserializationContext12, beanProperty13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(objectIdReader11);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JavaType javaType4 = stringArrayDeserializer3.getValueType();
        java.lang.Class<?> wildcardClass5 = stringArrayDeserializer3.handledType();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer3.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer7 = null;
        stringArrayDeserializer3._elementDeserializer = strJsonDeserializer7;
        java.util.Collection<java.lang.Object> objCollection9 = stringArrayDeserializer3.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass10 = stringArrayDeserializer3.handledType();
        java.lang.Class<?> wildcardClass11 = stringArrayDeserializer3.handledType();
        com.fasterxml.jackson.databind.JavaType javaType12 = stringArrayDeserializer3.getValueType();
        java.lang.String[] strArray13 = stringArrayDeserializer3.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType14 = stringArrayDeserializer3.getValueType();
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(javaType14);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = stringArrayDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection2 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType3 = stringArrayDeserializer0.getValueType();
        boolean boolean4 = stringArrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer5);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = stringArrayDeserializer6.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection8 = stringArrayDeserializer6.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer9 = stringArrayDeserializer6._elementDeserializer;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer9;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = stringArrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = stringArrayDeserializer0.createContextual(deserializationContext13, beanProperty14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNotNull(strJsonDeserializer9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer12);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.String[] strArray7 = stringArrayDeserializer1.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer9 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer10 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer12 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        boolean boolean14 = stringArrayDeserializer13.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader15 = stringArrayDeserializer13.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser16 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext17 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = stringArrayDeserializer13.deserializeWithType(jsonParser16, deserializationContext17, typeDeserializer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer9);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(objectIdReader15);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.String[] strArray7 = stringArrayDeserializer1.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer9 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer8);
        java.util.Collection<java.lang.Object> objCollection10 = strArrayJsonDeserializer9.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer12 = strArrayJsonDeserializer9.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(strArrayJsonDeserializer9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer15 = stringArrayDeserializer13.unwrappingDeserializer(nameTransformer14);
        com.fasterxml.jackson.databind.JavaType javaType16 = stringArrayDeserializer13.getValueType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer17 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer13);
        java.lang.String[] strArray18 = stringArrayDeserializer13.getNullValue();
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer12);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer15);
        org.junit.Assert.assertNull(javaType16);
        org.junit.Assert.assertNull(strArray18);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = stringArrayDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection2 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType3 = stringArrayDeserializer0.getValueType();
        boolean boolean4 = stringArrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer6 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.JavaType javaType7 = stringArrayDeserializer0.getValueType();
        java.lang.String[] strArray8 = stringArrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = stringArrayDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection10 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer12 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer11);
        java.util.Collection<java.lang.Object> objCollection13 = strArrayJsonDeserializer12.getKnownPropertyNames();
        java.lang.String[] strArray14 = strArrayJsonDeserializer12.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer16 = strArrayJsonDeserializer12.unwrappingDeserializer(nameTransformer15);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer12);
        org.junit.Assert.assertNull(objCollection13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer16);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.String[] strArray7 = stringArrayDeserializer1.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer9 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer10 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = stringArrayDeserializer1.getDelegatee();
        boolean boolean12 = stringArrayDeserializer1.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer14 = null;
        stringArrayDeserializer13._elementDeserializer = strJsonDeserializer14;
        java.util.Collection<java.lang.Object> objCollection16 = stringArrayDeserializer13.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass17 = stringArrayDeserializer13.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer18 = null;
        stringArrayDeserializer13._elementDeserializer = strJsonDeserializer18;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer20 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer21 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer22 = stringArrayDeserializer20.unwrappingDeserializer(nameTransformer21);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer23 = stringArrayDeserializer20.getDelegatee();
        java.lang.Class<?> wildcardClass24 = stringArrayDeserializer20.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer25 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer26 = null;
        stringArrayDeserializer25._elementDeserializer = strJsonDeserializer26;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer28 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer25);
        java.lang.String[] strArray29 = stringArrayDeserializer28.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer30 = stringArrayDeserializer28._elementDeserializer;
        stringArrayDeserializer20._elementDeserializer = strJsonDeserializer30;
        stringArrayDeserializer13._elementDeserializer = strJsonDeserializer30;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer30;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer34 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser35 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext36 = null;
        java.lang.String[] strArray37 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray38 = stringArrayDeserializer1.deserialize(jsonParser35, deserializationContext36, strArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type [Ljava.lang.String; (by deserializer of type com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(objCollection16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer22);
        org.junit.Assert.assertNull(wildcardJsonDeserializer23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNull(strArray29);
        org.junit.Assert.assertNotNull(strJsonDeserializer30);
        org.junit.Assert.assertNull(wildcardJsonDeserializer34);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] {});
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer4 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer6 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer7 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer9 = stringArrayDeserializer7.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.JavaType javaType10 = stringArrayDeserializer7.getValueType();
        java.lang.Class<?> wildcardClass11 = stringArrayDeserializer7.handledType();
        boolean boolean12 = stringArrayDeserializer7.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer14 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer13);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = stringArrayDeserializer14.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer16 = null;
        stringArrayDeserializer14._elementDeserializer = strJsonDeserializer16;
        boolean boolean18 = stringArrayDeserializer14.isCachable();
        java.lang.Class<?> wildcardClass19 = stringArrayDeserializer14.handledType();
        java.lang.String[] strArray20 = stringArrayDeserializer14.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer21 = stringArrayDeserializer14._elementDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType22 = stringArrayDeserializer14.getValueType();
        java.util.Collection<java.lang.Object> objCollection23 = stringArrayDeserializer14.getKnownPropertyNames();
        java.lang.String[] strArray24 = stringArrayDeserializer14.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer25 = stringArrayDeserializer14.getDelegatee();
        java.lang.Class<?> wildcardClass26 = stringArrayDeserializer14.getValueClass();
        java.lang.Class<?> wildcardClass27 = stringArrayDeserializer14.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer28 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer29 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer30 = stringArrayDeserializer28.unwrappingDeserializer(nameTransformer29);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer31 = stringArrayDeserializer28.getDelegatee();
        java.lang.Class<?> wildcardClass32 = stringArrayDeserializer28.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer33 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer34 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer35 = stringArrayDeserializer33.unwrappingDeserializer(nameTransformer34);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer36 = stringArrayDeserializer33.getDelegatee();
        java.lang.Class<?> wildcardClass37 = stringArrayDeserializer33.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer38 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer39 = null;
        stringArrayDeserializer38._elementDeserializer = strJsonDeserializer39;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer41 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer38);
        java.lang.String[] strArray42 = stringArrayDeserializer41.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer43 = stringArrayDeserializer41._elementDeserializer;
        stringArrayDeserializer33._elementDeserializer = strJsonDeserializer43;
        stringArrayDeserializer28._elementDeserializer = strJsonDeserializer43;
        stringArrayDeserializer14._elementDeserializer = strJsonDeserializer43;
        stringArrayDeserializer7._elementDeserializer = strJsonDeserializer43;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer43;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer49 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer50 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer49);
        java.lang.Class<?> wildcardClass51 = stringArrayDeserializer1.handledType();
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer4);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer6);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNull(strJsonDeserializer21);
        org.junit.Assert.assertNull(javaType22);
        org.junit.Assert.assertNull(objCollection23);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNull(wildcardJsonDeserializer25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer30);
        org.junit.Assert.assertNull(wildcardJsonDeserializer31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer35);
        org.junit.Assert.assertNull(wildcardJsonDeserializer36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNull(strArray42);
        org.junit.Assert.assertNotNull(strJsonDeserializer43);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer50);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = stringArrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass5 = stringArrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType7 = stringArrayDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass8 = stringArrayDeserializer0.getValueClass();
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        java.lang.String[] strArray3 = stringArrayDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.getValueClass();
        boolean boolean5 = stringArrayDeserializer0.isCachable();
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.String[] strArray7 = stringArrayDeserializer1.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer9 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer8);
        java.util.Collection<java.lang.Object> objCollection10 = strArrayJsonDeserializer9.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer12 = strArrayJsonDeserializer9.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(strArrayJsonDeserializer9);
        java.util.Collection<java.lang.Object> objCollection14 = stringArrayDeserializer13.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass15 = stringArrayDeserializer13.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer16 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer17 = null;
        stringArrayDeserializer16._elementDeserializer = strJsonDeserializer17;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer19 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer16);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader20 = stringArrayDeserializer19.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer21 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer22 = null;
        stringArrayDeserializer21._elementDeserializer = strJsonDeserializer22;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer24 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer21);
        java.lang.String[] strArray25 = stringArrayDeserializer24.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer26 = stringArrayDeserializer24._elementDeserializer;
        stringArrayDeserializer19._elementDeserializer = strJsonDeserializer26;
        java.lang.String[] strArray28 = stringArrayDeserializer19.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer29 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer30 = stringArrayDeserializer19.unwrappingDeserializer(nameTransformer29);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer31 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer32 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer31);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer33 = stringArrayDeserializer32.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer34 = null;
        stringArrayDeserializer32._elementDeserializer = strJsonDeserializer34;
        boolean boolean36 = stringArrayDeserializer32.isCachable();
        java.lang.Class<?> wildcardClass37 = stringArrayDeserializer32.handledType();
        java.lang.String[] strArray38 = stringArrayDeserializer32.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer39 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer32);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer40 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer41 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer42 = stringArrayDeserializer40.unwrappingDeserializer(nameTransformer41);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer43 = stringArrayDeserializer40.getDelegatee();
        java.lang.Class<?> wildcardClass44 = stringArrayDeserializer40.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer45 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer46 = null;
        stringArrayDeserializer45._elementDeserializer = strJsonDeserializer46;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer48 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer45);
        java.lang.String[] strArray49 = stringArrayDeserializer48.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer50 = stringArrayDeserializer48._elementDeserializer;
        stringArrayDeserializer40._elementDeserializer = strJsonDeserializer50;
        stringArrayDeserializer32._elementDeserializer = strJsonDeserializer50;
        stringArrayDeserializer19._elementDeserializer = strJsonDeserializer50;
        stringArrayDeserializer13._elementDeserializer = strJsonDeserializer50;
        java.lang.Class<?> wildcardClass55 = stringArrayDeserializer13.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser56 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext57 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer58 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj59 = stringArrayDeserializer13.deserializeWithType(jsonParser56, deserializationContext57, typeDeserializer58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer12);
        org.junit.Assert.assertNull(objCollection14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(objectIdReader20);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertNotNull(strJsonDeserializer26);
        org.junit.Assert.assertNull(strArray28);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer30);
        org.junit.Assert.assertNull(wildcardJsonDeserializer33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNull(strArray38);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer42);
        org.junit.Assert.assertNull(wildcardJsonDeserializer43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNull(strArray49);
        org.junit.Assert.assertNotNull(strJsonDeserializer50);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.String[] strArray7 = stringArrayDeserializer1.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer9 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer10 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer12 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        com.fasterxml.jackson.databind.JavaType javaType14 = stringArrayDeserializer13.getValueType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer15 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer13);
        boolean boolean16 = stringArrayDeserializer15.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer17 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer18 = stringArrayDeserializer15.unwrappingDeserializer(nameTransformer17);
        com.fasterxml.jackson.databind.JavaType javaType19 = stringArrayDeserializer15.getValueType();
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer9);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer18);
        org.junit.Assert.assertNull(javaType19);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.lang.Class<?> wildcardClass3 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = stringArrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer7 = stringArrayDeserializer5.unwrappingDeserializer(nameTransformer6);
        boolean boolean8 = strArrayJsonDeserializer7.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = strArrayJsonDeserializer7.getObjectIdReader();
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectIdReader9);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = stringArrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass5 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        java.lang.String[] strArray7 = stringArrayDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection8 = stringArrayDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass9 = stringArrayDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection10 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = stringArrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        java.lang.String[] strArray14 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray15 = stringArrayDeserializer0.deserialize(jsonParser12, deserializationContext13, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type [Ljava.lang.String; (by deserializer of type com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = stringArrayDeserializer0.getValueType();
        java.lang.String[] strArray2 = stringArrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer4 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = stringArrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JavaType javaType7 = stringArrayDeserializer6.getValueType();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(javaType7);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer5 = stringArrayDeserializer3.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer7 = strArrayJsonDeserializer5.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = strArrayJsonDeserializer5.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer9 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(strArrayJsonDeserializer5);
        com.fasterxml.jackson.databind.JavaType javaType10 = stringArrayDeserializer9.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray13 = stringArrayDeserializer9._deserializeCustom(jsonParser11, deserializationContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer5);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNull(javaType10);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = stringArrayDeserializer3.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer6 = null;
        stringArrayDeserializer5._elementDeserializer = strJsonDeserializer6;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer5);
        java.lang.String[] strArray9 = stringArrayDeserializer8.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer10 = stringArrayDeserializer8._elementDeserializer;
        stringArrayDeserializer3._elementDeserializer = strJsonDeserializer10;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer12 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer13 = null;
        stringArrayDeserializer12._elementDeserializer = strJsonDeserializer13;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer15 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer12);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader16 = stringArrayDeserializer15.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer17 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer18 = null;
        stringArrayDeserializer17._elementDeserializer = strJsonDeserializer18;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer20 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer17);
        java.lang.String[] strArray21 = stringArrayDeserializer20.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer22 = stringArrayDeserializer20._elementDeserializer;
        stringArrayDeserializer15._elementDeserializer = strJsonDeserializer22;
        stringArrayDeserializer3._elementDeserializer = strJsonDeserializer22;
        java.util.Collection<java.lang.Object> objCollection25 = stringArrayDeserializer3.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType26 = stringArrayDeserializer3.getValueType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer27 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer28 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer29 = stringArrayDeserializer27.unwrappingDeserializer(nameTransformer28);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer30 = stringArrayDeserializer27.getDelegatee();
        java.lang.Class<?> wildcardClass31 = stringArrayDeserializer27.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer32 = stringArrayDeserializer27._elementDeserializer;
        boolean boolean33 = stringArrayDeserializer27.isCachable();
        java.lang.String[] strArray34 = stringArrayDeserializer27.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer35 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        java.lang.Class<?> wildcardClass36 = stringArrayDeserializer35.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer37 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer38 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer37);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer39 = stringArrayDeserializer38.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer40 = null;
        stringArrayDeserializer38._elementDeserializer = strJsonDeserializer40;
        boolean boolean42 = stringArrayDeserializer38.isCachable();
        java.lang.Class<?> wildcardClass43 = stringArrayDeserializer38.handledType();
        java.lang.String[] strArray44 = stringArrayDeserializer38.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer45 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer38);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer46 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer47 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer48 = stringArrayDeserializer46.unwrappingDeserializer(nameTransformer47);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer49 = stringArrayDeserializer46.getDelegatee();
        java.lang.Class<?> wildcardClass50 = stringArrayDeserializer46.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer51 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer52 = null;
        stringArrayDeserializer51._elementDeserializer = strJsonDeserializer52;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer54 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer51);
        java.lang.String[] strArray55 = stringArrayDeserializer54.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer56 = stringArrayDeserializer54._elementDeserializer;
        stringArrayDeserializer46._elementDeserializer = strJsonDeserializer56;
        stringArrayDeserializer38._elementDeserializer = strJsonDeserializer56;
        stringArrayDeserializer35._elementDeserializer = strJsonDeserializer56;
        stringArrayDeserializer27._elementDeserializer = strJsonDeserializer56;
        stringArrayDeserializer3._elementDeserializer = strJsonDeserializer56;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer62 = stringArrayDeserializer3._elementDeserializer;
        java.lang.String[] strArray63 = stringArrayDeserializer3.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer64 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer3);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer65 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer64);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer66 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer67 = stringArrayDeserializer64.unwrappingDeserializer(nameTransformer66);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strJsonDeserializer10);
        org.junit.Assert.assertNull(objectIdReader16);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNotNull(strJsonDeserializer22);
        org.junit.Assert.assertNull(objCollection25);
        org.junit.Assert.assertNull(javaType26);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer29);
        org.junit.Assert.assertNull(wildcardJsonDeserializer30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNull(strJsonDeserializer32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(strArray34);
        org.junit.Assert.assertNotNull(stringArrayDeserializer35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNull(wildcardJsonDeserializer39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer48);
        org.junit.Assert.assertNull(wildcardJsonDeserializer49);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNull(strArray55);
        org.junit.Assert.assertNotNull(strJsonDeserializer56);
        org.junit.Assert.assertNotNull(strJsonDeserializer62);
        org.junit.Assert.assertNull(strArray63);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer67);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JavaType javaType4 = stringArrayDeserializer3.getValueType();
        java.lang.String[] strArray5 = stringArrayDeserializer3.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = stringArrayDeserializer3.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer7 = stringArrayDeserializer3._elementDeserializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer9 = stringArrayDeserializer3.unwrappingDeserializer(nameTransformer8);
        java.lang.String[] strArray10 = strArrayJsonDeserializer9.getNullValue();
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(strJsonDeserializer7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer9);
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType3 = stringArrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = stringArrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        java.lang.String[] strArray6 = stringArrayDeserializer0.getNullValue();
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(strArray6);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.String[] strArray7 = stringArrayDeserializer1.getNullValue();
        java.lang.String[] strArray8 = stringArrayDeserializer1.getEmptyValue();
        java.lang.String[] strArray9 = stringArrayDeserializer1.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer10 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer10);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = stringArrayDeserializer11.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection13 = stringArrayDeserializer11.getKnownPropertyNames();
        java.lang.String[] strArray14 = stringArrayDeserializer11.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer15 = stringArrayDeserializer11._elementDeserializer;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer15;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer17 = stringArrayDeserializer1.getDelegatee();
        java.lang.String[] strArray18 = stringArrayDeserializer1.getEmptyValue();
        java.lang.String[] strArray19 = stringArrayDeserializer1.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer20 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType21 = stringArrayDeserializer20.getValueType();
        java.util.Collection<java.lang.Object> objCollection22 = stringArrayDeserializer20.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType23 = stringArrayDeserializer20.getValueType();
        boolean boolean24 = stringArrayDeserializer20.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer25 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer26 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer25);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer27 = stringArrayDeserializer26.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection28 = stringArrayDeserializer26.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer29 = stringArrayDeserializer26._elementDeserializer;
        stringArrayDeserializer20._elementDeserializer = strJsonDeserializer29;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer31 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer20);
        java.lang.Class<?> wildcardClass32 = stringArrayDeserializer31.handledType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer33 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType34 = stringArrayDeserializer33.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer35 = null;
        stringArrayDeserializer33._elementDeserializer = strJsonDeserializer35;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer37 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer38 = null;
        stringArrayDeserializer37._elementDeserializer = strJsonDeserializer38;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer40 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer37);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader41 = stringArrayDeserializer40.getObjectIdReader();
        java.lang.String[] strArray42 = stringArrayDeserializer40.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer43 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer44 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer43);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer45 = stringArrayDeserializer44.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer46 = null;
        stringArrayDeserializer44._elementDeserializer = strJsonDeserializer46;
        boolean boolean48 = stringArrayDeserializer44.isCachable();
        java.lang.Class<?> wildcardClass49 = stringArrayDeserializer44.handledType();
        java.lang.String[] strArray50 = stringArrayDeserializer44.getNullValue();
        java.lang.String[] strArray51 = stringArrayDeserializer44.getEmptyValue();
        java.lang.Class<?> wildcardClass52 = stringArrayDeserializer44.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer53 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer54 = null;
        stringArrayDeserializer53._elementDeserializer = strJsonDeserializer54;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer56 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer53);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader57 = stringArrayDeserializer56.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer58 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer59 = null;
        stringArrayDeserializer58._elementDeserializer = strJsonDeserializer59;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer61 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer58);
        java.lang.String[] strArray62 = stringArrayDeserializer61.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer63 = stringArrayDeserializer61._elementDeserializer;
        stringArrayDeserializer56._elementDeserializer = strJsonDeserializer63;
        java.lang.String[] strArray65 = stringArrayDeserializer56.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer66 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer67 = stringArrayDeserializer56.unwrappingDeserializer(nameTransformer66);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer68 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer69 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer68);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer70 = stringArrayDeserializer69.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer71 = null;
        stringArrayDeserializer69._elementDeserializer = strJsonDeserializer71;
        boolean boolean73 = stringArrayDeserializer69.isCachable();
        java.lang.Class<?> wildcardClass74 = stringArrayDeserializer69.handledType();
        java.lang.String[] strArray75 = stringArrayDeserializer69.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer76 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer69);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer77 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer78 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer79 = stringArrayDeserializer77.unwrappingDeserializer(nameTransformer78);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer80 = stringArrayDeserializer77.getDelegatee();
        java.lang.Class<?> wildcardClass81 = stringArrayDeserializer77.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer82 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer83 = null;
        stringArrayDeserializer82._elementDeserializer = strJsonDeserializer83;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer85 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer82);
        java.lang.String[] strArray86 = stringArrayDeserializer85.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer87 = stringArrayDeserializer85._elementDeserializer;
        stringArrayDeserializer77._elementDeserializer = strJsonDeserializer87;
        stringArrayDeserializer69._elementDeserializer = strJsonDeserializer87;
        stringArrayDeserializer56._elementDeserializer = strJsonDeserializer87;
        stringArrayDeserializer44._elementDeserializer = strJsonDeserializer87;
        stringArrayDeserializer40._elementDeserializer = strJsonDeserializer87;
        stringArrayDeserializer33._elementDeserializer = strJsonDeserializer87;
        stringArrayDeserializer31._elementDeserializer = strJsonDeserializer87;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer87;
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer12);
        org.junit.Assert.assertNull(objCollection13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(strJsonDeserializer15);
        org.junit.Assert.assertNull(wildcardJsonDeserializer17);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertNull(objCollection22);
        org.junit.Assert.assertNull(javaType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer27);
        org.junit.Assert.assertNull(objCollection28);
        org.junit.Assert.assertNotNull(strJsonDeserializer29);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNull(javaType34);
        org.junit.Assert.assertNull(objectIdReader41);
        org.junit.Assert.assertNull(strArray42);
        org.junit.Assert.assertNull(wildcardJsonDeserializer45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNull(strArray50);
        org.junit.Assert.assertNull(strArray51);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNull(objectIdReader57);
        org.junit.Assert.assertNull(strArray62);
        org.junit.Assert.assertNotNull(strJsonDeserializer63);
        org.junit.Assert.assertNull(strArray65);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer67);
        org.junit.Assert.assertNull(wildcardJsonDeserializer70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNull(strArray75);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer79);
        org.junit.Assert.assertNull(wildcardJsonDeserializer80);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertNull(strArray86);
        org.junit.Assert.assertNotNull(strJsonDeserializer87);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        boolean boolean6 = stringArrayDeserializer1.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer7 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        java.lang.String[] strArray8 = stringArrayDeserializer1.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer9 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray12 = stringArrayDeserializer1._deserializeCustom(jsonParser10, deserializationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = stringArrayDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer7 = stringArrayDeserializer5.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = stringArrayDeserializer5.getDelegatee();
        java.lang.Class<?> wildcardClass9 = stringArrayDeserializer5.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer10 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer11 = null;
        stringArrayDeserializer10._elementDeserializer = strJsonDeserializer11;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer10);
        java.lang.String[] strArray14 = stringArrayDeserializer13.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer15 = stringArrayDeserializer13._elementDeserializer;
        stringArrayDeserializer5._elementDeserializer = strJsonDeserializer15;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer15;
        boolean boolean18 = stringArrayDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(strJsonDeserializer15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = stringArrayDeserializer0.getValueType();
        java.lang.String[] strArray2 = stringArrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer4 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(strArrayJsonDeserializer4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = stringArrayDeserializer5.getObjectIdReader();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer4);
        org.junit.Assert.assertNull(objectIdReader6);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        java.lang.String[] strArray1 = stringArrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType3 = stringArrayDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = stringArrayDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection6 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stringArrayDeserializer0.deserializeWithType(jsonParser7, deserializationContext8, typeDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = stringArrayDeserializer1.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        java.util.Collection<java.lang.Object> objCollection4 = stringArrayDeserializer3.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer5);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = stringArrayDeserializer6.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer8 = null;
        stringArrayDeserializer6._elementDeserializer = strJsonDeserializer8;
        boolean boolean10 = stringArrayDeserializer6.isCachable();
        java.lang.Class<?> wildcardClass11 = stringArrayDeserializer6.handledType();
        java.lang.String[] strArray12 = stringArrayDeserializer6.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer14 = stringArrayDeserializer6.unwrappingDeserializer(nameTransformer13);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer15 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer6);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer16 = stringArrayDeserializer6.getDelegatee();
        java.lang.String[] strArray17 = stringArrayDeserializer6.getEmptyValue();
        java.lang.String[] strArray18 = stringArrayDeserializer6.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer19 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer20 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer21 = stringArrayDeserializer19.unwrappingDeserializer(nameTransformer20);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer22 = stringArrayDeserializer19.getDelegatee();
        java.lang.Class<?> wildcardClass23 = stringArrayDeserializer19.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer24 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer25 = null;
        stringArrayDeserializer24._elementDeserializer = strJsonDeserializer25;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer27 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer24);
        java.lang.String[] strArray28 = stringArrayDeserializer27.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer29 = stringArrayDeserializer27._elementDeserializer;
        stringArrayDeserializer19._elementDeserializer = strJsonDeserializer29;
        java.lang.Class<?> wildcardClass31 = stringArrayDeserializer19.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer32 = stringArrayDeserializer19._elementDeserializer;
        stringArrayDeserializer6._elementDeserializer = strJsonDeserializer32;
        stringArrayDeserializer3._elementDeserializer = strJsonDeserializer32;
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer14);
        org.junit.Assert.assertNull(wildcardJsonDeserializer16);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer21);
        org.junit.Assert.assertNull(wildcardJsonDeserializer22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(strArray28);
        org.junit.Assert.assertNotNull(strJsonDeserializer29);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(strJsonDeserializer32);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = stringArrayDeserializer3.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer6 = null;
        stringArrayDeserializer5._elementDeserializer = strJsonDeserializer6;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer5);
        java.lang.String[] strArray9 = stringArrayDeserializer8.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer10 = stringArrayDeserializer8._elementDeserializer;
        stringArrayDeserializer3._elementDeserializer = strJsonDeserializer10;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer12 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer13 = null;
        stringArrayDeserializer12._elementDeserializer = strJsonDeserializer13;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer15 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer12);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader16 = stringArrayDeserializer15.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer17 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer18 = null;
        stringArrayDeserializer17._elementDeserializer = strJsonDeserializer18;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer20 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer17);
        java.lang.String[] strArray21 = stringArrayDeserializer20.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer22 = stringArrayDeserializer20._elementDeserializer;
        stringArrayDeserializer15._elementDeserializer = strJsonDeserializer22;
        stringArrayDeserializer3._elementDeserializer = strJsonDeserializer22;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader25 = stringArrayDeserializer3.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer26 = stringArrayDeserializer3._elementDeserializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer27 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer28 = stringArrayDeserializer3.unwrappingDeserializer(nameTransformer27);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strJsonDeserializer10);
        org.junit.Assert.assertNull(objectIdReader16);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNotNull(strJsonDeserializer22);
        org.junit.Assert.assertNull(objectIdReader25);
        org.junit.Assert.assertNotNull(strJsonDeserializer26);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer28);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.Class<?> wildcardClass7 = stringArrayDeserializer1.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = stringArrayDeserializer1.getObjectIdReader();
        java.lang.String[] strArray9 = stringArrayDeserializer1.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer10 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = stringArrayDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer5 = stringArrayDeserializer0._elementDeserializer;
        boolean boolean6 = stringArrayDeserializer0.isCachable();
        boolean boolean7 = stringArrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer8 = stringArrayDeserializer0._elementDeserializer;
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(strJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strJsonDeserializer8);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        java.lang.String[] strArray3 = stringArrayDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass5 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = stringArrayDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection7 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType9 = stringArrayDeserializer8.getValueType();
        java.util.Collection<java.lang.Object> objCollection10 = stringArrayDeserializer8.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType11 = stringArrayDeserializer8.getValueType();
        boolean boolean12 = stringArrayDeserializer8.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer14 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer13);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = stringArrayDeserializer14.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection16 = stringArrayDeserializer14.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer17 = stringArrayDeserializer14._elementDeserializer;
        stringArrayDeserializer8._elementDeserializer = strJsonDeserializer17;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer19 = stringArrayDeserializer8._elementDeserializer;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer19;
        java.util.Collection<java.lang.Object> objCollection21 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType22 = stringArrayDeserializer0.getValueType();
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer15);
        org.junit.Assert.assertNull(objCollection16);
        org.junit.Assert.assertNotNull(strJsonDeserializer17);
        org.junit.Assert.assertNotNull(strJsonDeserializer19);
        org.junit.Assert.assertNull(objCollection21);
        org.junit.Assert.assertNull(javaType22);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        java.lang.String[] strArray1 = stringArrayDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass2 = stringArrayDeserializer0.handledType();
        boolean boolean3 = stringArrayDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.lang.Class<?> wildcardClass3 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = stringArrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType5 = stringArrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = stringArrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType7 = stringArrayDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass8 = stringArrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer9 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = stringArrayDeserializer9.deserializeWithType(jsonParser10, deserializationContext11, typeDeserializer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        java.lang.String[] strArray1 = stringArrayDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass2 = stringArrayDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = stringArrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer4 = stringArrayDeserializer0._elementDeserializer;
        java.lang.String[] strArray5 = stringArrayDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(strJsonDeserializer4);
        org.junit.Assert.assertNull(strArray5);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = stringArrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer2 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer2;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = stringArrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer6 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer7 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer9 = stringArrayDeserializer7.unwrappingDeserializer(nameTransformer8);
        java.lang.Class<?> wildcardClass10 = stringArrayDeserializer7.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = stringArrayDeserializer7.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType12 = stringArrayDeserializer7.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader13 = stringArrayDeserializer7.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer14 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer15 = null;
        stringArrayDeserializer14._elementDeserializer = strJsonDeserializer15;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer17 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer14);
        com.fasterxml.jackson.databind.JavaType javaType18 = stringArrayDeserializer17.getValueType();
        java.lang.String[] strArray19 = stringArrayDeserializer17.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType20 = stringArrayDeserializer17.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer21 = stringArrayDeserializer17._elementDeserializer;
        stringArrayDeserializer7._elementDeserializer = strJsonDeserializer21;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer21;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer24 = stringArrayDeserializer0.getDelegatee();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer6);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(objectIdReader13);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNull(javaType20);
        org.junit.Assert.assertNotNull(strJsonDeserializer21);
        org.junit.Assert.assertNull(wildcardJsonDeserializer24);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = stringArrayDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection2 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType3 = stringArrayDeserializer0.getValueType();
        boolean boolean4 = stringArrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer5);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = stringArrayDeserializer6.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection8 = stringArrayDeserializer6.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer9 = stringArrayDeserializer6._elementDeserializer;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer9;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = stringArrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass12 = stringArrayDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray18 = stringArrayDeserializer0.deserialize(jsonParser13, deserializationContext14, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type [Ljava.lang.String; (by deserializer of type com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNotNull(strJsonDeserializer9);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = stringArrayDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer6 = null;
        stringArrayDeserializer5._elementDeserializer = strJsonDeserializer6;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer5);
        java.lang.String[] strArray9 = stringArrayDeserializer8.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer10 = stringArrayDeserializer8._elementDeserializer;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer10;
        com.fasterxml.jackson.databind.JavaType javaType12 = stringArrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType13 = stringArrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer14 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer15 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer16 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer15);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer17 = stringArrayDeserializer16.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer18 = null;
        stringArrayDeserializer16._elementDeserializer = strJsonDeserializer18;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer20 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer16);
        boolean boolean21 = stringArrayDeserializer16.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer22 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer16);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer23 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer24 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer23);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer25 = stringArrayDeserializer24.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer26 = null;
        stringArrayDeserializer24._elementDeserializer = strJsonDeserializer26;
        boolean boolean28 = stringArrayDeserializer24.isCachable();
        java.lang.Class<?> wildcardClass29 = stringArrayDeserializer24.handledType();
        java.lang.String[] strArray30 = stringArrayDeserializer24.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer31 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer32 = stringArrayDeserializer24.unwrappingDeserializer(nameTransformer31);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer33 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer24);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer34 = stringArrayDeserializer33._elementDeserializer;
        stringArrayDeserializer22._elementDeserializer = strJsonDeserializer34;
        java.util.Collection<java.lang.Object> objCollection36 = stringArrayDeserializer22.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer37 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer22);
        java.lang.Class<?> wildcardClass38 = stringArrayDeserializer22.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer39 = stringArrayDeserializer22._elementDeserializer;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer39;
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strJsonDeserializer10);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertNull(wildcardJsonDeserializer17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNull(strArray30);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer32);
        org.junit.Assert.assertNotNull(strJsonDeserializer34);
        org.junit.Assert.assertNull(objCollection36);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(strJsonDeserializer39);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.lang.String[] strArray3 = stringArrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer5 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(strArrayJsonDeserializer5);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer5);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.String[] strArray7 = stringArrayDeserializer1.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer10 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = strArrayJsonDeserializer10.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = strArrayJsonDeserializer10.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer14 = strArrayJsonDeserializer10.unwrappingDeserializer(nameTransformer13);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer16 = strArrayJsonDeserializer14.unwrappingDeserializer(nameTransformer15);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
        org.junit.Assert.assertNull(objectIdReader12);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer14);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer16);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.String[] strArray7 = stringArrayDeserializer1.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer9 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer10 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = stringArrayDeserializer1.getDelegatee();
        boolean boolean12 = stringArrayDeserializer1.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer14 = null;
        stringArrayDeserializer13._elementDeserializer = strJsonDeserializer14;
        java.util.Collection<java.lang.Object> objCollection16 = stringArrayDeserializer13.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass17 = stringArrayDeserializer13.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer18 = null;
        stringArrayDeserializer13._elementDeserializer = strJsonDeserializer18;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer20 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer21 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer22 = stringArrayDeserializer20.unwrappingDeserializer(nameTransformer21);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer23 = stringArrayDeserializer20.getDelegatee();
        java.lang.Class<?> wildcardClass24 = stringArrayDeserializer20.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer25 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer26 = null;
        stringArrayDeserializer25._elementDeserializer = strJsonDeserializer26;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer28 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer25);
        java.lang.String[] strArray29 = stringArrayDeserializer28.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer30 = stringArrayDeserializer28._elementDeserializer;
        stringArrayDeserializer20._elementDeserializer = strJsonDeserializer30;
        stringArrayDeserializer13._elementDeserializer = strJsonDeserializer30;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer30;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer34 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        boolean boolean35 = stringArrayDeserializer34.isCachable();
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(objCollection16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer22);
        org.junit.Assert.assertNull(wildcardJsonDeserializer23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNull(strArray29);
        org.junit.Assert.assertNotNull(strJsonDeserializer30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        java.lang.String[] strArray4 = stringArrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer5);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = stringArrayDeserializer6.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer8 = stringArrayDeserializer6._elementDeserializer;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer8;
        java.lang.Class<?> wildcardClass10 = stringArrayDeserializer0.getValueClass();
        boolean boolean11 = stringArrayDeserializer0.isCachable();
        java.lang.String[] strArray12 = stringArrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = stringArrayDeserializer0.getDelegatee();
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNotNull(strJsonDeserializer8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(wildcardJsonDeserializer13);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        boolean boolean6 = stringArrayDeserializer1.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer7 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer9 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer8);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = stringArrayDeserializer9.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer11 = null;
        stringArrayDeserializer9._elementDeserializer = strJsonDeserializer11;
        boolean boolean13 = stringArrayDeserializer9.isCachable();
        java.lang.Class<?> wildcardClass14 = stringArrayDeserializer9.handledType();
        java.lang.String[] strArray15 = stringArrayDeserializer9.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer17 = stringArrayDeserializer9.unwrappingDeserializer(nameTransformer16);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer18 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer9);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer19 = stringArrayDeserializer18._elementDeserializer;
        stringArrayDeserializer7._elementDeserializer = strJsonDeserializer19;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer21 = stringArrayDeserializer7.getDelegatee();
        java.lang.String[] strArray22 = stringArrayDeserializer7.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection23 = stringArrayDeserializer7.getKnownPropertyNames();
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer17);
        org.junit.Assert.assertNotNull(strJsonDeserializer19);
        org.junit.Assert.assertNull(wildcardJsonDeserializer21);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNull(objCollection23);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer5 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer5;
        java.lang.String[] strArray7 = stringArrayDeserializer1.getEmptyValue();
        java.lang.String[] strArray8 = stringArrayDeserializer1.getEmptyValue();
        java.lang.String[] strArray9 = stringArrayDeserializer1.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType10 = stringArrayDeserializer1.getValueType();
        java.util.Collection<java.lang.Object> objCollection11 = stringArrayDeserializer1.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer12 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer13 = stringArrayDeserializer12._elementDeserializer;
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(objCollection11);
        org.junit.Assert.assertNotNull(strJsonDeserializer13);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer4 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = stringArrayDeserializer4.getObjectIdReader();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer4.getValueClass();
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = stringArrayDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer6 = null;
        stringArrayDeserializer5._elementDeserializer = strJsonDeserializer6;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer5);
        java.lang.String[] strArray9 = stringArrayDeserializer8.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer10 = stringArrayDeserializer8._elementDeserializer;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer10;
        com.fasterxml.jackson.databind.JavaType javaType12 = stringArrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = stringArrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType14 = stringArrayDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strJsonDeserializer10);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(wildcardJsonDeserializer13);
        org.junit.Assert.assertNull(javaType14);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = stringArrayDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer7 = null;
        stringArrayDeserializer6._elementDeserializer = strJsonDeserializer7;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer9 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer6);
        java.lang.String[] strArray10 = stringArrayDeserializer9.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer11 = stringArrayDeserializer9._elementDeserializer;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer11;
        java.util.Collection<java.lang.Object> objCollection13 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer15 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer14);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer16 = stringArrayDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(strJsonDeserializer11);
        org.junit.Assert.assertNull(objCollection13);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer15);
        org.junit.Assert.assertNull(wildcardJsonDeserializer16);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        boolean boolean2 = stringArrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer4 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer6 = strArrayJsonDeserializer4.unwrappingDeserializer(nameTransformer5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer4);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer6);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        java.lang.String[] strArray4 = stringArrayDeserializer3.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer5 = stringArrayDeserializer3._elementDeserializer;
        java.lang.String[] strArray6 = stringArrayDeserializer3.getNullValue();
        java.lang.String[] strArray7 = stringArrayDeserializer3.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer9 = stringArrayDeserializer3.unwrappingDeserializer(nameTransformer8);
        java.lang.Class<?> wildcardClass10 = stringArrayDeserializer3.getValueClass();
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(strJsonDeserializer5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = stringArrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer2 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer2;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer4 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        java.lang.String[] strArray5 = stringArrayDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection6 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer7 = stringArrayDeserializer0._elementDeserializer;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = stringArrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType9 = stringArrayDeserializer0.getValueType();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(strJsonDeserializer7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.String[] strArray7 = stringArrayDeserializer1.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer9 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer10 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = stringArrayDeserializer1.getDelegatee();
        boolean boolean12 = stringArrayDeserializer1.isCachable();
        java.util.Collection<java.lang.Object> objCollection13 = stringArrayDeserializer1.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer14 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        java.lang.Class<?> wildcardClass15 = stringArrayDeserializer14.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer16 = stringArrayDeserializer14._elementDeserializer;
        java.lang.Class<?> wildcardClass17 = stringArrayDeserializer14.handledType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer18 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer19 = null;
        stringArrayDeserializer18._elementDeserializer = strJsonDeserializer19;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer21 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer18);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer22 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer18);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer23 = null;
        stringArrayDeserializer18._elementDeserializer = strJsonDeserializer23;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer25 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer18);
        java.lang.String[] strArray26 = stringArrayDeserializer25.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection27 = stringArrayDeserializer25.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer28 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer29 = null;
        stringArrayDeserializer28._elementDeserializer = strJsonDeserializer29;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer31 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer28);
        com.fasterxml.jackson.databind.JavaType javaType32 = stringArrayDeserializer31.getValueType();
        java.lang.String[] strArray33 = stringArrayDeserializer31.getNullValue();
        java.lang.String[] strArray34 = stringArrayDeserializer31.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer35 = stringArrayDeserializer31._elementDeserializer;
        stringArrayDeserializer25._elementDeserializer = strJsonDeserializer35;
        stringArrayDeserializer14._elementDeserializer = strJsonDeserializer35;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer38 = stringArrayDeserializer14._elementDeserializer;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer38;
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(objCollection13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(strJsonDeserializer16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertNull(objCollection27);
        org.junit.Assert.assertNull(javaType32);
        org.junit.Assert.assertNull(strArray33);
        org.junit.Assert.assertNull(strArray34);
        org.junit.Assert.assertNotNull(strJsonDeserializer35);
        org.junit.Assert.assertNotNull(strJsonDeserializer38);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        java.util.Collection<java.lang.Object> objCollection3 = stringArrayDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer5 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer5;
        java.lang.Class<?> wildcardClass7 = stringArrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass8 = stringArrayDeserializer0.getValueClass();
        java.lang.String[] strArray9 = stringArrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray12 = stringArrayDeserializer0._deserializeCustom(jsonParser10, deserializationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        java.lang.Class<?> wildcardClass1 = stringArrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer2 = stringArrayDeserializer0._elementDeserializer;
        java.lang.Class<?> wildcardClass3 = stringArrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer4 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer5 = null;
        stringArrayDeserializer4._elementDeserializer = strJsonDeserializer5;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer7 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer4);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer4);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer9 = null;
        stringArrayDeserializer4._elementDeserializer = strJsonDeserializer9;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer4);
        java.lang.String[] strArray12 = stringArrayDeserializer11.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection13 = stringArrayDeserializer11.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer14 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer15 = null;
        stringArrayDeserializer14._elementDeserializer = strJsonDeserializer15;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer17 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer14);
        com.fasterxml.jackson.databind.JavaType javaType18 = stringArrayDeserializer17.getValueType();
        java.lang.String[] strArray19 = stringArrayDeserializer17.getNullValue();
        java.lang.String[] strArray20 = stringArrayDeserializer17.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer21 = stringArrayDeserializer17._elementDeserializer;
        stringArrayDeserializer11._elementDeserializer = strJsonDeserializer21;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer21;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer24 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(strJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(objCollection13);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNotNull(strJsonDeserializer21);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        java.lang.String[] strArray4 = stringArrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer5);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = stringArrayDeserializer6.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer8 = stringArrayDeserializer6._elementDeserializer;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer8;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer10 = stringArrayDeserializer0._elementDeserializer;
        java.lang.String[] strArray11 = stringArrayDeserializer0.getEmptyValue();
        boolean boolean12 = stringArrayDeserializer0.isCachable();
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNotNull(strJsonDeserializer8);
        org.junit.Assert.assertNotNull(strJsonDeserializer10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        java.lang.String[] strArray1 = stringArrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer3 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer4 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray11 = stringArrayDeserializer0.deserialize(jsonParser5, deserializationContext6, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type [Ljava.lang.String; (by deserializer of type com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer3);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "", "hi!" });
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JavaType javaType4 = stringArrayDeserializer3.getValueType();
        java.lang.String[] strArray5 = stringArrayDeserializer3.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = stringArrayDeserializer3.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType7 = stringArrayDeserializer3.getValueType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = stringArrayDeserializer3.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType10 = stringArrayDeserializer3.getValueType();
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(javaType10);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer2);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = stringArrayDeserializer3.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer5 = null;
        stringArrayDeserializer3._elementDeserializer = strJsonDeserializer5;
        boolean boolean7 = stringArrayDeserializer3.isCachable();
        java.lang.Class<?> wildcardClass8 = stringArrayDeserializer3.handledType();
        java.lang.String[] strArray9 = stringArrayDeserializer3.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer10 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer3);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer13 = stringArrayDeserializer11.unwrappingDeserializer(nameTransformer12);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = stringArrayDeserializer11.getDelegatee();
        java.lang.Class<?> wildcardClass15 = stringArrayDeserializer11.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer16 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer17 = null;
        stringArrayDeserializer16._elementDeserializer = strJsonDeserializer17;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer19 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer16);
        java.lang.String[] strArray20 = stringArrayDeserializer19.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer21 = stringArrayDeserializer19._elementDeserializer;
        stringArrayDeserializer11._elementDeserializer = strJsonDeserializer21;
        stringArrayDeserializer3._elementDeserializer = strJsonDeserializer21;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer21;
        java.lang.Class<?> wildcardClass25 = stringArrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer26 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer27 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer26);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer28 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer29 = strArrayJsonDeserializer27.unwrappingDeserializer(nameTransformer28);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer30 = strArrayJsonDeserializer29.getDelegatee();
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer13);
        org.junit.Assert.assertNull(wildcardJsonDeserializer14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNotNull(strJsonDeserializer21);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer27);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer29);
        org.junit.Assert.assertNull(wildcardJsonDeserializer30);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer4 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        java.lang.String[] strArray5 = stringArrayDeserializer4.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stringArrayDeserializer4.deserializeWithType(jsonParser6, deserializationContext7, typeDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strArray5);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = stringArrayDeserializer0.getDelegatee();
        java.lang.String[] strArray4 = stringArrayDeserializer0.getNullValue();
        java.lang.String[] strArray5 = stringArrayDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer7 = stringArrayDeserializer0._elementDeserializer;
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strJsonDeserializer7);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = stringArrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType4 = stringArrayDeserializer0.getValueType();
        java.lang.String[] strArray5 = stringArrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer7 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer6);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = stringArrayDeserializer7.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer9 = null;
        stringArrayDeserializer7._elementDeserializer = strJsonDeserializer9;
        boolean boolean11 = stringArrayDeserializer7.isCachable();
        java.lang.Class<?> wildcardClass12 = stringArrayDeserializer7.handledType();
        java.lang.String[] strArray13 = stringArrayDeserializer7.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer15 = stringArrayDeserializer7.unwrappingDeserializer(nameTransformer14);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer16 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer17 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer18 = stringArrayDeserializer7.unwrappingDeserializer(nameTransformer17);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer19 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer7);
        boolean boolean20 = stringArrayDeserializer19.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader21 = stringArrayDeserializer19.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer22 = stringArrayDeserializer19._elementDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer23 = stringArrayDeserializer19._elementDeserializer;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer23;
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer15);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(objectIdReader21);
        org.junit.Assert.assertNotNull(strJsonDeserializer22);
        org.junit.Assert.assertNotNull(strJsonDeserializer23);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer4 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer5 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer5;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer7 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        java.lang.String[] strArray8 = stringArrayDeserializer7.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection9 = stringArrayDeserializer7.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer10 = stringArrayDeserializer7._elementDeserializer;
        java.lang.Class<?> wildcardClass11 = stringArrayDeserializer7.handledType();
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNotNull(strJsonDeserializer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.String[] strArray7 = stringArrayDeserializer1.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer9 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer10 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = stringArrayDeserializer1.getDelegatee();
        boolean boolean12 = stringArrayDeserializer1.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer14 = null;
        stringArrayDeserializer13._elementDeserializer = strJsonDeserializer14;
        java.util.Collection<java.lang.Object> objCollection16 = stringArrayDeserializer13.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass17 = stringArrayDeserializer13.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer18 = null;
        stringArrayDeserializer13._elementDeserializer = strJsonDeserializer18;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer20 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer21 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer22 = stringArrayDeserializer20.unwrappingDeserializer(nameTransformer21);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer23 = stringArrayDeserializer20.getDelegatee();
        java.lang.Class<?> wildcardClass24 = stringArrayDeserializer20.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer25 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer26 = null;
        stringArrayDeserializer25._elementDeserializer = strJsonDeserializer26;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer28 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer25);
        java.lang.String[] strArray29 = stringArrayDeserializer28.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer30 = stringArrayDeserializer28._elementDeserializer;
        stringArrayDeserializer20._elementDeserializer = strJsonDeserializer30;
        stringArrayDeserializer13._elementDeserializer = strJsonDeserializer30;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer30;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader34 = stringArrayDeserializer1.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer35 = stringArrayDeserializer1._elementDeserializer;
        com.fasterxml.jackson.core.JsonParser jsonParser36 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext37 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray38 = stringArrayDeserializer1._deserializeCustom(jsonParser36, deserializationContext37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(objCollection16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer22);
        org.junit.Assert.assertNull(wildcardJsonDeserializer23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNull(strArray29);
        org.junit.Assert.assertNotNull(strJsonDeserializer30);
        org.junit.Assert.assertNull(objectIdReader34);
        org.junit.Assert.assertNotNull(strJsonDeserializer35);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = stringArrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType4 = stringArrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer5 = stringArrayDeserializer0._elementDeserializer;
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stringArrayDeserializer0.deserializeWithType(jsonParser7, deserializationContext8, typeDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(strJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = stringArrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = stringArrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer5);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = stringArrayDeserializer6.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer8 = null;
        stringArrayDeserializer6._elementDeserializer = strJsonDeserializer8;
        boolean boolean10 = stringArrayDeserializer6.isCachable();
        java.lang.Class<?> wildcardClass11 = stringArrayDeserializer6.handledType();
        java.lang.String[] strArray12 = stringArrayDeserializer6.getNullValue();
        java.lang.String[] strArray13 = stringArrayDeserializer6.getEmptyValue();
        java.lang.Class<?> wildcardClass14 = stringArrayDeserializer6.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer15 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer16 = null;
        stringArrayDeserializer15._elementDeserializer = strJsonDeserializer16;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer18 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer15);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader19 = stringArrayDeserializer18.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer20 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer21 = null;
        stringArrayDeserializer20._elementDeserializer = strJsonDeserializer21;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer23 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer20);
        java.lang.String[] strArray24 = stringArrayDeserializer23.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer25 = stringArrayDeserializer23._elementDeserializer;
        stringArrayDeserializer18._elementDeserializer = strJsonDeserializer25;
        java.lang.String[] strArray27 = stringArrayDeserializer18.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer28 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer29 = stringArrayDeserializer18.unwrappingDeserializer(nameTransformer28);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer30 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer31 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer30);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer32 = stringArrayDeserializer31.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer33 = null;
        stringArrayDeserializer31._elementDeserializer = strJsonDeserializer33;
        boolean boolean35 = stringArrayDeserializer31.isCachable();
        java.lang.Class<?> wildcardClass36 = stringArrayDeserializer31.handledType();
        java.lang.String[] strArray37 = stringArrayDeserializer31.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer38 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer31);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer39 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer40 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer41 = stringArrayDeserializer39.unwrappingDeserializer(nameTransformer40);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer42 = stringArrayDeserializer39.getDelegatee();
        java.lang.Class<?> wildcardClass43 = stringArrayDeserializer39.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer44 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer45 = null;
        stringArrayDeserializer44._elementDeserializer = strJsonDeserializer45;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer47 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer44);
        java.lang.String[] strArray48 = stringArrayDeserializer47.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer49 = stringArrayDeserializer47._elementDeserializer;
        stringArrayDeserializer39._elementDeserializer = strJsonDeserializer49;
        stringArrayDeserializer31._elementDeserializer = strJsonDeserializer49;
        stringArrayDeserializer18._elementDeserializer = strJsonDeserializer49;
        stringArrayDeserializer6._elementDeserializer = strJsonDeserializer49;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer49;
        java.util.Collection<java.lang.Object> objCollection55 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer56 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer57 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer58 = stringArrayDeserializer56.unwrappingDeserializer(nameTransformer57);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer59 = stringArrayDeserializer56.getDelegatee();
        java.lang.Class<?> wildcardClass60 = stringArrayDeserializer56.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer61 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer62 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer63 = stringArrayDeserializer61.unwrappingDeserializer(nameTransformer62);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer64 = stringArrayDeserializer61.getDelegatee();
        java.lang.Class<?> wildcardClass65 = stringArrayDeserializer61.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer66 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer67 = null;
        stringArrayDeserializer66._elementDeserializer = strJsonDeserializer67;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer69 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer66);
        java.lang.String[] strArray70 = stringArrayDeserializer69.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer71 = stringArrayDeserializer69._elementDeserializer;
        stringArrayDeserializer61._elementDeserializer = strJsonDeserializer71;
        stringArrayDeserializer56._elementDeserializer = strJsonDeserializer71;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer71;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer75 = stringArrayDeserializer0._elementDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer76 = stringArrayDeserializer0.getDelegatee();
        java.lang.String[] strArray77 = stringArrayDeserializer0.getEmptyValue();
        java.lang.String[] strArray78 = stringArrayDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(objectIdReader19);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNotNull(strJsonDeserializer25);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer29);
        org.junit.Assert.assertNull(wildcardJsonDeserializer32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNull(strArray37);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer41);
        org.junit.Assert.assertNull(wildcardJsonDeserializer42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNull(strArray48);
        org.junit.Assert.assertNotNull(strJsonDeserializer49);
        org.junit.Assert.assertNull(objCollection55);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer58);
        org.junit.Assert.assertNull(wildcardJsonDeserializer59);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer63);
        org.junit.Assert.assertNull(wildcardJsonDeserializer64);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNull(strArray70);
        org.junit.Assert.assertNotNull(strJsonDeserializer71);
        org.junit.Assert.assertNotNull(strJsonDeserializer75);
        org.junit.Assert.assertNull(wildcardJsonDeserializer76);
        org.junit.Assert.assertNull(strArray77);
        org.junit.Assert.assertNull(strArray78);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType3 = stringArrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = stringArrayDeserializer0.getObjectIdReader();
        java.lang.String[] strArray5 = stringArrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer6 = stringArrayDeserializer0._elementDeserializer;
        java.util.Collection<java.lang.Object> objCollection7 = stringArrayDeserializer0.getKnownPropertyNames();
        java.lang.String[] strArray8 = stringArrayDeserializer0.getEmptyValue();
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(strJsonDeserializer6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        java.lang.String[] strArray1 = stringArrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType3 = stringArrayDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = stringArrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = stringArrayDeserializer0.deserialize(jsonParser6, deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = stringArrayDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer7 = null;
        stringArrayDeserializer6._elementDeserializer = strJsonDeserializer7;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer9 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer6);
        java.lang.String[] strArray10 = stringArrayDeserializer9.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer11 = stringArrayDeserializer9._elementDeserializer;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer11;
        java.util.Collection<java.lang.Object> objCollection13 = stringArrayDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection14 = stringArrayDeserializer0.getKnownPropertyNames();
        java.lang.String[] strArray15 = stringArrayDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(strJsonDeserializer11);
        org.junit.Assert.assertNull(objCollection13);
        org.junit.Assert.assertNull(objCollection14);
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = stringArrayDeserializer3.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer6 = null;
        stringArrayDeserializer5._elementDeserializer = strJsonDeserializer6;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer5);
        java.lang.String[] strArray9 = stringArrayDeserializer8.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer10 = stringArrayDeserializer8._elementDeserializer;
        stringArrayDeserializer3._elementDeserializer = strJsonDeserializer10;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer12 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer13 = null;
        stringArrayDeserializer12._elementDeserializer = strJsonDeserializer13;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer15 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer12);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader16 = stringArrayDeserializer15.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer17 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer18 = null;
        stringArrayDeserializer17._elementDeserializer = strJsonDeserializer18;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer20 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer17);
        java.lang.String[] strArray21 = stringArrayDeserializer20.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer22 = stringArrayDeserializer20._elementDeserializer;
        stringArrayDeserializer15._elementDeserializer = strJsonDeserializer22;
        stringArrayDeserializer3._elementDeserializer = strJsonDeserializer22;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader25 = stringArrayDeserializer3.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer26 = stringArrayDeserializer3._elementDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer27 = stringArrayDeserializer3.getDelegatee();
        java.lang.String[] strArray28 = stringArrayDeserializer3.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer29 = null;
        stringArrayDeserializer3._elementDeserializer = strJsonDeserializer29;
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strJsonDeserializer10);
        org.junit.Assert.assertNull(objectIdReader16);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNotNull(strJsonDeserializer22);
        org.junit.Assert.assertNull(objectIdReader25);
        org.junit.Assert.assertNotNull(strJsonDeserializer26);
        org.junit.Assert.assertNull(wildcardJsonDeserializer27);
        org.junit.Assert.assertNull(strArray28);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        boolean boolean3 = stringArrayDeserializer1.isCachable();
        boolean boolean4 = stringArrayDeserializer1.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType6 = stringArrayDeserializer1.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType7 = stringArrayDeserializer1.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stringArrayDeserializer1.deserializeWithType(jsonParser8, deserializationContext9, typeDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(javaType7);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer4 = strArrayJsonDeserializer2.unwrappingDeserializer(nameTransformer3);
        boolean boolean5 = strArrayJsonDeserializer2.isCachable();
        java.lang.String[] strArray6 = strArrayJsonDeserializer2.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer8 = strArrayJsonDeserializer2.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer9 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(strArrayJsonDeserializer2);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer11 = stringArrayDeserializer9.unwrappingDeserializer(nameTransformer10);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = stringArrayDeserializer9.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray15 = stringArrayDeserializer9.deserialize(jsonParser13, deserializationContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer8);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer11);
        org.junit.Assert.assertNull(wildcardJsonDeserializer12);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = stringArrayDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection2 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType3 = stringArrayDeserializer0.getValueType();
        boolean boolean4 = stringArrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer6 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.JavaType javaType7 = stringArrayDeserializer0.getValueType();
        java.lang.String[] strArray8 = stringArrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = stringArrayDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection10 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer12 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer11);
        java.util.Collection<java.lang.Object> objCollection13 = strArrayJsonDeserializer12.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer15 = strArrayJsonDeserializer12.unwrappingDeserializer(nameTransformer14);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer16 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(strArrayJsonDeserializer12);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer12);
        org.junit.Assert.assertNull(objCollection13);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer15);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        boolean boolean3 = stringArrayDeserializer1.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer4 = stringArrayDeserializer1._elementDeserializer;
        java.lang.Class<?> wildcardClass5 = stringArrayDeserializer1.handledType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        java.lang.Class<?> wildcardClass7 = stringArrayDeserializer1.handledType();
        java.lang.Class<?> wildcardClass8 = stringArrayDeserializer1.getValueClass();
        java.lang.Class<?> wildcardClass9 = stringArrayDeserializer1.getValueClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        java.lang.String[] strArray3 = stringArrayDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection5 = stringArrayDeserializer0.getKnownPropertyNames();
        boolean boolean6 = stringArrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer7 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType9 = stringArrayDeserializer8.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer10 = null;
        stringArrayDeserializer8._elementDeserializer = strJsonDeserializer10;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = stringArrayDeserializer8.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer14 = stringArrayDeserializer8.unwrappingDeserializer(nameTransformer13);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer15 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer16 = null;
        stringArrayDeserializer15._elementDeserializer = strJsonDeserializer16;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer18 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer15);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader19 = stringArrayDeserializer18.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer20 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer21 = null;
        stringArrayDeserializer20._elementDeserializer = strJsonDeserializer21;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer23 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer20);
        java.lang.String[] strArray24 = stringArrayDeserializer23.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer25 = stringArrayDeserializer23._elementDeserializer;
        stringArrayDeserializer18._elementDeserializer = strJsonDeserializer25;
        stringArrayDeserializer8._elementDeserializer = strJsonDeserializer25;
        java.lang.Class<?> wildcardClass28 = stringArrayDeserializer8.handledType();
        java.lang.Class<?> wildcardClass29 = stringArrayDeserializer8.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer30 = stringArrayDeserializer8._elementDeserializer;
        stringArrayDeserializer7._elementDeserializer = strJsonDeserializer30;
        java.lang.String[] strArray32 = stringArrayDeserializer7.getEmptyValue();
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objectIdReader12);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer14);
        org.junit.Assert.assertNull(objectIdReader19);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNotNull(strJsonDeserializer25);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(strJsonDeserializer30);
        org.junit.Assert.assertNull(strArray32);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.String[] strArray7 = stringArrayDeserializer1.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer8 = stringArrayDeserializer1._elementDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType9 = stringArrayDeserializer1.getValueType();
        java.util.Collection<java.lang.Object> objCollection10 = stringArrayDeserializer1.getKnownPropertyNames();
        java.lang.String[] strArray11 = stringArrayDeserializer1.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = stringArrayDeserializer1.getDelegatee();
        java.lang.Class<?> wildcardClass13 = stringArrayDeserializer1.getValueClass();
        java.lang.Class<?> wildcardClass14 = stringArrayDeserializer1.getValueClass();
        java.lang.Class<?> wildcardClass15 = stringArrayDeserializer1.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser16 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray18 = stringArrayDeserializer1.deserialize(jsonParser16, deserializationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(strJsonDeserializer8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(wildcardJsonDeserializer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = stringArrayDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection2 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType3 = stringArrayDeserializer0.getValueType();
        boolean boolean4 = stringArrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer5);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = stringArrayDeserializer6.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection8 = stringArrayDeserializer6.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer9 = stringArrayDeserializer6._elementDeserializer;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer9;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        java.lang.Class<?> wildcardClass12 = stringArrayDeserializer11.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader13 = stringArrayDeserializer11.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer14 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer11);
        java.lang.String[] strArray15 = stringArrayDeserializer11.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType16 = stringArrayDeserializer11.getValueType();
        java.lang.Class<?> wildcardClass17 = stringArrayDeserializer11.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer19 = stringArrayDeserializer11.unwrappingDeserializer(nameTransformer18);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNotNull(strJsonDeserializer9);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(objectIdReader13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(javaType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer19);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer2);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer4 = stringArrayDeserializer3._elementDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType5 = stringArrayDeserializer3.getValueType();
        java.util.Collection<java.lang.Object> objCollection6 = stringArrayDeserializer3.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(strJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objCollection6);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer4 = null;
        stringArrayDeserializer3._elementDeserializer = strJsonDeserializer4;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer3);
        com.fasterxml.jackson.databind.JavaType javaType7 = stringArrayDeserializer6.getValueType();
        java.lang.Class<?> wildcardClass8 = stringArrayDeserializer6.handledType();
        java.lang.Class<?> wildcardClass9 = stringArrayDeserializer6.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer10 = null;
        stringArrayDeserializer6._elementDeserializer = strJsonDeserializer10;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = stringArrayDeserializer6.getObjectIdReader();
        java.lang.String[] strArray13 = stringArrayDeserializer6.getNullValue();
        java.lang.Class<?> wildcardClass14 = stringArrayDeserializer6.handledType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer15 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer16 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer15);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer17 = stringArrayDeserializer16.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer18 = null;
        stringArrayDeserializer16._elementDeserializer = strJsonDeserializer18;
        boolean boolean20 = stringArrayDeserializer16.isCachable();
        java.lang.Class<?> wildcardClass21 = stringArrayDeserializer16.handledType();
        java.lang.String[] strArray22 = stringArrayDeserializer16.getNullValue();
        java.lang.String[] strArray23 = stringArrayDeserializer16.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType24 = stringArrayDeserializer16.getValueType();
        java.lang.String[] strArray25 = stringArrayDeserializer16.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer26 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer27 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer28 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer29 = stringArrayDeserializer27.unwrappingDeserializer(nameTransformer28);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer30 = stringArrayDeserializer27.getDelegatee();
        java.lang.Class<?> wildcardClass31 = stringArrayDeserializer27.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer32 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer33 = null;
        stringArrayDeserializer32._elementDeserializer = strJsonDeserializer33;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer35 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer32);
        java.lang.String[] strArray36 = stringArrayDeserializer35.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer37 = stringArrayDeserializer35._elementDeserializer;
        stringArrayDeserializer27._elementDeserializer = strJsonDeserializer37;
        java.lang.Class<?> wildcardClass39 = stringArrayDeserializer27.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer40 = stringArrayDeserializer27._elementDeserializer;
        stringArrayDeserializer26._elementDeserializer = strJsonDeserializer40;
        stringArrayDeserializer16._elementDeserializer = strJsonDeserializer40;
        stringArrayDeserializer6._elementDeserializer = strJsonDeserializer40;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer40;
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(objectIdReader12);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(wildcardJsonDeserializer17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNull(javaType24);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer29);
        org.junit.Assert.assertNull(wildcardJsonDeserializer30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNull(strArray36);
        org.junit.Assert.assertNotNull(strJsonDeserializer37);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(strJsonDeserializer40);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = stringArrayDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection2 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType3 = stringArrayDeserializer0.getValueType();
        boolean boolean4 = stringArrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer6 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer5);
        boolean boolean7 = stringArrayDeserializer0.isCachable();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.String[] strArray7 = stringArrayDeserializer1.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer9 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer13 = stringArrayDeserializer11.unwrappingDeserializer(nameTransformer12);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = stringArrayDeserializer11.getDelegatee();
        java.lang.Class<?> wildcardClass15 = stringArrayDeserializer11.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer16 = stringArrayDeserializer11._elementDeserializer;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer17 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer19 = stringArrayDeserializer17.unwrappingDeserializer(nameTransformer18);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer20 = stringArrayDeserializer17.getDelegatee();
        java.lang.Class<?> wildcardClass21 = stringArrayDeserializer17.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer22 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer17);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer23 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer24 = null;
        stringArrayDeserializer23._elementDeserializer = strJsonDeserializer24;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer26 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer23);
        java.lang.String[] strArray27 = stringArrayDeserializer26.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer28 = stringArrayDeserializer26._elementDeserializer;
        stringArrayDeserializer17._elementDeserializer = strJsonDeserializer28;
        stringArrayDeserializer11._elementDeserializer = strJsonDeserializer28;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer28;
        boolean boolean32 = stringArrayDeserializer1.isCachable();
        boolean boolean33 = stringArrayDeserializer1.isCachable();
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer13);
        org.junit.Assert.assertNull(wildcardJsonDeserializer14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(strJsonDeserializer16);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer19);
        org.junit.Assert.assertNull(wildcardJsonDeserializer20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertNotNull(strJsonDeserializer28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = stringArrayDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection2 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType3 = stringArrayDeserializer0.getValueType();
        boolean boolean4 = stringArrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer5);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = stringArrayDeserializer6.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection8 = stringArrayDeserializer6.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer9 = stringArrayDeserializer6._elementDeserializer;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer9;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = stringArrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer14 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer13);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer15 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer14);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer16 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer15);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer17 = stringArrayDeserializer16._elementDeserializer;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer17;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer19 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType20 = stringArrayDeserializer19.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer21 = null;
        stringArrayDeserializer19._elementDeserializer = strJsonDeserializer21;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader23 = stringArrayDeserializer19.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer24 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer25 = stringArrayDeserializer19.unwrappingDeserializer(nameTransformer24);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer26 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer27 = null;
        stringArrayDeserializer26._elementDeserializer = strJsonDeserializer27;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer29 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer26);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader30 = stringArrayDeserializer29.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer31 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer32 = null;
        stringArrayDeserializer31._elementDeserializer = strJsonDeserializer32;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer34 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer31);
        java.lang.String[] strArray35 = stringArrayDeserializer34.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer36 = stringArrayDeserializer34._elementDeserializer;
        stringArrayDeserializer29._elementDeserializer = strJsonDeserializer36;
        stringArrayDeserializer19._elementDeserializer = strJsonDeserializer36;
        java.lang.Class<?> wildcardClass39 = stringArrayDeserializer19.handledType();
        java.lang.Class<?> wildcardClass40 = stringArrayDeserializer19.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer41 = stringArrayDeserializer19._elementDeserializer;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer41;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer43 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer44 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer43);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNotNull(strJsonDeserializer9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer12);
        org.junit.Assert.assertNotNull(strJsonDeserializer17);
        org.junit.Assert.assertNull(javaType20);
        org.junit.Assert.assertNull(objectIdReader23);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer25);
        org.junit.Assert.assertNull(objectIdReader30);
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertNotNull(strJsonDeserializer36);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(strJsonDeserializer41);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer44);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JavaType javaType4 = stringArrayDeserializer3.getValueType();
        java.lang.String[] strArray5 = stringArrayDeserializer3.getNullValue();
        java.lang.String[] strArray6 = stringArrayDeserializer3.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer7 = stringArrayDeserializer3._elementDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType8 = stringArrayDeserializer3.getValueType();
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(strJsonDeserializer7);
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        java.lang.String[] strArray4 = stringArrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer5);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = stringArrayDeserializer6.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer8 = stringArrayDeserializer6._elementDeserializer;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer8;
        java.lang.Class<?> wildcardClass10 = stringArrayDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection11 = stringArrayDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNotNull(strJsonDeserializer8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(objCollection11);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = stringArrayDeserializer0._elementDeserializer;
        java.lang.String[] strArray2 = stringArrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = stringArrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer4 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer5 = stringArrayDeserializer0._elementDeserializer;
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer8 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer7);
        org.junit.Assert.assertNull(strJsonDeserializer1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(strJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer8);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.String[] strArray7 = stringArrayDeserializer1.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer9 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer10 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = stringArrayDeserializer1.getDelegatee();
        java.lang.String[] strArray12 = stringArrayDeserializer1.getEmptyValue();
        java.lang.String[] strArray13 = stringArrayDeserializer1.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader14 = stringArrayDeserializer1.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer15 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer16 = null;
        stringArrayDeserializer15._elementDeserializer = strJsonDeserializer16;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer18 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer15);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer19 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer15);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer20 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType21 = stringArrayDeserializer20.getValueType();
        java.util.Collection<java.lang.Object> objCollection22 = stringArrayDeserializer20.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType23 = stringArrayDeserializer20.getValueType();
        boolean boolean24 = stringArrayDeserializer20.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer25 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer26 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer25);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer27 = stringArrayDeserializer26.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection28 = stringArrayDeserializer26.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer29 = stringArrayDeserializer26._elementDeserializer;
        stringArrayDeserializer20._elementDeserializer = strJsonDeserializer29;
        stringArrayDeserializer15._elementDeserializer = strJsonDeserializer29;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer29;
        java.lang.String[] strArray33 = stringArrayDeserializer1.getEmptyValue();
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(objectIdReader14);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertNull(objCollection22);
        org.junit.Assert.assertNull(javaType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer27);
        org.junit.Assert.assertNull(objCollection28);
        org.junit.Assert.assertNotNull(strJsonDeserializer29);
        org.junit.Assert.assertNull(strArray33);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = stringArrayDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer6 = null;
        stringArrayDeserializer5._elementDeserializer = strJsonDeserializer6;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer5);
        java.lang.String[] strArray9 = stringArrayDeserializer8.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer10 = stringArrayDeserializer8._elementDeserializer;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer10;
        com.fasterxml.jackson.databind.JavaType javaType12 = stringArrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType13 = stringArrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer15 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer14);
        java.lang.String[] strArray16 = stringArrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader17 = stringArrayDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strJsonDeserializer10);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer15);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNull(objectIdReader17);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.String[] strArray7 = stringArrayDeserializer1.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer10 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer9);
        boolean boolean11 = strArrayJsonDeserializer10.isCachable();
        boolean boolean12 = strArrayJsonDeserializer10.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(strArrayJsonDeserializer10);
        java.util.Collection<java.lang.Object> objCollection14 = stringArrayDeserializer13.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader15 = stringArrayDeserializer13.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer16 = stringArrayDeserializer13.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser17 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray19 = stringArrayDeserializer13._deserializeCustom(jsonParser17, deserializationContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(objCollection14);
        org.junit.Assert.assertNull(objectIdReader15);
        org.junit.Assert.assertNull(wildcardJsonDeserializer16);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.String[] strArray7 = stringArrayDeserializer1.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer9 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer11 = stringArrayDeserializer9.unwrappingDeserializer(nameTransformer10);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = stringArrayDeserializer9.getDelegatee();
        java.lang.Class<?> wildcardClass13 = stringArrayDeserializer9.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer14 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer15 = null;
        stringArrayDeserializer14._elementDeserializer = strJsonDeserializer15;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer17 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer14);
        java.lang.String[] strArray18 = stringArrayDeserializer17.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer19 = stringArrayDeserializer17._elementDeserializer;
        stringArrayDeserializer9._elementDeserializer = strJsonDeserializer19;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer19;
        java.util.Collection<java.lang.Object> objCollection22 = stringArrayDeserializer1.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer23 = stringArrayDeserializer1._elementDeserializer;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer24 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer25 = stringArrayDeserializer24.getDelegatee();
        java.lang.String[] strArray26 = stringArrayDeserializer24.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer27 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer28 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer27);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer29 = stringArrayDeserializer28.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer30 = null;
        stringArrayDeserializer28._elementDeserializer = strJsonDeserializer30;
        boolean boolean32 = stringArrayDeserializer28.isCachable();
        java.lang.Class<?> wildcardClass33 = stringArrayDeserializer28.handledType();
        java.lang.String[] strArray34 = stringArrayDeserializer28.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer35 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer36 = stringArrayDeserializer28.unwrappingDeserializer(nameTransformer35);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer37 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer28);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer38 = stringArrayDeserializer37.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer39 = stringArrayDeserializer37.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer40 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer41 = null;
        stringArrayDeserializer40._elementDeserializer = strJsonDeserializer41;
        java.util.Collection<java.lang.Object> objCollection43 = stringArrayDeserializer40.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass44 = stringArrayDeserializer40.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer45 = null;
        stringArrayDeserializer40._elementDeserializer = strJsonDeserializer45;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer47 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer48 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer49 = stringArrayDeserializer47.unwrappingDeserializer(nameTransformer48);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer50 = stringArrayDeserializer47.getDelegatee();
        java.lang.Class<?> wildcardClass51 = stringArrayDeserializer47.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer52 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer53 = null;
        stringArrayDeserializer52._elementDeserializer = strJsonDeserializer53;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer55 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer52);
        java.lang.String[] strArray56 = stringArrayDeserializer55.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer57 = stringArrayDeserializer55._elementDeserializer;
        stringArrayDeserializer47._elementDeserializer = strJsonDeserializer57;
        stringArrayDeserializer40._elementDeserializer = strJsonDeserializer57;
        stringArrayDeserializer37._elementDeserializer = strJsonDeserializer57;
        stringArrayDeserializer24._elementDeserializer = strJsonDeserializer57;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer57;
        java.lang.String[] strArray63 = stringArrayDeserializer1.getEmptyValue();
        java.lang.Class<?> wildcardClass64 = stringArrayDeserializer1.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer65 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer66 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer65);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer11);
        org.junit.Assert.assertNull(wildcardJsonDeserializer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNotNull(strJsonDeserializer19);
        org.junit.Assert.assertNull(objCollection22);
        org.junit.Assert.assertNotNull(strJsonDeserializer23);
        org.junit.Assert.assertNull(wildcardJsonDeserializer25);
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertNull(wildcardJsonDeserializer29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNull(strArray34);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer36);
        org.junit.Assert.assertNull(wildcardJsonDeserializer38);
        org.junit.Assert.assertNull(wildcardJsonDeserializer39);
        org.junit.Assert.assertNull(objCollection43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer49);
        org.junit.Assert.assertNull(wildcardJsonDeserializer50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNull(strArray56);
        org.junit.Assert.assertNotNull(strJsonDeserializer57);
        org.junit.Assert.assertNull(strArray63);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer66);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.String[] strArray7 = stringArrayDeserializer1.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer10 = stringArrayDeserializer8.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer8);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer12 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer11);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer14 = stringArrayDeserializer11.unwrappingDeserializer(nameTransformer13);
        boolean boolean15 = stringArrayDeserializer11.isCachable();
        java.lang.Class<?> wildcardClass16 = stringArrayDeserializer11.getValueClass();
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer10);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        java.lang.String[] strArray3 = stringArrayDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass5 = stringArrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer8 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer7);
        java.lang.String[] strArray9 = stringArrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = stringArrayDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection11 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer12 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.core.JsonParser jsonParser13 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray15 = stringArrayDeserializer12.deserialize(jsonParser13, deserializationContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(objCollection11);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.String[] strArray7 = stringArrayDeserializer1.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer9 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer10 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer12 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        com.fasterxml.jackson.databind.JavaType javaType14 = stringArrayDeserializer1.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader15 = stringArrayDeserializer1.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader16 = stringArrayDeserializer1.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer17 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer18 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer17);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer19 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer20 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer19);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer9);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNull(objectIdReader15);
        org.junit.Assert.assertNull(objectIdReader16);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer18);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer20);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer4 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer5 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer5;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer7 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        java.lang.String[] strArray8 = stringArrayDeserializer7.getEmptyValue();
        java.lang.String[] strArray9 = stringArrayDeserializer7.getEmptyValue();
        java.lang.Class<?> wildcardClass10 = stringArrayDeserializer7.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray13 = stringArrayDeserializer7._deserializeCustom(jsonParser11, deserializationContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.String[] strArray7 = stringArrayDeserializer1.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer8 = stringArrayDeserializer1._elementDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType9 = stringArrayDeserializer1.getValueType();
        java.util.Collection<java.lang.Object> objCollection10 = stringArrayDeserializer1.getKnownPropertyNames();
        java.lang.String[] strArray11 = stringArrayDeserializer1.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = stringArrayDeserializer1.getDelegatee();
        java.lang.Class<?> wildcardClass13 = stringArrayDeserializer1.getValueClass();
        java.lang.Class<?> wildcardClass14 = stringArrayDeserializer1.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer15 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer17 = stringArrayDeserializer15.unwrappingDeserializer(nameTransformer16);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer18 = stringArrayDeserializer15.getDelegatee();
        java.lang.Class<?> wildcardClass19 = stringArrayDeserializer15.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer20 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer21 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer22 = stringArrayDeserializer20.unwrappingDeserializer(nameTransformer21);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer23 = stringArrayDeserializer20.getDelegatee();
        java.lang.Class<?> wildcardClass24 = stringArrayDeserializer20.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer25 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer26 = null;
        stringArrayDeserializer25._elementDeserializer = strJsonDeserializer26;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer28 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer25);
        java.lang.String[] strArray29 = stringArrayDeserializer28.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer30 = stringArrayDeserializer28._elementDeserializer;
        stringArrayDeserializer20._elementDeserializer = strJsonDeserializer30;
        stringArrayDeserializer15._elementDeserializer = strJsonDeserializer30;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer30;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader34 = stringArrayDeserializer1.getObjectIdReader();
        boolean boolean35 = stringArrayDeserializer1.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer36 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer37 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer36);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(strJsonDeserializer8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(wildcardJsonDeserializer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer17);
        org.junit.Assert.assertNull(wildcardJsonDeserializer18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer22);
        org.junit.Assert.assertNull(wildcardJsonDeserializer23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNull(strArray29);
        org.junit.Assert.assertNotNull(strJsonDeserializer30);
        org.junit.Assert.assertNull(objectIdReader34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer37);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = stringArrayDeserializer0._elementDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer4 = stringArrayDeserializer0._elementDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType5 = stringArrayDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection6 = stringArrayDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNull(strJsonDeserializer3);
        org.junit.Assert.assertNull(strJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objCollection6);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = stringArrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass5 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        java.lang.Class<?> wildcardClass7 = stringArrayDeserializer6.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty9 = stringArrayDeserializer6.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.String[] strArray7 = stringArrayDeserializer1.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer8 = stringArrayDeserializer1._elementDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType9 = stringArrayDeserializer1.getValueType();
        java.util.Collection<java.lang.Object> objCollection10 = stringArrayDeserializer1.getKnownPropertyNames();
        java.lang.String[] strArray11 = stringArrayDeserializer1.getNullValue();
        java.lang.Class<?> wildcardClass12 = stringArrayDeserializer1.getValueClass();
        boolean boolean13 = stringArrayDeserializer1.isCachable();
        java.lang.String[] strArray14 = stringArrayDeserializer1.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType15 = stringArrayDeserializer1.getValueType();
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(strJsonDeserializer8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(javaType15);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.String[] strArray7 = stringArrayDeserializer1.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer9 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer8);
        java.lang.String[] strArray10 = stringArrayDeserializer1.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray20 = stringArrayDeserializer1.deserialize(jsonParser12, deserializationContext13, strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type [Ljava.lang.String; (by deserializer of type com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "", "", "", "" });
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = stringArrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = stringArrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer5);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = stringArrayDeserializer6.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer8 = null;
        stringArrayDeserializer6._elementDeserializer = strJsonDeserializer8;
        boolean boolean10 = stringArrayDeserializer6.isCachable();
        java.lang.Class<?> wildcardClass11 = stringArrayDeserializer6.handledType();
        java.lang.String[] strArray12 = stringArrayDeserializer6.getNullValue();
        java.lang.String[] strArray13 = stringArrayDeserializer6.getEmptyValue();
        java.lang.Class<?> wildcardClass14 = stringArrayDeserializer6.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer15 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer16 = null;
        stringArrayDeserializer15._elementDeserializer = strJsonDeserializer16;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer18 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer15);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader19 = stringArrayDeserializer18.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer20 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer21 = null;
        stringArrayDeserializer20._elementDeserializer = strJsonDeserializer21;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer23 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer20);
        java.lang.String[] strArray24 = stringArrayDeserializer23.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer25 = stringArrayDeserializer23._elementDeserializer;
        stringArrayDeserializer18._elementDeserializer = strJsonDeserializer25;
        java.lang.String[] strArray27 = stringArrayDeserializer18.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer28 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer29 = stringArrayDeserializer18.unwrappingDeserializer(nameTransformer28);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer30 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer31 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer30);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer32 = stringArrayDeserializer31.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer33 = null;
        stringArrayDeserializer31._elementDeserializer = strJsonDeserializer33;
        boolean boolean35 = stringArrayDeserializer31.isCachable();
        java.lang.Class<?> wildcardClass36 = stringArrayDeserializer31.handledType();
        java.lang.String[] strArray37 = stringArrayDeserializer31.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer38 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer31);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer39 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer40 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer41 = stringArrayDeserializer39.unwrappingDeserializer(nameTransformer40);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer42 = stringArrayDeserializer39.getDelegatee();
        java.lang.Class<?> wildcardClass43 = stringArrayDeserializer39.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer44 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer45 = null;
        stringArrayDeserializer44._elementDeserializer = strJsonDeserializer45;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer47 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer44);
        java.lang.String[] strArray48 = stringArrayDeserializer47.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer49 = stringArrayDeserializer47._elementDeserializer;
        stringArrayDeserializer39._elementDeserializer = strJsonDeserializer49;
        stringArrayDeserializer31._elementDeserializer = strJsonDeserializer49;
        stringArrayDeserializer18._elementDeserializer = strJsonDeserializer49;
        stringArrayDeserializer6._elementDeserializer = strJsonDeserializer49;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer49;
        java.util.Collection<java.lang.Object> objCollection55 = stringArrayDeserializer0.getKnownPropertyNames();
        java.lang.String[] strArray56 = stringArrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer57 = stringArrayDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(objectIdReader19);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNotNull(strJsonDeserializer25);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer29);
        org.junit.Assert.assertNull(wildcardJsonDeserializer32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNull(strArray37);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer41);
        org.junit.Assert.assertNull(wildcardJsonDeserializer42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNull(strArray48);
        org.junit.Assert.assertNotNull(strJsonDeserializer49);
        org.junit.Assert.assertNull(objCollection55);
        org.junit.Assert.assertNull(strArray56);
        org.junit.Assert.assertNull(wildcardJsonDeserializer57);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        java.lang.Class<?> wildcardClass2 = stringArrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = stringArrayDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = stringArrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer7 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer6);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty9 = strArrayJsonDeserializer7.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer7);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = stringArrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer0.getDelegatee();
        java.lang.String[] strArray3 = stringArrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer4 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        java.lang.Class<?> wildcardClass5 = stringArrayDeserializer4.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer7 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer6);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = stringArrayDeserializer7.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer9 = null;
        stringArrayDeserializer7._elementDeserializer = strJsonDeserializer9;
        boolean boolean11 = stringArrayDeserializer7.isCachable();
        java.lang.Class<?> wildcardClass12 = stringArrayDeserializer7.handledType();
        java.lang.String[] strArray13 = stringArrayDeserializer7.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer14 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer7);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer15 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer17 = stringArrayDeserializer15.unwrappingDeserializer(nameTransformer16);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer18 = stringArrayDeserializer15.getDelegatee();
        java.lang.Class<?> wildcardClass19 = stringArrayDeserializer15.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer20 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer21 = null;
        stringArrayDeserializer20._elementDeserializer = strJsonDeserializer21;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer23 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer20);
        java.lang.String[] strArray24 = stringArrayDeserializer23.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer25 = stringArrayDeserializer23._elementDeserializer;
        stringArrayDeserializer15._elementDeserializer = strJsonDeserializer25;
        stringArrayDeserializer7._elementDeserializer = strJsonDeserializer25;
        stringArrayDeserializer4._elementDeserializer = strJsonDeserializer25;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer25;
        java.lang.String[] strArray30 = stringArrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer31 = stringArrayDeserializer0.getDelegatee();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(stringArrayDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer17);
        org.junit.Assert.assertNull(wildcardJsonDeserializer18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNotNull(strJsonDeserializer25);
        org.junit.Assert.assertNull(strArray30);
        org.junit.Assert.assertNull(wildcardJsonDeserializer31);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.lang.Class<?> wildcardClass3 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = stringArrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType5 = stringArrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = stringArrayDeserializer6.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection8 = stringArrayDeserializer6.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer9 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        java.lang.Class<?> wildcardClass10 = stringArrayDeserializer9.handledType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType12 = stringArrayDeserializer11.getValueType();
        java.util.Collection<java.lang.Object> objCollection13 = stringArrayDeserializer11.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType14 = stringArrayDeserializer11.getValueType();
        boolean boolean15 = stringArrayDeserializer11.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer16 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer17 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer16);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer18 = stringArrayDeserializer17.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection19 = stringArrayDeserializer17.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer20 = stringArrayDeserializer17._elementDeserializer;
        stringArrayDeserializer11._elementDeserializer = strJsonDeserializer20;
        stringArrayDeserializer9._elementDeserializer = strJsonDeserializer20;
        stringArrayDeserializer6._elementDeserializer = strJsonDeserializer20;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer20;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader25 = stringArrayDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(objCollection13);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer18);
        org.junit.Assert.assertNull(objCollection19);
        org.junit.Assert.assertNotNull(strJsonDeserializer20);
        org.junit.Assert.assertNull(objectIdReader25);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = stringArrayDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection2 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType3 = stringArrayDeserializer0.getValueType();
        boolean boolean4 = stringArrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer5);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = stringArrayDeserializer6.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection8 = stringArrayDeserializer6.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer9 = stringArrayDeserializer6._elementDeserializer;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer9;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = stringArrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer14 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer13);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer15 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer14);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer16 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer15);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer17 = stringArrayDeserializer16._elementDeserializer;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer17;
        java.lang.Class<?> wildcardClass19 = stringArrayDeserializer0.getValueClass();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNotNull(strJsonDeserializer9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer12);
        org.junit.Assert.assertNotNull(strJsonDeserializer17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        boolean boolean3 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer1.getValueClass();
        java.lang.Class<?> wildcardClass5 = stringArrayDeserializer1.getValueClass();
        java.util.Collection<java.lang.Object> objCollection6 = stringArrayDeserializer1.getKnownPropertyNames();
        boolean boolean7 = stringArrayDeserializer1.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.String[] strArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray11 = stringArrayDeserializer1.deserialize(jsonParser8, deserializationContext9, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JavaType javaType4 = stringArrayDeserializer3.getValueType();
        java.lang.Class<?> wildcardClass5 = stringArrayDeserializer3.handledType();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer3.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer7 = null;
        stringArrayDeserializer3._elementDeserializer = strJsonDeserializer7;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = stringArrayDeserializer3.getObjectIdReader();
        java.lang.Class<?> wildcardClass10 = stringArrayDeserializer3.handledType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer3);
        java.util.Collection<java.lang.Object> objCollection12 = stringArrayDeserializer11.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass13 = stringArrayDeserializer11.getValueClass();
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(objCollection12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.String[] strArray7 = stringArrayDeserializer1.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer9 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer10 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = stringArrayDeserializer1.getDelegatee();
        boolean boolean12 = stringArrayDeserializer1.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer14 = null;
        stringArrayDeserializer13._elementDeserializer = strJsonDeserializer14;
        java.util.Collection<java.lang.Object> objCollection16 = stringArrayDeserializer13.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass17 = stringArrayDeserializer13.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer18 = null;
        stringArrayDeserializer13._elementDeserializer = strJsonDeserializer18;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer20 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer21 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer22 = stringArrayDeserializer20.unwrappingDeserializer(nameTransformer21);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer23 = stringArrayDeserializer20.getDelegatee();
        java.lang.Class<?> wildcardClass24 = stringArrayDeserializer20.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer25 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer26 = null;
        stringArrayDeserializer25._elementDeserializer = strJsonDeserializer26;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer28 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer25);
        java.lang.String[] strArray29 = stringArrayDeserializer28.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer30 = stringArrayDeserializer28._elementDeserializer;
        stringArrayDeserializer20._elementDeserializer = strJsonDeserializer30;
        stringArrayDeserializer13._elementDeserializer = strJsonDeserializer30;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer30;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer34 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser35 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext36 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer37 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = stringArrayDeserializer1.deserializeWithType(jsonParser35, deserializationContext36, typeDeserializer37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(objCollection16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer22);
        org.junit.Assert.assertNull(wildcardJsonDeserializer23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNull(strArray29);
        org.junit.Assert.assertNotNull(strJsonDeserializer30);
        org.junit.Assert.assertNull(wildcardJsonDeserializer34);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer4 = strArrayJsonDeserializer2.unwrappingDeserializer(nameTransformer3);
        boolean boolean5 = strArrayJsonDeserializer2.isCachable();
        java.lang.String[] strArray6 = strArrayJsonDeserializer2.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer7 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(strArrayJsonDeserializer2);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer10 = stringArrayDeserializer7.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = stringArrayDeserializer7.deserializeWithType(jsonParser11, deserializationContext12, typeDeserializer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer10);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = stringArrayDeserializer0._elementDeserializer;
        java.lang.String[] strArray2 = stringArrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = stringArrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer4 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray7 = stringArrayDeserializer4._deserializeCustom(jsonParser5, deserializationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strJsonDeserializer1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(javaType3);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = stringArrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer2 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer2;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = stringArrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer6 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer7 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer8 = null;
        stringArrayDeserializer7._elementDeserializer = strJsonDeserializer8;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer10 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer7);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = stringArrayDeserializer10.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer12 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer13 = null;
        stringArrayDeserializer12._elementDeserializer = strJsonDeserializer13;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer15 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer12);
        java.lang.String[] strArray16 = stringArrayDeserializer15.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer17 = stringArrayDeserializer15._elementDeserializer;
        stringArrayDeserializer10._elementDeserializer = strJsonDeserializer17;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer17;
        java.lang.Class<?> wildcardClass20 = stringArrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType21 = stringArrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer22 = stringArrayDeserializer0.getDelegatee();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer6);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strJsonDeserializer17);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertNull(wildcardJsonDeserializer22);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = stringArrayDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer6 = null;
        stringArrayDeserializer5._elementDeserializer = strJsonDeserializer6;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer5);
        java.lang.String[] strArray9 = stringArrayDeserializer8.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer10 = stringArrayDeserializer8._elementDeserializer;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer10;
        com.fasterxml.jackson.databind.JavaType javaType12 = stringArrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType13 = stringArrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer14 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.core.JsonParser jsonParser15 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = stringArrayDeserializer14.deserializeWithType(jsonParser15, deserializationContext16, typeDeserializer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strJsonDeserializer10);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(javaType13);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType3 = stringArrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = stringArrayDeserializer0.getObjectIdReader();
        java.lang.String[] strArray5 = stringArrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer6 = stringArrayDeserializer0._elementDeserializer;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer7 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer8 = stringArrayDeserializer0._elementDeserializer;
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(strJsonDeserializer6);
        org.junit.Assert.assertNull(strJsonDeserializer8);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = stringArrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer2 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer2;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer4 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        java.lang.String[] strArray5 = stringArrayDeserializer0.getNullValue();
        boolean boolean6 = stringArrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = stringArrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass8 = stringArrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer9 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer10 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer11 = null;
        stringArrayDeserializer10._elementDeserializer = strJsonDeserializer11;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer10);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader14 = stringArrayDeserializer13.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer15 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer16 = null;
        stringArrayDeserializer15._elementDeserializer = strJsonDeserializer16;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer18 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer15);
        java.lang.String[] strArray19 = stringArrayDeserializer18.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer20 = stringArrayDeserializer18._elementDeserializer;
        stringArrayDeserializer13._elementDeserializer = strJsonDeserializer20;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer22 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer23 = null;
        stringArrayDeserializer22._elementDeserializer = strJsonDeserializer23;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer25 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer22);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader26 = stringArrayDeserializer25.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer27 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer28 = null;
        stringArrayDeserializer27._elementDeserializer = strJsonDeserializer28;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer30 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer27);
        java.lang.String[] strArray31 = stringArrayDeserializer30.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer32 = stringArrayDeserializer30._elementDeserializer;
        stringArrayDeserializer25._elementDeserializer = strJsonDeserializer32;
        stringArrayDeserializer13._elementDeserializer = strJsonDeserializer32;
        java.util.Collection<java.lang.Object> objCollection35 = stringArrayDeserializer13.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType36 = stringArrayDeserializer13.getValueType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer37 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer38 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer39 = stringArrayDeserializer37.unwrappingDeserializer(nameTransformer38);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer40 = stringArrayDeserializer37.getDelegatee();
        java.lang.Class<?> wildcardClass41 = stringArrayDeserializer37.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer42 = stringArrayDeserializer37._elementDeserializer;
        boolean boolean43 = stringArrayDeserializer37.isCachable();
        java.lang.String[] strArray44 = stringArrayDeserializer37.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer45 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        java.lang.Class<?> wildcardClass46 = stringArrayDeserializer45.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer47 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer48 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer47);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer49 = stringArrayDeserializer48.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer50 = null;
        stringArrayDeserializer48._elementDeserializer = strJsonDeserializer50;
        boolean boolean52 = stringArrayDeserializer48.isCachable();
        java.lang.Class<?> wildcardClass53 = stringArrayDeserializer48.handledType();
        java.lang.String[] strArray54 = stringArrayDeserializer48.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer55 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer48);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer56 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer57 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer58 = stringArrayDeserializer56.unwrappingDeserializer(nameTransformer57);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer59 = stringArrayDeserializer56.getDelegatee();
        java.lang.Class<?> wildcardClass60 = stringArrayDeserializer56.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer61 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer62 = null;
        stringArrayDeserializer61._elementDeserializer = strJsonDeserializer62;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer64 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer61);
        java.lang.String[] strArray65 = stringArrayDeserializer64.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer66 = stringArrayDeserializer64._elementDeserializer;
        stringArrayDeserializer56._elementDeserializer = strJsonDeserializer66;
        stringArrayDeserializer48._elementDeserializer = strJsonDeserializer66;
        stringArrayDeserializer45._elementDeserializer = strJsonDeserializer66;
        stringArrayDeserializer37._elementDeserializer = strJsonDeserializer66;
        stringArrayDeserializer13._elementDeserializer = strJsonDeserializer66;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer72 = stringArrayDeserializer13._elementDeserializer;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer72;
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objectIdReader14);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNotNull(strJsonDeserializer20);
        org.junit.Assert.assertNull(objectIdReader26);
        org.junit.Assert.assertNull(strArray31);
        org.junit.Assert.assertNotNull(strJsonDeserializer32);
        org.junit.Assert.assertNull(objCollection35);
        org.junit.Assert.assertNull(javaType36);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer39);
        org.junit.Assert.assertNull(wildcardJsonDeserializer40);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNull(strJsonDeserializer42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNotNull(stringArrayDeserializer45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNull(wildcardJsonDeserializer49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNull(strArray54);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer58);
        org.junit.Assert.assertNull(wildcardJsonDeserializer59);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNull(strArray65);
        org.junit.Assert.assertNotNull(strJsonDeserializer66);
        org.junit.Assert.assertNotNull(strJsonDeserializer72);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = stringArrayDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer5.handledType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer7 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer5);
        com.fasterxml.jackson.databind.JavaType javaType8 = stringArrayDeserializer7.getValueType();
        boolean boolean9 = stringArrayDeserializer7.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer10 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer12 = stringArrayDeserializer10.unwrappingDeserializer(nameTransformer11);
        java.lang.Class<?> wildcardClass13 = stringArrayDeserializer10.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = stringArrayDeserializer10.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType15 = stringArrayDeserializer10.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader16 = stringArrayDeserializer10.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType17 = stringArrayDeserializer10.getValueType();
        java.lang.Class<?> wildcardClass18 = stringArrayDeserializer10.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer19 = stringArrayDeserializer7.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(wildcardJsonDeserializer14);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertNull(objectIdReader16);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.String[] strArray7 = stringArrayDeserializer1.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer9 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer10 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        boolean boolean11 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass12 = stringArrayDeserializer1.handledType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer7 = null;
        stringArrayDeserializer6._elementDeserializer = strJsonDeserializer7;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer9 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = stringArrayDeserializer9.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer12 = null;
        stringArrayDeserializer11._elementDeserializer = strJsonDeserializer12;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer14 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer11);
        java.lang.String[] strArray15 = stringArrayDeserializer14.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer16 = stringArrayDeserializer14._elementDeserializer;
        stringArrayDeserializer9._elementDeserializer = strJsonDeserializer16;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer18 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer19 = null;
        stringArrayDeserializer18._elementDeserializer = strJsonDeserializer19;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer21 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer18);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader22 = stringArrayDeserializer21.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer23 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer24 = null;
        stringArrayDeserializer23._elementDeserializer = strJsonDeserializer24;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer26 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer23);
        java.lang.String[] strArray27 = stringArrayDeserializer26.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer28 = stringArrayDeserializer26._elementDeserializer;
        stringArrayDeserializer21._elementDeserializer = strJsonDeserializer28;
        stringArrayDeserializer9._elementDeserializer = strJsonDeserializer28;
        stringArrayDeserializer5._elementDeserializer = strJsonDeserializer28;
        java.lang.String[] strArray32 = stringArrayDeserializer5.getEmptyValue();
        boolean boolean33 = stringArrayDeserializer5.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType34 = stringArrayDeserializer5.getValueType();
        java.util.Collection<java.lang.Object> objCollection35 = stringArrayDeserializer5.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer36 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer5);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer37 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer36);
        com.fasterxml.jackson.core.JsonParser jsonParser38 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext39 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray40 = stringArrayDeserializer37.deserialize(jsonParser38, deserializationContext39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectIdReader10);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(strJsonDeserializer16);
        org.junit.Assert.assertNull(objectIdReader22);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertNotNull(strJsonDeserializer28);
        org.junit.Assert.assertNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(javaType34);
        org.junit.Assert.assertNull(objCollection35);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = stringArrayDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection2 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType3 = stringArrayDeserializer0.getValueType();
        boolean boolean4 = stringArrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = stringArrayDeserializer5.getDelegatee();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        java.lang.String[] strArray3 = stringArrayDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass5 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = stringArrayDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection7 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType9 = stringArrayDeserializer8.getValueType();
        java.util.Collection<java.lang.Object> objCollection10 = stringArrayDeserializer8.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType11 = stringArrayDeserializer8.getValueType();
        boolean boolean12 = stringArrayDeserializer8.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer14 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer13);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = stringArrayDeserializer14.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection16 = stringArrayDeserializer14.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer17 = stringArrayDeserializer14._elementDeserializer;
        stringArrayDeserializer8._elementDeserializer = strJsonDeserializer17;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer19 = stringArrayDeserializer8._elementDeserializer;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer19;
        java.util.Collection<java.lang.Object> objCollection21 = stringArrayDeserializer0.getKnownPropertyNames();
        java.lang.String[] strArray22 = stringArrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer23 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer15);
        org.junit.Assert.assertNull(objCollection16);
        org.junit.Assert.assertNotNull(strJsonDeserializer17);
        org.junit.Assert.assertNotNull(strJsonDeserializer19);
        org.junit.Assert.assertNull(objCollection21);
        org.junit.Assert.assertNull(strArray22);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = stringArrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer0.getDelegatee();
        java.lang.String[] strArray3 = stringArrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = stringArrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer6 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = stringArrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = stringArrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = stringArrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = stringArrayDeserializer0.getDelegatee();
        java.lang.String[] strArray11 = stringArrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray17 = stringArrayDeserializer0.deserialize(jsonParser12, deserializationContext13, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type [Ljava.lang.String; (by deserializer of type com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = stringArrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer2 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer2;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer4 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        java.lang.Class<?> wildcardClass5 = stringArrayDeserializer0.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty7 = stringArrayDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = stringArrayDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer5.handledType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer7 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer9 = stringArrayDeserializer5.unwrappingDeserializer(nameTransformer8);
        java.lang.String[] strArray10 = stringArrayDeserializer5.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer12 = stringArrayDeserializer5.unwrappingDeserializer(nameTransformer11);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer12);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JavaType javaType4 = stringArrayDeserializer3.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = stringArrayDeserializer3.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer7 = stringArrayDeserializer3.unwrappingDeserializer(nameTransformer6);
        java.lang.String[] strArray8 = stringArrayDeserializer3.getEmptyValue();
        java.lang.String[] strArray9 = stringArrayDeserializer3.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection10 = stringArrayDeserializer3.getKnownPropertyNames();
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(objCollection10);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = stringArrayDeserializer1.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType6 = stringArrayDeserializer1.getValueType();
        java.lang.Class<?> wildcardClass7 = stringArrayDeserializer1.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer8 = stringArrayDeserializer1._elementDeserializer;
        java.lang.Class<?> wildcardClass9 = stringArrayDeserializer1.handledType();
        java.lang.Class<?> wildcardClass10 = stringArrayDeserializer1.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty12 = stringArrayDeserializer1.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(strJsonDeserializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.String[] strArray7 = stringArrayDeserializer1.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer9 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer10 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer12 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        boolean boolean14 = stringArrayDeserializer13.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader15 = stringArrayDeserializer13.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer16 = stringArrayDeserializer13._elementDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType17 = stringArrayDeserializer13.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser18 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray20 = stringArrayDeserializer13._deserializeCustom(jsonParser18, deserializationContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer9);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(objectIdReader15);
        org.junit.Assert.assertNotNull(strJsonDeserializer16);
        org.junit.Assert.assertNull(javaType17);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = stringArrayDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection2 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType3 = stringArrayDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer5 = stringArrayDeserializer0._elementDeserializer;
        java.util.Collection<java.lang.Object> objCollection6 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer7 = stringArrayDeserializer0._elementDeserializer;
        java.util.Collection<java.lang.Object> objCollection8 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = stringArrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer11 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer10);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer12 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(strJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(strJsonDeserializer7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer11);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = stringArrayDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection2 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType3 = stringArrayDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer5 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer5;
        java.lang.Class<?> wildcardClass7 = stringArrayDeserializer0.handledType();
        java.lang.String[] strArray8 = stringArrayDeserializer0.getNullValue();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.String[] strArray7 = stringArrayDeserializer1.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer9 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer10 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = stringArrayDeserializer1.getDelegatee();
        boolean boolean12 = stringArrayDeserializer1.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader13 = stringArrayDeserializer1.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer14 = stringArrayDeserializer1._elementDeserializer;
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(objectIdReader13);
        org.junit.Assert.assertNull(strJsonDeserializer14);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.String[] strArray7 = stringArrayDeserializer1.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer10 = stringArrayDeserializer8.unwrappingDeserializer(nameTransformer9);
        boolean boolean11 = strArrayJsonDeserializer10.isCachable();
        boolean boolean12 = strArrayJsonDeserializer10.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray19 = strArrayJsonDeserializer10.deserialize(jsonParser13, deserializationContext14, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type [Ljava.lang.String; (by deserializer of type com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = stringArrayDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.getValueClass();
        boolean boolean5 = stringArrayDeserializer0.isCachable();
        java.lang.String[] strArray6 = stringArrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer7 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer7);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = stringArrayDeserializer8.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer10 = null;
        stringArrayDeserializer8._elementDeserializer = strJsonDeserializer10;
        boolean boolean12 = stringArrayDeserializer8.isCachable();
        java.lang.Class<?> wildcardClass13 = stringArrayDeserializer8.handledType();
        java.lang.String[] strArray14 = stringArrayDeserializer8.getNullValue();
        java.lang.String[] strArray15 = stringArrayDeserializer8.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType16 = stringArrayDeserializer8.getValueType();
        java.lang.String[] strArray17 = stringArrayDeserializer8.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer18 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer19 = null;
        stringArrayDeserializer18._elementDeserializer = strJsonDeserializer19;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer21 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer18);
        com.fasterxml.jackson.databind.JavaType javaType22 = stringArrayDeserializer21.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType23 = stringArrayDeserializer21.getValueType();
        java.lang.String[] strArray24 = stringArrayDeserializer21.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer25 = stringArrayDeserializer21._elementDeserializer;
        stringArrayDeserializer8._elementDeserializer = strJsonDeserializer25;
        java.util.Collection<java.lang.Object> objCollection27 = stringArrayDeserializer8.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer28 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer29 = stringArrayDeserializer8.unwrappingDeserializer(nameTransformer28);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer30 = stringArrayDeserializer0.replaceDelegatee(strArrayJsonDeserializer29);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(javaType16);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(javaType22);
        org.junit.Assert.assertNull(javaType23);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNotNull(strJsonDeserializer25);
        org.junit.Assert.assertNull(objCollection27);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer29);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JavaType javaType3 = stringArrayDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection4 = stringArrayDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass5 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer7 = null;
        stringArrayDeserializer6._elementDeserializer = strJsonDeserializer7;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer9 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer6);
        java.lang.String[] strArray10 = stringArrayDeserializer9.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer11 = stringArrayDeserializer9._elementDeserializer;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer11;
        com.fasterxml.jackson.databind.JavaType javaType13 = stringArrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer14 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer15 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer14);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer16 = stringArrayDeserializer14.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType17 = stringArrayDeserializer14.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer19 = stringArrayDeserializer14.unwrappingDeserializer(nameTransformer18);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer20 = stringArrayDeserializer14._elementDeserializer;
        java.lang.String[] strArray21 = stringArrayDeserializer14.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer22 = stringArrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(strJsonDeserializer11);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertNull(wildcardJsonDeserializer16);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer19);
        org.junit.Assert.assertNull(strJsonDeserializer20);
        org.junit.Assert.assertNull(strArray21);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JavaType javaType4 = stringArrayDeserializer3.getValueType();
        java.lang.Class<?> wildcardClass5 = stringArrayDeserializer3.handledType();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer3.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer7 = null;
        stringArrayDeserializer3._elementDeserializer = strJsonDeserializer7;
        java.util.Collection<java.lang.Object> objCollection9 = stringArrayDeserializer3.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass10 = stringArrayDeserializer3.getValueClass();
        java.lang.String[] strArray11 = stringArrayDeserializer3.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType12 = stringArrayDeserializer3.getValueType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer3);
        java.lang.Class<?> wildcardClass14 = stringArrayDeserializer3.getValueClass();
        java.lang.Class<?> wildcardClass15 = stringArrayDeserializer3.handledType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer16 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer3);
        java.lang.Class<?> wildcardClass17 = stringArrayDeserializer16.getValueClass();
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = stringArrayDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection5 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = stringArrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer7 = stringArrayDeserializer0._elementDeserializer;
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray13 = stringArrayDeserializer0.deserialize(jsonParser8, deserializationContext9, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type [Ljava.lang.String; (by deserializer of type com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(strJsonDeserializer7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = stringArrayDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer6 = null;
        stringArrayDeserializer5._elementDeserializer = strJsonDeserializer6;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer5);
        java.lang.String[] strArray9 = stringArrayDeserializer8.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer10 = stringArrayDeserializer8._elementDeserializer;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer10;
        com.fasterxml.jackson.databind.JavaType javaType12 = stringArrayDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection13 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer15 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer14);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer16 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.core.JsonParser jsonParser17 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray19 = stringArrayDeserializer0._deserializeCustom(jsonParser17, deserializationContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strJsonDeserializer10);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(objCollection13);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer15);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JavaType javaType4 = stringArrayDeserializer3.getValueType();
        java.lang.Class<?> wildcardClass5 = stringArrayDeserializer3.handledType();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer3.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer7 = null;
        stringArrayDeserializer3._elementDeserializer = strJsonDeserializer7;
        java.util.Collection<java.lang.Object> objCollection9 = stringArrayDeserializer3.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass10 = stringArrayDeserializer3.getValueClass();
        java.lang.String[] strArray11 = stringArrayDeserializer3.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType12 = stringArrayDeserializer3.getValueType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer3);
        java.lang.Class<?> wildcardClass14 = stringArrayDeserializer3.getValueClass();
        java.lang.Class<?> wildcardClass15 = stringArrayDeserializer3.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer17 = stringArrayDeserializer3.unwrappingDeserializer(nameTransformer16);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader18 = strArrayJsonDeserializer17.getObjectIdReader();
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer17);
        org.junit.Assert.assertNull(objectIdReader18);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        java.lang.String[] strArray3 = stringArrayDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection5 = stringArrayDeserializer0.getKnownPropertyNames();
        java.lang.String[] strArray6 = stringArrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = stringArrayDeserializer0.getDelegatee();
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = stringArrayDeserializer1.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType6 = stringArrayDeserializer1.getValueType();
        java.lang.Class<?> wildcardClass7 = stringArrayDeserializer1.handledType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        java.lang.String[] strArray9 = stringArrayDeserializer8.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer11 = stringArrayDeserializer8.unwrappingDeserializer(nameTransformer10);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer12 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer8);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer12);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer11);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.String[] strArray7 = stringArrayDeserializer1.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer9 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer10 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer12 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer15 = stringArrayDeserializer13.unwrappingDeserializer(nameTransformer14);
        java.lang.Class<?> wildcardClass16 = stringArrayDeserializer13.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer17 = stringArrayDeserializer13.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType18 = stringArrayDeserializer13.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader19 = stringArrayDeserializer13.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer20 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer21 = null;
        stringArrayDeserializer20._elementDeserializer = strJsonDeserializer21;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer23 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer20);
        com.fasterxml.jackson.databind.JavaType javaType24 = stringArrayDeserializer23.getValueType();
        java.lang.String[] strArray25 = stringArrayDeserializer23.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType26 = stringArrayDeserializer23.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer27 = stringArrayDeserializer23._elementDeserializer;
        stringArrayDeserializer13._elementDeserializer = strJsonDeserializer27;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer27;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer30 = stringArrayDeserializer1._elementDeserializer;
        boolean boolean31 = stringArrayDeserializer1.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer32 = stringArrayDeserializer1.getDelegatee();
        java.lang.Class<?> wildcardClass33 = stringArrayDeserializer1.getClass();
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer9);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer12);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(wildcardJsonDeserializer17);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNull(objectIdReader19);
        org.junit.Assert.assertNull(javaType24);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertNull(javaType26);
        org.junit.Assert.assertNotNull(strJsonDeserializer27);
        org.junit.Assert.assertNotNull(strJsonDeserializer30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = stringArrayDeserializer0.getDelegatee();
        java.lang.String[] strArray2 = stringArrayDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass3 = stringArrayDeserializer0.getValueClass();
        java.lang.String[] strArray4 = stringArrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer6 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer6);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.String[] strArray7 = stringArrayDeserializer1.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer9 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer8);
        java.util.Collection<java.lang.Object> objCollection10 = strArrayJsonDeserializer9.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer12 = strArrayJsonDeserializer9.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(strArrayJsonDeserializer9);
        java.util.Collection<java.lang.Object> objCollection14 = stringArrayDeserializer13.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass15 = stringArrayDeserializer13.handledType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer16 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer13);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader17 = stringArrayDeserializer16.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType18 = stringArrayDeserializer16.getValueType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer19 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType20 = stringArrayDeserializer19.getValueType();
        java.util.Collection<java.lang.Object> objCollection21 = stringArrayDeserializer19.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType22 = stringArrayDeserializer19.getValueType();
        boolean boolean23 = stringArrayDeserializer19.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer24 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer25 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer24);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer26 = stringArrayDeserializer25.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection27 = stringArrayDeserializer25.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer28 = stringArrayDeserializer25._elementDeserializer;
        stringArrayDeserializer19._elementDeserializer = strJsonDeserializer28;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer30 = stringArrayDeserializer19._elementDeserializer;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer31 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer19);
        java.lang.String[] strArray32 = stringArrayDeserializer31.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer33 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer31);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer34 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer35 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer34);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer36 = stringArrayDeserializer35.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer37 = null;
        stringArrayDeserializer35._elementDeserializer = strJsonDeserializer37;
        boolean boolean39 = stringArrayDeserializer35.isCachable();
        java.lang.Class<?> wildcardClass40 = stringArrayDeserializer35.handledType();
        java.lang.String[] strArray41 = stringArrayDeserializer35.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer42 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer43 = stringArrayDeserializer35.unwrappingDeserializer(nameTransformer42);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer44 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer35);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer45 = stringArrayDeserializer35.getDelegatee();
        boolean boolean46 = stringArrayDeserializer35.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer47 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer48 = null;
        stringArrayDeserializer47._elementDeserializer = strJsonDeserializer48;
        java.util.Collection<java.lang.Object> objCollection50 = stringArrayDeserializer47.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass51 = stringArrayDeserializer47.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer52 = null;
        stringArrayDeserializer47._elementDeserializer = strJsonDeserializer52;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer54 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer55 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer56 = stringArrayDeserializer54.unwrappingDeserializer(nameTransformer55);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer57 = stringArrayDeserializer54.getDelegatee();
        java.lang.Class<?> wildcardClass58 = stringArrayDeserializer54.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer59 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer60 = null;
        stringArrayDeserializer59._elementDeserializer = strJsonDeserializer60;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer62 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer59);
        java.lang.String[] strArray63 = stringArrayDeserializer62.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer64 = stringArrayDeserializer62._elementDeserializer;
        stringArrayDeserializer54._elementDeserializer = strJsonDeserializer64;
        stringArrayDeserializer47._elementDeserializer = strJsonDeserializer64;
        stringArrayDeserializer35._elementDeserializer = strJsonDeserializer64;
        stringArrayDeserializer31._elementDeserializer = strJsonDeserializer64;
        stringArrayDeserializer16._elementDeserializer = strJsonDeserializer64;
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer12);
        org.junit.Assert.assertNull(objCollection14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(objectIdReader17);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNull(javaType20);
        org.junit.Assert.assertNull(objCollection21);
        org.junit.Assert.assertNull(javaType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer26);
        org.junit.Assert.assertNull(objCollection27);
        org.junit.Assert.assertNotNull(strJsonDeserializer28);
        org.junit.Assert.assertNotNull(strJsonDeserializer30);
        org.junit.Assert.assertNull(strArray32);
        org.junit.Assert.assertNull(wildcardJsonDeserializer36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNull(strArray41);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer43);
        org.junit.Assert.assertNull(wildcardJsonDeserializer45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(objCollection50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer56);
        org.junit.Assert.assertNull(wildcardJsonDeserializer57);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNull(strArray63);
        org.junit.Assert.assertNotNull(strJsonDeserializer64);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        java.util.Collection<java.lang.Object> objCollection3 = stringArrayDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = stringArrayDeserializer0.getDelegatee();
        java.lang.String[] strArray6 = stringArrayDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = stringArrayDeserializer0.deserialize(jsonParser7, deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(strArray6);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = stringArrayDeserializer1.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        java.lang.String[] strArray4 = stringArrayDeserializer1.getEmptyValue();
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(strArray4);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        boolean boolean3 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer1.getValueClass();
        java.lang.Class<?> wildcardClass5 = stringArrayDeserializer1.getValueClass();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.getValueClass();
        java.lang.Class<?> wildcardClass7 = stringArrayDeserializer1.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer9 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer11 = strArrayJsonDeserializer9.unwrappingDeserializer(nameTransformer10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer9);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer11);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.String[] strArray7 = stringArrayDeserializer1.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer9 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer10 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer11 = stringArrayDeserializer10._elementDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer12 = stringArrayDeserializer10._elementDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = stringArrayDeserializer10.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser14 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = stringArrayDeserializer10.deserializeWithType(jsonParser14, deserializationContext15, typeDeserializer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer9);
        org.junit.Assert.assertNotNull(strJsonDeserializer11);
        org.junit.Assert.assertNotNull(strJsonDeserializer12);
        org.junit.Assert.assertNull(wildcardJsonDeserializer13);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = stringArrayDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection2 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType3 = stringArrayDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer5 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer5;
        java.lang.String[] strArray7 = stringArrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer9 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = strArrayJsonDeserializer9.getObjectIdReader();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer9);
        org.junit.Assert.assertNull(objectIdReader10);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.String[] strArray7 = stringArrayDeserializer1.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer10 = stringArrayDeserializer8.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer8);
        java.lang.Class<?> wildcardClass12 = stringArrayDeserializer11.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer14 = stringArrayDeserializer11.unwrappingDeserializer(nameTransformer13);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer16 = strArrayJsonDeserializer14.unwrappingDeserializer(nameTransformer15);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer14);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer16);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = stringArrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer2 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer2;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer4 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        java.lang.String[] strArray5 = stringArrayDeserializer0.getNullValue();
        boolean boolean6 = stringArrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = stringArrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType8 = stringArrayDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray11 = stringArrayDeserializer0.deserialize(jsonParser9, deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = stringArrayDeserializer0.getValueType();
        java.lang.String[] strArray2 = stringArrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = stringArrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer4 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray7 = stringArrayDeserializer4._deserializeCustom(jsonParser5, deserializationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(objectIdReader3);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer4 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer6 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer7 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer9 = stringArrayDeserializer7.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.JavaType javaType10 = stringArrayDeserializer7.getValueType();
        java.lang.Class<?> wildcardClass11 = stringArrayDeserializer7.handledType();
        boolean boolean12 = stringArrayDeserializer7.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer14 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer13);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = stringArrayDeserializer14.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer16 = null;
        stringArrayDeserializer14._elementDeserializer = strJsonDeserializer16;
        boolean boolean18 = stringArrayDeserializer14.isCachable();
        java.lang.Class<?> wildcardClass19 = stringArrayDeserializer14.handledType();
        java.lang.String[] strArray20 = stringArrayDeserializer14.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer21 = stringArrayDeserializer14._elementDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType22 = stringArrayDeserializer14.getValueType();
        java.util.Collection<java.lang.Object> objCollection23 = stringArrayDeserializer14.getKnownPropertyNames();
        java.lang.String[] strArray24 = stringArrayDeserializer14.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer25 = stringArrayDeserializer14.getDelegatee();
        java.lang.Class<?> wildcardClass26 = stringArrayDeserializer14.getValueClass();
        java.lang.Class<?> wildcardClass27 = stringArrayDeserializer14.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer28 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer29 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer30 = stringArrayDeserializer28.unwrappingDeserializer(nameTransformer29);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer31 = stringArrayDeserializer28.getDelegatee();
        java.lang.Class<?> wildcardClass32 = stringArrayDeserializer28.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer33 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer34 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer35 = stringArrayDeserializer33.unwrappingDeserializer(nameTransformer34);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer36 = stringArrayDeserializer33.getDelegatee();
        java.lang.Class<?> wildcardClass37 = stringArrayDeserializer33.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer38 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer39 = null;
        stringArrayDeserializer38._elementDeserializer = strJsonDeserializer39;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer41 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer38);
        java.lang.String[] strArray42 = stringArrayDeserializer41.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer43 = stringArrayDeserializer41._elementDeserializer;
        stringArrayDeserializer33._elementDeserializer = strJsonDeserializer43;
        stringArrayDeserializer28._elementDeserializer = strJsonDeserializer43;
        stringArrayDeserializer14._elementDeserializer = strJsonDeserializer43;
        stringArrayDeserializer7._elementDeserializer = strJsonDeserializer43;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer43;
        com.fasterxml.jackson.core.JsonParser jsonParser49 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext50 = null;
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray55 = stringArrayDeserializer1.deserialize(jsonParser49, deserializationContext50, strArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type [Ljava.lang.String; (by deserializer of type com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer4);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer6);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNull(strJsonDeserializer21);
        org.junit.Assert.assertNull(javaType22);
        org.junit.Assert.assertNull(objCollection23);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNull(wildcardJsonDeserializer25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer30);
        org.junit.Assert.assertNull(wildcardJsonDeserializer31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer35);
        org.junit.Assert.assertNull(wildcardJsonDeserializer36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNull(strArray42);
        org.junit.Assert.assertNotNull(strJsonDeserializer43);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "hi!", "hi!", "hi!" });
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.String[] strArray7 = stringArrayDeserializer1.getNullValue();
        java.lang.String[] strArray8 = stringArrayDeserializer1.getEmptyValue();
        java.lang.Class<?> wildcardClass9 = stringArrayDeserializer1.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer10 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer11 = null;
        stringArrayDeserializer10._elementDeserializer = strJsonDeserializer11;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer10);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader14 = stringArrayDeserializer13.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer15 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer16 = null;
        stringArrayDeserializer15._elementDeserializer = strJsonDeserializer16;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer18 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer15);
        java.lang.String[] strArray19 = stringArrayDeserializer18.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer20 = stringArrayDeserializer18._elementDeserializer;
        stringArrayDeserializer13._elementDeserializer = strJsonDeserializer20;
        java.lang.String[] strArray22 = stringArrayDeserializer13.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer23 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer24 = stringArrayDeserializer13.unwrappingDeserializer(nameTransformer23);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer25 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer26 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer25);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer27 = stringArrayDeserializer26.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer28 = null;
        stringArrayDeserializer26._elementDeserializer = strJsonDeserializer28;
        boolean boolean30 = stringArrayDeserializer26.isCachable();
        java.lang.Class<?> wildcardClass31 = stringArrayDeserializer26.handledType();
        java.lang.String[] strArray32 = stringArrayDeserializer26.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer33 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer26);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer34 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer35 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer36 = stringArrayDeserializer34.unwrappingDeserializer(nameTransformer35);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer37 = stringArrayDeserializer34.getDelegatee();
        java.lang.Class<?> wildcardClass38 = stringArrayDeserializer34.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer39 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer40 = null;
        stringArrayDeserializer39._elementDeserializer = strJsonDeserializer40;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer42 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer39);
        java.lang.String[] strArray43 = stringArrayDeserializer42.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer44 = stringArrayDeserializer42._elementDeserializer;
        stringArrayDeserializer34._elementDeserializer = strJsonDeserializer44;
        stringArrayDeserializer26._elementDeserializer = strJsonDeserializer44;
        stringArrayDeserializer13._elementDeserializer = strJsonDeserializer44;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer44;
        boolean boolean49 = stringArrayDeserializer1.isCachable();
        java.lang.String[] strArray50 = stringArrayDeserializer1.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer51 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        boolean boolean52 = stringArrayDeserializer51.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer53 = null;
        stringArrayDeserializer51._elementDeserializer = strJsonDeserializer53;
        java.lang.String[] strArray55 = stringArrayDeserializer51.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer56 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer57 = stringArrayDeserializer51.unwrappingDeserializer(nameTransformer56);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(objectIdReader14);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNotNull(strJsonDeserializer20);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer24);
        org.junit.Assert.assertNull(wildcardJsonDeserializer27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNull(strArray32);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer36);
        org.junit.Assert.assertNull(wildcardJsonDeserializer37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNull(strArray43);
        org.junit.Assert.assertNotNull(strJsonDeserializer44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(strArray55);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer57);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = stringArrayDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection2 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType3 = stringArrayDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer5 = stringArrayDeserializer0._elementDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer6 = stringArrayDeserializer0._elementDeserializer;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer7 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(strJsonDeserializer5);
        org.junit.Assert.assertNull(strJsonDeserializer6);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        java.lang.Class<?> wildcardClass3 = stringArrayDeserializer1.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer4 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer4;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer6 = stringArrayDeserializer1._elementDeserializer;
        java.util.Collection<java.lang.Object> objCollection7 = stringArrayDeserializer1.getKnownPropertyNames();
        java.lang.String[] strArray8 = stringArrayDeserializer1.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType9 = stringArrayDeserializer1.getValueType();
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(strJsonDeserializer6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = stringArrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer2 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer2;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer4 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        java.lang.String[] strArray5 = stringArrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer6 = stringArrayDeserializer0._elementDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = stringArrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer9 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer8);
        java.lang.String[] strArray10 = stringArrayDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray13 = stringArrayDeserializer0.deserialize(jsonParser11, deserializationContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(strJsonDeserializer6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer9);
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = stringArrayDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer5);
        java.lang.Class<?> wildcardClass7 = stringArrayDeserializer5.getValueClass();
        java.lang.String[] strArray8 = stringArrayDeserializer5.getNullValue();
        java.lang.String[] strArray9 = stringArrayDeserializer5.getNullValue();
        java.lang.Class<?> wildcardClass10 = stringArrayDeserializer5.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = stringArrayDeserializer5.deserializeWithType(jsonParser11, deserializationContext12, typeDeserializer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.String[] strArray7 = stringArrayDeserializer1.getNullValue();
        java.lang.String[] strArray8 = stringArrayDeserializer1.getEmptyValue();
        java.lang.String[] strArray9 = stringArrayDeserializer1.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType10 = stringArrayDeserializer1.getValueType();
        java.lang.String[] strArray11 = stringArrayDeserializer1.getNullValue();
        java.lang.String[] strArray12 = stringArrayDeserializer1.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stringArrayDeserializer1.deserializeWithType(jsonParser13, deserializationContext14, typeDeserializer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(strArray12);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = stringArrayDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection2 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType3 = stringArrayDeserializer0.getValueType();
        boolean boolean4 = stringArrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer5);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = stringArrayDeserializer6.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection8 = stringArrayDeserializer6.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer9 = stringArrayDeserializer6._elementDeserializer;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer9;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = stringArrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = stringArrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType13 = stringArrayDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass14 = stringArrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader15 = stringArrayDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNotNull(strJsonDeserializer9);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNull(objectIdReader12);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(objectIdReader15);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = stringArrayDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer6 = null;
        stringArrayDeserializer5._elementDeserializer = strJsonDeserializer6;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer5);
        java.lang.String[] strArray9 = stringArrayDeserializer8.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer10 = stringArrayDeserializer8._elementDeserializer;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer10;
        com.fasterxml.jackson.databind.JavaType javaType12 = stringArrayDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection13 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer15 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer14);
        java.lang.Class<?> wildcardClass16 = stringArrayDeserializer0.getClass();
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strJsonDeserializer10);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(objCollection13);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = stringArrayDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.handledType();
        java.lang.String[] strArray5 = stringArrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = stringArrayDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass7 = stringArrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = stringArrayDeserializer3.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer6 = null;
        stringArrayDeserializer5._elementDeserializer = strJsonDeserializer6;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer5);
        java.lang.String[] strArray9 = stringArrayDeserializer8.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer10 = stringArrayDeserializer8._elementDeserializer;
        stringArrayDeserializer3._elementDeserializer = strJsonDeserializer10;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer12 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer13 = null;
        stringArrayDeserializer12._elementDeserializer = strJsonDeserializer13;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer15 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer12);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader16 = stringArrayDeserializer15.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer17 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer18 = null;
        stringArrayDeserializer17._elementDeserializer = strJsonDeserializer18;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer20 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer17);
        java.lang.String[] strArray21 = stringArrayDeserializer20.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer22 = stringArrayDeserializer20._elementDeserializer;
        stringArrayDeserializer15._elementDeserializer = strJsonDeserializer22;
        stringArrayDeserializer3._elementDeserializer = strJsonDeserializer22;
        java.lang.Class<?> wildcardClass25 = stringArrayDeserializer3.handledType();
        java.lang.Class<?> wildcardClass26 = stringArrayDeserializer3.getValueClass();
        java.lang.String[] strArray27 = stringArrayDeserializer3.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser28 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext29 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray33 = stringArrayDeserializer3.deserialize(jsonParser28, deserializationContext29, strArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type [Ljava.lang.String; (by deserializer of type com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strJsonDeserializer10);
        org.junit.Assert.assertNull(objectIdReader16);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNotNull(strJsonDeserializer22);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        java.lang.Class<?> wildcardClass1 = stringArrayDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = stringArrayDeserializer3.createContextual(deserializationContext4, beanProperty5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = stringArrayDeserializer1.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType6 = stringArrayDeserializer1.getValueType();
        java.lang.Class<?> wildcardClass7 = stringArrayDeserializer1.handledType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        java.lang.String[] strArray9 = stringArrayDeserializer8.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer11 = stringArrayDeserializer8.unwrappingDeserializer(nameTransformer10);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer12 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer8);
        java.util.Collection<java.lang.Object> objCollection13 = stringArrayDeserializer12.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser14 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = stringArrayDeserializer12.deserializeWithType(jsonParser14, deserializationContext15, typeDeserializer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer11);
        org.junit.Assert.assertNull(objCollection13);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer1 = null;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer1;
        java.lang.String[] strArray3 = stringArrayDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass5 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = stringArrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType7 = stringArrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = stringArrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.String[] strArray11 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray12 = stringArrayDeserializer0.deserialize(jsonParser9, deserializationContext10, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type [Ljava.lang.String; (by deserializer of type com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = stringArrayDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer5 = stringArrayDeserializer0._elementDeserializer;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer8 = stringArrayDeserializer6.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = stringArrayDeserializer6.getDelegatee();
        java.lang.Class<?> wildcardClass10 = stringArrayDeserializer6.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer6);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer12 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer13 = null;
        stringArrayDeserializer12._elementDeserializer = strJsonDeserializer13;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer15 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer12);
        java.lang.String[] strArray16 = stringArrayDeserializer15.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer17 = stringArrayDeserializer15._elementDeserializer;
        stringArrayDeserializer6._elementDeserializer = strJsonDeserializer17;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer17;
        java.util.Collection<java.lang.Object> objCollection20 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer21 = stringArrayDeserializer0._elementDeserializer;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer22 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer23 = null;
        stringArrayDeserializer22._elementDeserializer = strJsonDeserializer23;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer25 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer22);
        java.lang.String[] strArray26 = stringArrayDeserializer22.getNullValue();
        java.util.Collection<java.lang.Object> objCollection27 = stringArrayDeserializer22.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer28 = stringArrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(strJsonDeserializer5);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strJsonDeserializer17);
        org.junit.Assert.assertNull(objCollection20);
        org.junit.Assert.assertNotNull(strJsonDeserializer21);
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertNull(objCollection27);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.String[] strArray7 = stringArrayDeserializer1.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer9 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer10 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer12 = stringArrayDeserializer1.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer15 = stringArrayDeserializer13.unwrappingDeserializer(nameTransformer14);
        java.lang.Class<?> wildcardClass16 = stringArrayDeserializer13.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer17 = stringArrayDeserializer13.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType18 = stringArrayDeserializer13.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader19 = stringArrayDeserializer13.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer20 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer21 = null;
        stringArrayDeserializer20._elementDeserializer = strJsonDeserializer21;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer23 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer20);
        com.fasterxml.jackson.databind.JavaType javaType24 = stringArrayDeserializer23.getValueType();
        java.lang.String[] strArray25 = stringArrayDeserializer23.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType26 = stringArrayDeserializer23.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer27 = stringArrayDeserializer23._elementDeserializer;
        stringArrayDeserializer13._elementDeserializer = strJsonDeserializer27;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer27;
        java.lang.String[] strArray30 = stringArrayDeserializer1.getEmptyValue();
        java.lang.String[] strArray31 = stringArrayDeserializer1.getNullValue();
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer9);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer12);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(wildcardJsonDeserializer17);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNull(objectIdReader19);
        org.junit.Assert.assertNull(javaType24);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertNull(javaType26);
        org.junit.Assert.assertNotNull(strJsonDeserializer27);
        org.junit.Assert.assertNull(strArray30);
        org.junit.Assert.assertNull(strArray31);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = stringArrayDeserializer1.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer3 = null;
        stringArrayDeserializer1._elementDeserializer = strJsonDeserializer3;
        boolean boolean5 = stringArrayDeserializer1.isCachable();
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer1.handledType();
        java.lang.String[] strArray7 = stringArrayDeserializer1.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer8 = stringArrayDeserializer1._elementDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType9 = stringArrayDeserializer1.getValueType();
        java.util.Collection<java.lang.Object> objCollection10 = stringArrayDeserializer1.getKnownPropertyNames();
        java.lang.String[] strArray11 = stringArrayDeserializer1.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = stringArrayDeserializer1.getDelegatee();
        java.lang.Class<?> wildcardClass13 = stringArrayDeserializer1.getValueClass();
        java.lang.Class<?> wildcardClass14 = stringArrayDeserializer1.getClass();
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(strJsonDeserializer8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(wildcardJsonDeserializer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = stringArrayDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection2 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType3 = stringArrayDeserializer0.getValueType();
        boolean boolean4 = stringArrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer5);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = stringArrayDeserializer6.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection8 = stringArrayDeserializer6.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer9 = stringArrayDeserializer6._elementDeserializer;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer9;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer11 = stringArrayDeserializer0._elementDeserializer;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer12 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        java.lang.String[] strArray13 = stringArrayDeserializer12.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer14 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer12);
        com.fasterxml.jackson.core.JsonParser jsonParser15 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray17 = stringArrayDeserializer12.deserialize(jsonParser15, deserializationContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNotNull(strJsonDeserializer9);
        org.junit.Assert.assertNotNull(strJsonDeserializer11);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = stringArrayDeserializer0.getDelegatee();
        java.lang.String[] strArray2 = stringArrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer4 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = stringArrayDeserializer4.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer6 = null;
        stringArrayDeserializer4._elementDeserializer = strJsonDeserializer6;
        boolean boolean8 = stringArrayDeserializer4.isCachable();
        java.lang.Class<?> wildcardClass9 = stringArrayDeserializer4.handledType();
        java.lang.String[] strArray10 = stringArrayDeserializer4.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer12 = stringArrayDeserializer4.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer4);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = stringArrayDeserializer13.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = stringArrayDeserializer13.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer16 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer17 = null;
        stringArrayDeserializer16._elementDeserializer = strJsonDeserializer17;
        java.util.Collection<java.lang.Object> objCollection19 = stringArrayDeserializer16.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass20 = stringArrayDeserializer16.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer21 = null;
        stringArrayDeserializer16._elementDeserializer = strJsonDeserializer21;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer23 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer24 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer25 = stringArrayDeserializer23.unwrappingDeserializer(nameTransformer24);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer26 = stringArrayDeserializer23.getDelegatee();
        java.lang.Class<?> wildcardClass27 = stringArrayDeserializer23.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer28 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer29 = null;
        stringArrayDeserializer28._elementDeserializer = strJsonDeserializer29;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer31 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer28);
        java.lang.String[] strArray32 = stringArrayDeserializer31.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer33 = stringArrayDeserializer31._elementDeserializer;
        stringArrayDeserializer23._elementDeserializer = strJsonDeserializer33;
        stringArrayDeserializer16._elementDeserializer = strJsonDeserializer33;
        stringArrayDeserializer13._elementDeserializer = strJsonDeserializer33;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer33;
        java.lang.Class<?> wildcardClass38 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer39 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer40 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer41 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer40);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer12);
        org.junit.Assert.assertNull(wildcardJsonDeserializer14);
        org.junit.Assert.assertNull(wildcardJsonDeserializer15);
        org.junit.Assert.assertNull(objCollection19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer25);
        org.junit.Assert.assertNull(wildcardJsonDeserializer26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNull(strArray32);
        org.junit.Assert.assertNotNull(strJsonDeserializer33);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer41);
    }
}

