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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = objectDeserializer0.deserializeWithType(jsonParser1, deserializationContext2, typeDeserializer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.deserialize(jsonParser1, deserializationContext2, objectNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer2 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType3 = arrayDeserializer2.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = objectDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(arrayDeserializer2);
        org.junit.Assert.assertNull(javaType3);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.deserialize(jsonParser2, deserializationContext3, arrayNode4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.deserialize(jsonParser2, deserializationContext3, objectNode4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.deserialize(jsonParser2, deserializationContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer1 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer1);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean1 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer2 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean3 = arrayDeserializer2.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(arrayDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
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
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty4 = objectDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectNode2);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer3 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean4 = arrayDeserializer3.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(arrayDeserializer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.deserialize(jsonParser1, deserializationContext2, arrayNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer._instance;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.deserialize(jsonParser1, deserializationContext2, objectNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectDeserializer0);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = arrayDeserializer0.deserializeWithType(jsonParser1, deserializationContext2, typeDeserializer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean1 = arrayDeserializer0.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty3 = arrayDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.deserialize(jsonParser3, deserializationContext4, objectNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = arrayDeserializer0.deserializeWithType(jsonParser3, deserializationContext4, typeDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode2);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = objectDeserializer0.deserializeWithType(jsonParser3, deserializationContext4, typeDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode2);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.deserialize(jsonParser4, deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode3);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = jsonNodeDeserializer0.deserializeWithType(jsonParser2, deserializationContext3, typeDeserializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty5 = objectDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode3);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer7 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNodeDeserializer7.getNullValue(deserializationContext8);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNodeJsonDeserializer4.deserialize(jsonParser5, deserializationContext6, jsonNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode9);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.deserialize(jsonParser1, deserializationContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer4 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer4.getNullValue(deserializationContext5);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.deserialize(jsonParser2, deserializationContext3, jsonNode6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode6);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.deserialize(jsonParser5, deserializationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = arrayDeserializer0.deserializeWithType(jsonParser3, deserializationContext4, typeDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(arrayNode2);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
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
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer5 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType6 = arrayDeserializer5.getValueType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer5.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(arrayDeserializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(arrayNode7);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer.getInstance();
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.deserialize(jsonParser1, deserializationContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectDeserializer0);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode2);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.JavaType javaType3 = objectDeserializer0.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty5 = objectDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(javaType3);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
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
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty4 = jsonNodeDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty6 = jsonNodeDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue(deserializationContext5);
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.getClass();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getEmptyValue(deserializationContext1);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty4 = arrayDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode2);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer0.deserialize(jsonParser6, deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(objCollection5);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.JavaType javaType3 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.deserialize(jsonParser4, deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(javaType3);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.deserialize(jsonParser2, deserializationContext3, arrayNode4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(arrayNode1);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.JavaType javaType3 = objectDeserializer0.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty5 = objectDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(javaType3);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = arrayDeserializer0.deserializeWithType(jsonParser4, deserializationContext5, typeDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue(deserializationContext5);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty8 = jsonNodeDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        boolean boolean1 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.deserialize(jsonParser2, deserializationContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = objectDeserializer0.deserializeWithType(jsonParser4, deserializationContext5, typeDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(objectNode3);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType7 = arrayDeserializer6.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = arrayDeserializer6.getObjectIdReader();
        java.lang.Class<?> wildcardClass9 = arrayDeserializer6.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = objectDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNotNull(arrayDeserializer6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getNullValue();
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
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(arrayNode2);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getEmptyValue();
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
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objectNode5);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectDeserializer0.deserialize(jsonParser6, deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectIdReader5);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty7 = jsonNodeDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.JavaType javaType7 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer8 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType9 = arrayDeserializer8.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = arrayDeserializer8.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = objectDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer8);
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
        org.junit.Assert.assertNotNull(arrayDeserializer8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objectIdReader10);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
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
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(arrayNode4);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer0.deserialize(jsonParser6, deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(arrayNode5);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = objectDeserializer0.deserializeWithType(jsonParser5, deserializationContext6, typeDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer._instance;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.deserialize(jsonParser1, deserializationContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.deserialize(jsonParser2, deserializationContext3, arrayNode4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode1);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.deserialize(jsonParser3, deserializationContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue();
        boolean boolean8 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = jsonNodeDeserializer0.deserializeWithType(jsonParser9, deserializationContext10, typeDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass2 = jsonNodeDeserializer0.getClass();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = objectDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.deserialize(jsonParser4, deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = jsonNodeDeserializer0.deserializeWithType(jsonParser4, deserializationContext5, typeDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNull(objectIdReader3);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        boolean boolean4 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = objectIdReader5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(objectIdReader5);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = arrayDeserializer0.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = objectIdReader6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(objectIdReader6);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.deserialize(jsonParser2, deserializationContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode1);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer9 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = jsonNodeDeserializer9.getNullValue(deserializationContext10);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNodeDeserializer0.deserialize(jsonParser7, deserializationContext8, jsonNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode11);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty4 = arrayDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(arrayNode2);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer6 = objectDeserializer0.unwrappingDeserializer(nameTransformer5);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty8 = objectNodeJsonDeserializer6.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer6);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue(deserializationContext4);
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objectNode5);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.deserialize(jsonParser3, deserializationContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean1 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty4 = arrayDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer._instance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.deserialize(jsonParser2, deserializationContext3, objectNode4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer6 = objectDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = objectDeserializer0.deserializeWithType(jsonParser7, deserializationContext8, typeDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer6);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer6 = objectDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectDeserializer0.deserialize(jsonParser7, deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer6);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty4 = arrayDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        boolean boolean6 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNodeDeserializer0.deserialize(jsonParser7, deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.deserialize(jsonParser2, deserializationContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(arrayNode1);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer._instance;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(arrayDeserializer6);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getEmptyValue(deserializationContext6);
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
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(arrayNode7);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty5 = objectDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode3);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectDeserializer0.deserialize(jsonParser6, deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objectNode5);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = arrayDeserializer0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty4 = arrayDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
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
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode13 = jsonNodeDeserializer0.deserialize(jsonParser11, deserializationContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer10);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = objectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = objectDeserializer0.deserializeWithType(jsonParser5, deserializationContext6, typeDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer4 = arrayDeserializer0.unwrappingDeserializer(nameTransformer3);
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
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer4);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getEmptyValue(deserializationContext6);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty9 = objectDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(objectNode7);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue();
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
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode7);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
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
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectDeserializer0.deserialize(jsonParser10, deserializationContext11, objectNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(objectNode9);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue(deserializationContext5);
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = jsonNodeDeserializer0.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty10 = jsonNodeDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objectIdReader8);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty12 = jsonNodeDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer10);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer._instance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer2 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType3 = arrayDeserializer2.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = arrayDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass5 = arrayDeserializer2.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer2.getEmptyValue(deserializationContext6);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = objectDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(arrayDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(arrayNode7);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean1 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer3 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType4 = arrayDeserializer3.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = arrayDeserializer3.getObjectIdReader();
        java.lang.Class<?> wildcardClass6 = arrayDeserializer3.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer3.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = arrayDeserializer3.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(arrayDeserializer3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(arrayNode8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty4 = jsonNodeDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        boolean boolean4 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer5 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType6 = arrayDeserializer5.getValueType();
        java.lang.Class<?> wildcardClass7 = arrayDeserializer5.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = objectDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(arrayDeserializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection6 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.getValueClass();
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
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = arrayDeserializer0.deserializeWithType(jsonParser6, deserializationContext7, typeDeserializer8);
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
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean1 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer4 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer4.getNullValue(deserializationContext5);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(arrayDeserializer4);
        org.junit.Assert.assertNull(arrayNode6);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        java.util.Collection<java.lang.Object> objCollection3 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer5 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType6 = arrayDeserializer5.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType7 = arrayDeserializer5.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer5.getNullValue(deserializationContext8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = arrayDeserializer5.getEmptyValue(deserializationContext10);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = jsonNodeDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(arrayDeserializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(arrayNode9);
        org.junit.Assert.assertNull(arrayNode11);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getEmptyValue(deserializationContext6);
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
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(arrayNode7);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean1 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer0.deserialize(jsonParser6, deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(arrayNode5);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = objectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty6 = objectDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection6 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer11 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = jsonNodeDeserializer11.getNullValue(deserializationContext12);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer15 = jsonNodeDeserializer11.unwrappingDeserializer(nameTransformer14);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = jsonNodeDeserializer11.getNullValue(deserializationContext16);
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = jsonNodeDeserializer11.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode19 = jsonNodeDeserializer0.deserialize(jsonParser9, deserializationContext10, jsonNode18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer15);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertNotNull(jsonNode18);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getEmptyValue(deserializationContext6);
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
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(objectNode7);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = jsonNodeDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection8 = jsonNodeDeserializer0.getKnownPropertyNames();
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
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(objCollection8);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = objectDeserializer0.deserializeWithType(jsonParser5, deserializationContext6, typeDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer5 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType6 = arrayDeserializer5.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = arrayDeserializer5.getObjectIdReader();
        java.lang.Class<?> wildcardClass8 = arrayDeserializer5.getValueClass();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer5.getNullValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayDeserializer5.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode12 = arrayDeserializer5.getEmptyValue(deserializationContext11);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = objectDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNotNull(arrayDeserializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(arrayNode9);
        org.junit.Assert.assertNull(arrayNode10);
        org.junit.Assert.assertNull(arrayNode12);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer3 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue(deserializationContext4);
        boolean boolean6 = jsonNodeDeserializer0.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty8 = jsonNodeDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer3);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.handledType();
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
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        boolean boolean4 = objectDeserializer0.isCachable();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty3 = arrayDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue(deserializationContext4);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty7 = objectDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objectNode5);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer5 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType6 = arrayDeserializer5.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType7 = arrayDeserializer5.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer5.getNullValue(deserializationContext8);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = jsonNodeDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(arrayDeserializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(arrayNode9);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
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
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer13 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = jsonNodeDeserializer13.getNullValue(deserializationContext14);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode16 = jsonNodeJsonDeserializer10.deserialize(jsonParser11, deserializationContext12, jsonNode15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer10);
        org.junit.Assert.assertNotNull(jsonNode15);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectDeserializer0.deserialize(jsonParser6, deserializationContext7, objectNode8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectIdReader5);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean1 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer2 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType3 = arrayDeserializer2.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = arrayDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass5 = arrayDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = arrayDeserializer2.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(arrayDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.JavaType javaType3 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType4 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer5 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer5.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer5.getNullValue(deserializationContext8);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = objectDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(arrayDeserializer5);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(arrayNode9);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer0.deserialize(jsonParser6, deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(arrayNode5);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType7 = arrayDeserializer6.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType8 = arrayDeserializer6.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayDeserializer6.getNullValue(deserializationContext9);
        java.util.Collection<java.lang.Object> objCollection11 = arrayDeserializer6.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = arrayDeserializer6.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(arrayDeserializer6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(arrayNode10);
        org.junit.Assert.assertNull(objCollection11);
        org.junit.Assert.assertNull(objectIdReader12);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer6.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = arrayDeserializer6.getObjectIdReader();
        java.lang.Class<?> wildcardClass9 = arrayDeserializer6.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = jsonNodeDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNotNull(arrayDeserializer6);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer5 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType6 = arrayDeserializer5.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = arrayDeserializer5.getObjectIdReader();
        java.lang.Class<?> wildcardClass8 = arrayDeserializer5.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayDeserializer5.getEmptyValue(deserializationContext9);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = objectDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(arrayDeserializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(arrayNode10);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = arrayDeserializer0.deserializeWithType(jsonParser5, deserializationContext6, typeDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(arrayNode4);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer7 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer6);
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
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer7);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = jsonNodeDeserializer0.getObjectIdReader();
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
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objectIdReader7);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer5 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean6 = arrayDeserializer5.isCachable();
        java.lang.Class<?> wildcardClass7 = arrayDeserializer5.getValueClass();
        java.lang.Class<?> wildcardClass8 = arrayDeserializer5.handledType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer5.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(arrayDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(arrayNode9);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = objectDeserializer0.getValueType();
        boolean boolean7 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = objectDeserializer0.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty10 = objectDeserializer0.findBackReference("hi!");
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
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer8 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNodeDeserializer8.getNullValue(deserializationContext9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer12 = jsonNodeDeserializer8.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeDeserializer8.getNullValue(deserializationContext13);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode15 = jsonNodeDeserializer0.deserialize(jsonParser6, deserializationContext7, jsonNode14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer12);
        org.junit.Assert.assertNotNull(jsonNode14);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer8.getNullValue();
        java.lang.Class<?> wildcardClass10 = arrayDeserializer8.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
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
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = jsonNodeDeserializer0.getNullValue(deserializationContext10);
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeDeserializer0.deserialize(jsonParser12, deserializationContext13);
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
        org.junit.Assert.assertNotNull(jsonNode11);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer3 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType4 = arrayDeserializer3.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = arrayDeserializer3.getObjectIdReader();
        java.lang.Class<?> wildcardClass6 = arrayDeserializer3.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer3.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer3.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(arrayDeserializer3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(arrayNode8);
        org.junit.Assert.assertNull(arrayNode9);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = arrayNode9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(arrayNode9);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty7 = jsonNodeDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.deserialize(jsonParser6, deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass3 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = jsonNodeDeserializer0.deserializeWithType(jsonParser4, deserializationContext5, typeDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass6 = jsonNode5.getClass();
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer7 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNodeDeserializer7.getNullValue(deserializationContext8);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer11 = jsonNodeDeserializer7.unwrappingDeserializer(nameTransformer10);
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNodeDeserializer7.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode13 = jsonNodeDeserializer0.deserialize(jsonParser5, deserializationContext6, jsonNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer11);
        org.junit.Assert.assertNotNull(jsonNode12);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
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
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectDeserializer0.deserialize(jsonParser10, deserializationContext11);
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
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass6 = objectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass7 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer8 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer8.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = arrayDeserializer8.getObjectIdReader();
        java.lang.Class<?> wildcardClass11 = arrayDeserializer8.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode13 = arrayDeserializer8.getNullValue(deserializationContext12);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = objectDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(arrayDeserializer8);
        org.junit.Assert.assertNull(arrayNode9);
        org.junit.Assert.assertNull(objectIdReader10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(arrayNode13);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
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
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = objectDeserializer0.deserialize(jsonParser12, deserializationContext13);
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
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(objectNode11);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer6.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = arrayDeserializer6.getObjectIdReader();
        java.lang.Class<?> wildcardClass9 = arrayDeserializer6.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNotNull(arrayDeserializer6);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = objectDeserializer0.getEmptyValue();
        boolean boolean2 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = objectDeserializer0.deserializeWithType(jsonParser3, deserializationContext4, typeDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = arrayDeserializer0.deserializeWithType(jsonParser5, deserializationContext6, typeDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean1 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getNullValue(deserializationContext4);
        java.lang.Class<?> wildcardClass6 = arrayDeserializer0.getClass();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeJsonDeserializer4.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer9 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = jsonNodeDeserializer9.getNullValue(deserializationContext10);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = jsonNodeDeserializer9.getEmptyValue(deserializationContext12);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeJsonDeserializer4.deserialize(jsonParser7, deserializationContext8, jsonNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(jsonNode13);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty12 = jsonNodeDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer10);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer5 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean6 = arrayDeserializer5.isCachable();
        java.lang.Class<?> wildcardClass7 = arrayDeserializer5.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = objectDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNotNull(arrayDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = arrayDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = arrayDeserializer0.getClass();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty12 = jsonNodeJsonDeserializer10.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer10);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue(deserializationContext5);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty8 = jsonNodeDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass8 = arrayDeserializer0.getClass();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.deserialize(jsonParser3, deserializationContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode1);
        org.junit.Assert.assertNull(javaType2);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.deserialize(jsonParser4, deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection6 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = jsonNodeDeserializer0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty10 = jsonNodeDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = arrayDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection3 = arrayDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass4 = arrayDeserializer0.getClass();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer10 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection11 = jsonNodeDeserializer10.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNodeDeserializer10.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode13 = jsonNodeDeserializer0.deserialize(jsonParser8, deserializationContext9, jsonNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(objCollection11);
        org.junit.Assert.assertNotNull(jsonNode12);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer3 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue(deserializationContext4);
        boolean boolean6 = jsonNodeDeserializer0.isCachable();
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
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean7 = arrayDeserializer6.isCachable();
        java.lang.Class<?> wildcardClass8 = arrayDeserializer6.getValueClass();
        java.lang.Class<?> wildcardClass9 = arrayDeserializer6.handledType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayDeserializer6.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = jsonNodeDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNotNull(arrayDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(arrayNode10);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getEmptyValue(deserializationContext5);
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
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(arrayNode6);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = objectDeserializer0.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty5 = objectDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectIdReader3);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.deserialize(jsonParser1, deserializationContext2, arrayNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer6 = objectDeserializer0.unwrappingDeserializer(nameTransformer5);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty8 = objectNodeJsonDeserializer6.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer6);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        java.util.Collection<java.lang.Object> objCollection3 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty7 = jsonNodeDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(jsonNode5);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection3 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.deserialize(jsonParser4, deserializationContext5, arrayNode6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(objCollection3);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        java.util.Collection<java.lang.Object> objCollection3 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer6.getNullValue();
        java.lang.Class<?> wildcardClass8 = arrayDeserializer6.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = jsonNodeDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectIdReader5);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        java.lang.Class<?> wildcardClass1 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer2 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer._instance;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = objectDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(arrayDeserializer2);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
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
        com.fasterxml.jackson.core.JsonParser jsonParser14 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = objectDeserializer0.deserializeWithType(jsonParser14, deserializationContext15, typeDeserializer16);
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
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer13);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = jsonNodeDeserializer0.deserializeWithType(jsonParser6, deserializationContext7, typeDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(jsonNode5);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer10 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNodeDeserializer10.getNullValue(deserializationContext11);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeDeserializer10.getNullValue(deserializationContext13);
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = jsonNodeDeserializer10.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode16 = jsonNodeDeserializer0.deserialize(jsonParser8, deserializationContext9, jsonNode15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(jsonNode15);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = objectDeserializer0.getEmptyValue();
        boolean boolean2 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = objectDeserializer0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty5 = objectDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.deserialize(jsonParser5, deserializationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeJsonDeserializer4.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        java.util.Collection<java.lang.Object> objCollection7 = arrayDeserializer6.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = jsonNodeJsonDeserializer4.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNull(objCollection7);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        java.lang.Class<?> wildcardClass1 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.deserialize(jsonParser2, deserializationContext3, arrayNode4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue(deserializationContext4);
        boolean boolean6 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer8 = objectDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectDeserializer0.deserialize(jsonParser9, deserializationContext10);
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
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer7 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNodeDeserializer7.getNullValue(deserializationContext8);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer11 = jsonNodeDeserializer7.unwrappingDeserializer(nameTransformer10);
        java.lang.Class<?> wildcardClass12 = jsonNodeDeserializer7.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeDeserializer7.getEmptyValue(deserializationContext13);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode15 = jsonNodeDeserializer0.deserialize(jsonParser5, deserializationContext6, jsonNode14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(jsonNode14);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        boolean boolean4 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getNullValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = objectDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectDeserializer0.deserialize(jsonParser9, deserializationContext10, objectNode11);
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
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeJsonDeserializer4.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer8 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection9 = jsonNodeDeserializer8.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNodeDeserializer8.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode11 = jsonNodeJsonDeserializer4.deserialize(jsonParser6, deserializationContext7, jsonNode10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNotNull(jsonNode10);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = jsonNodeDeserializer0.deserializeWithType(jsonParser4, deserializationContext5, typeDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = arrayDeserializer0.deserializeWithType(jsonParser3, deserializationContext4, typeDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
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
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = objectDeserializer0.deserialize(jsonParser12, deserializationContext13);
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
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(objectIdReader11);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass7 = arrayDeserializer0.getClass();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
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
        java.lang.Class<?> wildcardClass11 = jsonNodeJsonDeserializer10.getClass();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer0.deserialize(jsonParser6, deserializationContext7, arrayNode8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = arrayDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayDeserializer0.deserialize(jsonParser8, deserializationContext9);
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
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer0.deserialize(jsonParser6, deserializationContext7);
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
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        boolean boolean6 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getNullValue();
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
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNode8);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.deserialize(jsonParser4, deserializationContext5, arrayNode6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.JavaType javaType3 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue(deserializationContext4);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty7 = objectDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(objectNode5);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty12 = jsonNodeJsonDeserializer10.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer10);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = arrayDeserializer0.deserializeWithType(jsonParser3, deserializationContext4, typeDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer._instance;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = arrayDeserializer0.deserializeWithType(jsonParser1, deserializationContext2, typeDeserializer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection2 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer4 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType5 = arrayDeserializer4.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType6 = arrayDeserializer4.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer4.getNullValue(deserializationContext7);
        java.util.Collection<java.lang.Object> objCollection9 = arrayDeserializer4.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass10 = arrayDeserializer4.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(arrayNode3);
        org.junit.Assert.assertNotNull(arrayDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(arrayNode8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType4 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer5 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer5.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer5.getNullValue(deserializationContext8);
        java.lang.Class<?> wildcardClass10 = arrayDeserializer5.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode12 = arrayDeserializer5.getNullValue(deserializationContext11);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode14 = arrayDeserializer5.getEmptyValue(deserializationContext13);
        com.fasterxml.jackson.databind.JavaType javaType15 = arrayDeserializer5.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer17 = arrayDeserializer5.unwrappingDeserializer(nameTransformer16);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer18 = objectDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(arrayDeserializer5);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(arrayNode9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(arrayNode12);
        org.junit.Assert.assertNull(arrayNode14);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer17);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
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
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer13 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = jsonNodeDeserializer13.getNullValue(deserializationContext14);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer17 = jsonNodeDeserializer13.unwrappingDeserializer(nameTransformer16);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = jsonNodeDeserializer13.getNullValue(deserializationContext18);
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = jsonNodeDeserializer13.getNullValue();
        boolean boolean21 = jsonNodeDeserializer13.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer22 = jsonNodeDeserializer13.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext23 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode24 = jsonNodeDeserializer13.getNullValue(deserializationContext23);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode25 = jsonNodeDeserializer0.deserialize(jsonParser11, deserializationContext12, jsonNode24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer10);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer17);
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertNotNull(jsonNode20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer22);
        org.junit.Assert.assertNotNull(jsonNode24);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectDeserializer0.deserialize(jsonParser6, deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer5 = arrayDeserializer0.unwrappingDeserializer(nameTransformer4);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty7 = arrayNodeJsonDeserializer5.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer5);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty12 = objectDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
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
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.deserialize(jsonParser4, deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode3);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        boolean boolean6 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer10 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection11 = jsonNodeDeserializer10.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNodeDeserializer10.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader13 = jsonNodeDeserializer10.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeDeserializer10.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode15 = jsonNodeDeserializer0.deserialize(jsonParser8, deserializationContext9, jsonNode14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objCollection11);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNull(objectIdReader13);
        org.junit.Assert.assertNotNull(jsonNode14);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        boolean boolean1 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass2 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer5 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection6 = jsonNodeDeserializer5.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer5.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNodeDeserializer5.getNullValue(deserializationContext8);
        java.lang.Class<?> wildcardClass10 = jsonNodeDeserializer5.handledType();
        boolean boolean11 = jsonNodeDeserializer5.isCachable();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNodeDeserializer5.getNullValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = jsonNodeDeserializer5.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeDeserializer0.deserialize(jsonParser3, deserializationContext4, jsonNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(jsonNode13);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = jsonNodeDeserializer0.deserializeWithType(jsonParser6, deserializationContext7, typeDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer3 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType4 = arrayDeserializer3.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = arrayDeserializer3.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer3.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer3.getEmptyValue(deserializationContext8);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayDeserializer3.getNullValue();
        java.util.Collection<java.lang.Object> objCollection11 = arrayDeserializer3.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(arrayDeserializer3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(arrayNode9);
        org.junit.Assert.assertNull(arrayNode10);
        org.junit.Assert.assertNull(objCollection11);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getEmptyValue();
        boolean boolean8 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer11 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection12 = jsonNodeDeserializer11.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = jsonNodeDeserializer11.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeDeserializer0.deserialize(jsonParser9, deserializationContext10, jsonNode13);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(objCollection12);
        org.junit.Assert.assertNotNull(jsonNode13);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.getClass();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
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
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNodeDeserializer0.getEmptyValue(deserializationContext11);
        com.fasterxml.jackson.core.JsonParser jsonParser13 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode15 = jsonNodeDeserializer0.deserialize(jsonParser13, deserializationContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer10);
        org.junit.Assert.assertNotNull(jsonNode12);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = arrayDeserializer0.deserializeWithType(jsonParser3, deserializationContext4, typeDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode2);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = arrayDeserializer0.deserializeWithType(jsonParser3, deserializationContext4, typeDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer10 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection11 = jsonNodeDeserializer10.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer13 = jsonNodeDeserializer10.unwrappingDeserializer(nameTransformer12);
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeDeserializer10.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode15 = jsonNodeDeserializer0.deserialize(jsonParser8, deserializationContext9, jsonNode14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNull(objCollection11);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer13);
        org.junit.Assert.assertNotNull(jsonNode14);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.JavaType javaType3 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType4 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer5 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType6 = arrayDeserializer5.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = arrayDeserializer5.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection8 = arrayDeserializer5.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType9 = arrayDeserializer5.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = arrayDeserializer5.getNullValue(deserializationContext10);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = objectDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(arrayDeserializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(arrayNode11);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue(deserializationContext2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(objectNode3);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer.getInstance();
        java.lang.Class<?> wildcardClass1 = objectDeserializer0.handledType();
        org.junit.Assert.assertNotNull(objectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = objectDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objCollection5);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectDeserializer0.deserialize(jsonParser6, deserializationContext7, objectNode8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer7 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer10 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection11 = jsonNodeDeserializer10.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNodeDeserializer10.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeDeserializer10.getNullValue(deserializationContext13);
        java.lang.Class<?> wildcardClass15 = jsonNodeDeserializer10.handledType();
        boolean boolean16 = jsonNodeDeserializer10.isCachable();
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = jsonNodeDeserializer10.getNullValue();
        java.util.Collection<java.lang.Object> objCollection18 = jsonNodeDeserializer10.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext19 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = jsonNodeDeserializer10.getNullValue(deserializationContext19);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext21 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode22 = jsonNodeDeserializer10.getEmptyValue(deserializationContext21);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode23 = jsonNodeDeserializer0.deserialize(jsonParser8, deserializationContext9, jsonNode22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer7);
        org.junit.Assert.assertNull(objCollection11);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertNull(objCollection18);
        org.junit.Assert.assertNotNull(jsonNode20);
        org.junit.Assert.assertNotNull(jsonNode22);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = objectDeserializer0.getEmptyValue();
        boolean boolean2 = objectDeserializer0.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty4 = objectDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.deserialize(jsonParser3, deserializationContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectNode2);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
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
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer10 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType11 = arrayDeserializer10.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType12 = arrayDeserializer10.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer14 = arrayDeserializer10.unwrappingDeserializer(nameTransformer13);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = jsonNodeDeserializer0.replaceDelegatee(arrayNodeJsonDeserializer14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNotNull(arrayDeserializer10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer14);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue(deserializationContext5);
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNodeDeserializer0.deserialize(jsonParser8, deserializationContext9);
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
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer5 = arrayDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = arrayDeserializer0.deserializeWithType(jsonParser6, deserializationContext7, typeDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer5);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType5 = objectDeserializer0.getValueType();
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
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        java.util.Collection<java.lang.Object> objCollection3 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass7 = jsonNode6.getClass();
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer._instance;
        java.util.Collection<java.lang.Object> objCollection1 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.deserialize(jsonParser2, deserializationContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectDeserializer0);
        org.junit.Assert.assertNull(objCollection1);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection2 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType4 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = arrayDeserializer0.deserializeWithType(jsonParser6, deserializationContext7, typeDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(arrayNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(objectIdReader5);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer3 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue(deserializationContext4);
        boolean boolean6 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer7 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer7.getEmptyValue(deserializationContext8);
        com.fasterxml.jackson.databind.JavaType javaType10 = arrayDeserializer7.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = jsonNodeDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer3);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(arrayDeserializer7);
        org.junit.Assert.assertNull(arrayNode9);
        org.junit.Assert.assertNull(javaType10);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer3 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType4 = arrayDeserializer3.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = arrayDeserializer3.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = arrayDeserializer3.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer8 = arrayDeserializer3.unwrappingDeserializer(nameTransformer7);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = objectDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(arrayDeserializer3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer8);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getEmptyValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType9 = arrayDeserializer0.getValueType();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = arrayDeserializer0.deserializeWithType(jsonParser4, deserializationContext5, typeDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getEmptyValue();
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
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(objectNode7);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = jsonNodeDeserializer0.deserializeWithType(jsonParser6, deserializationContext7, typeDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer8 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayDeserializer8.getEmptyValue(deserializationContext9);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = arrayDeserializer8.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = jsonNodeDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(arrayDeserializer8);
        org.junit.Assert.assertNull(arrayNode10);
        org.junit.Assert.assertNull(objectIdReader11);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty5 = arrayDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.deserialize(jsonParser2, deserializationContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer7 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Class<?> wildcardClass8 = jsonNodeDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass9 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer12 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection13 = jsonNodeDeserializer12.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeDeserializer12.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = jsonNodeDeserializer12.getNullValue(deserializationContext15);
        java.lang.Class<?> wildcardClass17 = jsonNodeDeserializer12.handledType();
        boolean boolean18 = jsonNodeDeserializer12.isCachable();
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = jsonNodeDeserializer12.getNullValue();
        java.util.Collection<java.lang.Object> objCollection20 = jsonNodeDeserializer12.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext21 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode22 = jsonNodeDeserializer12.getNullValue(deserializationContext21);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext23 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode24 = jsonNodeDeserializer12.getEmptyValue(deserializationContext23);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode25 = jsonNodeDeserializer0.deserialize(jsonParser10, deserializationContext11, jsonNode24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(objCollection13);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertNull(objCollection20);
        org.junit.Assert.assertNotNull(jsonNode22);
        org.junit.Assert.assertNotNull(jsonNode24);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection3 = arrayDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass4 = arrayDeserializer0.getClass();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        boolean boolean4 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getNullValue(deserializationContext6);
        java.util.Collection<java.lang.Object> objCollection8 = objectDeserializer0.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = objCollection8.getClass();
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
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = jsonNodeDeserializer0.deserializeWithType(jsonParser5, deserializationContext6, typeDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer11 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = jsonNodeDeserializer11.getNullValue(deserializationContext12);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer15 = jsonNodeDeserializer11.unwrappingDeserializer(nameTransformer14);
        com.fasterxml.jackson.databind.JavaType javaType16 = jsonNodeDeserializer11.getValueType();
        java.lang.Class<?> wildcardClass17 = jsonNodeDeserializer11.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = jsonNodeDeserializer11.getNullValue(deserializationContext18);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode20 = jsonNodeDeserializer0.deserialize(jsonParser9, deserializationContext10, jsonNode19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer15);
        org.junit.Assert.assertNull(javaType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(jsonNode19);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeJsonDeserializer4.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer8 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNodeDeserializer8.getNullValue(deserializationContext9);
        java.util.Collection<java.lang.Object> objCollection11 = jsonNodeDeserializer8.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType12 = jsonNodeDeserializer8.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = jsonNodeDeserializer8.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = jsonNodeDeserializer8.getEmptyValue(deserializationContext14);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode16 = jsonNodeJsonDeserializer4.deserialize(jsonParser6, deserializationContext7, jsonNode15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNull(objCollection11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(wildcardJsonDeserializer13);
        org.junit.Assert.assertNotNull(jsonNode15);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = objectDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectDeserializer0.deserialize(jsonParser6, deserializationContext7, objectNode8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
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
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = jsonNodeJsonDeserializer9.getDelegatee();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        java.lang.Class<?> wildcardClass1 = objectDeserializer0.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty3 = objectDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
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
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer12 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean13 = arrayDeserializer12.isCachable();
        java.lang.Class<?> wildcardClass14 = arrayDeserializer12.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode16 = arrayDeserializer12.getNullValue(deserializationContext15);
        com.fasterxml.jackson.databind.JavaType javaType17 = arrayDeserializer12.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer18 = objectDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertNull(objectNode11);
        org.junit.Assert.assertNotNull(arrayDeserializer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(arrayNode16);
        org.junit.Assert.assertNull(javaType17);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.deserialize(jsonParser6, deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue();
        boolean boolean8 = jsonNodeDeserializer0.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty10 = jsonNodeDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
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
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode13 = jsonNodeDeserializer0.deserialize(jsonParser11, deserializationContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNotNull(jsonNode10);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer4 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean5 = arrayDeserializer4.isCachable();
        java.lang.Class<?> wildcardClass6 = arrayDeserializer4.getValueClass();
        java.lang.Class<?> wildcardClass7 = arrayDeserializer4.handledType();
        java.lang.Class<?> wildcardClass8 = arrayDeserializer4.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = objectDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(arrayDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.deserialize(jsonParser1, deserializationContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass2 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.deserialize(jsonParser3, deserializationContext4, objectNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayDeserializer0.deserialize(jsonParser8, deserializationContext9);
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
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = jsonNodeDeserializer0.deserializeWithType(jsonParser10, deserializationContext11, typeDeserializer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = arrayDeserializer0.deserializeWithType(jsonParser5, deserializationContext6, typeDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(arrayNode4);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = arrayDeserializer0.deserializeWithType(jsonParser5, deserializationContext6, typeDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(arrayNode4);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
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
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer10 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode12 = arrayDeserializer10.getEmptyValue(deserializationContext11);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode14 = arrayDeserializer10.getNullValue(deserializationContext13);
        java.lang.Class<?> wildcardClass15 = arrayDeserializer10.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode17 = arrayDeserializer10.getNullValue(deserializationContext16);
        java.lang.Class<?> wildcardClass18 = arrayDeserializer10.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer19 = objectDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer10);
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
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNotNull(arrayDeserializer10);
        org.junit.Assert.assertNull(arrayNode12);
        org.junit.Assert.assertNull(arrayNode14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(arrayNode17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer0.deserialize(jsonParser6, deserializationContext7, arrayNode8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(arrayNode5);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection2 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.deserialize(jsonParser3, deserializationContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objCollection2);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        java.util.Collection<java.lang.Object> objCollection3 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass6 = jsonNode5.getClass();
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass8 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer9 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType10 = arrayDeserializer9.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = arrayDeserializer9.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = arrayDeserializer9.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer14 = arrayDeserializer9.unwrappingDeserializer(nameTransformer13);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader15 = arrayNodeJsonDeserializer14.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer16 = jsonNodeDeserializer0.replaceDelegatee(arrayNodeJsonDeserializer14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(arrayDeserializer9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
        org.junit.Assert.assertNull(wildcardJsonDeserializer12);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer14);
        org.junit.Assert.assertNull(objectIdReader15);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty12 = jsonNodeDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(jsonNode10);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = arrayDeserializer0.deserializeWithType(jsonParser4, deserializationContext5, typeDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getNullValue(deserializationContext5);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty8 = objectDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(objectNode6);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        boolean boolean6 = jsonNodeDeserializer0.isCachable();
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
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer3 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType4 = arrayDeserializer3.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = arrayDeserializer3.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNotNull(arrayDeserializer3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType5);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getNullValue(deserializationContext4);
        java.util.Collection<java.lang.Object> objCollection6 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty9 = objectDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(objectNode7);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = jsonNodeDeserializer0.deserializeWithType(jsonParser6, deserializationContext7, typeDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getEmptyValue(deserializationContext7);
        java.lang.Class<?> wildcardClass9 = jsonNode8.getClass();
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
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
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = objectDeserializer0.deserializeWithType(jsonParser12, deserializationContext13, typeDeserializer14);
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
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(objectIdReader11);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        java.util.Collection<java.lang.Object> objCollection3 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer8 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection9 = jsonNodeDeserializer8.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNodeDeserializer8.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNodeDeserializer8.getNullValue(deserializationContext11);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode13 = jsonNodeDeserializer0.deserialize(jsonParser6, deserializationContext7, jsonNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(jsonNode12);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer4 = arrayDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getNullValue(deserializationContext5);
        java.util.Collection<java.lang.Object> objCollection7 = arrayDeserializer0.getKnownPropertyNames();
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
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer4);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNull(objCollection7);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass2 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.deserialize(jsonParser3, deserializationContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.JavaType javaType7 = jsonNodeDeserializer0.getValueType();
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
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNull(javaType7);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = objectDeserializer0.getDelegatee();
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
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = objectDeserializer0.getValueType();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(javaType3);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass3 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.deserialize(jsonParser4, deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.getClass();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty5 = arrayDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType4 = arrayDeserializer0.getValueType();
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
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNull(arrayNode3);
        org.junit.Assert.assertNull(javaType4);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType7 = jsonNodeDeserializer0.getValueType();
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
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(javaType7);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.deserialize(jsonParser4, deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer._instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = objectDeserializer0.deserializeWithType(jsonParser4, deserializationContext5, typeDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectDeserializer0);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode3);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer7 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType8 = arrayDeserializer7.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = arrayDeserializer7.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection10 = arrayDeserializer7.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = arrayDeserializer7.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer7);
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
        org.junit.Assert.assertNotNull(arrayDeserializer7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(arrayNode11);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.JavaType javaType7 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer8 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayDeserializer8.getEmptyValue(deserializationContext9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode12 = arrayDeserializer8.getNullValue(deserializationContext11);
        java.lang.Class<?> wildcardClass13 = arrayDeserializer8.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode15 = arrayDeserializer8.getNullValue(deserializationContext14);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode17 = arrayDeserializer8.getEmptyValue(deserializationContext16);
        com.fasterxml.jackson.databind.JavaType javaType18 = arrayDeserializer8.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer19 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer20 = arrayDeserializer8.unwrappingDeserializer(nameTransformer19);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext21 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode22 = arrayNodeJsonDeserializer20.getEmptyValue(deserializationContext21);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer23 = jsonNodeDeserializer0.replaceDelegatee(arrayNodeJsonDeserializer20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNotNull(arrayDeserializer8);
        org.junit.Assert.assertNull(arrayNode10);
        org.junit.Assert.assertNull(arrayNode12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(arrayNode15);
        org.junit.Assert.assertNull(arrayNode17);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer20);
        org.junit.Assert.assertNull(arrayNode22);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectDeserializer0.deserialize(jsonParser6, deserializationContext7, objectNode8);
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
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getNullValue();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(arrayNode2);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = objectDeserializer0.getValueType();
        boolean boolean7 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectDeserializer0.getNullValue(deserializationContext9);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(objectNode10);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty7 = jsonNodeDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean1 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = arrayDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getEmptyValue();
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
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(arrayNode7);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getEmptyValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = objectDeserializer0.getClass();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer3 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer3.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.JavaType javaType6 = arrayDeserializer3.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = objectDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(arrayDeserializer3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer0.getNullValue(deserializationContext8);
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(arrayNode9);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer6 = objectDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer7 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType8 = arrayDeserializer7.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType9 = arrayDeserializer7.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer11 = arrayDeserializer7.unwrappingDeserializer(nameTransformer10);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode13 = arrayDeserializer7.getNullValue(deserializationContext12);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = objectDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer6);
        org.junit.Assert.assertNotNull(arrayDeserializer7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer11);
        org.junit.Assert.assertNull(arrayNode13);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer6 = objectDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectDeserializer0.deserialize(jsonParser7, deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer6);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer8 = arrayDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer0.getNullValue();
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
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer8);
        org.junit.Assert.assertNull(arrayNode9);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType7 = arrayDeserializer6.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = arrayDeserializer6.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = arrayDeserializer6.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNotNull(arrayDeserializer6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode12 = arrayDeserializer0.deserialize(jsonParser9, deserializationContext10, arrayNode11);
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
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer10 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection11 = jsonNodeDeserializer10.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNodeDeserializer10.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeDeserializer10.getNullValue(deserializationContext13);
        java.lang.Class<?> wildcardClass15 = jsonNodeDeserializer10.handledType();
        boolean boolean16 = jsonNodeDeserializer10.isCachable();
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = jsonNodeDeserializer10.getNullValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = jsonNodeDeserializer10.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode19 = jsonNodeDeserializer0.deserialize(jsonParser8, deserializationContext9, jsonNode18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objCollection11);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertNotNull(jsonNode18);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection6 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = jsonNodeDeserializer0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = wildcardJsonDeserializer8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = arrayDeserializer0.deserializeWithType(jsonParser2, deserializationContext3, typeDeserializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.deserialize(jsonParser5, deserializationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = arrayDeserializer0.deserializeWithType(jsonParser3, deserializationContext4, typeDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType7 = arrayDeserializer6.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = arrayDeserializer6.getObjectIdReader();
        java.lang.Class<?> wildcardClass9 = arrayDeserializer6.handledType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayDeserializer6.getEmptyValue();
        boolean boolean11 = arrayDeserializer6.isCachable();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode12 = arrayDeserializer6.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = arrayDeserializer6.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode15 = arrayDeserializer6.getEmptyValue(deserializationContext14);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer16 = jsonNodeDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNotNull(arrayDeserializer6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(arrayNode10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(arrayNode12);
        org.junit.Assert.assertNull(wildcardJsonDeserializer13);
        org.junit.Assert.assertNull(arrayNode15);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
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
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeDeserializer0.getEmptyValue(deserializationContext13);
        com.fasterxml.jackson.core.JsonParser jsonParser15 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer17 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = jsonNodeDeserializer17.getNullValue(deserializationContext18);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer20 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer21 = jsonNodeDeserializer17.unwrappingDeserializer(nameTransformer20);
        com.fasterxml.jackson.databind.JavaType javaType22 = jsonNodeDeserializer17.getValueType();
        java.util.Collection<java.lang.Object> objCollection23 = jsonNodeDeserializer17.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass24 = jsonNodeDeserializer17.getValueClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode25 = jsonNodeDeserializer17.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode26 = jsonNodeDeserializer0.deserialize(jsonParser15, deserializationContext16, jsonNode25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer21);
        org.junit.Assert.assertNull(javaType22);
        org.junit.Assert.assertNull(objCollection23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(jsonNode25);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer11 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType12 = arrayDeserializer11.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType13 = arrayDeserializer11.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer15 = arrayDeserializer11.unwrappingDeserializer(nameTransformer14);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode17 = arrayDeserializer11.getNullValue(deserializationContext16);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer18 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(arrayNode9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNotNull(arrayDeserializer11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer15);
        org.junit.Assert.assertNull(arrayNode17);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean1 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        java.lang.Class<?> wildcardClass4 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = arrayDeserializer0.deserializeWithType(jsonParser5, deserializationContext6, typeDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer4 = arrayDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType6 = arrayDeserializer0.getValueType();
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
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        boolean boolean4 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection6 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectDeserializer0.deserialize(jsonParser7, deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objCollection6);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = objectDeserializer0.getValueType();
        boolean boolean7 = objectDeserializer0.isCachable();
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
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer6.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType8 = arrayDeserializer6.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = arrayDeserializer6.getDelegatee();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayDeserializer6.getNullValue();
        java.lang.Class<?> wildcardClass11 = arrayDeserializer6.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer13 = arrayDeserializer6.unwrappingDeserializer(nameTransformer12);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = objectDeserializer0.replaceDelegatee(arrayNodeJsonDeserializer13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(arrayDeserializer6);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNull(arrayNode10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer13);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer8 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType9 = arrayDeserializer8.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType10 = arrayDeserializer8.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode12 = arrayDeserializer8.getNullValue(deserializationContext11);
        java.util.Collection<java.lang.Object> objCollection13 = arrayDeserializer8.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader14 = arrayDeserializer8.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader15 = arrayDeserializer8.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer16 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer8);
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
        org.junit.Assert.assertNotNull(arrayDeserializer8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(arrayNode12);
        org.junit.Assert.assertNull(objCollection13);
        org.junit.Assert.assertNull(objectIdReader14);
        org.junit.Assert.assertNull(objectIdReader15);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getEmptyValue(deserializationContext5);
        java.lang.Class<?> wildcardClass7 = jsonNode6.getClass();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer13 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer._instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode15 = arrayDeserializer13.getNullValue(deserializationContext14);
        java.util.Collection<java.lang.Object> objCollection16 = arrayDeserializer13.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer17 = jsonNodeDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
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
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer12);
        org.junit.Assert.assertNotNull(arrayDeserializer13);
        org.junit.Assert.assertNull(arrayNode15);
        org.junit.Assert.assertNull(objCollection16);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getNullValue(deserializationContext6);
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
        org.junit.Assert.assertNull(arrayNode1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(arrayNode7);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer6.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer6.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType10 = arrayDeserializer6.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = objectDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNotNull(arrayDeserializer6);
        org.junit.Assert.assertNull(arrayNode8);
        org.junit.Assert.assertNull(arrayNode9);
        org.junit.Assert.assertNull(javaType10);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection2 = objectDeserializer0.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = objCollection2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objCollection2);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.deserialize(jsonParser2, deserializationContext3, objectNode4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode1);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer6 = objectDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = objectDeserializer0.getDelegatee();
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
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = objectDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = objectDeserializer0.deserializeWithType(jsonParser4, deserializationContext5, typeDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
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
        java.util.Collection<java.lang.Object> objCollection10 = objectDeserializer0.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = objCollection10.getClass();
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
        org.junit.Assert.assertNull(objCollection10);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = arrayDeserializer0.getDelegatee();
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
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer6 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = jsonNodeJsonDeserializer6.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer10 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection11 = jsonNodeDeserializer10.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNodeDeserializer10.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeDeserializer10.getNullValue(deserializationContext13);
        java.lang.Class<?> wildcardClass15 = jsonNodeDeserializer10.handledType();
        boolean boolean16 = jsonNodeDeserializer10.isCachable();
        boolean boolean17 = jsonNodeDeserializer10.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = jsonNodeDeserializer10.getEmptyValue(deserializationContext18);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode20 = jsonNodeJsonDeserializer6.deserialize(jsonParser8, deserializationContext9, jsonNode19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(objCollection11);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(jsonNode19);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer5 = arrayDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType7 = arrayDeserializer6.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType8 = arrayDeserializer6.getValueType();
        java.util.Collection<java.lang.Object> objCollection9 = arrayDeserializer6.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = arrayNodeJsonDeserializer5.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer5);
        org.junit.Assert.assertNotNull(arrayDeserializer6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(objCollection9);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.JavaType javaType7 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = objectDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(objectIdReader8);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = jsonNodeDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection4 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue(deserializationContext5);
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
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNotNull(jsonNode6);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
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
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = objectNodeJsonDeserializer9.getObjectIdReader();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer9);
        org.junit.Assert.assertNull(objectIdReader10);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = objectDeserializer0.getEmptyValue();
        boolean boolean2 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = objectDeserializer0.deserializeWithType(jsonParser5, deserializationContext6, typeDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer6 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer5);
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty9 = jsonNodeDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.databind.JavaType javaType7 = objectDeserializer0.getValueType();
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
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNull(javaType7);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
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
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer6 = objectDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectNodeJsonDeserializer6.getNullValue();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer8 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean9 = arrayDeserializer8.isCachable();
        java.lang.Class<?> wildcardClass10 = arrayDeserializer8.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode12 = arrayDeserializer8.getNullValue(deserializationContext11);
        com.fasterxml.jackson.databind.JavaType javaType13 = arrayDeserializer8.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = objectNodeJsonDeserializer6.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer8);
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
        org.junit.Assert.assertNotNull(arrayDeserializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(arrayNode12);
        org.junit.Assert.assertNull(javaType13);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer4 = arrayDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayNodeJsonDeserializer4.getNullValue(deserializationContext5);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty8 = arrayNodeJsonDeserializer4.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer4);
        org.junit.Assert.assertNull(arrayNode6);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = arrayDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType4 = arrayDeserializer0.getValueType();
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
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(javaType4);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getNullValue(deserializationContext4);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty7 = arrayDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(arrayNode5);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty6 = objectDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = arrayDeserializer0.deserializeWithType(jsonParser5, deserializationContext6, typeDeserializer7);
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
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = jsonNodeDeserializer0.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = objectIdReader3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNull(objectIdReader3);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer7 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Class<?> wildcardClass8 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = jsonNodeDeserializer0.deserializeWithType(jsonParser9, deserializationContext10, typeDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        boolean boolean6 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection8 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer11 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection12 = jsonNodeDeserializer11.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = jsonNodeDeserializer11.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeDeserializer0.deserialize(jsonParser9, deserializationContext10, jsonNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNull(objCollection12);
        org.junit.Assert.assertNotNull(jsonNode13);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection3 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer4 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer4.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = arrayDeserializer4.getObjectIdReader();
        java.lang.Class<?> wildcardClass7 = arrayDeserializer4.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer4.getNullValue(deserializationContext8);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer11 = arrayDeserializer4.unwrappingDeserializer(nameTransformer10);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = arrayDeserializer0.replaceDelegatee(arrayNodeJsonDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNotNull(arrayDeserializer4);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(arrayNode9);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer11);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = arrayDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection3 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType4 = arrayDeserializer0.getValueType();
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
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(javaType4);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = objectDeserializer0.deserializeWithType(jsonParser7, deserializationContext8, typeDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(objectNode6);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass3 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer6 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection7 = jsonNodeDeserializer6.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer6.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNodeDeserializer6.getNullValue(deserializationContext9);
        java.lang.Class<?> wildcardClass11 = jsonNodeDeserializer6.handledType();
        boolean boolean12 = jsonNodeDeserializer6.isCachable();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = jsonNodeDeserializer6.getNullValue();
        java.util.Collection<java.lang.Object> objCollection14 = jsonNodeDeserializer6.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = jsonNodeDeserializer6.getNullValue(deserializationContext15);
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = jsonNodeDeserializer6.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode18 = jsonNodeDeserializer0.deserialize(jsonParser4, deserializationContext5, jsonNode17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNull(objCollection14);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(jsonNode17);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.getValueClass();
        boolean boolean6 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty9 = jsonNodeDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer5 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType6 = arrayDeserializer5.getValueType();
        java.lang.Class<?> wildcardClass7 = arrayDeserializer5.getValueClass();
        java.lang.Class<?> wildcardClass8 = arrayDeserializer5.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(arrayDeserializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean1 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = arrayDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer8 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType9 = arrayDeserializer8.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = arrayDeserializer8.getObjectIdReader();
        java.lang.Class<?> wildcardClass11 = arrayDeserializer8.getValueClass();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode12 = arrayDeserializer8.getNullValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode13 = arrayDeserializer8.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode15 = arrayDeserializer8.getEmptyValue(deserializationContext14);
        java.lang.Class<?> wildcardClass16 = arrayDeserializer8.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType17 = arrayDeserializer8.getValueType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode18 = arrayDeserializer8.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer19 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNotNull(arrayDeserializer8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objectIdReader10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(arrayNode12);
        org.junit.Assert.assertNull(arrayNode13);
        org.junit.Assert.assertNull(arrayNode15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertNull(arrayNode18);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = jsonNodeDeserializer0.deserializeWithType(jsonParser5, deserializationContext6, typeDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer4 = arrayDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = arrayDeserializer0.deserializeWithType(jsonParser5, deserializationContext6, typeDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer4);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getEmptyValue();
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
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(arrayNode6);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer._instance;
        java.lang.Class<?> wildcardClass1 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty4 = arrayDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass8 = jsonNodeDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass9 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = jsonNodeDeserializer0.deserializeWithType(jsonParser10, deserializationContext11, typeDeserializer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
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
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = jsonNodeDeserializer0.deserializeWithType(jsonParser10, deserializationContext11, typeDeserializer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getEmptyValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayDeserializer0.getEmptyValue(deserializationContext9);
        java.lang.Class<?> wildcardClass11 = arrayDeserializer0.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty13 = arrayDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(arrayNode10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass5 = objectDeserializer0.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty7 = objectDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean1 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty7 = arrayDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(arrayNode5);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
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
        java.util.Collection<java.lang.Object> objCollection17 = objectNodeJsonDeserializer15.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer18 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType19 = arrayDeserializer18.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer20 = arrayDeserializer18.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer21 = arrayDeserializer18.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer22 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer23 = arrayDeserializer18.unwrappingDeserializer(nameTransformer22);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer24 = objectNodeJsonDeserializer15.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer18);
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
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNull(objectNode9);
        org.junit.Assert.assertNull(objectNode11);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer13);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer15);
        org.junit.Assert.assertNull(objectNode16);
        org.junit.Assert.assertNull(objCollection17);
        org.junit.Assert.assertNotNull(arrayDeserializer18);
        org.junit.Assert.assertNull(javaType19);
        org.junit.Assert.assertNull(wildcardJsonDeserializer20);
        org.junit.Assert.assertNull(wildcardJsonDeserializer21);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer23);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer._instance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(objectDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectNode2);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer8 = arrayDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayNodeJsonDeserializer8.getEmptyValue();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer8);
        org.junit.Assert.assertNull(arrayNode9);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer._instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getClass();
        org.junit.Assert.assertNotNull(objectDeserializer0);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
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
        java.lang.Class<?> wildcardClass10 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = objectDeserializer0.deserializeWithType(jsonParser11, deserializationContext12, typeDeserializer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(objectNode9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass3 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objectNode4);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer._instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.deserialize(jsonParser3, deserializationContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectDeserializer0);
        org.junit.Assert.assertNull(objectNode2);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = objectDeserializer0.deserializeWithType(jsonParser3, deserializationContext4, typeDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectNode2);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = arrayDeserializer0.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty3 = arrayDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getNullValue();
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
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer8);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = arrayDeserializer0.getDelegatee();
        boolean boolean4 = arrayDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = arrayDeserializer0.deserializeWithType(jsonParser11, deserializationContext12, typeDeserializer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(arrayNode9);
        org.junit.Assert.assertNull(javaType10);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean1 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(arrayNode2);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass6 = objectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass7 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = objectDeserializer0.getDelegatee();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer4 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer4.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer4.getNullValue(deserializationContext7);
        java.lang.Class<?> wildcardClass9 = arrayDeserializer4.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = arrayDeserializer4.getNullValue(deserializationContext10);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = arrayDeserializer4.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(arrayDeserializer4);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNull(arrayNode8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(arrayNode11);
        org.junit.Assert.assertNull(objectIdReader12);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer6 = objectDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = objectDeserializer0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty9 = objectDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getNullValue(deserializationContext4);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objectNode5);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
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
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = jsonNodeJsonDeserializer10.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer14 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = jsonNodeDeserializer14.getNullValue(deserializationContext15);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer17 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer18 = jsonNodeDeserializer14.unwrappingDeserializer(nameTransformer17);
        com.fasterxml.jackson.databind.JavaType javaType19 = jsonNodeDeserializer14.getValueType();
        java.lang.Class<?> wildcardClass20 = jsonNodeDeserializer14.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = jsonNodeDeserializer14.getEmptyValue();
        java.lang.Class<?> wildcardClass22 = jsonNodeDeserializer14.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext23 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode24 = jsonNodeDeserializer14.getNullValue(deserializationContext23);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode25 = jsonNodeJsonDeserializer10.deserialize(jsonParser12, deserializationContext13, jsonNode24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
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
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer18);
        org.junit.Assert.assertNull(javaType19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(jsonNode21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(jsonNode24);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer7 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer6);
        boolean boolean8 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNodeDeserializer0.getEmptyValue(deserializationContext9);
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = jsonNodeDeserializer0.deserializeWithType(jsonParser11, deserializationContext12, typeDeserializer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonNode10);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getEmptyValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayDeserializer0.getEmptyValue(deserializationContext9);
        java.lang.Class<?> wildcardClass11 = arrayDeserializer0.getValueClass();
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
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(arrayNode10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.deserialize(jsonParser4, deserializationContext5, arrayNode6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer11 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = jsonNodeDeserializer11.getNullValue(deserializationContext12);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = jsonNodeDeserializer11.getNullValue(deserializationContext14);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode16 = jsonNodeDeserializer0.deserialize(jsonParser9, deserializationContext10, jsonNode15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNotNull(jsonNode15);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer8 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType9 = arrayDeserializer8.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType10 = arrayDeserializer8.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode12 = arrayDeserializer8.getNullValue(deserializationContext11);
        java.util.Collection<java.lang.Object> objCollection13 = arrayDeserializer8.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader14 = arrayDeserializer8.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader15 = arrayDeserializer8.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer16 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNotNull(arrayDeserializer8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(arrayNode12);
        org.junit.Assert.assertNull(objCollection13);
        org.junit.Assert.assertNull(objectIdReader14);
        org.junit.Assert.assertNull(objectIdReader15);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = arrayDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass4 = arrayDeserializer0.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty6 = arrayDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection6 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = arrayDeserializer0.deserializeWithType(jsonParser7, deserializationContext8, typeDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objCollection6);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = objectDeserializer0.deserializeWithType(jsonParser2, deserializationContext3, typeDeserializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeJsonDeserializer4.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeJsonDeserializer4.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer9 = jsonNodeJsonDeserializer4.unwrappingDeserializer(nameTransformer8);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer9);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer5 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean6 = arrayDeserializer5.isCachable();
        java.lang.Class<?> wildcardClass7 = arrayDeserializer5.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(arrayDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass5 = objectDeserializer0.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty7 = objectDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean1 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = arrayDeserializer0.deserializeWithType(jsonParser6, deserializationContext7, typeDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(arrayNode5);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType5 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getNullValue(deserializationContext6);
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
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objectNode7);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass3 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = objectDeserializer0.deserializeWithType(jsonParser4, deserializationContext5, typeDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean1 = arrayDeserializer0.isCachable();
        boolean boolean2 = arrayDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection3 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer4 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType5 = arrayDeserializer4.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType6 = arrayDeserializer4.getValueType();
        java.util.Collection<java.lang.Object> objCollection7 = arrayDeserializer4.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNotNull(arrayDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(objCollection7);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty15 = objectDeserializer0.findBackReference("");
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
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNull(objectNode9);
        org.junit.Assert.assertNull(objectNode11);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer13);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = objectDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectDeserializer0.deserialize(jsonParser7, deserializationContext8, objectNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objectIdReader6);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer7 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Class<?> wildcardClass8 = jsonNodeJsonDeserializer7.getClass();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
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
        java.lang.Class<?> wildcardClass10 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer12 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType13 = arrayDeserializer12.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = arrayDeserializer12.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = arrayDeserializer12.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer17 = arrayDeserializer12.unwrappingDeserializer(nameTransformer16);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader18 = arrayNodeJsonDeserializer17.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext19 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode20 = arrayNodeJsonDeserializer17.getEmptyValue(deserializationContext19);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer21 = objectDeserializer0.replaceDelegatee(arrayNodeJsonDeserializer17);
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
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(objectNode11);
        org.junit.Assert.assertNotNull(arrayDeserializer12);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertNull(wildcardJsonDeserializer14);
        org.junit.Assert.assertNull(wildcardJsonDeserializer15);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer17);
        org.junit.Assert.assertNull(objectIdReader18);
        org.junit.Assert.assertNull(arrayNode20);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = jsonNodeDeserializer0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty10 = jsonNodeDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass2 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(objectNode4);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getEmptyValue();
        boolean boolean5 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer0.deserialize(jsonParser6, deserializationContext7, arrayNode8);
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
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = arrayDeserializer0.deserializeWithType(jsonParser4, deserializationContext5, typeDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection4 = objectDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass5 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass7 = objectDeserializer0.handledType();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer9 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer8);
        java.util.Collection<java.lang.Object> objCollection10 = jsonNodeJsonDeserializer9.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer9);
        org.junit.Assert.assertNull(objCollection10);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = arrayDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.deserialize(jsonParser3, deserializationContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        boolean boolean6 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass8 = jsonNodeDeserializer0.handledType();
        java.lang.Class<?> wildcardClass9 = jsonNodeDeserializer0.getClass();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean1 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = arrayDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer9 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType10 = arrayDeserializer9.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = arrayDeserializer9.getObjectIdReader();
        java.lang.Class<?> wildcardClass12 = arrayDeserializer9.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode14 = arrayDeserializer9.getEmptyValue(deserializationContext13);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode15 = arrayDeserializer9.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer17 = arrayDeserializer9.unwrappingDeserializer(nameTransformer16);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode18 = arrayNodeJsonDeserializer17.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer19 = arrayDeserializer0.replaceDelegatee(arrayNodeJsonDeserializer17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(arrayNode8);
        org.junit.Assert.assertNotNull(arrayDeserializer9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(arrayNode14);
        org.junit.Assert.assertNull(arrayNode15);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer17);
        org.junit.Assert.assertNull(arrayNode18);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = arrayDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.deserialize(jsonParser5, deserializationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(arrayNode4);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNodeDeserializer0.getEmptyValue(deserializationContext8);
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
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNode9);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass4 = arrayDeserializer0.getClass();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer11 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType12 = arrayDeserializer11.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType13 = arrayDeserializer11.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode15 = arrayDeserializer11.getNullValue(deserializationContext14);
        java.util.Collection<java.lang.Object> objCollection16 = arrayDeserializer11.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader17 = arrayDeserializer11.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader18 = arrayDeserializer11.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer19 = arrayDeserializer11.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer20 = jsonNodeJsonDeserializer10.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer10);
        org.junit.Assert.assertNotNull(arrayDeserializer11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertNull(arrayNode15);
        org.junit.Assert.assertNull(objCollection16);
        org.junit.Assert.assertNull(objectIdReader17);
        org.junit.Assert.assertNull(objectIdReader18);
        org.junit.Assert.assertNull(wildcardJsonDeserializer19);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer3 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer2);
        java.lang.Class<?> wildcardClass4 = jsonNodeDeserializer0.handledType();
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty7 = jsonNodeDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
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
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer12 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeDeserializer12.getNullValue(deserializationContext13);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = jsonNodeDeserializer12.getEmptyValue(deserializationContext15);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode17 = jsonNodeDeserializer0.deserialize(jsonParser10, deserializationContext11, jsonNode16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(jsonNode16);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer7 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Class<?> wildcardClass8 = jsonNodeDeserializer0.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty10 = jsonNodeDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection6 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer8 = arrayDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayNodeJsonDeserializer8.getEmptyValue();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer8);
        org.junit.Assert.assertNull(arrayNode9);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer0.deserialize(jsonParser6, deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayDeserializer0.getEmptyValue(deserializationContext9);
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = arrayDeserializer0.deserializeWithType(jsonParser11, deserializationContext12, typeDeserializer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(arrayNode10);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = jsonNodeDeserializer0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty9 = jsonNodeDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
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
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = jsonNodeDeserializer0.deserializeWithType(jsonParser11, deserializationContext12, typeDeserializer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getNullValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = arrayDeserializer0.getDelegatee();
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
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = jsonNodeDeserializer0.deserializeWithType(jsonParser6, deserializationContext7, typeDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNull(javaType5);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection7 = jsonNodeDeserializer0.getKnownPropertyNames();
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
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objCollection7);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType4 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer7 = objectDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectDeserializer0.getNullValue(deserializationContext9);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(objectNode10);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer10 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer9);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer10);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer8 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayDeserializer8.getEmptyValue(deserializationContext9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode12 = arrayDeserializer8.getNullValue(deserializationContext11);
        java.lang.Class<?> wildcardClass13 = arrayDeserializer8.handledType();
        java.util.Collection<java.lang.Object> objCollection14 = arrayDeserializer8.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer16 = arrayDeserializer8.unwrappingDeserializer(nameTransformer15);
        java.util.Collection<java.lang.Object> objCollection17 = arrayNodeJsonDeserializer16.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer18 = jsonNodeDeserializer0.replaceDelegatee(arrayNodeJsonDeserializer16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(arrayDeserializer8);
        org.junit.Assert.assertNull(arrayNode10);
        org.junit.Assert.assertNull(arrayNode12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(objCollection14);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer16);
        org.junit.Assert.assertNull(objCollection17);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer7 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer6);
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
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer7);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
        com.fasterxml.jackson.core.JsonParser jsonParser16 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode18 = objectDeserializer0.deserialize(jsonParser16, deserializationContext17);
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
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer13);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer15);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = jsonNodeDeserializer0.getDelegatee();
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
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = arrayDeserializer0.deserializeWithType(jsonParser2, deserializationContext3, typeDeserializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(arrayNode1);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectDeserializer0.deserialize(jsonParser6, deserializationContext7, objectNode8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objectNode5);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        java.util.Collection<java.lang.Object> objCollection3 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
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
        org.junit.Assert.assertNull(javaType4);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getEmptyValue(deserializationContext2);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty5 = objectDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode1);
        org.junit.Assert.assertNull(objectNode3);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType4 = objectDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection5 = objectDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = objectDeserializer0.handledType();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objectNode7);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = objectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass5 = objectDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection6 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = objectDeserializer0.deserializeWithType(jsonParser7, deserializationContext8, typeDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objCollection6);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.deserialize(jsonParser3, deserializationContext4, objectNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode1);
        org.junit.Assert.assertNull(objectNode2);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass8 = jsonNodeDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass9 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer13 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection14 = jsonNodeDeserializer13.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = jsonNodeDeserializer13.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = jsonNodeDeserializer13.getNullValue(deserializationContext16);
        java.lang.Class<?> wildcardClass18 = jsonNodeDeserializer13.handledType();
        boolean boolean19 = jsonNodeDeserializer13.isCachable();
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = jsonNodeDeserializer13.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode21 = jsonNodeDeserializer0.deserialize(jsonParser11, deserializationContext12, jsonNode20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(objCollection14);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jsonNode20);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean1 = arrayDeserializer0.isCachable();
        boolean boolean2 = arrayDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection3 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType4 = arrayDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(javaType4);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = objectDeserializer0.getDelegatee();
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
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean1 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass7 = arrayDeserializer0.handledType();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getEmptyValue();
        boolean boolean5 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getEmptyValue();
        boolean boolean7 = arrayDeserializer0.isCachable();
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
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(arrayNode9);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeJsonDeserializer4.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer7 = jsonNodeJsonDeserializer4.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer9 = jsonNodeJsonDeserializer7.unwrappingDeserializer(nameTransformer8);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty11 = jsonNodeJsonDeserializer9.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer7);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer9);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getEmptyValue();
        boolean boolean5 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer0.getEmptyValue(deserializationContext8);
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
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(arrayNode9);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.deserialize(jsonParser2, deserializationContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty11 = jsonNodeDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        boolean boolean6 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = jsonNodeDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass8 = jsonNodeDeserializer0.handledType();
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection2 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType4 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer0.deserialize(jsonParser6, deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(arrayNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(objectIdReader5);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean1 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        java.lang.Class<?> wildcardClass4 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = arrayDeserializer0.deserializeWithType(jsonParser7, deserializationContext8, typeDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(arrayNode6);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        java.lang.Class<?> wildcardClass10 = jsonNodeDeserializer0.getClass();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer7 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Class<?> wildcardClass8 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNodeDeserializer0.getNullValue(deserializationContext9);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(jsonNode10);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = jsonNodeJsonDeserializer10.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = jsonNodeJsonDeserializer10.getObjectIdReader();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
        org.junit.Assert.assertNull(objectIdReader12);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        java.util.Collection<java.lang.Object> objCollection3 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNodeDeserializer0.deserialize(jsonParser7, deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer3 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = jsonNodeDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = arrayDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType7 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = arrayDeserializer0.deserializeWithType(jsonParser9, deserializationContext10, typeDeserializer11);
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
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(arrayNode8);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
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
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer11 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType12 = arrayDeserializer11.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader13 = arrayDeserializer11.getObjectIdReader();
        java.lang.Class<?> wildcardClass14 = arrayDeserializer11.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode16 = arrayDeserializer11.getEmptyValue(deserializationContext15);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode17 = arrayDeserializer11.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer19 = arrayDeserializer11.unwrappingDeserializer(nameTransformer18);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode20 = arrayDeserializer11.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer21 = jsonNodeDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer10);
        org.junit.Assert.assertNotNull(arrayDeserializer11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(objectIdReader13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(arrayNode16);
        org.junit.Assert.assertNull(arrayNode17);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer19);
        org.junit.Assert.assertNull(arrayNode20);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer5 = objectDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getNullValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = objectDeserializer0.handledType();
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
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer5);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        boolean boolean6 = jsonNodeDeserializer0.isCachable();
        boolean boolean7 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass8 = jsonNodeDeserializer0.getClass();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer10);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = jsonNodeDeserializer0.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty8 = jsonNodeDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objectIdReader6);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = objectDeserializer0.deserializeWithType(jsonParser7, deserializationContext8, typeDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(objectNode6);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        boolean boolean4 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getEmptyValue(deserializationContext5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = objectNode6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(objectNode6);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = arrayDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection8 = arrayDeserializer0.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty10 = arrayDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(objCollection8);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getEmptyValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayDeserializer0.getNullValue(deserializationContext9);
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
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(arrayNode10);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType4 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer7 = objectDeserializer0.unwrappingDeserializer(nameTransformer6);
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
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer7);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = jsonNodeDeserializer0.getDelegatee();
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
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass8 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer11 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection12 = jsonNodeDeserializer11.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = jsonNodeDeserializer11.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = jsonNodeDeserializer11.getNullValue(deserializationContext14);
        java.lang.Class<?> wildcardClass16 = jsonNodeDeserializer11.handledType();
        boolean boolean17 = jsonNodeDeserializer11.isCachable();
        boolean boolean18 = jsonNodeDeserializer11.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext19 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = jsonNodeDeserializer11.getEmptyValue(deserializationContext19);
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = jsonNodeDeserializer11.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode22 = jsonNodeDeserializer0.deserialize(jsonParser9, deserializationContext10, jsonNode21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objCollection12);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(jsonNode20);
        org.junit.Assert.assertNotNull(jsonNode21);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getClass();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean1 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        java.lang.Class<?> wildcardClass4 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection6 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer7 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType8 = arrayDeserializer7.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType9 = arrayDeserializer7.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(arrayDeserializer7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection6 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer8 = arrayDeserializer0.unwrappingDeserializer(nameTransformer7);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty10 = arrayDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty6 = arrayDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(arrayNode4);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
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
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = arrayDeserializer0.getEmptyValue(deserializationContext10);
        com.fasterxml.jackson.databind.JavaType javaType12 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer13 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType14 = arrayDeserializer13.getValueType();
        java.lang.Class<?> wildcardClass15 = arrayDeserializer13.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode17 = arrayDeserializer13.getEmptyValue(deserializationContext16);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer18 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(arrayNode11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNotNull(arrayDeserializer13);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(arrayNode17);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass3 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType6 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer9 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection10 = jsonNodeDeserializer9.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = jsonNodeDeserializer9.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = jsonNodeDeserializer9.getNullValue(deserializationContext12);
        java.util.Collection<java.lang.Object> objCollection14 = jsonNodeDeserializer9.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass15 = jsonNodeDeserializer9.getValueClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = jsonNodeDeserializer9.getEmptyValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = jsonNodeDeserializer9.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer19 = jsonNodeDeserializer9.unwrappingDeserializer(nameTransformer18);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext20 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = jsonNodeDeserializer9.getNullValue(deserializationContext20);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode22 = jsonNodeDeserializer0.deserialize(jsonParser7, deserializationContext8, jsonNode21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNull(objCollection14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer19);
        org.junit.Assert.assertNotNull(jsonNode21);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty6 = jsonNodeDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNotNull(jsonNode4);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = jsonNodeDeserializer0.getDelegatee();
        boolean boolean9 = jsonNodeDeserializer0.isCachable();
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
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(objCollection13);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(jsonNode18);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection2 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType4 = arrayDeserializer0.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty6 = arrayDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(arrayNode3);
        org.junit.Assert.assertNull(javaType4);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = objectDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection5 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = objectDeserializer0.getDelegatee();
        org.junit.Assert.assertNull(objectNode1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType4 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer8.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = arrayDeserializer8.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = objectDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNull(arrayNode9);
        org.junit.Assert.assertNull(objectIdReader10);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass3 = objectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.deserialize(jsonParser5, deserializationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection3 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty6 = arrayDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(arrayNode4);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        boolean boolean6 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType8 = jsonNodeDeserializer0.getValueType();
        boolean boolean9 = jsonNodeDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection6 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer9 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean10 = arrayDeserializer9.isCachable();
        java.lang.Class<?> wildcardClass11 = arrayDeserializer9.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode13 = arrayDeserializer9.getNullValue(deserializationContext12);
        com.fasterxml.jackson.databind.JavaType javaType14 = arrayDeserializer9.getValueType();
        java.lang.Class<?> wildcardClass15 = arrayDeserializer9.getValueClass();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode16 = arrayDeserializer9.getEmptyValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode17 = arrayDeserializer9.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer18 = jsonNodeDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(arrayDeserializer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(arrayNode13);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(arrayNode16);
        org.junit.Assert.assertNull(arrayNode17);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass3 = objectDeserializer0.getValueClass();
        boolean boolean4 = objectDeserializer0.isCachable();
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
        org.junit.Assert.assertNull(objectNode1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer4 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType5 = arrayDeserializer4.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = arrayDeserializer4.getObjectIdReader();
        java.lang.Class<?> wildcardClass7 = arrayDeserializer4.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer4.getEmptyValue(deserializationContext8);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayDeserializer4.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer12 = arrayDeserializer4.unwrappingDeserializer(nameTransformer11);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(arrayDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(arrayNode9);
        org.junit.Assert.assertNull(arrayNode10);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer12);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
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
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = jsonNodeDeserializer0.getDelegatee();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean1 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty5 = arrayDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        boolean boolean1 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = arrayDeserializer0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty6 = arrayDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty2 = objectDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectDeserializer0);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = jsonNodeDeserializer0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty11 = jsonNodeDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode12 = arrayDeserializer0.deserialize(jsonParser9, deserializationContext10, arrayNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(objectIdReader8);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getEmptyValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = jsonNodeDeserializer0.getKnownPropertyNames();
        boolean boolean6 = jsonNodeDeserializer0.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty8 = jsonNodeDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType4 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getEmptyValue();
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(objectNode6);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer11 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer10);
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeDeserializer0.deserialize(jsonParser12, deserializationContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer11);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType4 = objectDeserializer0.getValueType();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(javaType4);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = arrayDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.deserialize(jsonParser4, deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.getClass();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode1);
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection6 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer11 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = jsonNodeDeserializer11.getNullValue(deserializationContext12);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer15 = jsonNodeDeserializer11.unwrappingDeserializer(nameTransformer14);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = jsonNodeDeserializer11.getNullValue(deserializationContext16);
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = jsonNodeDeserializer11.getNullValue();
        boolean boolean19 = jsonNodeDeserializer11.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer20 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer21 = jsonNodeDeserializer11.unwrappingDeserializer(nameTransformer20);
        java.lang.Class<?> wildcardClass22 = jsonNodeDeserializer11.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext23 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode24 = jsonNodeDeserializer11.getNullValue(deserializationContext23);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode25 = jsonNodeDeserializer0.deserialize(jsonParser9, deserializationContext10, jsonNode24);
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
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer15);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(jsonNode24);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer5 = arrayDeserializer0.unwrappingDeserializer(nameTransformer4);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty7 = arrayNodeJsonDeserializer5.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer5);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        boolean boolean3 = objectDeserializer0.isCachable();
        boolean boolean4 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getNullValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = objectDeserializer0.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty10 = objectDeserializer0.findBackReference("hi!");
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass6 = objectDeserializer0.handledType();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
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
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objectIdReader6);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getEmptyValue(deserializationContext6);
        boolean boolean8 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectDeserializer0.getNullValue(deserializationContext9);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(objectNode10);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer14 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        boolean boolean15 = jsonNodeDeserializer14.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = jsonNodeDeserializer14.getNullValue(deserializationContext16);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode18 = jsonNodeJsonDeserializer11.deserialize(jsonParser12, deserializationContext13, jsonNode17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jsonNode17);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        java.util.Collection<java.lang.Object> objCollection3 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = jsonNodeDeserializer0.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty6 = jsonNodeDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(objectIdReader4);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = objectDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection5 = objectDeserializer0.getKnownPropertyNames();
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
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(objCollection5);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.deserialize(jsonParser4, deserializationContext5, arrayNode6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertNull(arrayNode3);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JavaType javaType1 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer0.deserialize(jsonParser6, deserializationContext7, arrayNode8);
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
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer12 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection13 = jsonNodeDeserializer12.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeDeserializer12.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = jsonNodeDeserializer12.getNullValue(deserializationContext15);
        java.util.Collection<java.lang.Object> objCollection17 = jsonNodeDeserializer12.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass18 = jsonNodeDeserializer12.getValueClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = jsonNodeDeserializer12.getEmptyValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = jsonNodeDeserializer12.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode21 = jsonNodeDeserializer0.deserialize(jsonParser10, deserializationContext11, jsonNode20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
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
        org.junit.Assert.assertNull(objCollection13);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNull(objCollection17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertNotNull(jsonNode20);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = jsonNodeDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection4 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer6.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayDeserializer6.getNullValue(deserializationContext9);
        java.lang.Class<?> wildcardClass11 = arrayDeserializer6.handledType();
        boolean boolean12 = arrayDeserializer6.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = jsonNodeDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNotNull(arrayDeserializer6);
        org.junit.Assert.assertNull(arrayNode8);
        org.junit.Assert.assertNull(arrayNode10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
        java.lang.Class<?> wildcardClass11 = jsonNodeDeserializer0.getClass();
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer4 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass8 = jsonNodeDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass9 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNodeDeserializer0.deserialize(jsonParser10, deserializationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
        java.lang.Class<?> wildcardClass10 = objectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass11 = objectDeserializer0.getClass();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(objectNode9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
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
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeDeserializer0.getEmptyValue(deserializationContext13);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty16 = jsonNodeDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
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
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(jsonNode14);
    }
}

