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
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getNullValue(deserializationContext5);
        java.lang.Class<?> wildcardClass7 = arrayDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection8 = arrayDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objCollection8);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection3 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer6 = arrayDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer0.getNullValue(deserializationContext8);
        java.util.Collection<java.lang.Object> objCollection10 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode13 = arrayDeserializer0.deserialize(jsonParser11, deserializationContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(arrayNode9);
        org.junit.Assert.assertNull(objCollection10);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = objectDeserializer0.getDelegatee();
        boolean boolean6 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType7 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectDeserializer0.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty10 = objectDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(objectNode8);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer6 = objectDeserializer0.unwrappingDeserializer(nameTransformer5);
        java.util.Collection<java.lang.Object> objCollection7 = objectDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass8 = objectDeserializer0.handledType();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer10 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer9);
        java.lang.Class<?> wildcardClass11 = jsonNodeDeserializer0.handledType();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getEmptyValue();
        boolean boolean5 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer8 = arrayDeserializer0.unwrappingDeserializer(nameTransformer7);
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer8);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getEmptyValue();
        boolean boolean8 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass9 = jsonNodeDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection10 = jsonNodeDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(objCollection10);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNodeDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection10 = jsonNodeDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNull(objCollection10);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType8 = arrayDeserializer0.getValueType();
        boolean boolean9 = arrayDeserializer0.isCachable();
        boolean boolean10 = arrayDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection3 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer6 = arrayDeserializer0.unwrappingDeserializer(nameTransformer5);
        java.util.Collection<java.lang.Object> objCollection7 = arrayNodeJsonDeserializer6.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty9 = arrayNodeJsonDeserializer6.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer6);
        org.junit.Assert.assertNull(objCollection7);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer7 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Class<?> wildcardClass8 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType9 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType10 = jsonNodeDeserializer0.getValueType();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(javaType10);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        java.lang.Class<?> wildcardClass1 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = arrayDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass6 = arrayDeserializer0.handledType();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = objectDeserializer0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty6 = objectDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer3 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.util.Collection<java.lang.Object> objCollection4 = jsonNodeJsonDeserializer3.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeJsonDeserializer3.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeJsonDeserializer3.getEmptyValue(deserializationContext7);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode8);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        boolean boolean4 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getNullValue(deserializationContext6);
        java.util.Collection<java.lang.Object> objCollection8 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectDeserializer0.getEmptyValue(deserializationContext10);
        boolean boolean12 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType13 = objectDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass14 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer16 = objectDeserializer0.unwrappingDeserializer(nameTransformer15);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer17 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer18 = objectDeserializer0.unwrappingDeserializer(nameTransformer17);
        com.fasterxml.jackson.core.JsonParser jsonParser19 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext20 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = objectNodeJsonDeserializer18.deserialize(jsonParser19, deserializationContext20, objectNode21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNull(objectNode9);
        org.junit.Assert.assertNull(objectNode11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer16);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer18);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.JavaType javaType7 = objectDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass8 = objectDeserializer0.getValueClass();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.util.Collection<java.lang.Object> objCollection5 = jsonNodeJsonDeserializer4.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeJsonDeserializer4.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = jsonNodeJsonDeserializer4.getDelegatee();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection6 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = jsonNodeDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass8 = jsonNodeDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue();
        boolean boolean8 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = jsonNodeDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass10 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer12 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer11);
        java.util.Collection<java.lang.Object> objCollection13 = jsonNodeJsonDeserializer12.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader14 = jsonNodeJsonDeserializer12.getObjectIdReader();
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer12);
        org.junit.Assert.assertNull(objCollection13);
        org.junit.Assert.assertNull(objectIdReader14);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean1 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        java.lang.Class<?> wildcardClass4 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getNullValue();
        boolean boolean6 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass7 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayDeserializer0.getNullValue(deserializationContext9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer12 = arrayDeserializer0.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer14 = arrayDeserializer0.unwrappingDeserializer(nameTransformer13);
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(arrayNode8);
        org.junit.Assert.assertNull(arrayNode10);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer12);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer14);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        boolean boolean4 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.JavaType javaType8 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = objectDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass10 = objectDeserializer0.handledType();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer7 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Class<?> wildcardClass8 = jsonNodeDeserializer0.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty10 = jsonNodeDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer0.getNullValue(deserializationContext8);
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode12 = arrayDeserializer0.deserialize(jsonParser10, deserializationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(arrayNode9);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.handledType();
        boolean boolean5 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType7 = arrayDeserializer6.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = arrayDeserializer6.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = arrayDeserializer6.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType10 = arrayDeserializer6.getValueType();
        java.lang.Class<?> wildcardClass11 = arrayDeserializer6.handledType();
        java.lang.Class<?> wildcardClass12 = arrayDeserializer6.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = objectDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(arrayDeserializer6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue(deserializationContext4);
        boolean boolean6 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = objectDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass8 = objectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass9 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectDeserializer0.getNullValue(deserializationContext10);
        java.util.Collection<java.lang.Object> objCollection12 = objectDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(objectNode11);
        org.junit.Assert.assertNull(objCollection12);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        java.util.Collection<java.lang.Object> objCollection3 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = jsonNodeDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNodeDeserializer0.getNullValue(deserializationContext8);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer11 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer10);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer11);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer10 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer12 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader13 = jsonNodeJsonDeserializer12.getObjectIdReader();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer10);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer12);
        org.junit.Assert.assertNull(objectIdReader13);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer4 = arrayDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer7 = arrayDeserializer0.unwrappingDeserializer(nameTransformer6);
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer7);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer5 = objectDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getNullValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectDeserializer0.getNullValue(deserializationContext10);
        org.junit.Assert.assertNull(objectNode1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer5);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objectNode9);
        org.junit.Assert.assertNull(objectNode11);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer3 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Class<?> wildcardClass4 = jsonNodeDeserializer0.handledType();
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = jsonNodeDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.getValueClass();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.getValueClass();
        boolean boolean6 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.handledType();
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection2 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType4 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = arrayDeserializer0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty7 = arrayDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(arrayNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNotNull(jsonNode8);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue();
        boolean boolean8 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType9 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer12 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection13 = jsonNodeDeserializer12.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeDeserializer12.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer16 = jsonNodeDeserializer12.unwrappingDeserializer(nameTransformer15);
        java.lang.Class<?> wildcardClass17 = jsonNodeDeserializer12.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = jsonNodeDeserializer12.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode19 = jsonNodeDeserializer0.deserialize(jsonParser10, deserializationContext11, jsonNode18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objCollection13);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(jsonNode18);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        boolean boolean6 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection8 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNodeDeserializer0.getNullValue(deserializationContext9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNodeDeserializer0.getEmptyValue(deserializationContext11);
        java.lang.Class<?> wildcardClass13 = jsonNodeDeserializer0.getValueClass();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection5 = objectDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = objectDeserializer0.getValueClass();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean1 = arrayDeserializer0.isCachable();
        boolean boolean2 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getEmptyValue(deserializationContext4);
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(arrayNode3);
        org.junit.Assert.assertNull(arrayNode5);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType4 = arrayDeserializer0.getValueType();
        org.junit.Assert.assertNull(arrayNode1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(arrayNode3);
        org.junit.Assert.assertNull(javaType4);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        boolean boolean1 = objectDeserializer0.isCachable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.JavaType javaType7 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectDeserializer0.getNullValue(deserializationContext8);
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer10 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = arrayDeserializer10.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = arrayDeserializer10.getObjectIdReader();
        java.lang.Class<?> wildcardClass13 = arrayDeserializer10.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode15 = arrayDeserializer10.getNullValue(deserializationContext14);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode16 = arrayDeserializer10.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer17 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer18 = arrayDeserializer10.unwrappingDeserializer(nameTransformer17);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer19 = arrayNodeJsonDeserializer18.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer20 = objectDeserializer0.replaceDelegatee(arrayNodeJsonDeserializer18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(objectNode9);
        org.junit.Assert.assertNotNull(arrayDeserializer10);
        org.junit.Assert.assertNull(arrayNode11);
        org.junit.Assert.assertNull(objectIdReader12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(arrayNode15);
        org.junit.Assert.assertNull(arrayNode16);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer18);
        org.junit.Assert.assertNull(wildcardJsonDeserializer19);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType3 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer5 = arrayDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.util.Collection<java.lang.Object> objCollection6 = arrayDeserializer0.getKnownPropertyNames();
        boolean boolean7 = arrayDeserializer0.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty9 = arrayDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer10 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer9);
        java.util.Collection<java.lang.Object> objCollection11 = jsonNodeJsonDeserializer10.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = jsonNodeJsonDeserializer10.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection13 = jsonNodeJsonDeserializer10.getKnownPropertyNames();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer10);
        org.junit.Assert.assertNull(objCollection11);
        org.junit.Assert.assertNull(wildcardJsonDeserializer12);
        org.junit.Assert.assertNull(objCollection13);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer._instance;
        java.util.Collection<java.lang.Object> objCollection1 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue(deserializationContext4);
        org.junit.Assert.assertNotNull(objectDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objectNode5);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        boolean boolean4 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getNullValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType9 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectDeserializer0.getNullValue(deserializationContext10);
        com.fasterxml.jackson.databind.JavaType javaType12 = objectDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass13 = objectDeserializer0.getValueClass();
        boolean boolean14 = objectDeserializer0.isCachable();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objectNode11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue(deserializationContext6);
        boolean boolean8 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = jsonNodeDeserializer0.getObjectIdReader();
        boolean boolean10 = jsonNodeDeserializer0.isCachable();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer3 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue(deserializationContext4);
        boolean boolean6 = jsonNodeDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection7 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer9 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNodeDeserializer0.deserialize(jsonParser10, deserializationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer3);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer9);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getEmptyValue(deserializationContext7);
        java.lang.Class<?> wildcardClass9 = jsonNodeDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection10 = jsonNodeDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(objCollection10);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        java.util.Collection<java.lang.Object> objCollection3 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = jsonNodeDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNull(objectIdReader9);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        boolean boolean6 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType11 = jsonNodeDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNull(objectIdReader10);
        org.junit.Assert.assertNull(javaType11);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer._instance;
        java.util.Collection<java.lang.Object> objCollection1 = objectDeserializer0.getKnownPropertyNames();
        boolean boolean2 = objectDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass3 = objectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getNullValue(deserializationContext5);
        org.junit.Assert.assertNotNull(objectDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectNode6);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer10 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNodeDeserializer0.getNullValue(deserializationContext11);
        java.lang.Class<?> wildcardClass13 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeDeserializer0.getEmptyValue();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer10);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(jsonNode14);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = arrayDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer10 = arrayDeserializer0.unwrappingDeserializer(nameTransformer9);
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(arrayNode8);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer10);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectDeserializer0.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = objectDeserializer0.deserializeWithType(jsonParser10, deserializationContext11, typeDeserializer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(objectNode8);
        org.junit.Assert.assertNull(objectIdReader9);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer5 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType6 = arrayDeserializer5.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = arrayDeserializer5.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection8 = arrayDeserializer5.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType9 = arrayDeserializer5.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = arrayDeserializer5.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNull(arrayNode3);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(arrayDeserializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objectIdReader10);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        java.util.Collection<java.lang.Object> objCollection3 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = arrayDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass9 = arrayDeserializer0.handledType();
        java.lang.Class<?> wildcardClass10 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass11 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode13 = arrayDeserializer0.getEmptyValue(deserializationContext12);
        java.lang.Class<?> wildcardClass14 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass15 = arrayDeserializer0.handledType();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(arrayNode13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer._instance;
        java.util.Collection<java.lang.Object> objCollection1 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.deserialize(jsonParser5, deserializationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objectIdReader4);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue(deserializationContext5);
        java.util.Collection<java.lang.Object> objCollection7 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer10 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = jsonNodeDeserializer0.getDelegatee();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass3 = objectDeserializer0.getValueClass();
        boolean boolean4 = objectDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection5 = objectDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNull(objectNode1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(objCollection5);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = objectDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection5 = objectDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = objectDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objectIdReader7);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer8 = arrayDeserializer0.unwrappingDeserializer(nameTransformer7);
        boolean boolean9 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = arrayDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.JavaType javaType8 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = objectDeserializer0.deserialize(jsonParser11, deserializationContext12, objectNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(objectNode9);
        org.junit.Assert.assertNull(objectNode10);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getNullValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = arrayDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection9 = arrayDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection10 = arrayDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNull(objCollection10);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue(deserializationContext4);
        boolean boolean6 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer8 = objectDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectDeserializer0.getEmptyValue(deserializationContext10);
        java.lang.Class<?> wildcardClass12 = objectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass13 = objectDeserializer0.getValueClass();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNull(objectNode11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectDeserializer0.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = objectDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass10 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = objectDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass12 = objectDeserializer0.getValueClass();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(objectNode8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        boolean boolean4 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getNullValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectDeserializer0.getNullValue(deserializationContext10);
        java.lang.Class<?> wildcardClass12 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader13 = objectDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNull(objectNode11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(objectIdReader13);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectDeserializer0.deserialize(jsonParser8, deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNull(objectNode7);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getEmptyValue();
        boolean boolean8 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = arrayDeserializer0.deserialize(jsonParser9, deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType4 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer7 = objectDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer10 = objectDeserializer0.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer12 = objectDeserializer0.unwrappingDeserializer(nameTransformer11);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer7);
        org.junit.Assert.assertNull(objectNode8);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer10);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer12);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer7 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.util.Collection<java.lang.Object> objCollection8 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNodeDeserializer0.getNullValue(deserializationContext9);
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser14 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode16 = jsonNodeDeserializer0.deserialize(jsonParser14, deserializationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNull(wildcardJsonDeserializer13);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNodeDeserializer0.getNullValue(deserializationContext8);
        java.lang.Class<?> wildcardClass10 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = jsonNodeDeserializer0.getEmptyValue();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(jsonNode11);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection2 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = arrayDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection5 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer0.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer0.getNullValue();
        org.junit.Assert.assertNull(arrayNode1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNull(arrayNode8);
        org.junit.Assert.assertNull(arrayNode9);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer5 = objectDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectNodeJsonDeserializer5.getNullValue(deserializationContext6);
        org.junit.Assert.assertNull(objectNode1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer5);
        org.junit.Assert.assertNull(objectNode7);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection6 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer10 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType11 = arrayDeserializer10.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType12 = arrayDeserializer10.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode14 = arrayDeserializer10.getNullValue(deserializationContext13);
        java.util.Collection<java.lang.Object> objCollection15 = arrayDeserializer10.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode17 = arrayDeserializer10.getEmptyValue(deserializationContext16);
        java.lang.Class<?> wildcardClass18 = arrayDeserializer10.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer19 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer20 = arrayDeserializer10.unwrappingDeserializer(nameTransformer19);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer21 = jsonNodeDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNotNull(arrayDeserializer10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(arrayNode14);
        org.junit.Assert.assertNull(objCollection15);
        org.junit.Assert.assertNull(arrayNode17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer20);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = objectDeserializer0.getValueType();
        boolean boolean7 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = objectDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection9 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = objectDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass11 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer14 = objectDeserializer0.unwrappingDeserializer(nameTransformer13);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty16 = objectNodeJsonDeserializer14.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(wildcardJsonDeserializer12);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer14);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayDeserializer0.deserialize(jsonParser7, deserializationContext8, arrayNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(arrayNode6);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer._instance;
        java.util.Collection<java.lang.Object> objCollection1 = objectDeserializer0.getKnownPropertyNames();
        boolean boolean2 = objectDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass3 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer5 = objectDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.util.Collection<java.lang.Object> objCollection6 = objectNodeJsonDeserializer5.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(objectDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = objectDeserializer0.deserializeWithType(jsonParser6, deserializationContext7, typeDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(objectNode5);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer10 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNodeDeserializer0.getNullValue(deserializationContext11);
        boolean boolean13 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer15 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer14);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = jsonNodeDeserializer0.getEmptyValue(deserializationContext16);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer10);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer15);
        org.junit.Assert.assertNotNull(jsonNode17);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer11 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer10);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader13 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = jsonNodeDeserializer0.getNullValue(deserializationContext14);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer11);
        org.junit.Assert.assertNull(wildcardJsonDeserializer12);
        org.junit.Assert.assertNull(objectIdReader13);
        org.junit.Assert.assertNotNull(jsonNode15);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer5 = arrayDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer7 = arrayDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Class<?> wildcardClass8 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = arrayDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass11 = arrayDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer5);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(arrayNode9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.JavaType javaType7 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = objectDeserializer0.getDelegatee();
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = arrayDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer11 = arrayDeserializer0.unwrappingDeserializer(nameTransformer10);
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode15 = arrayNodeJsonDeserializer11.deserialize(jsonParser12, deserializationContext13, arrayNode14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(arrayNode8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer11);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass7 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass9 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer11 = arrayDeserializer0.unwrappingDeserializer(nameTransformer10);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer13 = arrayDeserializer0.unwrappingDeserializer(nameTransformer12);
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer11);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer13);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = jsonNodeDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNull(objectIdReader5);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getEmptyValue(deserializationContext3);
        boolean boolean5 = arrayDeserializer0.isCachable();
        boolean boolean6 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer0.getNullValue(deserializationContext7);
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(arrayNode8);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer0.deserialize(jsonParser5, deserializationContext6, arrayNode7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(arrayNode4);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        boolean boolean6 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection8 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType9 = jsonNodeDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection10 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNodeDeserializer0.getNullValue(deserializationContext11);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNotNull(jsonNode12);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection3 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType4 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer7 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer7.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType9 = arrayDeserializer7.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = arrayDeserializer7.getDelegatee();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = arrayDeserializer7.getNullValue();
        java.lang.Class<?> wildcardClass12 = arrayDeserializer7.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer14 = arrayDeserializer7.unwrappingDeserializer(nameTransformer13);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode15 = arrayNodeJsonDeserializer14.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection16 = arrayNodeJsonDeserializer14.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer17 = arrayDeserializer0.replaceDelegatee(arrayNodeJsonDeserializer14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNotNull(arrayDeserializer7);
        org.junit.Assert.assertNull(arrayNode8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(arrayNode11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer14);
        org.junit.Assert.assertNull(arrayNode15);
        org.junit.Assert.assertNull(objCollection16);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        boolean boolean6 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass8 = jsonNodeDeserializer0.handledType();
        java.lang.Class<?> wildcardClass9 = jsonNodeDeserializer0.getValueClass();
        boolean boolean10 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass11 = jsonNodeDeserializer0.handledType();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer5 = arrayDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.lang.Class<?> wildcardClass6 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass7 = arrayDeserializer0.getValueClass();
        boolean boolean8 = arrayDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer9 = objectDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectDeserializer0.getNullValue();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
        org.junit.Assert.assertNull(objectNode12);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        boolean boolean4 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getNullValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer13 = objectDeserializer0.unwrappingDeserializer(nameTransformer12);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNull(objectNode10);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer13);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = objectDeserializer0.getEmptyValue();
        boolean boolean2 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer8 = objectDeserializer0.unwrappingDeserializer(nameTransformer7);
        java.lang.Class<?> wildcardClass9 = objectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass10 = objectDeserializer0.getClass();
        org.junit.Assert.assertNull(objectNode1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = objectDeserializer0.getValueType();
        boolean boolean7 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = objectDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection9 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectDeserializer0.getEmptyValue(deserializationContext10);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = objectDeserializer0.getNullValue(deserializationContext13);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNull(objectNode11);
        org.junit.Assert.assertNull(objectIdReader12);
        org.junit.Assert.assertNull(objectNode14);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass6 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer8 = arrayDeserializer0.unwrappingDeserializer(nameTransformer7);
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer8);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer9 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer8);
        java.util.Collection<java.lang.Object> objCollection10 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass11 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = jsonNodeDeserializer0.deserializeWithType(jsonParser12, deserializationContext13, typeDeserializer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue(deserializationContext4);
        boolean boolean6 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer8 = objectDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = objectNodeJsonDeserializer8.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectNodeJsonDeserializer8.getNullValue(deserializationContext10);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer13 = objectNodeJsonDeserializer8.unwrappingDeserializer(nameTransformer12);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = objectNodeJsonDeserializer13.getEmptyValue();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNull(objectNode11);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer13);
        org.junit.Assert.assertNull(objectNode14);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue();
        boolean boolean8 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer10 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer9);
        java.lang.Class<?> wildcardClass11 = jsonNodeDeserializer0.getValueClass();
        boolean boolean12 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = jsonNodeDeserializer0.getEmptyValue(deserializationContext14);
        java.lang.Class<?> wildcardClass16 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer17 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer18 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer17);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer19 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer20 = jsonNodeJsonDeserializer18.unwrappingDeserializer(nameTransformer19);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer13);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer18);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer20);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection8 = arrayDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass9 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = arrayDeserializer0.getNullValue(deserializationContext10);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer13 = arrayDeserializer0.unwrappingDeserializer(nameTransformer12);
        java.lang.Class<?> wildcardClass14 = arrayDeserializer0.handledType();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(arrayNode11);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer5 = arrayDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayNodeJsonDeserializer5.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer9 = arrayNodeJsonDeserializer5.unwrappingDeserializer(nameTransformer8);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty11 = arrayNodeJsonDeserializer9.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer5);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer9);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = arrayDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection4 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType5 = arrayDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode1);
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(javaType5);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = objectDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection7 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType8 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer10 = objectDeserializer0.unwrappingDeserializer(nameTransformer9);
        java.lang.Class<?> wildcardClass11 = objectDeserializer0.getClass();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getNullValue(deserializationContext6);
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(arrayNode7);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        java.util.Collection<java.lang.Object> objCollection3 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNodeDeserializer0.deserialize(jsonParser8, deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = arrayDeserializer0.getDelegatee();
        boolean boolean4 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(arrayNode5);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        boolean boolean4 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.JavaType javaType8 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = objectDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection10 = objectDeserializer0.getKnownPropertyNames();
        boolean boolean11 = objectDeserializer0.isCachable();
        boolean boolean12 = objectDeserializer0.isCachable();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = objectDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection6 = objectDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass7 = objectDeserializer0.handledType();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        boolean boolean4 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType9 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer11 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType12 = arrayDeserializer11.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader13 = arrayDeserializer11.getObjectIdReader();
        java.lang.Class<?> wildcardClass14 = arrayDeserializer11.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode16 = arrayDeserializer11.getEmptyValue(deserializationContext15);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode17 = arrayDeserializer11.getEmptyValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode18 = arrayDeserializer11.getNullValue();
        boolean boolean19 = arrayDeserializer11.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer20 = objectDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objectNode10);
        org.junit.Assert.assertNotNull(arrayDeserializer11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(objectIdReader13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(arrayNode16);
        org.junit.Assert.assertNull(arrayNode17);
        org.junit.Assert.assertNull(arrayNode18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType4 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getNullValue(deserializationContext5);
        java.lang.Class<?> wildcardClass7 = arrayDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNull(arrayNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue(deserializationContext4);
        boolean boolean6 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer8 = objectDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = objectDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection10 = objectDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection11 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection13 = objectDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(objCollection11);
        org.junit.Assert.assertNull(objectNode12);
        org.junit.Assert.assertNull(objCollection13);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass4 = arrayDeserializer0.handledType();
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNull(arrayNode3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer7 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = jsonNodeDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer7);
        org.junit.Assert.assertNull(objectIdReader8);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection6 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = jsonNodeDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass10 = jsonNodeDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = arrayDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType7 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass9 = arrayDeserializer0.handledType();
        java.lang.Class<?> wildcardClass10 = arrayDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(arrayNode8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = arrayDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass9 = arrayDeserializer0.handledType();
        java.lang.Class<?> wildcardClass10 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer12 = arrayDeserializer0.unwrappingDeserializer(nameTransformer11);
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer12);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode11 = jsonNodeDeserializer0.deserialize(jsonParser9, deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode8);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection3 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getNullValue(deserializationContext5);
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(arrayNode6);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        java.lang.Class<?> wildcardClass1 = arrayDeserializer0.handledType();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        boolean boolean4 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getNullValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType9 = objectDeserializer0.getValueType();
        boolean boolean10 = objectDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass11 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectDeserializer0.getNullValue();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(objectNode12);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer0.getEmptyValue();
        boolean boolean10 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass11 = arrayDeserializer0.handledType();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(arrayNode9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection3 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue(deserializationContext4);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(objectNode5);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass4 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer7 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = jsonNodeDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass9 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer12 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection13 = jsonNodeDeserializer12.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeDeserializer12.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = jsonNodeDeserializer12.getNullValue(deserializationContext15);
        java.lang.Class<?> wildcardClass17 = jsonNodeDeserializer12.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer19 = jsonNodeDeserializer12.unwrappingDeserializer(nameTransformer18);
        boolean boolean20 = jsonNodeDeserializer12.isCachable();
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = jsonNodeDeserializer12.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer22 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer23 = jsonNodeDeserializer12.unwrappingDeserializer(nameTransformer22);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext24 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode25 = jsonNodeJsonDeserializer23.getEmptyValue(deserializationContext24);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode26 = jsonNodeDeserializer0.deserialize(jsonParser10, deserializationContext11, jsonNode25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(objCollection13);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jsonNode21);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer23);
        org.junit.Assert.assertNotNull(jsonNode25);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        boolean boolean4 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection6 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType7 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = objectDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection10 = objectDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass11 = objectDeserializer0.handledType();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.handledType();
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getEmptyValue(deserializationContext7);
        boolean boolean9 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNodeDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass11 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = jsonNodeDeserializer0.getNullValue(deserializationContext12);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer15 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer14);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer15);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.JavaType javaType9 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = jsonNodeDeserializer0.getDelegatee();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        boolean boolean4 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getNullValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType9 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectDeserializer0.getNullValue(deserializationContext10);
        java.lang.Class<?> wildcardClass12 = objectDeserializer0.handledType();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objectNode11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer9 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer8);
        java.util.Collection<java.lang.Object> objCollection10 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType11 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType12 = jsonNodeDeserializer0.getValueType();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(javaType12);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer9 = objectDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectDeserializer0.getNullValue(deserializationContext11);
        java.lang.Class<?> wildcardClass13 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = objectDeserializer0.getDelegatee();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer9);
        org.junit.Assert.assertNull(objectNode10);
        org.junit.Assert.assertNull(objectNode12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(wildcardJsonDeserializer14);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = objectDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection5 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer7 = objectDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.util.Collection<java.lang.Object> objCollection8 = objectNodeJsonDeserializer7.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectNodeJsonDeserializer7.getNullValue();
        org.junit.Assert.assertNull(objectNode1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNull(objectNode9);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue(deserializationContext4);
        boolean boolean6 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer8 = objectDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectDeserializer0.getEmptyValue(deserializationContext10);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser14 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode16 = objectDeserializer0.deserialize(jsonParser14, deserializationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNull(objectNode11);
        org.junit.Assert.assertNull(objectIdReader12);
        org.junit.Assert.assertNull(wildcardJsonDeserializer13);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection3 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer6 = arrayDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = arrayDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass8 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(arrayNode9);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getNullValue(deserializationContext5);
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(arrayNode6);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType7 = jsonNodeDeserializer0.getValueType();
        boolean boolean8 = jsonNodeDeserializer0.isCachable();
        boolean boolean9 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer12 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection13 = jsonNodeDeserializer12.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeDeserializer12.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer16 = jsonNodeDeserializer12.unwrappingDeserializer(nameTransformer15);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext17 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = jsonNodeDeserializer12.getNullValue(deserializationContext17);
        java.lang.Class<?> wildcardClass19 = jsonNodeDeserializer12.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader20 = jsonNodeDeserializer12.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer21 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer22 = jsonNodeDeserializer12.unwrappingDeserializer(nameTransformer21);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext23 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode24 = jsonNodeDeserializer12.getNullValue(deserializationContext23);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode25 = jsonNodeDeserializer0.deserialize(jsonParser10, deserializationContext11, jsonNode24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(objCollection13);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer16);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNull(objectIdReader20);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer22);
        org.junit.Assert.assertNotNull(jsonNode24);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer0.getNullValue(deserializationContext7);
        java.util.Collection<java.lang.Object> objCollection9 = arrayDeserializer0.getKnownPropertyNames();
        boolean boolean10 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass11 = arrayDeserializer0.handledType();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(arrayNode8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        boolean boolean6 = jsonNodeDeserializer0.isCachable();
        boolean boolean7 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNodeDeserializer0.getEmptyValue(deserializationContext8);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer11 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer10);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer13 = jsonNodeJsonDeserializer11.unwrappingDeserializer(nameTransformer12);
        java.lang.Class<?> wildcardClass14 = jsonNodeJsonDeserializer11.getClass();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer11);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.JavaType javaType3 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = objectDeserializer0.getObjectIdReader();
        boolean boolean7 = objectDeserializer0.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty9 = objectDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode11 = jsonNodeDeserializer0.deserialize(jsonParser9, deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode8);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer8 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType9 = arrayDeserializer8.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = arrayDeserializer8.getObjectIdReader();
        java.lang.Class<?> wildcardClass11 = arrayDeserializer8.handledType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode12 = arrayDeserializer8.getEmptyValue();
        boolean boolean13 = arrayDeserializer8.isCachable();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode14 = arrayDeserializer8.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = arrayDeserializer8.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode17 = arrayDeserializer8.getEmptyValue(deserializationContext16);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer18 = objectDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNotNull(arrayDeserializer8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objectIdReader10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(arrayNode12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(arrayNode14);
        org.junit.Assert.assertNull(wildcardJsonDeserializer15);
        org.junit.Assert.assertNull(arrayNode17);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        boolean boolean4 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getNullValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectDeserializer0.getNullValue(deserializationContext10);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty13 = objectDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNull(objectNode11);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer0.getEmptyValue(deserializationContext8);
        com.fasterxml.jackson.databind.JavaType javaType10 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer12 = arrayDeserializer0.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode13 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer15 = arrayDeserializer0.unwrappingDeserializer(nameTransformer14);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader16 = arrayNodeJsonDeserializer15.getObjectIdReader();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(arrayNode9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer12);
        org.junit.Assert.assertNull(arrayNode13);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer15);
        org.junit.Assert.assertNull(objectIdReader16);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNull(arrayNode7);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = arrayDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = arrayDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(objectIdReader5);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue();
        boolean boolean8 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNodeDeserializer0.getNullValue(deserializationContext9);
        java.util.Collection<java.lang.Object> objCollection11 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer12 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType13 = arrayDeserializer12.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType14 = arrayDeserializer12.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode16 = arrayDeserializer12.getNullValue(deserializationContext15);
        java.util.Collection<java.lang.Object> objCollection17 = arrayDeserializer12.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass18 = arrayDeserializer12.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType19 = arrayDeserializer12.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext20 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode21 = arrayDeserializer12.getEmptyValue(deserializationContext20);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer22 = jsonNodeDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNull(objCollection11);
        org.junit.Assert.assertNotNull(arrayDeserializer12);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNull(arrayNode16);
        org.junit.Assert.assertNull(objCollection17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(javaType19);
        org.junit.Assert.assertNull(arrayNode21);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = arrayDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.JavaType javaType6 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer7 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType8 = arrayDeserializer7.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType9 = arrayDeserializer7.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer11 = arrayDeserializer7.unwrappingDeserializer(nameTransformer10);
        java.lang.Class<?> wildcardClass12 = arrayDeserializer7.getValueClass();
        java.lang.Class<?> wildcardClass13 = arrayDeserializer7.getValueClass();
        boolean boolean14 = arrayDeserializer7.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(arrayNode3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(arrayDeserializer7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType4 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer7 = objectDeserializer0.unwrappingDeserializer(nameTransformer6);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty9 = objectNodeJsonDeserializer7.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer7);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass3 = objectDeserializer0.getValueClass();
        boolean boolean4 = objectDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass5 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectDeserializer0.getNullValue(deserializationContext9);
        com.fasterxml.jackson.databind.JavaType javaType11 = objectDeserializer0.getValueType();
        org.junit.Assert.assertNull(objectNode1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(objectNode8);
        org.junit.Assert.assertNull(objectNode10);
        org.junit.Assert.assertNull(javaType11);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection7 = jsonNodeDeserializer0.getKnownPropertyNames();
        boolean boolean8 = jsonNodeDeserializer0.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty10 = jsonNodeDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection2 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType3 = arrayDeserializer0.getValueType();
        boolean boolean4 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.getClass();
        org.junit.Assert.assertNull(arrayNode1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNodeDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass10 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNodeDeserializer0.getNullValue(deserializationContext11);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeDeserializer0.getNullValue(deserializationContext13);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(jsonNode14);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection3 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = objectDeserializer0.deserializeWithType(jsonParser6, deserializationContext7, typeDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(objectNode5);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = arrayDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(javaType5);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer8 = arrayDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer10 = arrayNodeJsonDeserializer8.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = arrayNodeJsonDeserializer10.getDelegatee();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer8);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = arrayDeserializer0.getDelegatee();
        boolean boolean2 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer5 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType6 = arrayDeserializer5.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType7 = arrayDeserializer5.getValueType();
        java.util.Collection<java.lang.Object> objCollection8 = arrayDeserializer5.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = arrayDeserializer5.getDelegatee();
        boolean boolean10 = arrayDeserializer5.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = arrayDeserializer5.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(arrayDeserializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer7 = objectDeserializer0.unwrappingDeserializer(nameTransformer6);
        boolean boolean8 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectDeserializer0.getEmptyValue();
        org.junit.Assert.assertNull(objectNode1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(objectNode9);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        boolean boolean4 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection6 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType7 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectDeserializer0.getEmptyValue();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(objectNode8);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection3 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer6 = arrayDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer0.getNullValue(deserializationContext8);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer11 = arrayDeserializer0.unwrappingDeserializer(nameTransformer10);
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(arrayNode9);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer11);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection6 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.handledType();
        java.lang.Class<?> wildcardClass8 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNodeDeserializer0.getNullValue(deserializationContext9);
        java.lang.Class<?> wildcardClass11 = jsonNodeDeserializer0.handledType();
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = jsonNodeDeserializer0.getDelegatee();
        boolean boolean7 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNodeDeserializer0.getNullValue(deserializationContext8);
        com.fasterxml.jackson.databind.JavaType javaType10 = jsonNodeDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNull(javaType10);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = arrayDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType4 = arrayDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = arrayDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection7 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = arrayDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNull(objectIdReader8);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = objectDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection6 = objectDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass7 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer9 = objectDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNodeJsonDeserializer9.deserialize(jsonParser10, deserializationContext11, objectNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer9);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer._instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass5 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer7 = objectDeserializer0.unwrappingDeserializer(nameTransformer6);
        org.junit.Assert.assertNotNull(objectDeserializer0);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer7);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer._instance;
        java.util.Collection<java.lang.Object> objCollection1 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = objectDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass5 = objectDeserializer0.handledType();
        org.junit.Assert.assertNotNull(objectDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        boolean boolean4 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getNullValue(deserializationContext6);
        java.util.Collection<java.lang.Object> objCollection8 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectDeserializer0.getEmptyValue(deserializationContext10);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer13 = objectDeserializer0.unwrappingDeserializer(nameTransformer12);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer15 = objectDeserializer0.unwrappingDeserializer(nameTransformer14);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode16 = objectNodeJsonDeserializer15.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader17 = objectNodeJsonDeserializer15.getObjectIdReader();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNull(objectNode9);
        org.junit.Assert.assertNull(objectNode11);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer13);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer15);
        org.junit.Assert.assertNull(objectNode16);
        org.junit.Assert.assertNull(objectIdReader17);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectDeserializer0.deserialize(jsonParser5, deserializationContext6, objectNode7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer._instance;
        java.util.Collection<java.lang.Object> objCollection1 = objectDeserializer0.getKnownPropertyNames();
        boolean boolean2 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType3 = objectDeserializer0.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty5 = objectDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(javaType3);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer3 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Class<?> wildcardClass4 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNodeDeserializer0.deserialize(jsonParser7, deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNull(objectIdReader6);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = arrayDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType4 = arrayDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = arrayDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(arrayNode8);
        org.junit.Assert.assertNull(objectIdReader9);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue();
        boolean boolean5 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection7 = arrayDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNull(objCollection7);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = objectDeserializer0.getValueType();
        boolean boolean7 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = objectDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection9 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer11 = objectDeserializer0.unwrappingDeserializer(nameTransformer10);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer11);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        boolean boolean4 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectDeserializer0.getNullValue(deserializationContext8);
        com.fasterxml.jackson.databind.JavaType javaType10 = objectDeserializer0.getValueType();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNull(objectNode9);
        org.junit.Assert.assertNull(javaType10);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer9 = objectDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = objectDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass11 = objectDeserializer0.handledType();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        java.lang.Class<?> wildcardClass1 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = objectDeserializer0.getValueType();
        boolean boolean5 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = objectDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectDeserializer0.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = objectDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass10 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = objectDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection12 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode15 = objectDeserializer0.deserialize(jsonParser13, deserializationContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(objectNode8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
        org.junit.Assert.assertNull(objCollection12);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer4 = arrayDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType6 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass8 = arrayDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer9 = objectDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType12 = objectDeserializer0.getValueType();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
        org.junit.Assert.assertNull(javaType12);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer0.getEmptyValue(deserializationContext8);
        java.lang.Class<?> wildcardClass10 = arrayDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(arrayNode9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue(deserializationContext5);
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer10 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = jsonNodeDeserializer0.getObjectIdReader();
        boolean boolean12 = jsonNodeDeserializer0.isCachable();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer10);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass8 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass10 = objectDeserializer0.getValueClass();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objectNode9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        boolean boolean1 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass2 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType6 = jsonNodeDeserializer0.getValueType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer5 = arrayDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.lang.Class<?> wildcardClass6 = arrayDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        boolean boolean3 = objectDeserializer0.isCachable();
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType7 = jsonNodeDeserializer0.getValueType();
        boolean boolean8 = jsonNodeDeserializer0.isCachable();
        boolean boolean9 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = jsonNodeDeserializer0.getEmptyValue(deserializationContext10);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jsonNode11);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        boolean boolean4 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.JavaType javaType8 = objectDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection9 = objectDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass10 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType11 = objectDeserializer0.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty13 = objectDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(javaType11);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection6 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType9 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass10 = jsonNodeDeserializer0.handledType();
        boolean boolean11 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = jsonNodeDeserializer0.getEmptyValue(deserializationContext12);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = jsonNodeDeserializer0.getNullValue(deserializationContext15);
        com.fasterxml.jackson.core.JsonParser jsonParser17 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer19 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext20 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = jsonNodeDeserializer19.getNullValue(deserializationContext20);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer22 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer23 = jsonNodeDeserializer19.unwrappingDeserializer(nameTransformer22);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext24 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode25 = jsonNodeDeserializer19.getNullValue(deserializationContext24);
        com.fasterxml.jackson.databind.JsonNode jsonNode26 = jsonNodeDeserializer19.getNullValue();
        boolean boolean27 = jsonNodeDeserializer19.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer28 = jsonNodeDeserializer19.getDelegatee();
        java.lang.Class<?> wildcardClass29 = jsonNodeDeserializer19.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer30 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer31 = jsonNodeDeserializer19.unwrappingDeserializer(nameTransformer30);
        com.fasterxml.jackson.databind.JsonNode jsonNode32 = jsonNodeDeserializer19.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode33 = jsonNodeDeserializer0.deserialize(jsonParser17, deserializationContext18, jsonNode32);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNull(wildcardJsonDeserializer14);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(jsonNode21);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer23);
        org.junit.Assert.assertNotNull(jsonNode25);
        org.junit.Assert.assertNotNull(jsonNode26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer31);
        org.junit.Assert.assertNotNull(jsonNode32);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer.getInstance();
        java.util.Collection<java.lang.Object> objCollection1 = objectDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(objectDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = jsonNodeDeserializer0.getNullValue(deserializationContext10);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = jsonNodeDeserializer0.getNullValue(deserializationContext12);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = jsonNodeDeserializer0.getEmptyValue(deserializationContext14);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNotNull(jsonNode15);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection6 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.handledType();
        java.lang.Class<?> wildcardClass8 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNodeDeserializer0.getNullValue(deserializationContext9);
        java.lang.Class<?> wildcardClass11 = jsonNodeDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass8 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType9 = objectDeserializer0.getValueType();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass7 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer8 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType9 = arrayDeserializer8.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType10 = arrayDeserializer8.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode12 = arrayDeserializer8.getNullValue(deserializationContext11);
        java.util.Collection<java.lang.Object> objCollection13 = arrayDeserializer8.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass14 = arrayDeserializer8.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader15 = arrayDeserializer8.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer17 = arrayDeserializer8.unwrappingDeserializer(nameTransformer16);
        com.fasterxml.jackson.databind.JavaType javaType18 = arrayDeserializer8.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext19 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode20 = arrayDeserializer8.getNullValue(deserializationContext19);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader21 = arrayDeserializer8.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer22 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(arrayDeserializer8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(arrayNode12);
        org.junit.Assert.assertNull(objCollection13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(objectIdReader15);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer17);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNull(arrayNode20);
        org.junit.Assert.assertNull(objectIdReader21);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.deserialize(jsonParser3, deserializationContext4, arrayNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectDeserializer0.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = objectDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection10 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType11 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer13 = objectDeserializer0.unwrappingDeserializer(nameTransformer12);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(objectNode8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer13);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = objectDeserializer0.getDelegatee();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getEmptyValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer10 = arrayDeserializer0.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer12 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode14 = arrayDeserializer12.getEmptyValue(deserializationContext13);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode16 = arrayDeserializer12.getNullValue(deserializationContext15);
        java.lang.Class<?> wildcardClass17 = arrayDeserializer12.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode19 = arrayDeserializer12.getNullValue(deserializationContext18);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer20 = arrayDeserializer12.getDelegatee();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode21 = arrayDeserializer12.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer22 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer10);
        org.junit.Assert.assertNull(arrayNode11);
        org.junit.Assert.assertNotNull(arrayDeserializer12);
        org.junit.Assert.assertNull(arrayNode14);
        org.junit.Assert.assertNull(arrayNode16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(arrayNode19);
        org.junit.Assert.assertNull(wildcardJsonDeserializer20);
        org.junit.Assert.assertNull(arrayNode21);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass8 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNodeDeserializer0.getNullValue(deserializationContext9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNodeDeserializer0.getNullValue(deserializationContext11);
        java.util.Collection<java.lang.Object> objCollection13 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection14 = jsonNodeDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNull(objCollection13);
        org.junit.Assert.assertNull(objCollection14);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue();
        boolean boolean8 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = jsonNodeDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass10 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNodeDeserializer0.getEmptyValue(deserializationContext11);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader13 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = jsonNodeDeserializer0.getNullValue(deserializationContext15);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNull(objectIdReader13);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(jsonNode16);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.deserialize(jsonParser2, deserializationContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType8 = jsonNodeDeserializer0.getValueType();
        boolean boolean9 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = jsonNodeDeserializer0.getEmptyValue(deserializationContext10);
        java.lang.Class<?> wildcardClass12 = jsonNodeDeserializer0.handledType();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer5 = objectDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getNullValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = objectDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass10 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectDeserializer0.getEmptyValue(deserializationContext11);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer14 = objectDeserializer0.unwrappingDeserializer(nameTransformer13);
        com.fasterxml.jackson.databind.JavaType javaType15 = objectDeserializer0.getValueType();
        org.junit.Assert.assertNull(objectNode1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer5);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(objectNode12);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer14);
        org.junit.Assert.assertNull(javaType15);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass2 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType3 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer6 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer5);
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.handledType();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean1 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        java.lang.Class<?> wildcardClass4 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getNullValue();
        boolean boolean6 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer9 = arrayDeserializer0.unwrappingDeserializer(nameTransformer8);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty11 = arrayDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer9);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection5 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass7 = objectDeserializer0.handledType();
        boolean boolean8 = objectDeserializer0.isCachable();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType4 = arrayDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection5 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = arrayDeserializer0.deserialize(jsonParser9, deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass3 = objectDeserializer0.getValueClass();
        boolean boolean4 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectDeserializer0.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = objectDeserializer0.deserializeWithType(jsonParser9, deserializationContext10, typeDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNull(objectNode8);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.deserialize(jsonParser4, deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectIdReader3);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue(deserializationContext5);
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = jsonNodeDeserializer0.deserializeWithType(jsonParser8, deserializationContext9, typeDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer8 = arrayDeserializer0.unwrappingDeserializer(nameTransformer7);
        boolean boolean9 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = arrayDeserializer0.getNullValue(deserializationContext10);
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(arrayNode11);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = arrayDeserializer0.getDelegatee();
        boolean boolean5 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getEmptyValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = arrayDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection6 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer8 = arrayDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode12 = arrayNodeJsonDeserializer8.deserialize(jsonParser9, deserializationContext10, arrayNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer8);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = arrayDeserializer0.getDelegatee();
        boolean boolean2 = arrayDeserializer0.isCachable();
        boolean boolean3 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.deserialize(jsonParser4, deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = objectDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection5 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer7 = objectDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.util.Collection<java.lang.Object> objCollection8 = objectNodeJsonDeserializer7.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = objectNodeJsonDeserializer7.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer10 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = arrayDeserializer10.getEmptyValue();
        java.lang.Class<?> wildcardClass12 = arrayDeserializer10.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = arrayDeserializer10.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = objectNodeJsonDeserializer7.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNotNull(arrayDeserializer10);
        org.junit.Assert.assertNull(arrayNode11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(wildcardJsonDeserializer13);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = objectDeserializer0.getValueType();
        boolean boolean7 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = objectDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection9 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer12 = objectDeserializer0.unwrappingDeserializer(nameTransformer11);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty14 = objectNodeJsonDeserializer12.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer12);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer0.getNullValue(deserializationContext8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = arrayDeserializer0.getEmptyValue(deserializationContext10);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode13 = arrayDeserializer0.getNullValue(deserializationContext12);
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(arrayNode9);
        org.junit.Assert.assertNull(arrayNode11);
        org.junit.Assert.assertNull(arrayNode13);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.JavaType javaType6 = jsonNodeDeserializer0.getValueType();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection8 = arrayDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass9 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = arrayDeserializer0.getNullValue(deserializationContext10);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode13 = arrayDeserializer0.getEmptyValue(deserializationContext12);
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(arrayNode11);
        org.junit.Assert.assertNull(arrayNode13);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean1 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer8 = arrayDeserializer0.unwrappingDeserializer(nameTransformer7);
        java.util.Collection<java.lang.Object> objCollection9 = arrayDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer8);
        org.junit.Assert.assertNull(objCollection9);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        boolean boolean4 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.JavaType javaType8 = objectDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection9 = objectDeserializer0.getKnownPropertyNames();
        boolean boolean10 = objectDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass11 = objectDeserializer0.getValueClass();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectDeserializer0.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = objectDeserializer0.getDelegatee();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNull(objectNode8);
        org.junit.Assert.assertNull(objectNode9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer6 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getEmptyValue();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer6);
        org.junit.Assert.assertNotNull(jsonNode7);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection6 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(arrayNode7);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer5 = objectDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.JavaType javaType8 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer11 = objectDeserializer0.unwrappingDeserializer(nameTransformer10);
        com.fasterxml.jackson.databind.JavaType javaType12 = objectDeserializer0.getValueType();
        org.junit.Assert.assertNull(objectNode1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer5);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(objectNode9);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer11);
        org.junit.Assert.assertNull(javaType12);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType3 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue(deserializationContext4);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(objectNode5);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer10 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNodeJsonDeserializer10.getEmptyValue(deserializationContext11);
        com.fasterxml.jackson.core.JsonParser jsonParser13 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer15 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = jsonNodeDeserializer15.getNullValue(deserializationContext16);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer19 = jsonNodeDeserializer15.unwrappingDeserializer(nameTransformer18);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext20 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = jsonNodeDeserializer15.getNullValue(deserializationContext20);
        boolean boolean22 = jsonNodeDeserializer15.isCachable();
        boolean boolean23 = jsonNodeDeserializer15.isCachable();
        boolean boolean24 = jsonNodeDeserializer15.isCachable();
        com.fasterxml.jackson.databind.JsonNode jsonNode25 = jsonNodeDeserializer15.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode26 = jsonNodeJsonDeserializer10.deserialize(jsonParser13, deserializationContext14, jsonNode25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer10);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer19);
        org.junit.Assert.assertNotNull(jsonNode21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jsonNode25);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue();
        boolean boolean8 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = jsonNodeDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection10 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer13 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer12);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer13);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.JavaType javaType7 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectDeserializer0.getNullValue(deserializationContext8);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer11 = objectDeserializer0.unwrappingDeserializer(nameTransformer10);
        java.util.Collection<java.lang.Object> objCollection12 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = objectDeserializer0.getEmptyValue(deserializationContext13);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(objectNode9);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer11);
        org.junit.Assert.assertNull(objCollection12);
        org.junit.Assert.assertNull(objectNode14);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue(deserializationContext4);
        boolean boolean6 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer8 = objectDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = objectDeserializer0.getDelegatee();
        boolean boolean11 = objectDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection12 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = objectDeserializer0.getNullValue(deserializationContext13);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode16 = objectDeserializer0.getEmptyValue(deserializationContext15);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode17 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer19 = objectDeserializer0.unwrappingDeserializer(nameTransformer18);
        com.fasterxml.jackson.core.JsonParser jsonParser20 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext21 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = objectNodeJsonDeserializer19.deserialize(jsonParser20, deserializationContext21, objectNode22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(objCollection12);
        org.junit.Assert.assertNull(objectNode14);
        org.junit.Assert.assertNull(objectNode16);
        org.junit.Assert.assertNull(objectNode17);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer19);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectDeserializer0.getEmptyValue(deserializationContext7);
        java.util.Collection<java.lang.Object> objCollection9 = objectDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNull(objectNode8);
        org.junit.Assert.assertNull(objCollection9);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = objectDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectDeserializer0.getNullValue(deserializationContext7);
        boolean boolean9 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer11 = objectDeserializer0.unwrappingDeserializer(nameTransformer10);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectDeserializer0.getNullValue();
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(objectNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer11);
        org.junit.Assert.assertNull(objectNode12);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection2 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer0.getEmptyValue(deserializationContext7);
        org.junit.Assert.assertNull(arrayNode1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNull(arrayNode8);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue(deserializationContext4);
        boolean boolean6 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer8 = objectDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = objectDeserializer0.getDelegatee();
        boolean boolean11 = objectDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection12 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = objectDeserializer0.getNullValue(deserializationContext13);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode16 = objectDeserializer0.getEmptyValue(deserializationContext15);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode17 = objectDeserializer0.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty19 = objectDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(objCollection12);
        org.junit.Assert.assertNull(objectNode14);
        org.junit.Assert.assertNull(objectNode16);
        org.junit.Assert.assertNull(objectNode17);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = arrayDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection5 = arrayDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = arrayDeserializer0.handledType();
        java.lang.Class<?> wildcardClass7 = arrayDeserializer0.handledType();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection8 = arrayDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass9 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass10 = arrayDeserializer0.handledType();
        boolean boolean11 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode14 = arrayDeserializer0.deserialize(jsonParser12, deserializationContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer5 = objectDeserializer0.unwrappingDeserializer(nameTransformer4);
        org.junit.Assert.assertNull(objectNode1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer5);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        boolean boolean4 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getNullValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer10 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType11 = arrayDeserializer10.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType12 = arrayDeserializer10.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode14 = arrayDeserializer10.getNullValue(deserializationContext13);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode16 = arrayDeserializer10.getEmptyValue(deserializationContext15);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode17 = arrayDeserializer10.getNullValue();
        java.util.Collection<java.lang.Object> objCollection18 = arrayDeserializer10.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass19 = arrayDeserializer10.getValueClass();
        java.lang.Class<?> wildcardClass20 = arrayDeserializer10.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader21 = arrayDeserializer10.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer22 = arrayDeserializer10.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext23 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode24 = arrayDeserializer10.getEmptyValue(deserializationContext23);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer25 = objectDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objectNode9);
        org.junit.Assert.assertNotNull(arrayDeserializer10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(arrayNode14);
        org.junit.Assert.assertNull(arrayNode16);
        org.junit.Assert.assertNull(arrayNode17);
        org.junit.Assert.assertNull(objCollection18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNull(objectIdReader21);
        org.junit.Assert.assertNull(wildcardJsonDeserializer22);
        org.junit.Assert.assertNull(arrayNode24);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer7 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Class<?> wildcardClass8 = jsonNodeDeserializer0.getValueClass();
        boolean boolean9 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType10 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = jsonNodeDeserializer0.getNullValue();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNotNull(jsonNode11);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = objectDeserializer0.getValueType();
        boolean boolean7 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = objectDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection9 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = objectDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass11 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader13 = objectDeserializer0.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty15 = objectDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(wildcardJsonDeserializer12);
        org.junit.Assert.assertNull(objectIdReader13);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = objectDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection5 = objectDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer8 = objectDeserializer0.unwrappingDeserializer(nameTransformer7);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer8);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = arrayDeserializer0.getDelegatee();
        boolean boolean2 = arrayDeserializer0.isCachable();
        boolean boolean3 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getNullValue(deserializationContext4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(arrayNode5);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer8 = arrayDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayDeserializer0.getNullValue(deserializationContext9);
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNull(arrayNode3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer8);
        org.junit.Assert.assertNull(arrayNode10);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection6 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType9 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass10 = jsonNodeDeserializer0.handledType();
        java.lang.Class<?> wildcardClass11 = jsonNodeDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass12 = jsonNodeDeserializer0.getValueClass();
        boolean boolean13 = jsonNodeDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue(deserializationContext4);
        boolean boolean6 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer8 = objectDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = objectDeserializer0.getDelegatee();
        boolean boolean11 = objectDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass12 = objectDeserializer0.getValueClass();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection6 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.handledType();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType4 = objectDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection5 = objectDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = objectDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection7 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = objectDeserializer0.deserializeWithType(jsonParser8, deserializationContext9, typeDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objCollection7);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = arrayDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType7 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = arrayDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection9 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer10 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType11 = arrayDeserializer10.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = arrayDeserializer10.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = arrayDeserializer10.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer15 = arrayDeserializer10.unwrappingDeserializer(nameTransformer14);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer17 = arrayDeserializer10.unwrappingDeserializer(nameTransformer16);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer19 = arrayDeserializer10.unwrappingDeserializer(nameTransformer18);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer20 = arrayDeserializer0.replaceDelegatee(arrayNodeJsonDeserializer19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNotNull(arrayDeserializer10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(wildcardJsonDeserializer12);
        org.junit.Assert.assertNull(wildcardJsonDeserializer13);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer15);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer17);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer19);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer0.getEmptyValue(deserializationContext8);
        com.fasterxml.jackson.databind.JavaType javaType10 = arrayDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass11 = arrayDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(arrayNode9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean1 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty4 = arrayDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        boolean boolean6 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass8 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType9 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNodeDeserializer0.getNullValue();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNotNull(jsonNode10);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass3 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getEmptyValue();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode7);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean1 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getEmptyValue(deserializationContext5);
        java.lang.Class<?> wildcardClass7 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer0.getEmptyValue(deserializationContext8);
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = arrayDeserializer0.deserializeWithType(jsonParser10, deserializationContext11, typeDeserializer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(arrayNode9);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue(deserializationContext5);
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer10 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNodeJsonDeserializer10.getEmptyValue(deserializationContext11);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer10);
        org.junit.Assert.assertNotNull(jsonNode12);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer9 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer8);
        java.util.Collection<java.lang.Object> objCollection10 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass11 = jsonNodeDeserializer0.handledType();
        java.lang.Class<?> wildcardClass12 = jsonNodeDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection13 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = jsonNodeDeserializer0.getNullValue(deserializationContext15);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty18 = jsonNodeDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(objCollection13);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(jsonNode16);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNodeDeserializer0.getNullValue(deserializationContext8);
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer10 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType11 = arrayDeserializer10.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType12 = arrayDeserializer10.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode14 = arrayDeserializer10.getNullValue(deserializationContext13);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode16 = arrayDeserializer10.getEmptyValue(deserializationContext15);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext17 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode18 = arrayDeserializer10.getNullValue(deserializationContext17);
        java.util.Collection<java.lang.Object> objCollection19 = arrayDeserializer10.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer20 = jsonNodeDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNotNull(arrayDeserializer10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(arrayNode14);
        org.junit.Assert.assertNull(arrayNode16);
        org.junit.Assert.assertNull(arrayNode18);
        org.junit.Assert.assertNull(objCollection19);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        java.lang.Class<?> wildcardClass1 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(arrayNode3);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.handledType();
        org.junit.Assert.assertNull(objectNode1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = jsonNodeDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection10 = jsonNodeDeserializer0.getKnownPropertyNames();
        boolean boolean11 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = jsonNodeDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(objectIdReader12);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer7 = objectDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectDeserializer0.getNullValue(deserializationContext8);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer7);
        org.junit.Assert.assertNull(objectNode9);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = jsonNodeDeserializer0.getValueType();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer3 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Class<?> wildcardClass4 = jsonNodeDeserializer0.handledType();
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getEmptyValue(deserializationContext7);
        java.lang.Class<?> wildcardClass9 = jsonNodeDeserializer0.getValueClass();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = arrayDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection3 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType4 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getNullValue(deserializationContext6);
        boolean boolean8 = arrayDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        boolean boolean6 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer9 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection10 = jsonNodeDeserializer9.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = jsonNodeDeserializer9.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = jsonNodeDeserializer9.getNullValue(deserializationContext12);
        java.lang.Class<?> wildcardClass14 = jsonNodeDeserializer9.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer16 = jsonNodeDeserializer9.unwrappingDeserializer(nameTransformer15);
        boolean boolean17 = jsonNodeDeserializer9.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = jsonNodeDeserializer9.getEmptyValue(deserializationContext18);
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = jsonNodeDeserializer9.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode21 = jsonNodeDeserializer0.deserialize(jsonParser7, deserializationContext8, jsonNode20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertNotNull(jsonNode20);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer0.getEmptyValue(deserializationContext8);
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode13 = arrayDeserializer0.deserialize(jsonParser10, deserializationContext11, arrayNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(arrayNode9);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = objectDeserializer0.getDelegatee();
        boolean boolean6 = objectDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass7 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectDeserializer0.getNullValue(deserializationContext8);
        java.lang.Class<?> wildcardClass10 = objectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass11 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = objectDeserializer0.deserializeWithType(jsonParser13, deserializationContext14, typeDeserializer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objectNode9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(objectNode12);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getNullValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = arrayDeserializer0.handledType();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        boolean boolean4 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.JavaType javaType8 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType9 = objectDeserializer0.getValueType();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass5 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = objectDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass8 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectDeserializer0.getNullValue(deserializationContext9);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection12 = objectDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objectNode10);
        org.junit.Assert.assertNull(objectNode11);
        org.junit.Assert.assertNull(objCollection12);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(objectIdReader2);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue();
        boolean boolean8 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = jsonNodeDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass10 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer12 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer11);
        java.util.Collection<java.lang.Object> objCollection13 = jsonNodeJsonDeserializer12.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty15 = jsonNodeJsonDeserializer12.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer12);
        org.junit.Assert.assertNull(objCollection13);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        java.util.Collection<java.lang.Object> objCollection3 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.handledType();
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass3 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer8 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection9 = jsonNodeDeserializer8.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNodeDeserializer8.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer12 = jsonNodeDeserializer8.unwrappingDeserializer(nameTransformer11);
        java.lang.Class<?> wildcardClass13 = jsonNodeDeserializer8.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeDeserializer8.getNullValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = jsonNodeDeserializer8.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = jsonNodeDeserializer8.getNullValue(deserializationContext16);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode18 = jsonNodeDeserializer0.deserialize(jsonParser6, deserializationContext7, jsonNode17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNotNull(jsonNode17);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection4 = objectDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass5 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer7 = objectDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer9 = objectDeserializer0.unwrappingDeserializer(nameTransformer8);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer7);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer9);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer3 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Class<?> wildcardClass4 = jsonNodeDeserializer0.handledType();
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = jsonNodeDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection7 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType8 = jsonNodeDeserializer0.getValueType();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType7 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNodeDeserializer0.getEmptyValue(deserializationContext8);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = jsonNodeDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue();
        boolean boolean8 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer10 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer9);
        java.lang.Class<?> wildcardClass11 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = jsonNodeDeserializer0.getNullValue(deserializationContext12);
        boolean boolean14 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = jsonNodeDeserializer0.getNullValue(deserializationContext16);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer15);
        org.junit.Assert.assertNotNull(jsonNode17);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer8 = arrayDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayNodeJsonDeserializer8.getNullValue(deserializationContext9);
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer11 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType12 = arrayDeserializer11.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader13 = arrayDeserializer11.getObjectIdReader();
        java.lang.Class<?> wildcardClass14 = arrayDeserializer11.getValueClass();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode15 = arrayDeserializer11.getNullValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode16 = arrayDeserializer11.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext17 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode18 = arrayDeserializer11.getEmptyValue(deserializationContext17);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext19 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode20 = arrayDeserializer11.getEmptyValue(deserializationContext19);
        java.lang.Class<?> wildcardClass21 = arrayDeserializer11.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer22 = arrayNodeJsonDeserializer8.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNull(arrayNode3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer8);
        org.junit.Assert.assertNull(arrayNode10);
        org.junit.Assert.assertNotNull(arrayDeserializer11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(objectIdReader13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(arrayNode15);
        org.junit.Assert.assertNull(arrayNode16);
        org.junit.Assert.assertNull(arrayNode18);
        org.junit.Assert.assertNull(arrayNode20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer5 = objectDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getNullValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass10 = objectDeserializer0.getValueClass();
        boolean boolean11 = objectDeserializer0.isCachable();
        org.junit.Assert.assertNull(objectNode1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer5);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objectNode9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue();
        boolean boolean8 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = jsonNodeDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass10 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer12 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.core.JsonParser jsonParser13 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = jsonNodeDeserializer0.deserializeWithType(jsonParser13, deserializationContext14, typeDeserializer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer12);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = arrayDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer9 = arrayDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayNodeJsonDeserializer9.getNullValue();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer9);
        org.junit.Assert.assertNull(arrayNode10);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        boolean boolean6 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectDeserializer0.getNullValue(deserializationContext7);
        org.junit.Assert.assertNull(objectNode1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectNode8);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        java.util.Collection<java.lang.Object> objCollection3 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection6 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNodeDeserializer0.deserialize(jsonParser9, deserializationContext10, jsonNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(jsonNode8);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass6 = objectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass7 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectDeserializer0.getEmptyValue(deserializationContext9);
        java.lang.Class<?> wildcardClass11 = objectDeserializer0.getValueClass();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNull(objectNode10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = objectDeserializer0.getDelegatee();
        boolean boolean6 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType7 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer8 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType9 = arrayDeserializer8.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = arrayDeserializer8.getObjectIdReader();
        java.lang.Class<?> wildcardClass11 = arrayDeserializer8.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode13 = arrayDeserializer8.getEmptyValue(deserializationContext12);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = arrayDeserializer8.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType15 = arrayDeserializer8.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode17 = arrayDeserializer8.getNullValue(deserializationContext16);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer18 = objectDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNotNull(arrayDeserializer8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objectIdReader10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(arrayNode13);
        org.junit.Assert.assertNull(wildcardJsonDeserializer14);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertNull(arrayNode17);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean1 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        java.lang.Class<?> wildcardClass4 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getNullValue();
        boolean boolean6 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer9 = arrayDeserializer0.unwrappingDeserializer(nameTransformer8);
        java.lang.Class<?> wildcardClass10 = arrayDeserializer0.handledType();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = arrayDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(arrayNode3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue();
        boolean boolean8 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer9 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType10 = arrayDeserializer9.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = arrayDeserializer9.getObjectIdReader();
        java.lang.Class<?> wildcardClass12 = arrayDeserializer9.handledType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode13 = arrayDeserializer9.getEmptyValue();
        boolean boolean14 = arrayDeserializer9.isCachable();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode15 = arrayDeserializer9.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode17 = arrayDeserializer9.getNullValue(deserializationContext16);
        boolean boolean18 = arrayDeserializer9.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer19 = jsonNodeDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(arrayDeserializer9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(arrayNode13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(arrayNode15);
        org.junit.Assert.assertNull(arrayNode17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType4 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getEmptyValue();
        boolean boolean8 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectDeserializer0.getEmptyValue(deserializationContext9);
        java.lang.Class<?> wildcardClass11 = objectDeserializer0.handledType();
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(objectNode10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getEmptyValue(deserializationContext2);
        java.util.Collection<java.lang.Object> objCollection4 = arrayDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode1);
        org.junit.Assert.assertNull(arrayNode3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(arrayNode6);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer9 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer8);
        boolean boolean10 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNodeDeserializer0.getEmptyValue(deserializationContext11);
        com.fasterxml.jackson.databind.JavaType javaType13 = jsonNodeDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNull(javaType13);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        boolean boolean4 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getNullValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = objectDeserializer0.deserialize(jsonParser11, deserializationContext12, objectNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNull(objectNode10);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass3 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = jsonNodeDeserializer0.getDelegatee();
        boolean boolean6 = jsonNodeDeserializer0.isCachable();
        boolean boolean7 = jsonNodeDeserializer0.isCachable();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue(deserializationContext4);
        boolean boolean6 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = objectDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass8 = objectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass9 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectDeserializer0.getEmptyValue(deserializationContext11);
        java.util.Collection<java.lang.Object> objCollection13 = objectDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(objectNode10);
        org.junit.Assert.assertNull(objectNode12);
        org.junit.Assert.assertNull(objCollection13);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer9 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer11 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer10);
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNodeDeserializer0.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty14 = jsonNodeDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer9);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer11);
        org.junit.Assert.assertNotNull(jsonNode12);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer8 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer8.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection10 = arrayDeserializer8.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = arrayDeserializer8.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType12 = arrayDeserializer8.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = arrayDeserializer8.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = arrayDeserializer8.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = jsonNodeDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(arrayDeserializer8);
        org.junit.Assert.assertNull(arrayNode9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(arrayNode11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(wildcardJsonDeserializer13);
        org.junit.Assert.assertNull(wildcardJsonDeserializer14);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectDeserializer0.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = objectDeserializer0.getObjectIdReader();
        boolean boolean10 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectDeserializer0.getNullValue();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(objectNode8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(objectNode11);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue();
        boolean boolean8 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer10 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer9);
        java.lang.Class<?> wildcardClass11 = jsonNodeDeserializer0.getValueClass();
        boolean boolean12 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = jsonNodeDeserializer0.getEmptyValue(deserializationContext14);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer16 = jsonNodeDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer13);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNull(wildcardJsonDeserializer16);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean1 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = arrayDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayDeserializer0.deserialize(jsonParser7, deserializationContext8, arrayNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        boolean boolean4 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getEmptyValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectDeserializer0.getNullValue();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objectNode9);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer9 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer8);
        java.util.Collection<java.lang.Object> objCollection10 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType11 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader13 = jsonNodeDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNull(objectIdReader13);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection2 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType4 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = arrayDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(arrayNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(objectIdReader6);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer6 = objectDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = objectDeserializer0.getDelegatee();
        boolean boolean9 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer10 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType11 = arrayDeserializer10.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType12 = arrayDeserializer10.getValueType();
        java.lang.Class<?> wildcardClass13 = arrayDeserializer10.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType14 = arrayDeserializer10.getValueType();
        java.lang.Class<?> wildcardClass15 = arrayDeserializer10.handledType();
        com.fasterxml.jackson.databind.JavaType javaType16 = arrayDeserializer10.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer17 = objectDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer6);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(arrayDeserializer10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(javaType16);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getEmptyValue();
        boolean boolean5 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getEmptyValue();
        boolean boolean7 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = arrayDeserializer0.deserialize(jsonParser8, deserializationContext9, arrayNode10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer3 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Class<?> wildcardClass4 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNodeDeserializer0.getNullValue();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNode9);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = arrayDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection3 = arrayDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass4 = arrayDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer0.getNullValue(deserializationContext8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = arrayDeserializer0.getEmptyValue(deserializationContext10);
        boolean boolean12 = arrayDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(arrayNode9);
        org.junit.Assert.assertNull(arrayNode11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        boolean boolean4 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getNullValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType9 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectDeserializer0.getEmptyValue(deserializationContext10);
        java.lang.Class<?> wildcardClass12 = objectDeserializer0.handledType();
        boolean boolean13 = objectDeserializer0.isCachable();
        boolean boolean14 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser15 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = objectDeserializer0.deserializeWithType(jsonParser15, deserializationContext16, typeDeserializer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objectNode11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = objectDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectDeserializer0.deserialize(jsonParser8, deserializationContext9, objectNode10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(objectIdReader7);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer._instance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(objectDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objectNode4);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Class<?> wildcardClass6 = arrayDeserializer0.getValueClass();
        boolean boolean7 = arrayDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(arrayNode3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType7 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer10 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer9);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer10);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = jsonNodeDeserializer0.getEmptyValue(deserializationContext10);
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer12 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean13 = arrayDeserializer12.isCachable();
        java.lang.Class<?> wildcardClass14 = arrayDeserializer12.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode16 = arrayDeserializer12.getNullValue(deserializationContext15);
        com.fasterxml.jackson.databind.JavaType javaType17 = arrayDeserializer12.getValueType();
        java.lang.Class<?> wildcardClass18 = arrayDeserializer12.getValueClass();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode19 = arrayDeserializer12.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext20 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode21 = arrayDeserializer12.getNullValue(deserializationContext20);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode22 = arrayDeserializer12.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext23 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode24 = arrayDeserializer12.getNullValue(deserializationContext23);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer25 = jsonNodeDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(arrayDeserializer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(arrayNode16);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(arrayNode19);
        org.junit.Assert.assertNull(arrayNode21);
        org.junit.Assert.assertNull(arrayNode22);
        org.junit.Assert.assertNull(arrayNode24);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer5 = objectDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectDeserializer0.getEmptyValue(deserializationContext8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectDeserializer0.getEmptyValue(deserializationContext10);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer13 = objectDeserializer0.unwrappingDeserializer(nameTransformer12);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer15 = objectDeserializer0.unwrappingDeserializer(nameTransformer14);
        org.junit.Assert.assertNull(objectNode1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer5);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNull(objectNode9);
        org.junit.Assert.assertNull(objectNode11);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer13);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer15);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = objectDeserializer0.getDelegatee();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getNullValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer9 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType10 = arrayDeserializer9.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = arrayDeserializer9.getObjectIdReader();
        java.lang.Class<?> wildcardClass12 = arrayDeserializer9.getValueClass();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode13 = arrayDeserializer9.getNullValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode14 = arrayDeserializer9.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode16 = arrayDeserializer9.getEmptyValue(deserializationContext15);
        java.lang.Class<?> wildcardClass17 = arrayDeserializer9.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode19 = arrayDeserializer9.getNullValue(deserializationContext18);
        java.util.Collection<java.lang.Object> objCollection20 = arrayDeserializer9.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer21 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer22 = arrayDeserializer9.unwrappingDeserializer(nameTransformer21);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer23 = arrayDeserializer0.replaceDelegatee(arrayNodeJsonDeserializer22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(arrayDeserializer9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(arrayNode13);
        org.junit.Assert.assertNull(arrayNode14);
        org.junit.Assert.assertNull(arrayNode16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(arrayNode19);
        org.junit.Assert.assertNull(objCollection20);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer22);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass3 = objectDeserializer0.getValueClass();
        boolean boolean4 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getNullValue(deserializationContext5);
        java.lang.Class<?> wildcardClass7 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer9 = objectDeserializer0.unwrappingDeserializer(nameTransformer8);
        org.junit.Assert.assertNull(objectNode1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer9);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer7 = arrayDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Class<?> wildcardClass8 = arrayDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection9 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = arrayDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNull(objectIdReader10);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer5 = arrayDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer7 = arrayDeserializer0.unwrappingDeserializer(nameTransformer6);
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer5);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer7);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean1 = arrayDeserializer0.isCachable();
        boolean boolean2 = arrayDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection3 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getNullValue(deserializationContext6);
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(arrayNode7);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType3 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer5 = arrayDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.util.Collection<java.lang.Object> objCollection6 = arrayDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass7 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = arrayDeserializer0.deserializeWithType(jsonParser8, deserializationContext9, typeDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass7 = objectDeserializer0.getValueClass();
        org.junit.Assert.assertNull(objectNode1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        boolean boolean4 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer8 = arrayDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayDeserializer0.getNullValue(deserializationContext9);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty12 = arrayDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer8);
        org.junit.Assert.assertNull(arrayNode10);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass6 = objectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass7 = objectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass8 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectDeserializer0.getEmptyValue();
        boolean boolean11 = objectDeserializer0.isCachable();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(objectNode10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection4 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType5 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer7 = objectDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Class<?> wildcardClass8 = objectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass9 = objectDeserializer0.getClass();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getEmptyValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        boolean boolean4 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getNullValue(deserializationContext6);
        java.util.Collection<java.lang.Object> objCollection8 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectDeserializer0.getEmptyValue(deserializationContext10);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer13 = objectDeserializer0.unwrappingDeserializer(nameTransformer12);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty15 = objectNodeJsonDeserializer13.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNull(objectNode9);
        org.junit.Assert.assertNull(objectNode11);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer13);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer9 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer8);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer9);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer9 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer8);
        boolean boolean10 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNodeDeserializer0.getEmptyValue(deserializationContext11);
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = jsonNodeDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(jsonNode13);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNull(arrayNode7);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType7 = arrayDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection8 = arrayDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(objCollection8);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer3 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.JavaType javaType6 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType7 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNodeDeserializer0.getNullValue(deserializationContext8);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer3);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNotNull(jsonNode9);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer7 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer6);
        boolean boolean8 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer10 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer11 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean12 = arrayDeserializer11.isCachable();
        java.lang.Class<?> wildcardClass13 = arrayDeserializer11.getValueClass();
        java.lang.Class<?> wildcardClass14 = arrayDeserializer11.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = arrayDeserializer11.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode17 = arrayDeserializer11.getEmptyValue(deserializationContext16);
        java.lang.Class<?> wildcardClass18 = arrayDeserializer11.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType19 = arrayDeserializer11.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer20 = jsonNodeDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer10);
        org.junit.Assert.assertNotNull(arrayDeserializer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(wildcardJsonDeserializer15);
        org.junit.Assert.assertNull(arrayNode17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(javaType19);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer10 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer12 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer11);
        java.lang.Class<?> wildcardClass13 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = jsonNodeDeserializer0.getDelegatee();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer10);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(wildcardJsonDeserializer14);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection2 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer4 = objectDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNodeJsonDeserializer4.getEmptyValue();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer4);
        org.junit.Assert.assertNull(objectNode5);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType4 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = objectDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNull(objectNode1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNull(objectIdReader8);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean1 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getNullValue(deserializationContext4);
        java.lang.Class<?> wildcardClass6 = arrayDeserializer0.handledType();
        boolean boolean7 = arrayDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType4 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer7 = objectDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.util.Collection<java.lang.Object> objCollection8 = objectDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass9 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType10 = objectDeserializer0.getValueType();
        boolean boolean11 = objectDeserializer0.isCachable();
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean1 = arrayDeserializer0.isCachable();
        boolean boolean2 = arrayDeserializer0.isCachable();
        boolean boolean3 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer6.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = arrayDeserializer6.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType9 = arrayDeserializer6.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer11 = arrayDeserializer6.unwrappingDeserializer(nameTransformer10);
        java.util.Collection<java.lang.Object> objCollection12 = arrayDeserializer6.getKnownPropertyNames();
        boolean boolean13 = arrayDeserializer6.isCachable();
        java.lang.Class<?> wildcardClass14 = arrayDeserializer6.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer16 = arrayDeserializer6.unwrappingDeserializer(nameTransformer15);
        com.fasterxml.jackson.databind.JavaType javaType17 = arrayDeserializer6.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer18 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNotNull(arrayDeserializer6);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer11);
        org.junit.Assert.assertNull(objCollection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer16);
        org.junit.Assert.assertNull(javaType17);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getNullValue();
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNull(objectNode7);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        java.util.Collection<java.lang.Object> objCollection3 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.deserialize(jsonParser5, deserializationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(objectIdReader4);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer8 = arrayDeserializer0.unwrappingDeserializer(nameTransformer7);
        boolean boolean9 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass10 = arrayDeserializer0.handledType();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType7 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNodeDeserializer0.getNullValue(deserializationContext9);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(jsonNode10);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass4 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer6 = arrayDeserializer0.unwrappingDeserializer(nameTransformer5);
        boolean boolean7 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer8 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType9 = arrayDeserializer8.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType10 = arrayDeserializer8.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode12 = arrayDeserializer8.getNullValue(deserializationContext11);
        java.util.Collection<java.lang.Object> objCollection13 = arrayDeserializer8.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass14 = arrayDeserializer8.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType15 = arrayDeserializer8.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode17 = arrayDeserializer8.getEmptyValue(deserializationContext16);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer18 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(arrayDeserializer8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(arrayNode12);
        org.junit.Assert.assertNull(objCollection13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertNull(arrayNode17);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer10 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer12 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeDeserializer0.getNullValue(deserializationContext13);
        com.fasterxml.jackson.databind.JavaType javaType15 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = jsonNodeDeserializer0.getEmptyValue();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer10);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer12);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertNotNull(jsonNode16);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass3 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass7 = objectDeserializer0.handledType();
        org.junit.Assert.assertNull(objectNode1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType5 = arrayDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(javaType5);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = objectDeserializer0.deserializeWithType(jsonParser6, deserializationContext7, typeDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objectNode5);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getEmptyValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = objectDeserializer0.getValueClass();
        boolean boolean9 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectDeserializer0.getEmptyValue(deserializationContext10);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectDeserializer0.getNullValue();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(objectNode11);
        org.junit.Assert.assertNull(objectNode12);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer9 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer12 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection13 = jsonNodeDeserializer12.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeDeserializer12.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer16 = jsonNodeDeserializer12.unwrappingDeserializer(nameTransformer15);
        java.util.Collection<java.lang.Object> objCollection17 = jsonNodeJsonDeserializer16.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = jsonNodeJsonDeserializer16.getEmptyValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = jsonNodeJsonDeserializer16.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode20 = jsonNodeJsonDeserializer9.deserialize(jsonParser10, deserializationContext11, jsonNode19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer9);
        org.junit.Assert.assertNull(objCollection13);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer16);
        org.junit.Assert.assertNull(objCollection17);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertNotNull(jsonNode19);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Class<?> wildcardClass6 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass7 = arrayDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer6 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNodeDeserializer0.getNullValue(deserializationContext8);
        java.lang.Class<?> wildcardClass10 = jsonNodeDeserializer0.handledType();
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        java.util.Collection<java.lang.Object> objCollection3 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode7);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        boolean boolean6 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass8 = jsonNodeDeserializer0.handledType();
        java.lang.Class<?> wildcardClass9 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = jsonNodeDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(objectIdReader10);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getNullValue(deserializationContext5);
        java.lang.Class<?> wildcardClass7 = arrayDeserializer0.handledType();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection3 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer6 = arrayDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayNodeJsonDeserializer6.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayNodeJsonDeserializer6.getEmptyValue(deserializationContext9);
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer6);
        org.junit.Assert.assertNull(arrayNode8);
        org.junit.Assert.assertNull(arrayNode10);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        java.lang.Class<?> wildcardClass1 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getNullValue(deserializationContext2);
        java.lang.Class<?> wildcardClass4 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty7 = arrayDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(arrayNode3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer7 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer7.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType9 = arrayDeserializer7.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = arrayDeserializer7.getDelegatee();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = arrayDeserializer7.getNullValue();
        java.lang.Class<?> wildcardClass12 = arrayDeserializer7.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer14 = arrayDeserializer7.unwrappingDeserializer(nameTransformer13);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode15 = arrayDeserializer7.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer17 = arrayDeserializer7.unwrappingDeserializer(nameTransformer16);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer18 = jsonNodeDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNotNull(arrayDeserializer7);
        org.junit.Assert.assertNull(arrayNode8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(arrayNode11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer14);
        org.junit.Assert.assertNull(arrayNode15);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer17);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue(deserializationContext5);
        boolean boolean7 = jsonNodeDeserializer0.isCachable();
        boolean boolean8 = jsonNodeDeserializer0.isCachable();
        boolean boolean9 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass10 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNodeDeserializer0.getEmptyValue(deserializationContext11);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(jsonNode12);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getNullValue(deserializationContext4);
        boolean boolean6 = objectDeserializer0.isCachable();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getEmptyValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = jsonNodeDeserializer0.getKnownPropertyNames();
        boolean boolean6 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = jsonNodeDeserializer0.deserializeWithType(jsonParser7, deserializationContext8, typeDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer8 = arrayDeserializer0.unwrappingDeserializer(nameTransformer7);
        boolean boolean9 = arrayDeserializer0.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty11 = arrayDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection6 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType9 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass10 = jsonNodeDeserializer0.handledType();
        boolean boolean11 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass12 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader13 = jsonNodeDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(objectIdReader13);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = arrayDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer0.getNullValue(deserializationContext8);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty11 = arrayDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(arrayNode9);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer9 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer8);
        java.util.Collection<java.lang.Object> objCollection10 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass11 = jsonNodeDeserializer0.handledType();
        java.lang.Class<?> wildcardClass12 = jsonNodeDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection13 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = jsonNodeDeserializer0.getNullValue(deserializationContext15);
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer17 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType18 = arrayDeserializer17.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType19 = arrayDeserializer17.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext20 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode21 = arrayDeserializer17.getNullValue(deserializationContext20);
        java.util.Collection<java.lang.Object> objCollection22 = arrayDeserializer17.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass23 = arrayDeserializer17.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType24 = arrayDeserializer17.getValueType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode25 = arrayDeserializer17.getNullValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode26 = arrayDeserializer17.getEmptyValue();
        java.lang.Class<?> wildcardClass27 = arrayDeserializer17.getValueClass();
        java.util.Collection<java.lang.Object> objCollection28 = arrayDeserializer17.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext29 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode30 = arrayDeserializer17.getEmptyValue(deserializationContext29);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer31 = jsonNodeDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(objCollection13);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(arrayDeserializer17);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNull(javaType19);
        org.junit.Assert.assertNull(arrayNode21);
        org.junit.Assert.assertNull(objCollection22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(javaType24);
        org.junit.Assert.assertNull(arrayNode25);
        org.junit.Assert.assertNull(arrayNode26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNull(objCollection28);
        org.junit.Assert.assertNull(arrayNode30);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass3 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        boolean boolean6 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = jsonNodeDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNull(objectIdReader8);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer3 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Class<?> wildcardClass4 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer8 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer11 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer10);
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer11);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass6 = objectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass7 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectDeserializer0.getEmptyValue(deserializationContext9);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = objectDeserializer0.getDelegatee();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(objectNode10);
        org.junit.Assert.assertNull(objectNode11);
        org.junit.Assert.assertNull(wildcardJsonDeserializer12);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType7 = jsonNodeDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection8 = jsonNodeDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(objCollection8);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType4 = arrayDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.handledType();
        java.lang.Class<?> wildcardClass6 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer0.deserialize(jsonParser7, deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType4 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = objectDeserializer0.getDelegatee();
        boolean boolean6 = objectDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass7 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = objectDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass9 = objectDeserializer0.handledType();
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType6 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer9 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer8);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty11 = jsonNodeJsonDeserializer9.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer9);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType4 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer7 = objectDeserializer0.unwrappingDeserializer(nameTransformer6);
        boolean boolean8 = objectDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection9 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType10 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectDeserializer0.getNullValue();
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(objectNode11);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass5 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectDeserializer0.deserialize(jsonParser8, deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(objectIdReader7);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass8 = jsonNodeDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass9 = jsonNodeDeserializer0.handledType();
        boolean boolean10 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer12 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer14 = jsonNodeJsonDeserializer12.unwrappingDeserializer(nameTransformer13);
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = jsonNodeJsonDeserializer12.getEmptyValue();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer12);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer14);
        org.junit.Assert.assertNotNull(jsonNode15);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNodeDeserializer0.deserialize(jsonParser6, deserializationContext7, jsonNode8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(jsonNode5);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection8 = objectDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNull(objCollection8);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer10 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer12 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.databind.JavaType javaType13 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass14 = jsonNodeDeserializer0.getValueClass();
        boolean boolean15 = jsonNodeDeserializer0.isCachable();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer10);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer12);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean1 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        java.lang.Class<?> wildcardClass4 = arrayDeserializer0.handledType();
        boolean boolean5 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass6 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer0.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(arrayNode8);
        org.junit.Assert.assertNull(arrayNode9);
        org.junit.Assert.assertNull(arrayNode10);
    }
}

