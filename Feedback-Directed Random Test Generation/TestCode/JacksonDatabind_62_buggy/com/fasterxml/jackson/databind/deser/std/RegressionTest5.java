package com.fasterxml.jackson.databind.deser.std;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = collectionDeserializer7.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer9 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer7);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = collectionDeserializer9._valueTypeDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer13 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer17 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType11, objJsonDeserializer12, typeDeserializer13, valueInstantiator14, objJsonDeserializer15, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer18 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer17);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = collectionDeserializer18.getContentDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer20 = collectionDeserializer18.getContentDeserializer();
        java.lang.Class<?> wildcardClass21 = collectionDeserializer18.handledType();
        com.fasterxml.jackson.databind.JavaType javaType22 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer23 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer24 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator25 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer26 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer28 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType22, objJsonDeserializer23, typeDeserializer24, valueInstantiator25, objJsonDeserializer26, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer29 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer28);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer30 = collectionDeserializer29.getContentDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer31 = collectionDeserializer29.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer32 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer33 = collectionDeserializer9.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer18, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer29, typeDeserializer32);
        boolean boolean34 = collectionDeserializer18.isCachable();
        java.util.Collection<java.lang.Object> objCollection35 = collectionDeserializer18.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer36 = collectionDeserializer18.getDelegatee();
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(typeDeserializer10);
        org.junit.Assert.assertNull(objJsonDeserializer19);
        org.junit.Assert.assertNull(objJsonDeserializer20);
        org.junit.Assert.assertNull(wildcardClass21);
        org.junit.Assert.assertNull(objJsonDeserializer30);
        org.junit.Assert.assertNull(objJsonDeserializer31);
        org.junit.Assert.assertNotNull(collectionDeserializer33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(objCollection35);
        org.junit.Assert.assertNull(wildcardJsonDeserializer36);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer4 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer11 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType5, objJsonDeserializer6, typeDeserializer7, valueInstantiator8, objJsonDeserializer9, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer12 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer11);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = collectionDeserializer12.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer14 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer12);
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer17 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer21 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType15, objJsonDeserializer16, typeDeserializer17, valueInstantiator18, objJsonDeserializer19, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer22 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer21);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer23 = collectionDeserializer21.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer24 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer26 = collectionDeserializer4.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer12, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer21, typeDeserializer24, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType27 = collectionDeserializer26._collectionType;
        java.lang.Class<?> wildcardClass28 = collectionDeserializer26.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader29 = collectionDeserializer26.getObjectIdReader();
        java.lang.Class<?> wildcardClass30 = collectionDeserializer26.getValueClass();
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertNull(objJsonDeserializer23);
        org.junit.Assert.assertNotNull(collectionDeserializer26);
        org.junit.Assert.assertNull(javaType27);
        org.junit.Assert.assertNull(wildcardClass28);
        org.junit.Assert.assertNull(objectIdReader29);
        org.junit.Assert.assertNull(wildcardClass30);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer14 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType8, objJsonDeserializer9, typeDeserializer10, valueInstantiator11, objJsonDeserializer12, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer15 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer14);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = collectionDeserializer15.getContentDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer18 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer19 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator20 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer21 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer23 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType17, objJsonDeserializer18, typeDeserializer19, valueInstantiator20, objJsonDeserializer21, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer24 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer23);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer25 = collectionDeserializer24.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer24);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer27 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer28 = collectionDeserializer6.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer15, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer24, typeDeserializer27);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer29 = collectionDeserializer28.getDelegatee();
        java.lang.Class<?> wildcardClass30 = collectionDeserializer28.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer31 = collectionDeserializer28.getContentDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer32 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer33 = collectionDeserializer28.unwrappingDeserializer(nameTransformer32);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext34 = null;
        java.util.Collection<java.lang.Object> objCollection35 = collectionDeserializer28.getNullValue(deserializationContext34);
        com.fasterxml.jackson.core.JsonParser jsonParser36 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext37 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer38 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = collectionDeserializer28.deserializeWithType(jsonParser36, deserializationContext37, typeDeserializer38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objJsonDeserializer16);
        org.junit.Assert.assertNull(objJsonDeserializer25);
        org.junit.Assert.assertNotNull(collectionDeserializer28);
        org.junit.Assert.assertNull(wildcardJsonDeserializer29);
        org.junit.Assert.assertNull(wildcardClass30);
        org.junit.Assert.assertNotNull(objJsonDeserializer31);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer33);
        org.junit.Assert.assertNull(objCollection35);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = collectionDeserializer7.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer9 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer7);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = collectionDeserializer9._valueTypeDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType11 = collectionDeserializer9.getValueType();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer12 = collectionDeserializer9._valueTypeDeserializer;
        boolean boolean13 = collectionDeserializer9.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = collectionDeserializer9.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader15 = collectionDeserializer9.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer17 = collectionDeserializer9.unwrappingDeserializer(nameTransformer16);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNull(typeDeserializer10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(typeDeserializer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer14);
        org.junit.Assert.assertNull(objectIdReader15);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer17);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = collectionDeserializer7.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer9 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer7);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = collectionDeserializer9._valueTypeDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer13 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer17 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType11, objJsonDeserializer12, typeDeserializer13, valueInstantiator14, objJsonDeserializer15, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer18 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer17);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = collectionDeserializer18.getContentDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer20 = collectionDeserializer18.getContentDeserializer();
        java.lang.Class<?> wildcardClass21 = collectionDeserializer18.handledType();
        com.fasterxml.jackson.databind.JavaType javaType22 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer23 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer24 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator25 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer26 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer28 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType22, objJsonDeserializer23, typeDeserializer24, valueInstantiator25, objJsonDeserializer26, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer29 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer28);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer30 = collectionDeserializer29.getContentDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer31 = collectionDeserializer29.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer32 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer33 = collectionDeserializer9.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer18, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer29, typeDeserializer32);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer34 = collectionDeserializer29._valueTypeDeserializer;
        java.util.Collection<java.lang.Object> objCollection35 = collectionDeserializer29.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection36 = collectionDeserializer29.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer37 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer38 = collectionDeserializer29.unwrappingDeserializer(nameTransformer37);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType39 = collectionDeserializer29.getContentType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(typeDeserializer10);
        org.junit.Assert.assertNull(objJsonDeserializer19);
        org.junit.Assert.assertNull(objJsonDeserializer20);
        org.junit.Assert.assertNull(wildcardClass21);
        org.junit.Assert.assertNull(objJsonDeserializer30);
        org.junit.Assert.assertNull(objJsonDeserializer31);
        org.junit.Assert.assertNotNull(collectionDeserializer33);
        org.junit.Assert.assertNull(typeDeserializer34);
        org.junit.Assert.assertNull(objCollection35);
        org.junit.Assert.assertNull(objCollection36);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer38);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = collectionDeserializer7.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer9 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer7);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer10 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer7);
        java.util.Collection<java.lang.Object> objCollection11 = collectionDeserializer10.getEmptyValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer12 = collectionDeserializer10._valueTypeDeserializer;
        java.lang.Boolean boolean13 = collectionDeserializer10._unwrapSingle;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator14 = collectionDeserializer10._valueInstantiator;
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objCollection11);
        org.junit.Assert.assertNull(typeDeserializer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(valueInstantiator14);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer4 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer11 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType5, objJsonDeserializer6, typeDeserializer7, valueInstantiator8, objJsonDeserializer9, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer12 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer11);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = collectionDeserializer12.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer14 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer12);
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer17 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer21 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType15, objJsonDeserializer16, typeDeserializer17, valueInstantiator18, objJsonDeserializer19, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer22 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer21);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer23 = collectionDeserializer21.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer24 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer26 = collectionDeserializer4.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer12, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer21, typeDeserializer24, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator27 = collectionDeserializer26._valueInstantiator;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator28 = collectionDeserializer26._valueInstantiator;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext29 = null;
        java.util.Collection<java.lang.Object> objCollection30 = collectionDeserializer26.getNullValue(deserializationContext29);
        com.fasterxml.jackson.databind.JavaType javaType31 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer32 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer33 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator34 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer35 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType31, objJsonDeserializer32, typeDeserializer33, valueInstantiator34);
        com.fasterxml.jackson.databind.JavaType javaType36 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer37 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer38 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator39 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer40 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer42 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType36, objJsonDeserializer37, typeDeserializer38, valueInstantiator39, objJsonDeserializer40, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer43 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer42);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer44 = collectionDeserializer43.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer45 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer43);
        com.fasterxml.jackson.databind.JavaType javaType46 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer47 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer48 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator49 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer50 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer52 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType46, objJsonDeserializer47, typeDeserializer48, valueInstantiator49, objJsonDeserializer50, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer53 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer52);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer54 = collectionDeserializer52.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer55 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer57 = collectionDeserializer35.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer43, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer52, typeDeserializer55, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer58 = collectionDeserializer43._valueDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType59 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer60 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer61 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator62 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer63 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer65 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType59, objJsonDeserializer60, typeDeserializer61, valueInstantiator62, objJsonDeserializer63, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer66 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer65);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer67 = collectionDeserializer66.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer68 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer66);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer69 = collectionDeserializer68._valueTypeDeserializer;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer70 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer68);
        com.fasterxml.jackson.databind.JavaType javaType71 = collectionDeserializer70._collectionType;
        com.fasterxml.jackson.databind.JavaType javaType72 = collectionDeserializer70.getValueType();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer73 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer75 = collectionDeserializer26.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer43, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer70, typeDeserializer73, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer76 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer43);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer77 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer43);
        com.fasterxml.jackson.databind.JavaType javaType78 = collectionDeserializer43.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser79 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext80 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Object> objCollection81 = collectionDeserializer43.deserialize(jsonParser79, deserializationContext80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertNull(objJsonDeserializer23);
        org.junit.Assert.assertNotNull(collectionDeserializer26);
        org.junit.Assert.assertNull(valueInstantiator27);
        org.junit.Assert.assertNull(valueInstantiator28);
        org.junit.Assert.assertNull(objCollection30);
        org.junit.Assert.assertNull(objJsonDeserializer44);
        org.junit.Assert.assertNull(objJsonDeserializer54);
        org.junit.Assert.assertNotNull(collectionDeserializer57);
        org.junit.Assert.assertNull(objJsonDeserializer58);
        org.junit.Assert.assertNull(objJsonDeserializer67);
        org.junit.Assert.assertNull(typeDeserializer69);
        org.junit.Assert.assertNull(javaType71);
        org.junit.Assert.assertNull(javaType72);
        org.junit.Assert.assertNotNull(collectionDeserializer75);
        org.junit.Assert.assertNull(javaType78);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer4 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer11 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType5, objJsonDeserializer6, typeDeserializer7, valueInstantiator8, objJsonDeserializer9, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer12 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer11);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = collectionDeserializer12.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer14 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer12);
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer17 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer21 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType15, objJsonDeserializer16, typeDeserializer17, valueInstantiator18, objJsonDeserializer19, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer22 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer21);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer23 = collectionDeserializer21.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer24 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer26 = collectionDeserializer4.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer12, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer21, typeDeserializer24, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator27 = collectionDeserializer26._valueInstantiator;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator28 = collectionDeserializer26._valueInstantiator;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext29 = null;
        java.util.Collection<java.lang.Object> objCollection30 = collectionDeserializer26.getNullValue(deserializationContext29);
        java.util.Collection<java.lang.Object> objCollection31 = collectionDeserializer26.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer32 = collectionDeserializer26._valueDeserializer;
        boolean boolean33 = collectionDeserializer26.isCachable();
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertNull(objJsonDeserializer23);
        org.junit.Assert.assertNotNull(collectionDeserializer26);
        org.junit.Assert.assertNull(valueInstantiator27);
        org.junit.Assert.assertNull(valueInstantiator28);
        org.junit.Assert.assertNull(objCollection30);
        org.junit.Assert.assertNull(objCollection31);
        org.junit.Assert.assertNotNull(objJsonDeserializer32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = collectionDeserializer6.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = collectionDeserializer6._delegateDeserializer;
        java.lang.Boolean boolean9 = collectionDeserializer6._unwrapSingle;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = collectionDeserializer6.getContentDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer13 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator14 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer15 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType11, objJsonDeserializer12, typeDeserializer13, valueInstantiator14);
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer17 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer18 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator19 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer20 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer22 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType16, objJsonDeserializer17, typeDeserializer18, valueInstantiator19, objJsonDeserializer20, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer23 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer22);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer24 = collectionDeserializer23.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer23);
        com.fasterxml.jackson.databind.JavaType javaType26 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer27 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer28 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator29 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer30 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer32 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType26, objJsonDeserializer27, typeDeserializer28, valueInstantiator29, objJsonDeserializer30, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer33 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer32);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer34 = collectionDeserializer32.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer35 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer37 = collectionDeserializer15.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer23, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer32, typeDeserializer35, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType38 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer39 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer40 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator41 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer42 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer44 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType38, objJsonDeserializer39, typeDeserializer40, valueInstantiator41, objJsonDeserializer42, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer45 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer44);
        com.fasterxml.jackson.databind.JavaType javaType46 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer47 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer48 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator49 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer50 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer52 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType46, objJsonDeserializer47, typeDeserializer48, valueInstantiator49, objJsonDeserializer50, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer53 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer52);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer54 = collectionDeserializer53.getContentDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType55 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer56 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer57 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator58 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer59 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer61 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType55, objJsonDeserializer56, typeDeserializer57, valueInstantiator58, objJsonDeserializer59, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer62 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer61);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer63 = collectionDeserializer62.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer64 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer62);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer65 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer66 = collectionDeserializer44.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer53, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer62, typeDeserializer65);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer67 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer68 = collectionDeserializer6.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer15, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer66, typeDeserializer67);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer69 = collectionDeserializer66.getContentDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext70 = null;
        java.util.Collection<java.lang.Object> objCollection71 = collectionDeserializer66.getNullValue(deserializationContext70);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer72 = collectionDeserializer66._delegateDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType73 = collectionDeserializer66._collectionType;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer74 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer66);
        java.lang.Class<?> wildcardClass75 = collectionDeserializer74.handledType();
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(objJsonDeserializer10);
        org.junit.Assert.assertNull(objJsonDeserializer24);
        org.junit.Assert.assertNull(objJsonDeserializer34);
        org.junit.Assert.assertNotNull(collectionDeserializer37);
        org.junit.Assert.assertNull(objJsonDeserializer54);
        org.junit.Assert.assertNull(objJsonDeserializer63);
        org.junit.Assert.assertNotNull(collectionDeserializer66);
        org.junit.Assert.assertNotNull(collectionDeserializer68);
        org.junit.Assert.assertNotNull(objJsonDeserializer69);
        org.junit.Assert.assertNull(objCollection71);
        org.junit.Assert.assertNotNull(objJsonDeserializer72);
        org.junit.Assert.assertNull(javaType73);
        org.junit.Assert.assertNull(wildcardClass75);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer14 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType8, objJsonDeserializer9, typeDeserializer10, valueInstantiator11, objJsonDeserializer12, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer15 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer14);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = collectionDeserializer15.getContentDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer18 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer19 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator20 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer21 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer23 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType17, objJsonDeserializer18, typeDeserializer19, valueInstantiator20, objJsonDeserializer21, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer24 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer23);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer25 = collectionDeserializer24.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer24);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer27 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer28 = collectionDeserializer6.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer15, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer24, typeDeserializer27);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer29 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer30 = collectionDeserializer15.unwrappingDeserializer(nameTransformer29);
        java.lang.Boolean boolean31 = collectionDeserializer15._unwrapSingle;
        org.junit.Assert.assertNull(objJsonDeserializer16);
        org.junit.Assert.assertNull(objJsonDeserializer25);
        org.junit.Assert.assertNotNull(collectionDeserializer28);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = collectionDeserializer7.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer9 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer7);
        java.util.Collection<java.lang.Object> objCollection10 = collectionDeserializer7.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.util.Collection<java.lang.Object> objCollection12 = collectionDeserializer7.getNullValue(deserializationContext11);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = collectionDeserializer7._delegateDeserializer;
        java.lang.Boolean boolean14 = collectionDeserializer7._unwrapSingle;
        java.util.Collection<java.lang.Object> objCollection15 = collectionDeserializer7.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType16 = collectionDeserializer7.getValueType();
        java.util.Collection<java.lang.Object> objCollection17 = collectionDeserializer7.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer18 = collectionDeserializer7.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType19 = collectionDeserializer7.getValueType();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer20 = collectionDeserializer7._valueTypeDeserializer;
        com.fasterxml.jackson.core.JsonParser jsonParser21 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Object> objCollection23 = collectionDeserializer7.deserialize(jsonParser21, deserializationContext22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(objCollection12);
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(objCollection15);
        org.junit.Assert.assertNull(javaType16);
        org.junit.Assert.assertNull(objCollection17);
        org.junit.Assert.assertNull(wildcardJsonDeserializer18);
        org.junit.Assert.assertNull(javaType19);
        org.junit.Assert.assertNull(typeDeserializer20);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer4 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer11 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType5, objJsonDeserializer6, typeDeserializer7, valueInstantiator8, objJsonDeserializer9, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer12 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer11);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = collectionDeserializer12.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer14 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer12);
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer17 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer21 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType15, objJsonDeserializer16, typeDeserializer17, valueInstantiator18, objJsonDeserializer19, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer22 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer21);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer23 = collectionDeserializer21.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer24 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer26 = collectionDeserializer4.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer12, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer21, typeDeserializer24, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator27 = collectionDeserializer26._valueInstantiator;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer28 = collectionDeserializer26._valueDeserializer;
        boolean boolean29 = collectionDeserializer26.isCachable();
        java.util.Collection<java.lang.Object> objCollection30 = collectionDeserializer26.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext31 = null;
        java.util.Collection<java.lang.Object> objCollection32 = collectionDeserializer26.getNullValue(deserializationContext31);
        java.util.Collection<java.lang.Object> objCollection33 = collectionDeserializer26.getEmptyValue();
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertNull(objJsonDeserializer23);
        org.junit.Assert.assertNotNull(collectionDeserializer26);
        org.junit.Assert.assertNull(valueInstantiator27);
        org.junit.Assert.assertNotNull(objJsonDeserializer28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(objCollection30);
        org.junit.Assert.assertNull(objCollection32);
        org.junit.Assert.assertNull(objCollection33);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = collectionDeserializer7.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer9 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer7);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = collectionDeserializer9._valueTypeDeserializer;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer11 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer9);
        java.lang.Class<?> wildcardClass12 = collectionDeserializer11.handledType();
        java.util.Collection<java.lang.Object> objCollection13 = collectionDeserializer11.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = collectionDeserializer11.getContentDeserializer();
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(typeDeserializer10);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNull(objCollection13);
        org.junit.Assert.assertNull(objJsonDeserializer14);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = collectionDeserializer7.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer9 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer7);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = collectionDeserializer9._valueTypeDeserializer;
        java.util.Collection<java.lang.Object> objCollection11 = collectionDeserializer9.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection12 = collectionDeserializer9.getNullValue();
        java.util.Collection<java.lang.Object> objCollection13 = collectionDeserializer9.getNullValue();
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator14 = collectionDeserializer9._valueInstantiator;
        com.fasterxml.jackson.core.JsonParser jsonParser15 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Object> objCollection17 = collectionDeserializer9.deserialize(jsonParser15, deserializationContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(typeDeserializer10);
        org.junit.Assert.assertNull(objCollection11);
        org.junit.Assert.assertNull(objCollection12);
        org.junit.Assert.assertNull(objCollection13);
        org.junit.Assert.assertNull(valueInstantiator14);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer4 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer11 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType5, objJsonDeserializer6, typeDeserializer7, valueInstantiator8, objJsonDeserializer9, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer12 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer11);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = collectionDeserializer12.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer14 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer12);
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer17 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer21 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType15, objJsonDeserializer16, typeDeserializer17, valueInstantiator18, objJsonDeserializer19, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer22 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer21);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer23 = collectionDeserializer21.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer24 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer26 = collectionDeserializer4.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer12, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer21, typeDeserializer24, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer27 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer12);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer28 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer27);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer29 = collectionDeserializer28._valueDeserializer;
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertNull(objJsonDeserializer23);
        org.junit.Assert.assertNotNull(collectionDeserializer26);
        org.junit.Assert.assertNull(objJsonDeserializer29);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer4 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer11 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType5, objJsonDeserializer6, typeDeserializer7, valueInstantiator8, objJsonDeserializer9, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer12 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer11);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = collectionDeserializer12.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer14 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer12);
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer17 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer21 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType15, objJsonDeserializer16, typeDeserializer17, valueInstantiator18, objJsonDeserializer19, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer22 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer21);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer23 = collectionDeserializer21.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer24 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer26 = collectionDeserializer4.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer12, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer21, typeDeserializer24, (java.lang.Boolean) true);
        java.util.Collection<java.lang.Object> objCollection27 = collectionDeserializer4.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer28 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer4);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty30 = collectionDeserializer28.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: container deserializer of type com.fasterxml.jackson.databind.deser.std.CollectionDeserializer returned null for 'getContentDeserializer()'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertNull(objJsonDeserializer23);
        org.junit.Assert.assertNotNull(collectionDeserializer26);
        org.junit.Assert.assertNull(objCollection27);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = collectionDeserializer7.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer9 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer7);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = collectionDeserializer9._valueTypeDeserializer;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer11 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer9);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer12 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer11);
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer15 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator16 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer17 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType13, objJsonDeserializer14, typeDeserializer15, valueInstantiator16);
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer20 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator21 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer22 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer24 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType18, objJsonDeserializer19, typeDeserializer20, valueInstantiator21, objJsonDeserializer22, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer24);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer26 = collectionDeserializer25.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer27 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer25);
        com.fasterxml.jackson.databind.JavaType javaType28 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer29 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer30 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator31 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer32 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer34 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType28, objJsonDeserializer29, typeDeserializer30, valueInstantiator31, objJsonDeserializer32, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer35 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer34);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer36 = collectionDeserializer34.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer37 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer39 = collectionDeserializer17.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer25, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer34, typeDeserializer37, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator40 = collectionDeserializer39._valueInstantiator;
        com.fasterxml.jackson.databind.JavaType javaType41 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer42 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer43 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator44 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer45 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType41, objJsonDeserializer42, typeDeserializer43, valueInstantiator44);
        com.fasterxml.jackson.databind.JavaType javaType46 = collectionDeserializer45.getValueType();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer47 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer48 = collectionDeserializer12.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer39, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer45, typeDeserializer47);
        java.lang.Class<?> wildcardClass49 = collectionDeserializer48.getValueClass();
        java.lang.Class<?> wildcardClass50 = collectionDeserializer48.getValueClass();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer51 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer48);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext52 = null;
        java.util.Collection<java.lang.Object> objCollection53 = collectionDeserializer48.getNullValue(deserializationContext52);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(typeDeserializer10);
        org.junit.Assert.assertNull(objJsonDeserializer26);
        org.junit.Assert.assertNull(objJsonDeserializer36);
        org.junit.Assert.assertNotNull(collectionDeserializer39);
        org.junit.Assert.assertNull(valueInstantiator40);
        org.junit.Assert.assertNull(javaType46);
        org.junit.Assert.assertNotNull(collectionDeserializer48);
        org.junit.Assert.assertNull(wildcardClass49);
        org.junit.Assert.assertNull(wildcardClass50);
        org.junit.Assert.assertNull(objCollection53);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = collectionDeserializer6.getContentDeserializer();
        java.util.Collection<java.lang.Object> objCollection8 = collectionDeserializer6.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = collectionDeserializer6.deserializeWithType(jsonParser9, deserializationContext10, typeDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(objCollection8);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer4 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer11 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType5, objJsonDeserializer6, typeDeserializer7, valueInstantiator8, objJsonDeserializer9, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer12 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer11);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = collectionDeserializer12.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer14 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer12);
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer17 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer21 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType15, objJsonDeserializer16, typeDeserializer17, valueInstantiator18, objJsonDeserializer19, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer22 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer21);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer23 = collectionDeserializer21.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer24 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer26 = collectionDeserializer4.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer12, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer21, typeDeserializer24, (java.lang.Boolean) true);
        java.lang.Class<?> wildcardClass27 = collectionDeserializer21.handledType();
        com.fasterxml.jackson.databind.JavaType javaType28 = collectionDeserializer21.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType29 = collectionDeserializer21._collectionType;
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertNull(objJsonDeserializer23);
        org.junit.Assert.assertNotNull(collectionDeserializer26);
        org.junit.Assert.assertNull(wildcardClass27);
        org.junit.Assert.assertNull(javaType28);
        org.junit.Assert.assertNull(javaType29);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer4 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer11 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType5, objJsonDeserializer6, typeDeserializer7, valueInstantiator8, objJsonDeserializer9, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer12 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer11);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = collectionDeserializer12.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer14 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer12);
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer17 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer21 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType15, objJsonDeserializer16, typeDeserializer17, valueInstantiator18, objJsonDeserializer19, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer22 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer21);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer23 = collectionDeserializer21.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer24 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer26 = collectionDeserializer4.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer12, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer21, typeDeserializer24, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator27 = collectionDeserializer26._valueInstantiator;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator28 = collectionDeserializer26._valueInstantiator;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext29 = null;
        java.util.Collection<java.lang.Object> objCollection30 = collectionDeserializer26.getNullValue(deserializationContext29);
        com.fasterxml.jackson.databind.JavaType javaType31 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer32 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer33 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator34 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer35 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType31, objJsonDeserializer32, typeDeserializer33, valueInstantiator34);
        com.fasterxml.jackson.databind.JavaType javaType36 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer37 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer38 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator39 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer40 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer42 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType36, objJsonDeserializer37, typeDeserializer38, valueInstantiator39, objJsonDeserializer40, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer43 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer42);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer44 = collectionDeserializer43.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer45 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer43);
        com.fasterxml.jackson.databind.JavaType javaType46 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer47 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer48 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator49 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer50 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer52 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType46, objJsonDeserializer47, typeDeserializer48, valueInstantiator49, objJsonDeserializer50, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer53 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer52);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer54 = collectionDeserializer52.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer55 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer57 = collectionDeserializer35.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer43, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer52, typeDeserializer55, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer58 = collectionDeserializer43._valueDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType59 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer60 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer61 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator62 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer63 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer65 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType59, objJsonDeserializer60, typeDeserializer61, valueInstantiator62, objJsonDeserializer63, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer66 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer65);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer67 = collectionDeserializer66.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer68 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer66);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer69 = collectionDeserializer68._valueTypeDeserializer;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer70 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer68);
        com.fasterxml.jackson.databind.JavaType javaType71 = collectionDeserializer70._collectionType;
        com.fasterxml.jackson.databind.JavaType javaType72 = collectionDeserializer70.getValueType();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer73 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer75 = collectionDeserializer26.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer43, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer70, typeDeserializer73, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader76 = collectionDeserializer70.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer77 = collectionDeserializer70._delegateDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer78 = collectionDeserializer70.getContentDeserializer();
        boolean boolean79 = collectionDeserializer70.isCachable();
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertNull(objJsonDeserializer23);
        org.junit.Assert.assertNotNull(collectionDeserializer26);
        org.junit.Assert.assertNull(valueInstantiator27);
        org.junit.Assert.assertNull(valueInstantiator28);
        org.junit.Assert.assertNull(objCollection30);
        org.junit.Assert.assertNull(objJsonDeserializer44);
        org.junit.Assert.assertNull(objJsonDeserializer54);
        org.junit.Assert.assertNotNull(collectionDeserializer57);
        org.junit.Assert.assertNull(objJsonDeserializer58);
        org.junit.Assert.assertNull(objJsonDeserializer67);
        org.junit.Assert.assertNull(typeDeserializer69);
        org.junit.Assert.assertNull(javaType71);
        org.junit.Assert.assertNull(javaType72);
        org.junit.Assert.assertNotNull(collectionDeserializer75);
        org.junit.Assert.assertNull(objectIdReader76);
        org.junit.Assert.assertNull(objJsonDeserializer77);
        org.junit.Assert.assertNull(objJsonDeserializer78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer14 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType8, objJsonDeserializer9, typeDeserializer10, valueInstantiator11, objJsonDeserializer12, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer15 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer14);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = collectionDeserializer15.getContentDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer18 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer19 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator20 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer21 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer23 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType17, objJsonDeserializer18, typeDeserializer19, valueInstantiator20, objJsonDeserializer21, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer24 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer23);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer25 = collectionDeserializer24.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer24);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer27 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer28 = collectionDeserializer6.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer15, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer24, typeDeserializer27);
        com.fasterxml.jackson.databind.JavaType javaType29 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer30 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer31 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator32 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer33 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer35 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType29, objJsonDeserializer30, typeDeserializer31, valueInstantiator32, objJsonDeserializer33, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType36 = collectionDeserializer35.getValueType();
        java.util.Collection<java.lang.Object> objCollection37 = collectionDeserializer35.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer38 = collectionDeserializer35._valueDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer39 = collectionDeserializer35._delegateDeserializer;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer40 = collectionDeserializer35._valueTypeDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType41 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer42 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer43 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator44 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer45 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer47 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType41, objJsonDeserializer42, typeDeserializer43, valueInstantiator44, objJsonDeserializer45, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer48 = collectionDeserializer47.getContentDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer49 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer50 = collectionDeserializer47.unwrappingDeserializer(nameTransformer49);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer51 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer53 = collectionDeserializer6.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer35, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer47, typeDeserializer51, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType54 = collectionDeserializer47._collectionType;
        java.util.Collection<java.lang.Object> objCollection55 = collectionDeserializer47.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer56 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer57 = collectionDeserializer47.unwrappingDeserializer(nameTransformer56);
        org.junit.Assert.assertNull(objJsonDeserializer16);
        org.junit.Assert.assertNull(objJsonDeserializer25);
        org.junit.Assert.assertNotNull(collectionDeserializer28);
        org.junit.Assert.assertNull(javaType36);
        org.junit.Assert.assertNull(objCollection37);
        org.junit.Assert.assertNull(objJsonDeserializer38);
        org.junit.Assert.assertNull(objJsonDeserializer39);
        org.junit.Assert.assertNull(typeDeserializer40);
        org.junit.Assert.assertNull(objJsonDeserializer48);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer50);
        org.junit.Assert.assertNotNull(collectionDeserializer53);
        org.junit.Assert.assertNull(javaType54);
        org.junit.Assert.assertNull(objCollection55);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer57);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = collectionDeserializer7.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer9 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer7);
        java.util.Collection<java.lang.Object> objCollection10 = collectionDeserializer7.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.util.Collection<java.lang.Object> objCollection12 = collectionDeserializer7.getNullValue(deserializationContext11);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = collectionDeserializer7._delegateDeserializer;
        java.lang.Boolean boolean14 = collectionDeserializer7._unwrapSingle;
        java.util.Collection<java.lang.Object> objCollection15 = collectionDeserializer7.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        java.util.Collection<java.lang.Object> objCollection17 = collectionDeserializer7.getNullValue(deserializationContext16);
        java.util.Collection<java.lang.Object> objCollection18 = collectionDeserializer7.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty20 = collectionDeserializer7.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: container deserializer of type com.fasterxml.jackson.databind.deser.std.CollectionDeserializer returned null for 'getContentDeserializer()'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(objCollection12);
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(objCollection15);
        org.junit.Assert.assertNull(objCollection17);
        org.junit.Assert.assertNull(objCollection18);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = collectionDeserializer7.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer9 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer7);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer10 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer7);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = collectionDeserializer10._delegateDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = collectionDeserializer10.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer14 = collectionDeserializer10.unwrappingDeserializer(nameTransformer13);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        java.util.Collection<java.lang.Object> objCollection16 = objCollectionJsonDeserializer14.getNullValue(deserializationContext15);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objJsonDeserializer11);
        org.junit.Assert.assertNull(wildcardJsonDeserializer12);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer14);
        org.junit.Assert.assertNull(objCollection16);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = collectionDeserializer6.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator8 = collectionDeserializer6._valueInstantiator;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator9 = collectionDeserializer6._valueInstantiator;
        java.lang.Class<?> wildcardClass10 = collectionDeserializer6.handledType();
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer13 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer17 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType11, objJsonDeserializer12, typeDeserializer13, valueInstantiator14, objJsonDeserializer15, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer18 = collectionDeserializer17.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = collectionDeserializer17._delegateDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer21 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer22 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator23 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer24 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType20, objJsonDeserializer21, typeDeserializer22, valueInstantiator23, objJsonDeserializer24, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer27 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer26);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer28 = collectionDeserializer27.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer29 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer27);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer30 = collectionDeserializer29._valueTypeDeserializer;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer31 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer29);
        com.fasterxml.jackson.databind.JavaType javaType32 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer33 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer34 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator35 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer36 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer38 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType32, objJsonDeserializer33, typeDeserializer34, valueInstantiator35, objJsonDeserializer36, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer39 = collectionDeserializer38.getDelegatee();
        java.lang.Class<?> wildcardClass40 = collectionDeserializer38.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer41 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer42 = collectionDeserializer38.unwrappingDeserializer(nameTransformer41);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer43 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer45 = collectionDeserializer17.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer31, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer38, typeDeserializer43, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType46 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer47 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer48 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator49 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer50 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer52 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType46, objJsonDeserializer47, typeDeserializer48, valueInstantiator49, objJsonDeserializer50, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer53 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer52);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer54 = collectionDeserializer53.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer55 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer53);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer56 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer53);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer57 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer58 = collectionDeserializer56.unwrappingDeserializer(nameTransformer57);
        java.lang.Class<?> wildcardClass59 = collectionDeserializer56.handledType();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer60 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer62 = collectionDeserializer6.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer38, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer56, typeDeserializer60, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer63 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer64 = collectionDeserializer56.unwrappingDeserializer(nameTransformer63);
        java.util.Collection<java.lang.Object> objCollection65 = collectionDeserializer56.getKnownPropertyNames();
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(valueInstantiator8);
        org.junit.Assert.assertNull(valueInstantiator9);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer18);
        org.junit.Assert.assertNull(objJsonDeserializer19);
        org.junit.Assert.assertNull(objJsonDeserializer28);
        org.junit.Assert.assertNull(typeDeserializer30);
        org.junit.Assert.assertNull(wildcardJsonDeserializer39);
        org.junit.Assert.assertNull(wildcardClass40);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer42);
        org.junit.Assert.assertNotNull(collectionDeserializer45);
        org.junit.Assert.assertNull(objJsonDeserializer54);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer58);
        org.junit.Assert.assertNull(wildcardClass59);
        org.junit.Assert.assertNotNull(collectionDeserializer62);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer64);
        org.junit.Assert.assertNull(objCollection65);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer3 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer5 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType1, objJsonDeserializer2, typeDeserializer3, valueInstantiator4);
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer12 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType6, objJsonDeserializer7, typeDeserializer8, valueInstantiator9, objJsonDeserializer10, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer13 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer12);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = collectionDeserializer13.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer15 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer13);
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer17 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer18 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator19 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer20 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer22 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType16, objJsonDeserializer17, typeDeserializer18, valueInstantiator19, objJsonDeserializer20, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer23 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer22);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer24 = collectionDeserializer22.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer25 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer27 = collectionDeserializer5.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer13, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer22, typeDeserializer25, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext28 = null;
        java.util.Collection<java.lang.Object> objCollection29 = collectionDeserializer27.getEmptyValue(deserializationContext28);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader30 = collectionDeserializer27.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer31 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer32 = collectionDeserializer27.unwrappingDeserializer(nameTransformer31);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer33 = collectionDeserializer27._valueDeserializer;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer34 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator35 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer36 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer33, typeDeserializer34, valueInstantiator35);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext37 = null;
        java.util.Collection<java.lang.Object> objCollection38 = collectionDeserializer36.getEmptyValue(deserializationContext37);
        org.junit.Assert.assertNull(objJsonDeserializer14);
        org.junit.Assert.assertNull(objJsonDeserializer24);
        org.junit.Assert.assertNotNull(collectionDeserializer27);
        org.junit.Assert.assertNull(objCollection29);
        org.junit.Assert.assertNull(objectIdReader30);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer32);
        org.junit.Assert.assertNotNull(objJsonDeserializer33);
        org.junit.Assert.assertNull(objCollection38);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer14 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType8, objJsonDeserializer9, typeDeserializer10, valueInstantiator11, objJsonDeserializer12, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer15 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer14);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = collectionDeserializer15.getContentDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer18 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer19 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator20 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer21 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer23 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType17, objJsonDeserializer18, typeDeserializer19, valueInstantiator20, objJsonDeserializer21, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer24 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer23);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer25 = collectionDeserializer24.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer24);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer27 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer28 = collectionDeserializer6.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer15, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer24, typeDeserializer27);
        boolean boolean29 = collectionDeserializer24.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer30 = collectionDeserializer24._delegateDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType31 = collectionDeserializer24.getValueType();
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator32 = collectionDeserializer24._valueInstantiator;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader33 = collectionDeserializer24.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator34 = collectionDeserializer24._valueInstantiator;
        org.junit.Assert.assertNull(objJsonDeserializer16);
        org.junit.Assert.assertNull(objJsonDeserializer25);
        org.junit.Assert.assertNotNull(collectionDeserializer28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(objJsonDeserializer30);
        org.junit.Assert.assertNull(javaType31);
        org.junit.Assert.assertNull(valueInstantiator32);
        org.junit.Assert.assertNull(objectIdReader33);
        org.junit.Assert.assertNull(valueInstantiator34);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer4 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer11 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType5, objJsonDeserializer6, typeDeserializer7, valueInstantiator8, objJsonDeserializer9, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer12 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer11);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = collectionDeserializer12.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer14 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer12);
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer17 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer21 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType15, objJsonDeserializer16, typeDeserializer17, valueInstantiator18, objJsonDeserializer19, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer22 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer21);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer23 = collectionDeserializer21.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer24 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer26 = collectionDeserializer4.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer12, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer21, typeDeserializer24, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator27 = collectionDeserializer26._valueInstantiator;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator28 = collectionDeserializer26._valueInstantiator;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext29 = null;
        java.util.Collection<java.lang.Object> objCollection30 = collectionDeserializer26.getNullValue(deserializationContext29);
        com.fasterxml.jackson.databind.JavaType javaType31 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer32 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer33 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator34 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer35 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType31, objJsonDeserializer32, typeDeserializer33, valueInstantiator34);
        com.fasterxml.jackson.databind.JavaType javaType36 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer37 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer38 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator39 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer40 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer42 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType36, objJsonDeserializer37, typeDeserializer38, valueInstantiator39, objJsonDeserializer40, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer43 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer42);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer44 = collectionDeserializer43.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer45 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer43);
        com.fasterxml.jackson.databind.JavaType javaType46 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer47 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer48 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator49 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer50 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer52 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType46, objJsonDeserializer47, typeDeserializer48, valueInstantiator49, objJsonDeserializer50, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer53 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer52);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer54 = collectionDeserializer52.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer55 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer57 = collectionDeserializer35.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer43, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer52, typeDeserializer55, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer58 = collectionDeserializer43._valueDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType59 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer60 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer61 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator62 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer63 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer65 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType59, objJsonDeserializer60, typeDeserializer61, valueInstantiator62, objJsonDeserializer63, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer66 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer65);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer67 = collectionDeserializer66.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer68 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer66);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer69 = collectionDeserializer68._valueTypeDeserializer;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer70 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer68);
        com.fasterxml.jackson.databind.JavaType javaType71 = collectionDeserializer70._collectionType;
        com.fasterxml.jackson.databind.JavaType javaType72 = collectionDeserializer70.getValueType();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer73 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer75 = collectionDeserializer26.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer43, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer70, typeDeserializer73, (java.lang.Boolean) false);
        java.util.Collection<java.lang.Object> objCollection76 = collectionDeserializer75.getNullValue();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer77 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer75);
        com.fasterxml.jackson.databind.JavaType javaType78 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer79 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer80 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator81 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer82 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType78, objJsonDeserializer79, typeDeserializer80, valueInstantiator81);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer83 = collectionDeserializer82._valueTypeDeserializer;
        java.util.Collection<java.lang.Object> objCollection84 = collectionDeserializer82.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer85 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer82);
        com.fasterxml.jackson.databind.JavaType javaType86 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer87 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer88 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator89 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer90 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer92 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType86, objJsonDeserializer87, typeDeserializer88, valueInstantiator89, objJsonDeserializer90, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.JavaType javaType93 = collectionDeserializer92._collectionType;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer94 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer95 = collectionDeserializer77.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer85, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer92, typeDeserializer94);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer96 = collectionDeserializer92.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType97 = collectionDeserializer92._collectionType;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType98 = collectionDeserializer92.getContentType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertNull(objJsonDeserializer23);
        org.junit.Assert.assertNotNull(collectionDeserializer26);
        org.junit.Assert.assertNull(valueInstantiator27);
        org.junit.Assert.assertNull(valueInstantiator28);
        org.junit.Assert.assertNull(objCollection30);
        org.junit.Assert.assertNull(objJsonDeserializer44);
        org.junit.Assert.assertNull(objJsonDeserializer54);
        org.junit.Assert.assertNotNull(collectionDeserializer57);
        org.junit.Assert.assertNull(objJsonDeserializer58);
        org.junit.Assert.assertNull(objJsonDeserializer67);
        org.junit.Assert.assertNull(typeDeserializer69);
        org.junit.Assert.assertNull(javaType71);
        org.junit.Assert.assertNull(javaType72);
        org.junit.Assert.assertNotNull(collectionDeserializer75);
        org.junit.Assert.assertNull(objCollection76);
        org.junit.Assert.assertNull(typeDeserializer83);
        org.junit.Assert.assertNull(objCollection84);
        org.junit.Assert.assertNull(javaType93);
        org.junit.Assert.assertNotNull(collectionDeserializer95);
        org.junit.Assert.assertNull(wildcardJsonDeserializer96);
        org.junit.Assert.assertNull(javaType97);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer4 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer11 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType5, objJsonDeserializer6, typeDeserializer7, valueInstantiator8, objJsonDeserializer9, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer12 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer11);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = collectionDeserializer12.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer14 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer12);
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer17 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer21 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType15, objJsonDeserializer16, typeDeserializer17, valueInstantiator18, objJsonDeserializer19, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer22 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer21);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer23 = collectionDeserializer21.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer24 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer26 = collectionDeserializer4.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer12, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer21, typeDeserializer24, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator27 = collectionDeserializer26._valueInstantiator;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator28 = collectionDeserializer26._valueInstantiator;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext29 = null;
        java.util.Collection<java.lang.Object> objCollection30 = collectionDeserializer26.getNullValue(deserializationContext29);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer31 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer32 = collectionDeserializer26.unwrappingDeserializer(nameTransformer31);
        java.util.Collection<java.lang.Object> objCollection33 = collectionDeserializer26.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader34 = collectionDeserializer26.getObjectIdReader();
        boolean boolean35 = collectionDeserializer26.isCachable();
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertNull(objJsonDeserializer23);
        org.junit.Assert.assertNotNull(collectionDeserializer26);
        org.junit.Assert.assertNull(valueInstantiator27);
        org.junit.Assert.assertNull(valueInstantiator28);
        org.junit.Assert.assertNull(objCollection30);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer32);
        org.junit.Assert.assertNull(objCollection33);
        org.junit.Assert.assertNull(objectIdReader34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer8 = collectionDeserializer6.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.JavaType javaType9 = collectionDeserializer6._collectionType;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer12 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer16 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType10, objJsonDeserializer11, typeDeserializer12, valueInstantiator13, objJsonDeserializer14, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer17 = collectionDeserializer16.getDelegatee();
        java.lang.Class<?> wildcardClass18 = collectionDeserializer16.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer19 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer20 = collectionDeserializer16.unwrappingDeserializer(nameTransformer19);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader21 = collectionDeserializer16.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer22 = collectionDeserializer16._delegateDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType23 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer24 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer25 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator26 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer27 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer29 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType23, objJsonDeserializer24, typeDeserializer25, valueInstantiator26, objJsonDeserializer27, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer30 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer29);
        com.fasterxml.jackson.databind.JavaType javaType31 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer32 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer33 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator34 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer35 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer37 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType31, objJsonDeserializer32, typeDeserializer33, valueInstantiator34, objJsonDeserializer35, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer38 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer37);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer39 = collectionDeserializer38.getContentDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType40 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer41 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer42 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator43 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer44 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer46 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType40, objJsonDeserializer41, typeDeserializer42, valueInstantiator43, objJsonDeserializer44, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer47 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer46);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer48 = collectionDeserializer47.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer49 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer47);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer50 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer51 = collectionDeserializer29.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer38, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer47, typeDeserializer50);
        com.fasterxml.jackson.databind.JavaType javaType52 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer53 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer54 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator55 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer56 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer58 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType52, objJsonDeserializer53, typeDeserializer54, valueInstantiator55, objJsonDeserializer56, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType59 = collectionDeserializer58.getValueType();
        java.util.Collection<java.lang.Object> objCollection60 = collectionDeserializer58.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer61 = collectionDeserializer58._valueDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer62 = collectionDeserializer58._delegateDeserializer;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer63 = collectionDeserializer58._valueTypeDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType64 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer65 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer66 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator67 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer68 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer70 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType64, objJsonDeserializer65, typeDeserializer66, valueInstantiator67, objJsonDeserializer68, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer71 = collectionDeserializer70.getContentDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer72 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer73 = collectionDeserializer70.unwrappingDeserializer(nameTransformer72);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer74 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer76 = collectionDeserializer29.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer58, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer70, typeDeserializer74, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType77 = collectionDeserializer70._collectionType;
        com.fasterxml.jackson.databind.JavaType javaType78 = collectionDeserializer70.getValueType();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer79 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer70);
        boolean boolean80 = collectionDeserializer79.isCachable();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer81 = collectionDeserializer79._valueTypeDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType82 = collectionDeserializer79.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext83 = null;
        java.util.Collection<java.lang.Object> objCollection84 = collectionDeserializer79.getNullValue(deserializationContext83);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer85 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer87 = collectionDeserializer6.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer16, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer79, typeDeserializer85, (java.lang.Boolean) false);
        java.lang.Boolean boolean88 = collectionDeserializer87._unwrapSingle;
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer17);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer20);
        org.junit.Assert.assertNull(objectIdReader21);
        org.junit.Assert.assertNull(objJsonDeserializer22);
        org.junit.Assert.assertNull(objJsonDeserializer39);
        org.junit.Assert.assertNull(objJsonDeserializer48);
        org.junit.Assert.assertNotNull(collectionDeserializer51);
        org.junit.Assert.assertNull(javaType59);
        org.junit.Assert.assertNull(objCollection60);
        org.junit.Assert.assertNull(objJsonDeserializer61);
        org.junit.Assert.assertNull(objJsonDeserializer62);
        org.junit.Assert.assertNull(typeDeserializer63);
        org.junit.Assert.assertNull(objJsonDeserializer71);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer73);
        org.junit.Assert.assertNotNull(collectionDeserializer76);
        org.junit.Assert.assertNull(javaType77);
        org.junit.Assert.assertNull(javaType78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNull(typeDeserializer81);
        org.junit.Assert.assertNull(javaType82);
        org.junit.Assert.assertNull(objCollection84);
        org.junit.Assert.assertNotNull(collectionDeserializer87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer4 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer5 = collectionDeserializer4._valueTypeDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer12 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType6, objJsonDeserializer7, typeDeserializer8, valueInstantiator9, objJsonDeserializer10, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer13 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer12);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = collectionDeserializer13.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer15 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer13);
        java.util.Collection<java.lang.Object> objCollection16 = collectionDeserializer13.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext17 = null;
        java.util.Collection<java.lang.Object> objCollection18 = collectionDeserializer13.getNullValue(deserializationContext17);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = collectionDeserializer13._delegateDeserializer;
        java.lang.Boolean boolean20 = collectionDeserializer13._unwrapSingle;
        java.util.Collection<java.lang.Object> objCollection21 = collectionDeserializer13.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType22 = collectionDeserializer13.getValueType();
        java.util.Collection<java.lang.Object> objCollection23 = collectionDeserializer13.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer24 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer25 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer27 = collectionDeserializer4.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer13, objCollectionJsonDeserializer24, typeDeserializer25, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator28 = collectionDeserializer4._valueInstantiator;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader29 = collectionDeserializer4.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection30 = collectionDeserializer4.getEmptyValue();
        org.junit.Assert.assertNull(typeDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer14);
        org.junit.Assert.assertNull(objCollection16);
        org.junit.Assert.assertNull(objCollection18);
        org.junit.Assert.assertNull(objJsonDeserializer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(objCollection21);
        org.junit.Assert.assertNull(javaType22);
        org.junit.Assert.assertNull(objCollection23);
        org.junit.Assert.assertNotNull(collectionDeserializer27);
        org.junit.Assert.assertNull(valueInstantiator28);
        org.junit.Assert.assertNull(objectIdReader29);
        org.junit.Assert.assertNull(objCollection30);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer3 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer5 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType1, objJsonDeserializer2, typeDeserializer3, valueInstantiator4);
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer12 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType6, objJsonDeserializer7, typeDeserializer8, valueInstantiator9, objJsonDeserializer10, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer13 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer12);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = collectionDeserializer13.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer15 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer13);
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer17 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer18 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator19 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer20 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer22 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType16, objJsonDeserializer17, typeDeserializer18, valueInstantiator19, objJsonDeserializer20, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer23 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer22);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer24 = collectionDeserializer22.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer25 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer27 = collectionDeserializer5.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer13, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer22, typeDeserializer25, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator28 = collectionDeserializer27._valueInstantiator;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer29 = collectionDeserializer27._valueDeserializer;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer30 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator31 = null;
        com.fasterxml.jackson.databind.JavaType javaType32 = null;
        com.fasterxml.jackson.databind.JavaType javaType33 = null;
        com.fasterxml.jackson.databind.JavaType javaType34 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer35 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer36 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator37 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer38 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer40 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType34, objJsonDeserializer35, typeDeserializer36, valueInstantiator37, objJsonDeserializer38, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer41 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer40);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer42 = collectionDeserializer41.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer43 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer41);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer44 = collectionDeserializer43._valueTypeDeserializer;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer45 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer43);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer46 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer45);
        com.fasterxml.jackson.databind.JavaType javaType47 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer48 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer49 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator50 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer51 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType47, objJsonDeserializer48, typeDeserializer49, valueInstantiator50);
        com.fasterxml.jackson.databind.JavaType javaType52 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer53 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer54 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator55 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer56 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer58 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType52, objJsonDeserializer53, typeDeserializer54, valueInstantiator55, objJsonDeserializer56, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer59 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer58);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer60 = collectionDeserializer59.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer61 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer59);
        com.fasterxml.jackson.databind.JavaType javaType62 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer63 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer64 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator65 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer66 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer68 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType62, objJsonDeserializer63, typeDeserializer64, valueInstantiator65, objJsonDeserializer66, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer69 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer68);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer70 = collectionDeserializer68.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer71 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer73 = collectionDeserializer51.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer59, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer68, typeDeserializer71, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator74 = collectionDeserializer73._valueInstantiator;
        com.fasterxml.jackson.databind.JavaType javaType75 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer76 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer77 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator78 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer79 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType75, objJsonDeserializer76, typeDeserializer77, valueInstantiator78);
        com.fasterxml.jackson.databind.JavaType javaType80 = collectionDeserializer79.getValueType();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer81 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer82 = collectionDeserializer46.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer73, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer79, typeDeserializer81);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer83 = collectionDeserializer73._valueDeserializer;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer84 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator85 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer86 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType33, objJsonDeserializer83, typeDeserializer84, valueInstantiator85);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer87 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator88 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer89 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType32, objJsonDeserializer83, typeDeserializer87, valueInstantiator88);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer91 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer29, typeDeserializer30, valueInstantiator31, objJsonDeserializer83, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.JavaType javaType92 = collectionDeserializer91._collectionType;
        java.util.Collection<java.lang.Object> objCollection93 = collectionDeserializer91.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass94 = collectionDeserializer91.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader95 = collectionDeserializer91.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection96 = collectionDeserializer91.getNullValue();
        boolean boolean97 = collectionDeserializer91.isCachable();
        org.junit.Assert.assertNull(objJsonDeserializer14);
        org.junit.Assert.assertNull(objJsonDeserializer24);
        org.junit.Assert.assertNotNull(collectionDeserializer27);
        org.junit.Assert.assertNull(valueInstantiator28);
        org.junit.Assert.assertNotNull(objJsonDeserializer29);
        org.junit.Assert.assertNull(objJsonDeserializer42);
        org.junit.Assert.assertNull(typeDeserializer44);
        org.junit.Assert.assertNull(objJsonDeserializer60);
        org.junit.Assert.assertNull(objJsonDeserializer70);
        org.junit.Assert.assertNotNull(collectionDeserializer73);
        org.junit.Assert.assertNull(valueInstantiator74);
        org.junit.Assert.assertNull(javaType80);
        org.junit.Assert.assertNotNull(collectionDeserializer82);
        org.junit.Assert.assertNotNull(objJsonDeserializer83);
        org.junit.Assert.assertNull(javaType92);
        org.junit.Assert.assertNull(objCollection93);
        org.junit.Assert.assertNull(wildcardClass94);
        org.junit.Assert.assertNull(objectIdReader95);
        org.junit.Assert.assertNull(objCollection96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer14 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType8, objJsonDeserializer9, typeDeserializer10, valueInstantiator11, objJsonDeserializer12, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer15 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer14);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = collectionDeserializer15.getContentDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer18 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer19 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator20 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer21 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer23 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType17, objJsonDeserializer18, typeDeserializer19, valueInstantiator20, objJsonDeserializer21, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer24 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer23);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer25 = collectionDeserializer24.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer24);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer27 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer28 = collectionDeserializer6.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer15, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer24, typeDeserializer27);
        com.fasterxml.jackson.databind.JavaType javaType29 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer30 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer31 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator32 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer33 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer35 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType29, objJsonDeserializer30, typeDeserializer31, valueInstantiator32, objJsonDeserializer33, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType36 = collectionDeserializer35.getValueType();
        java.util.Collection<java.lang.Object> objCollection37 = collectionDeserializer35.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer38 = collectionDeserializer35._valueDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer39 = collectionDeserializer35._delegateDeserializer;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer40 = collectionDeserializer35._valueTypeDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType41 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer42 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer43 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator44 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer45 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer47 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType41, objJsonDeserializer42, typeDeserializer43, valueInstantiator44, objJsonDeserializer45, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer48 = collectionDeserializer47.getContentDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer49 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer50 = collectionDeserializer47.unwrappingDeserializer(nameTransformer49);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer51 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer53 = collectionDeserializer6.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer35, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer47, typeDeserializer51, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType54 = collectionDeserializer47._collectionType;
        java.lang.Class<?> wildcardClass55 = collectionDeserializer47.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer56 = collectionDeserializer47._valueDeserializer;
        boolean boolean57 = collectionDeserializer47.isCachable();
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator58 = collectionDeserializer47._valueInstantiator;
        org.junit.Assert.assertNull(objJsonDeserializer16);
        org.junit.Assert.assertNull(objJsonDeserializer25);
        org.junit.Assert.assertNotNull(collectionDeserializer28);
        org.junit.Assert.assertNull(javaType36);
        org.junit.Assert.assertNull(objCollection37);
        org.junit.Assert.assertNull(objJsonDeserializer38);
        org.junit.Assert.assertNull(objJsonDeserializer39);
        org.junit.Assert.assertNull(typeDeserializer40);
        org.junit.Assert.assertNull(objJsonDeserializer48);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer50);
        org.junit.Assert.assertNotNull(collectionDeserializer53);
        org.junit.Assert.assertNull(javaType54);
        org.junit.Assert.assertNull(wildcardClass55);
        org.junit.Assert.assertNull(objJsonDeserializer56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(valueInstantiator58);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = collectionDeserializer6.getDelegatee();
        java.lang.Class<?> wildcardClass8 = collectionDeserializer6.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer10 = collectionDeserializer6.unwrappingDeserializer(nameTransformer9);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty12 = collectionDeserializer6.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: container deserializer of type com.fasterxml.jackson.databind.deser.std.CollectionDeserializer returned null for 'getContentDeserializer()'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer10);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer5 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer9 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType3, objJsonDeserializer4, typeDeserializer5, valueInstantiator6, objJsonDeserializer7, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = collectionDeserializer9.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = collectionDeserializer9._delegateDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer14 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer18 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType12, objJsonDeserializer13, typeDeserializer14, valueInstantiator15, objJsonDeserializer16, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer19 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer18);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer20 = collectionDeserializer19.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer21 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer19);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer22 = collectionDeserializer21._valueTypeDeserializer;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer23 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer21);
        com.fasterxml.jackson.databind.JavaType javaType24 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer25 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer26 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator27 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer28 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer30 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType24, objJsonDeserializer25, typeDeserializer26, valueInstantiator27, objJsonDeserializer28, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer31 = collectionDeserializer30.getDelegatee();
        java.lang.Class<?> wildcardClass32 = collectionDeserializer30.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer33 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer34 = collectionDeserializer30.unwrappingDeserializer(nameTransformer33);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer35 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer37 = collectionDeserializer9.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer23, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer30, typeDeserializer35, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator38 = collectionDeserializer37._valueInstantiator;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer39 = collectionDeserializer37.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer40 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator41 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer42 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType2, objJsonDeserializer39, typeDeserializer40, valueInstantiator41);
        java.lang.Boolean boolean43 = collectionDeserializer42._unwrapSingle;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer44 = collectionDeserializer42.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer45 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator46 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer47 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType1, objJsonDeserializer44, typeDeserializer45, valueInstantiator46);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer48 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator49 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer50 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer44, typeDeserializer48, valueInstantiator49);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext51 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty52 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer53 = collectionDeserializer50.createContextual(deserializationContext51, beanProperty52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(objJsonDeserializer11);
        org.junit.Assert.assertNull(objJsonDeserializer20);
        org.junit.Assert.assertNull(typeDeserializer22);
        org.junit.Assert.assertNull(wildcardJsonDeserializer31);
        org.junit.Assert.assertNull(wildcardClass32);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer34);
        org.junit.Assert.assertNotNull(collectionDeserializer37);
        org.junit.Assert.assertNull(valueInstantiator38);
        org.junit.Assert.assertNotNull(objJsonDeserializer39);
        org.junit.Assert.assertNull(boolean43);
        org.junit.Assert.assertNotNull(objJsonDeserializer44);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = collectionDeserializer7.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer9 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer7);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = collectionDeserializer9._valueTypeDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer13 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer17 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType11, objJsonDeserializer12, typeDeserializer13, valueInstantiator14, objJsonDeserializer15, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer18 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer17);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = collectionDeserializer18.getContentDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer20 = collectionDeserializer18.getContentDeserializer();
        java.lang.Class<?> wildcardClass21 = collectionDeserializer18.handledType();
        com.fasterxml.jackson.databind.JavaType javaType22 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer23 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer24 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator25 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer26 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer28 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType22, objJsonDeserializer23, typeDeserializer24, valueInstantiator25, objJsonDeserializer26, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer29 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer28);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer30 = collectionDeserializer29.getContentDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer31 = collectionDeserializer29.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer32 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer33 = collectionDeserializer9.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer18, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer29, typeDeserializer32);
        boolean boolean34 = collectionDeserializer18.isCachable();
        java.lang.Class<?> wildcardClass35 = collectionDeserializer18.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser36 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext37 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Object> objCollection38 = collectionDeserializer18.deserialize(jsonParser36, deserializationContext37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(typeDeserializer10);
        org.junit.Assert.assertNull(objJsonDeserializer19);
        org.junit.Assert.assertNull(objJsonDeserializer20);
        org.junit.Assert.assertNull(wildcardClass21);
        org.junit.Assert.assertNull(objJsonDeserializer30);
        org.junit.Assert.assertNull(objJsonDeserializer31);
        org.junit.Assert.assertNotNull(collectionDeserializer33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(wildcardClass35);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType7 = collectionDeserializer6.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer14 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType8, objJsonDeserializer9, typeDeserializer10, valueInstantiator11, objJsonDeserializer12, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer15 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer14);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer16 = collectionDeserializer15.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer17 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer15);
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer20 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator21 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer22 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer24 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType18, objJsonDeserializer19, typeDeserializer20, valueInstantiator21, objJsonDeserializer22, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer24);
        com.fasterxml.jackson.databind.JavaType javaType26 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer27 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer28 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator29 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer30 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer32 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType26, objJsonDeserializer27, typeDeserializer28, valueInstantiator29, objJsonDeserializer30, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer33 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer32);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer34 = collectionDeserializer33.getContentDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType35 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer36 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer37 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator38 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer39 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer41 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType35, objJsonDeserializer36, typeDeserializer37, valueInstantiator38, objJsonDeserializer39, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer42 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer41);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer43 = collectionDeserializer42.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer44 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer42);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer45 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer46 = collectionDeserializer24.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer33, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer42, typeDeserializer45);
        com.fasterxml.jackson.databind.JavaType javaType47 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer48 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer49 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator50 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer51 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer53 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType47, objJsonDeserializer48, typeDeserializer49, valueInstantiator50, objJsonDeserializer51, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType54 = collectionDeserializer53.getValueType();
        java.util.Collection<java.lang.Object> objCollection55 = collectionDeserializer53.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer56 = collectionDeserializer53._valueDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer57 = collectionDeserializer53._delegateDeserializer;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer58 = collectionDeserializer53._valueTypeDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType59 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer60 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer61 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator62 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer63 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer65 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType59, objJsonDeserializer60, typeDeserializer61, valueInstantiator62, objJsonDeserializer63, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer66 = collectionDeserializer65.getContentDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer67 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer68 = collectionDeserializer65.unwrappingDeserializer(nameTransformer67);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer69 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer71 = collectionDeserializer24.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer53, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer65, typeDeserializer69, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer72 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer73 = collectionDeserializer6.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer15, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer65, typeDeserializer72);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer74 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer73);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader75 = collectionDeserializer73.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType76 = collectionDeserializer73._collectionType;
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer16);
        org.junit.Assert.assertNull(objJsonDeserializer34);
        org.junit.Assert.assertNull(objJsonDeserializer43);
        org.junit.Assert.assertNotNull(collectionDeserializer46);
        org.junit.Assert.assertNull(javaType54);
        org.junit.Assert.assertNull(objCollection55);
        org.junit.Assert.assertNull(objJsonDeserializer56);
        org.junit.Assert.assertNull(objJsonDeserializer57);
        org.junit.Assert.assertNull(typeDeserializer58);
        org.junit.Assert.assertNull(objJsonDeserializer66);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer68);
        org.junit.Assert.assertNotNull(collectionDeserializer71);
        org.junit.Assert.assertNotNull(collectionDeserializer73);
        org.junit.Assert.assertNull(objectIdReader75);
        org.junit.Assert.assertNull(javaType76);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JavaType javaType8 = collectionDeserializer6.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType9 = collectionDeserializer6._collectionType;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = collectionDeserializer6.getContentDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = collectionDeserializer6.getContentDeserializer();
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objJsonDeserializer10);
        org.junit.Assert.assertNull(objJsonDeserializer11);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = collectionDeserializer7.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer9 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer7);
        java.lang.Class<?> wildcardClass10 = collectionDeserializer7.handledType();
        java.lang.Class<?> wildcardClass11 = collectionDeserializer7.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer14 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer18 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType12, objJsonDeserializer13, typeDeserializer14, valueInstantiator15, objJsonDeserializer16, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer19 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer18);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer20 = collectionDeserializer19.getContentDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer21 = collectionDeserializer19.getContentDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType22 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer23 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer24 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator25 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer26 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer28 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType22, objJsonDeserializer23, typeDeserializer24, valueInstantiator25, objJsonDeserializer26, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType29 = collectionDeserializer28.getValueType();
        java.util.Collection<java.lang.Object> objCollection30 = collectionDeserializer28.getKnownPropertyNames();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer31 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer33 = collectionDeserializer7.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer19, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer28, typeDeserializer31, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType34 = collectionDeserializer28.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext35 = null;
        java.util.Collection<java.lang.Object> objCollection36 = collectionDeserializer28.getNullValue(deserializationContext35);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer37 = collectionDeserializer28._valueDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType38 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer39 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer40 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator41 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer42 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer44 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType38, objJsonDeserializer39, typeDeserializer40, valueInstantiator41, objJsonDeserializer42, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer45 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer44);
        com.fasterxml.jackson.databind.JavaType javaType46 = collectionDeserializer44.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType47 = collectionDeserializer44._collectionType;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer48 = collectionDeserializer44._valueTypeDeserializer;
        boolean boolean49 = collectionDeserializer44.isCachable();
        java.lang.Class<?> wildcardClass50 = collectionDeserializer44.handledType();
        java.util.Collection<java.lang.Object> objCollection51 = collectionDeserializer44.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType52 = collectionDeserializer44._collectionType;
        com.fasterxml.jackson.databind.JavaType javaType53 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer54 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer55 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator56 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer57 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType53, objJsonDeserializer54, typeDeserializer55, valueInstantiator56);
        com.fasterxml.jackson.databind.JavaType javaType58 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer59 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer60 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator61 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer62 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer64 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType58, objJsonDeserializer59, typeDeserializer60, valueInstantiator61, objJsonDeserializer62, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer65 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer64);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer66 = collectionDeserializer65.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer67 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer65);
        com.fasterxml.jackson.databind.JavaType javaType68 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer69 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer70 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator71 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer72 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer74 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType68, objJsonDeserializer69, typeDeserializer70, valueInstantiator71, objJsonDeserializer72, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer75 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer74);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer76 = collectionDeserializer74.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer77 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer79 = collectionDeserializer57.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer65, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer74, typeDeserializer77, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer80 = collectionDeserializer57._delegateDeserializer;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer81 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer83 = collectionDeserializer28.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer44, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer57, typeDeserializer81, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext84 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty85 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer86 = collectionDeserializer44.createContextual(deserializationContext84, beanProperty85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertNull(objJsonDeserializer20);
        org.junit.Assert.assertNull(objJsonDeserializer21);
        org.junit.Assert.assertNull(javaType29);
        org.junit.Assert.assertNull(objCollection30);
        org.junit.Assert.assertNotNull(collectionDeserializer33);
        org.junit.Assert.assertNull(javaType34);
        org.junit.Assert.assertNull(objCollection36);
        org.junit.Assert.assertNull(objJsonDeserializer37);
        org.junit.Assert.assertNull(javaType46);
        org.junit.Assert.assertNull(javaType47);
        org.junit.Assert.assertNull(typeDeserializer48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(wildcardClass50);
        org.junit.Assert.assertNull(objCollection51);
        org.junit.Assert.assertNull(javaType52);
        org.junit.Assert.assertNull(objJsonDeserializer66);
        org.junit.Assert.assertNull(objJsonDeserializer76);
        org.junit.Assert.assertNotNull(collectionDeserializer79);
        org.junit.Assert.assertNull(objJsonDeserializer80);
        org.junit.Assert.assertNotNull(collectionDeserializer83);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = collectionDeserializer6.getDelegatee();
        java.lang.Class<?> wildcardClass8 = collectionDeserializer6.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer10 = collectionDeserializer6.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.JavaType javaType11 = collectionDeserializer6.getValueType();
        java.lang.Class<?> wildcardClass12 = collectionDeserializer6.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        java.util.Collection<java.lang.Object> objCollection14 = collectionDeserializer6.getNullValue(deserializationContext13);
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer17 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer21 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType15, objJsonDeserializer16, typeDeserializer17, valueInstantiator18, objJsonDeserializer19, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer22 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer21);
        com.fasterxml.jackson.databind.JavaType javaType23 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer24 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer25 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator26 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer27 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer29 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType23, objJsonDeserializer24, typeDeserializer25, valueInstantiator26, objJsonDeserializer27, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer30 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer29);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer31 = collectionDeserializer30.getContentDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType32 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer33 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer34 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator35 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer36 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer38 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType32, objJsonDeserializer33, typeDeserializer34, valueInstantiator35, objJsonDeserializer36, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer39 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer38);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer40 = collectionDeserializer39.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer41 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer39);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer42 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer43 = collectionDeserializer21.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer30, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer39, typeDeserializer42);
        boolean boolean44 = collectionDeserializer39.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer45 = collectionDeserializer39._delegateDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer46 = collectionDeserializer39.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer47 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer48 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer49 = collectionDeserializer6.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer39, objCollectionJsonDeserializer47, typeDeserializer48);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext50 = null;
        java.util.Collection<java.lang.Object> objCollection51 = collectionDeserializer49.getNullValue(deserializationContext50);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer52 = collectionDeserializer49._valueDeserializer;
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNull(objCollection14);
        org.junit.Assert.assertNull(objJsonDeserializer31);
        org.junit.Assert.assertNull(objJsonDeserializer40);
        org.junit.Assert.assertNotNull(collectionDeserializer43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(objJsonDeserializer45);
        org.junit.Assert.assertNull(wildcardJsonDeserializer46);
        org.junit.Assert.assertNotNull(collectionDeserializer49);
        org.junit.Assert.assertNull(objCollection51);
        org.junit.Assert.assertNull(objJsonDeserializer52);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer4 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3);
        java.lang.Boolean boolean5 = collectionDeserializer4._unwrapSingle;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer4);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = collectionDeserializer6._delegateDeserializer;
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Object> objCollection10 = collectionDeserializer6.deserialize(jsonParser8, deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(objJsonDeserializer7);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = collectionDeserializer7.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer9 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer7);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = collectionDeserializer9._valueTypeDeserializer;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer11 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer9);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer12 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer11);
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer15 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator16 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer17 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType13, objJsonDeserializer14, typeDeserializer15, valueInstantiator16);
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer20 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator21 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer22 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer24 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType18, objJsonDeserializer19, typeDeserializer20, valueInstantiator21, objJsonDeserializer22, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer24);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer26 = collectionDeserializer25.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer27 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer25);
        com.fasterxml.jackson.databind.JavaType javaType28 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer29 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer30 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator31 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer32 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer34 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType28, objJsonDeserializer29, typeDeserializer30, valueInstantiator31, objJsonDeserializer32, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer35 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer34);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer36 = collectionDeserializer34.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer37 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer39 = collectionDeserializer17.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer25, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer34, typeDeserializer37, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator40 = collectionDeserializer39._valueInstantiator;
        com.fasterxml.jackson.databind.JavaType javaType41 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer42 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer43 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator44 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer45 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType41, objJsonDeserializer42, typeDeserializer43, valueInstantiator44);
        com.fasterxml.jackson.databind.JavaType javaType46 = collectionDeserializer45.getValueType();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer47 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer48 = collectionDeserializer12.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer39, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer45, typeDeserializer47);
        com.fasterxml.jackson.databind.JavaType javaType49 = collectionDeserializer12._collectionType;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader50 = collectionDeserializer12.getObjectIdReader();
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(typeDeserializer10);
        org.junit.Assert.assertNull(objJsonDeserializer26);
        org.junit.Assert.assertNull(objJsonDeserializer36);
        org.junit.Assert.assertNotNull(collectionDeserializer39);
        org.junit.Assert.assertNull(valueInstantiator40);
        org.junit.Assert.assertNull(javaType46);
        org.junit.Assert.assertNotNull(collectionDeserializer48);
        org.junit.Assert.assertNull(javaType49);
        org.junit.Assert.assertNull(objectIdReader50);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer14 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType8, objJsonDeserializer9, typeDeserializer10, valueInstantiator11, objJsonDeserializer12, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer15 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer14);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = collectionDeserializer15.getContentDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer18 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer19 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator20 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer21 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer23 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType17, objJsonDeserializer18, typeDeserializer19, valueInstantiator20, objJsonDeserializer21, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer24 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer23);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer25 = collectionDeserializer24.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer24);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer27 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer28 = collectionDeserializer6.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer15, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer24, typeDeserializer27);
        com.fasterxml.jackson.databind.JavaType javaType29 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer30 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer31 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator32 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer33 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer35 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType29, objJsonDeserializer30, typeDeserializer31, valueInstantiator32, objJsonDeserializer33, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType36 = collectionDeserializer35.getValueType();
        java.util.Collection<java.lang.Object> objCollection37 = collectionDeserializer35.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer38 = collectionDeserializer35._valueDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer39 = collectionDeserializer35._delegateDeserializer;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer40 = collectionDeserializer35._valueTypeDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType41 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer42 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer43 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator44 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer45 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer47 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType41, objJsonDeserializer42, typeDeserializer43, valueInstantiator44, objJsonDeserializer45, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer48 = collectionDeserializer47.getContentDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer49 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer50 = collectionDeserializer47.unwrappingDeserializer(nameTransformer49);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer51 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer53 = collectionDeserializer6.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer35, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer47, typeDeserializer51, (java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType54 = collectionDeserializer35.getContentType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objJsonDeserializer16);
        org.junit.Assert.assertNull(objJsonDeserializer25);
        org.junit.Assert.assertNotNull(collectionDeserializer28);
        org.junit.Assert.assertNull(javaType36);
        org.junit.Assert.assertNull(objCollection37);
        org.junit.Assert.assertNull(objJsonDeserializer38);
        org.junit.Assert.assertNull(objJsonDeserializer39);
        org.junit.Assert.assertNull(typeDeserializer40);
        org.junit.Assert.assertNull(objJsonDeserializer48);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer50);
        org.junit.Assert.assertNotNull(collectionDeserializer53);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType7 = collectionDeserializer6.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer14 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType8, objJsonDeserializer9, typeDeserializer10, valueInstantiator11, objJsonDeserializer12, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer15 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer14);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer16 = collectionDeserializer15.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer17 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer15);
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer20 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator21 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer22 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer24 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType18, objJsonDeserializer19, typeDeserializer20, valueInstantiator21, objJsonDeserializer22, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer24);
        com.fasterxml.jackson.databind.JavaType javaType26 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer27 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer28 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator29 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer30 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer32 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType26, objJsonDeserializer27, typeDeserializer28, valueInstantiator29, objJsonDeserializer30, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer33 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer32);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer34 = collectionDeserializer33.getContentDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType35 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer36 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer37 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator38 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer39 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer41 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType35, objJsonDeserializer36, typeDeserializer37, valueInstantiator38, objJsonDeserializer39, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer42 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer41);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer43 = collectionDeserializer42.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer44 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer42);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer45 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer46 = collectionDeserializer24.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer33, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer42, typeDeserializer45);
        com.fasterxml.jackson.databind.JavaType javaType47 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer48 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer49 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator50 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer51 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer53 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType47, objJsonDeserializer48, typeDeserializer49, valueInstantiator50, objJsonDeserializer51, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType54 = collectionDeserializer53.getValueType();
        java.util.Collection<java.lang.Object> objCollection55 = collectionDeserializer53.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer56 = collectionDeserializer53._valueDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer57 = collectionDeserializer53._delegateDeserializer;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer58 = collectionDeserializer53._valueTypeDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType59 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer60 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer61 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator62 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer63 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer65 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType59, objJsonDeserializer60, typeDeserializer61, valueInstantiator62, objJsonDeserializer63, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer66 = collectionDeserializer65.getContentDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer67 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer68 = collectionDeserializer65.unwrappingDeserializer(nameTransformer67);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer69 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer71 = collectionDeserializer24.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer53, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer65, typeDeserializer69, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer72 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer73 = collectionDeserializer6.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer15, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer65, typeDeserializer72);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer74 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer73);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer75 = collectionDeserializer73.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType76 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer77 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer78 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator79 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer80 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer82 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType76, objJsonDeserializer77, typeDeserializer78, valueInstantiator79, objJsonDeserializer80, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer83 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer82);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer84 = collectionDeserializer83.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer85 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer83);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer86 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer83);
        java.util.Collection<java.lang.Object> objCollection87 = collectionDeserializer86.getEmptyValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer88 = collectionDeserializer86._valueTypeDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext89 = null;
        java.util.Collection<java.lang.Object> objCollection90 = collectionDeserializer86.getEmptyValue(deserializationContext89);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer91 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer92 = collectionDeserializer86.unwrappingDeserializer(nameTransformer91);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer93 = collectionDeserializer73.replaceDelegatee(objCollectionJsonDeserializer92);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer16);
        org.junit.Assert.assertNull(objJsonDeserializer34);
        org.junit.Assert.assertNull(objJsonDeserializer43);
        org.junit.Assert.assertNotNull(collectionDeserializer46);
        org.junit.Assert.assertNull(javaType54);
        org.junit.Assert.assertNull(objCollection55);
        org.junit.Assert.assertNull(objJsonDeserializer56);
        org.junit.Assert.assertNull(objJsonDeserializer57);
        org.junit.Assert.assertNull(typeDeserializer58);
        org.junit.Assert.assertNull(objJsonDeserializer66);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer68);
        org.junit.Assert.assertNotNull(collectionDeserializer71);
        org.junit.Assert.assertNotNull(collectionDeserializer73);
        org.junit.Assert.assertNull(wildcardJsonDeserializer75);
        org.junit.Assert.assertNull(objJsonDeserializer84);
        org.junit.Assert.assertNull(objCollection87);
        org.junit.Assert.assertNull(typeDeserializer88);
        org.junit.Assert.assertNull(objCollection90);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer92);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer4 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer11 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType5, objJsonDeserializer6, typeDeserializer7, valueInstantiator8, objJsonDeserializer9, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer12 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer11);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = collectionDeserializer12.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer14 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer12);
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer17 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer21 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType15, objJsonDeserializer16, typeDeserializer17, valueInstantiator18, objJsonDeserializer19, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer22 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer21);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer23 = collectionDeserializer21.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer24 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer26 = collectionDeserializer4.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer12, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer21, typeDeserializer24, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator27 = collectionDeserializer26._valueInstantiator;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator28 = collectionDeserializer26._valueInstantiator;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext29 = null;
        java.util.Collection<java.lang.Object> objCollection30 = collectionDeserializer26.getNullValue(deserializationContext29);
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator31 = collectionDeserializer26._valueInstantiator;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer32 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer26);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer33 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer34 = collectionDeserializer32.unwrappingDeserializer(nameTransformer33);
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertNull(objJsonDeserializer23);
        org.junit.Assert.assertNotNull(collectionDeserializer26);
        org.junit.Assert.assertNull(valueInstantiator27);
        org.junit.Assert.assertNull(valueInstantiator28);
        org.junit.Assert.assertNull(objCollection30);
        org.junit.Assert.assertNull(valueInstantiator31);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer34);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = collectionDeserializer6.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = collectionDeserializer6._delegateDeserializer;
        java.lang.Boolean boolean9 = collectionDeserializer6._unwrapSingle;
        com.fasterxml.jackson.databind.JavaType javaType10 = collectionDeserializer6._collectionType;
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(javaType10);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType7 = collectionDeserializer6.getValueType();
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator8 = collectionDeserializer6._valueInstantiator;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = collectionDeserializer6.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = collectionDeserializer6.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.util.Collection<java.lang.Object> objCollection12 = collectionDeserializer6.getEmptyValue(deserializationContext11);
        java.lang.Class<?> wildcardClass13 = collectionDeserializer6.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = collectionDeserializer6.getDelegatee();
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(valueInstantiator8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(objectIdReader10);
        org.junit.Assert.assertNull(objCollection12);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertNull(wildcardJsonDeserializer14);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = collectionDeserializer7.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer9 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer7);
        java.lang.Class<?> wildcardClass10 = collectionDeserializer7.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = collectionDeserializer7.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer14 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer18 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType12, objJsonDeserializer13, typeDeserializer14, valueInstantiator15, objJsonDeserializer16, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer19 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer18);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer20 = collectionDeserializer19.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer21 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer19);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext22 = null;
        java.util.Collection<java.lang.Object> objCollection23 = collectionDeserializer21.getEmptyValue(deserializationContext22);
        com.fasterxml.jackson.databind.JavaType javaType24 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer25 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer26 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator27 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer28 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer30 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType24, objJsonDeserializer25, typeDeserializer26, valueInstantiator27, objJsonDeserializer28, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer31 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer30);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer32 = collectionDeserializer31.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer33 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer31);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer34 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer31);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer35 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer37 = collectionDeserializer7.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer21, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer34, typeDeserializer35, (java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass38 = collectionDeserializer37.handledType();
        com.fasterxml.jackson.databind.JavaType javaType39 = collectionDeserializer37._collectionType;
        com.fasterxml.jackson.core.JsonParser jsonParser40 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext41 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer42 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = collectionDeserializer37.deserializeWithType(jsonParser40, deserializationContext41, typeDeserializer42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
        org.junit.Assert.assertNull(objJsonDeserializer20);
        org.junit.Assert.assertNull(objCollection23);
        org.junit.Assert.assertNull(objJsonDeserializer32);
        org.junit.Assert.assertNotNull(collectionDeserializer37);
        org.junit.Assert.assertNull(wildcardClass38);
        org.junit.Assert.assertNull(javaType39);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = collectionDeserializer6.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = collectionDeserializer6._delegateDeserializer;
        java.lang.Boolean boolean9 = collectionDeserializer6._unwrapSingle;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = collectionDeserializer6.getContentDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer13 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator14 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer15 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType11, objJsonDeserializer12, typeDeserializer13, valueInstantiator14);
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer17 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer18 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator19 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer20 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer22 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType16, objJsonDeserializer17, typeDeserializer18, valueInstantiator19, objJsonDeserializer20, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer23 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer22);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer24 = collectionDeserializer23.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer23);
        com.fasterxml.jackson.databind.JavaType javaType26 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer27 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer28 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator29 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer30 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer32 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType26, objJsonDeserializer27, typeDeserializer28, valueInstantiator29, objJsonDeserializer30, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer33 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer32);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer34 = collectionDeserializer32.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer35 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer37 = collectionDeserializer15.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer23, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer32, typeDeserializer35, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType38 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer39 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer40 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator41 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer42 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer44 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType38, objJsonDeserializer39, typeDeserializer40, valueInstantiator41, objJsonDeserializer42, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer45 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer44);
        com.fasterxml.jackson.databind.JavaType javaType46 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer47 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer48 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator49 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer50 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer52 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType46, objJsonDeserializer47, typeDeserializer48, valueInstantiator49, objJsonDeserializer50, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer53 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer52);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer54 = collectionDeserializer53.getContentDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType55 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer56 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer57 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator58 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer59 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer61 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType55, objJsonDeserializer56, typeDeserializer57, valueInstantiator58, objJsonDeserializer59, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer62 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer61);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer63 = collectionDeserializer62.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer64 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer62);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer65 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer66 = collectionDeserializer44.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer53, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer62, typeDeserializer65);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer67 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer68 = collectionDeserializer6.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer15, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer66, typeDeserializer67);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer69 = collectionDeserializer66.getContentDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext70 = null;
        java.util.Collection<java.lang.Object> objCollection71 = collectionDeserializer66.getNullValue(deserializationContext70);
        com.fasterxml.jackson.core.JsonParser jsonParser72 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext73 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Object> objCollection74 = collectionDeserializer66.deserialize(jsonParser72, deserializationContext73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(objJsonDeserializer10);
        org.junit.Assert.assertNull(objJsonDeserializer24);
        org.junit.Assert.assertNull(objJsonDeserializer34);
        org.junit.Assert.assertNotNull(collectionDeserializer37);
        org.junit.Assert.assertNull(objJsonDeserializer54);
        org.junit.Assert.assertNull(objJsonDeserializer63);
        org.junit.Assert.assertNotNull(collectionDeserializer66);
        org.junit.Assert.assertNotNull(collectionDeserializer68);
        org.junit.Assert.assertNotNull(objJsonDeserializer69);
        org.junit.Assert.assertNull(objCollection71);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = collectionDeserializer7.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer9 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer7);
        java.util.Collection<java.lang.Object> objCollection10 = collectionDeserializer7.getKnownPropertyNames();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = collectionDeserializer7._valueTypeDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = collectionDeserializer7._valueDeserializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer14 = collectionDeserializer7.unwrappingDeserializer(nameTransformer13);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(typeDeserializer11);
        org.junit.Assert.assertNull(objJsonDeserializer12);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer14);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer3 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer5 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType1, objJsonDeserializer2, typeDeserializer3, valueInstantiator4);
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer12 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType6, objJsonDeserializer7, typeDeserializer8, valueInstantiator9, objJsonDeserializer10, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer13 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer12);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = collectionDeserializer13.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer15 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer13);
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer17 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer18 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator19 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer20 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer22 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType16, objJsonDeserializer17, typeDeserializer18, valueInstantiator19, objJsonDeserializer20, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer23 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer22);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer24 = collectionDeserializer22.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer25 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer27 = collectionDeserializer5.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer13, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer22, typeDeserializer25, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator28 = collectionDeserializer27._valueInstantiator;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator29 = collectionDeserializer27._valueInstantiator;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext30 = null;
        java.util.Collection<java.lang.Object> objCollection31 = collectionDeserializer27.getNullValue(deserializationContext30);
        com.fasterxml.jackson.databind.JavaType javaType32 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer33 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer34 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator35 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer36 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType32, objJsonDeserializer33, typeDeserializer34, valueInstantiator35);
        com.fasterxml.jackson.databind.JavaType javaType37 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer38 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer39 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator40 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer41 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer43 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType37, objJsonDeserializer38, typeDeserializer39, valueInstantiator40, objJsonDeserializer41, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer44 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer43);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer45 = collectionDeserializer44.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer46 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer44);
        com.fasterxml.jackson.databind.JavaType javaType47 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer48 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer49 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator50 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer51 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer53 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType47, objJsonDeserializer48, typeDeserializer49, valueInstantiator50, objJsonDeserializer51, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer54 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer53);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer55 = collectionDeserializer53.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer56 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer58 = collectionDeserializer36.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer44, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer53, typeDeserializer56, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer59 = collectionDeserializer44._valueDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType60 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer61 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer62 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator63 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer64 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer66 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType60, objJsonDeserializer61, typeDeserializer62, valueInstantiator63, objJsonDeserializer64, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer67 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer66);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer68 = collectionDeserializer67.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer69 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer67);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer70 = collectionDeserializer69._valueTypeDeserializer;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer71 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer69);
        com.fasterxml.jackson.databind.JavaType javaType72 = collectionDeserializer71._collectionType;
        com.fasterxml.jackson.databind.JavaType javaType73 = collectionDeserializer71.getValueType();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer74 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer76 = collectionDeserializer27.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer44, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer71, typeDeserializer74, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext77 = null;
        java.util.Collection<java.lang.Object> objCollection78 = collectionDeserializer76.getEmptyValue(deserializationContext77);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer79 = collectionDeserializer76.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer80 = collectionDeserializer76._delegateDeserializer;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer81 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator82 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer83 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer80, typeDeserializer81, valueInstantiator82);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer84 = collectionDeserializer83._valueDeserializer;
        org.junit.Assert.assertNull(objJsonDeserializer14);
        org.junit.Assert.assertNull(objJsonDeserializer24);
        org.junit.Assert.assertNotNull(collectionDeserializer27);
        org.junit.Assert.assertNull(valueInstantiator28);
        org.junit.Assert.assertNull(valueInstantiator29);
        org.junit.Assert.assertNull(objCollection31);
        org.junit.Assert.assertNull(objJsonDeserializer45);
        org.junit.Assert.assertNull(objJsonDeserializer55);
        org.junit.Assert.assertNotNull(collectionDeserializer58);
        org.junit.Assert.assertNull(objJsonDeserializer59);
        org.junit.Assert.assertNull(objJsonDeserializer68);
        org.junit.Assert.assertNull(typeDeserializer70);
        org.junit.Assert.assertNull(javaType72);
        org.junit.Assert.assertNull(javaType73);
        org.junit.Assert.assertNotNull(collectionDeserializer76);
        org.junit.Assert.assertNull(objCollection78);
        org.junit.Assert.assertNull(wildcardJsonDeserializer79);
        org.junit.Assert.assertNotNull(objJsonDeserializer80);
        org.junit.Assert.assertNotNull(objJsonDeserializer84);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer4 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer11 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType5, objJsonDeserializer6, typeDeserializer7, valueInstantiator8, objJsonDeserializer9, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer12 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer11);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = collectionDeserializer12.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer14 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer12);
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer17 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer21 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType15, objJsonDeserializer16, typeDeserializer17, valueInstantiator18, objJsonDeserializer19, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer22 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer21);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer23 = collectionDeserializer21.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer24 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer26 = collectionDeserializer4.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer12, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer21, typeDeserializer24, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator27 = collectionDeserializer26._valueInstantiator;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator28 = collectionDeserializer26._valueInstantiator;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext29 = null;
        java.util.Collection<java.lang.Object> objCollection30 = collectionDeserializer26.getNullValue(deserializationContext29);
        com.fasterxml.jackson.databind.JavaType javaType31 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer32 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer33 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator34 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer35 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType31, objJsonDeserializer32, typeDeserializer33, valueInstantiator34);
        com.fasterxml.jackson.databind.JavaType javaType36 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer37 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer38 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator39 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer40 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer42 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType36, objJsonDeserializer37, typeDeserializer38, valueInstantiator39, objJsonDeserializer40, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer43 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer42);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer44 = collectionDeserializer43.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer45 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer43);
        com.fasterxml.jackson.databind.JavaType javaType46 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer47 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer48 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator49 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer50 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer52 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType46, objJsonDeserializer47, typeDeserializer48, valueInstantiator49, objJsonDeserializer50, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer53 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer52);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer54 = collectionDeserializer52.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer55 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer57 = collectionDeserializer35.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer43, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer52, typeDeserializer55, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer58 = collectionDeserializer43._valueDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType59 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer60 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer61 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator62 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer63 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer65 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType59, objJsonDeserializer60, typeDeserializer61, valueInstantiator62, objJsonDeserializer63, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer66 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer65);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer67 = collectionDeserializer66.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer68 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer66);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer69 = collectionDeserializer68._valueTypeDeserializer;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer70 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer68);
        com.fasterxml.jackson.databind.JavaType javaType71 = collectionDeserializer70._collectionType;
        com.fasterxml.jackson.databind.JavaType javaType72 = collectionDeserializer70.getValueType();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer73 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer75 = collectionDeserializer26.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer43, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer70, typeDeserializer73, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.JavaType javaType76 = collectionDeserializer26.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader77 = collectionDeserializer26.getObjectIdReader();
        java.lang.Boolean boolean78 = collectionDeserializer26._unwrapSingle;
        java.util.Collection<java.lang.Object> objCollection79 = collectionDeserializer26.getNullValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer80 = collectionDeserializer26._valueTypeDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer81 = collectionDeserializer26.getContentDeserializer();
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertNull(objJsonDeserializer23);
        org.junit.Assert.assertNotNull(collectionDeserializer26);
        org.junit.Assert.assertNull(valueInstantiator27);
        org.junit.Assert.assertNull(valueInstantiator28);
        org.junit.Assert.assertNull(objCollection30);
        org.junit.Assert.assertNull(objJsonDeserializer44);
        org.junit.Assert.assertNull(objJsonDeserializer54);
        org.junit.Assert.assertNotNull(collectionDeserializer57);
        org.junit.Assert.assertNull(objJsonDeserializer58);
        org.junit.Assert.assertNull(objJsonDeserializer67);
        org.junit.Assert.assertNull(typeDeserializer69);
        org.junit.Assert.assertNull(javaType71);
        org.junit.Assert.assertNull(javaType72);
        org.junit.Assert.assertNotNull(collectionDeserializer75);
        org.junit.Assert.assertNull(javaType76);
        org.junit.Assert.assertNull(objectIdReader77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNull(objCollection79);
        org.junit.Assert.assertNull(typeDeserializer80);
        org.junit.Assert.assertNotNull(objJsonDeserializer81);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = collectionDeserializer7.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer9 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer7);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = collectionDeserializer9._valueTypeDeserializer;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer11 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer9);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer12 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer11);
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer15 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator16 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer17 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType13, objJsonDeserializer14, typeDeserializer15, valueInstantiator16);
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer20 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator21 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer22 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer24 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType18, objJsonDeserializer19, typeDeserializer20, valueInstantiator21, objJsonDeserializer22, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer24);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer26 = collectionDeserializer25.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer27 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer25);
        com.fasterxml.jackson.databind.JavaType javaType28 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer29 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer30 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator31 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer32 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer34 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType28, objJsonDeserializer29, typeDeserializer30, valueInstantiator31, objJsonDeserializer32, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer35 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer34);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer36 = collectionDeserializer34.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer37 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer39 = collectionDeserializer17.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer25, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer34, typeDeserializer37, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator40 = collectionDeserializer39._valueInstantiator;
        com.fasterxml.jackson.databind.JavaType javaType41 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer42 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer43 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator44 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer45 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType41, objJsonDeserializer42, typeDeserializer43, valueInstantiator44);
        com.fasterxml.jackson.databind.JavaType javaType46 = collectionDeserializer45.getValueType();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer47 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer48 = collectionDeserializer12.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer39, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer45, typeDeserializer47);
        java.lang.Class<?> wildcardClass49 = collectionDeserializer48.getValueClass();
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator50 = collectionDeserializer48._valueInstantiator;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext51 = null;
        java.util.Collection<java.lang.Object> objCollection52 = collectionDeserializer48.getNullValue(deserializationContext51);
        com.fasterxml.jackson.databind.JavaType javaType53 = collectionDeserializer48.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer54 = collectionDeserializer48._valueDeserializer;
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(typeDeserializer10);
        org.junit.Assert.assertNull(objJsonDeserializer26);
        org.junit.Assert.assertNull(objJsonDeserializer36);
        org.junit.Assert.assertNotNull(collectionDeserializer39);
        org.junit.Assert.assertNull(valueInstantiator40);
        org.junit.Assert.assertNull(javaType46);
        org.junit.Assert.assertNotNull(collectionDeserializer48);
        org.junit.Assert.assertNull(wildcardClass49);
        org.junit.Assert.assertNull(valueInstantiator50);
        org.junit.Assert.assertNull(objCollection52);
        org.junit.Assert.assertNull(javaType53);
        org.junit.Assert.assertNotNull(objJsonDeserializer54);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator5 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType2, objJsonDeserializer3, typeDeserializer4, valueInstantiator5);
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer13 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType7, objJsonDeserializer8, typeDeserializer9, valueInstantiator10, objJsonDeserializer11, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer14 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer13);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = collectionDeserializer14.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer16 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer14);
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer18 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer19 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator20 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer21 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer23 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType17, objJsonDeserializer18, typeDeserializer19, valueInstantiator20, objJsonDeserializer21, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer24 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer23);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer25 = collectionDeserializer23.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer26 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer28 = collectionDeserializer6.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer14, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer23, typeDeserializer26, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator29 = collectionDeserializer28._valueInstantiator;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator30 = collectionDeserializer28._valueInstantiator;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext31 = null;
        java.util.Collection<java.lang.Object> objCollection32 = collectionDeserializer28.getNullValue(deserializationContext31);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer33 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer34 = collectionDeserializer28.unwrappingDeserializer(nameTransformer33);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer35 = collectionDeserializer28.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer36 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator37 = null;
        com.fasterxml.jackson.databind.JavaType javaType38 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer39 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer40 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator41 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer42 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType38, objJsonDeserializer39, typeDeserializer40, valueInstantiator41);
        com.fasterxml.jackson.databind.JavaType javaType43 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer44 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer45 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator46 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer47 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer49 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType43, objJsonDeserializer44, typeDeserializer45, valueInstantiator46, objJsonDeserializer47, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer50 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer49);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer51 = collectionDeserializer50.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer52 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer50);
        com.fasterxml.jackson.databind.JavaType javaType53 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer54 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer55 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator56 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer57 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer59 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType53, objJsonDeserializer54, typeDeserializer55, valueInstantiator56, objJsonDeserializer57, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer60 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer59);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer61 = collectionDeserializer59.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer62 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer64 = collectionDeserializer42.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer50, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer59, typeDeserializer62, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator65 = collectionDeserializer64._valueInstantiator;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer66 = collectionDeserializer64._valueDeserializer;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer68 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType1, objJsonDeserializer35, typeDeserializer36, valueInstantiator37, objJsonDeserializer66, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer69 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator70 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer71 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer35, typeDeserializer69, valueInstantiator70);
        org.junit.Assert.assertNull(objJsonDeserializer15);
        org.junit.Assert.assertNull(objJsonDeserializer25);
        org.junit.Assert.assertNotNull(collectionDeserializer28);
        org.junit.Assert.assertNull(valueInstantiator29);
        org.junit.Assert.assertNull(valueInstantiator30);
        org.junit.Assert.assertNull(objCollection32);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer34);
        org.junit.Assert.assertNotNull(objJsonDeserializer35);
        org.junit.Assert.assertNull(objJsonDeserializer51);
        org.junit.Assert.assertNull(objJsonDeserializer61);
        org.junit.Assert.assertNotNull(collectionDeserializer64);
        org.junit.Assert.assertNull(valueInstantiator65);
        org.junit.Assert.assertNotNull(objJsonDeserializer66);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType7 = collectionDeserializer6.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator11 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer12 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType8, objJsonDeserializer9, typeDeserializer10, valueInstantiator11);
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer15 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer17 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer19 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType13, objJsonDeserializer14, typeDeserializer15, valueInstantiator16, objJsonDeserializer17, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer20 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer19);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer21 = collectionDeserializer20.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer22 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer20);
        com.fasterxml.jackson.databind.JavaType javaType23 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer24 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer25 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator26 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer27 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer29 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType23, objJsonDeserializer24, typeDeserializer25, valueInstantiator26, objJsonDeserializer27, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer30 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer29);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer31 = collectionDeserializer29.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer32 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer34 = collectionDeserializer12.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer20, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer29, typeDeserializer32, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader35 = collectionDeserializer29.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType36 = collectionDeserializer29.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer37 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer38 = collectionDeserializer29.unwrappingDeserializer(nameTransformer37);
        com.fasterxml.jackson.databind.JavaType javaType39 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer40 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer41 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator42 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer43 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer45 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType39, objJsonDeserializer40, typeDeserializer41, valueInstantiator42, objJsonDeserializer43, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType46 = collectionDeserializer45.getValueType();
        java.util.Collection<java.lang.Object> objCollection47 = collectionDeserializer45.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer48 = collectionDeserializer45._valueDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer49 = collectionDeserializer45._delegateDeserializer;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer50 = collectionDeserializer45._valueTypeDeserializer;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer51 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer53 = collectionDeserializer6.withResolved(objCollectionJsonDeserializer38, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer45, typeDeserializer51, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader54 = collectionDeserializer53.getObjectIdReader();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer55 = collectionDeserializer53._valueTypeDeserializer;
        java.lang.Class<?> wildcardClass56 = collectionDeserializer53.handledType();
        java.util.Collection<java.lang.Object> objCollection57 = collectionDeserializer53.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader58 = collectionDeserializer53.getObjectIdReader();
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(objJsonDeserializer21);
        org.junit.Assert.assertNull(objJsonDeserializer31);
        org.junit.Assert.assertNotNull(collectionDeserializer34);
        org.junit.Assert.assertNull(objectIdReader35);
        org.junit.Assert.assertNull(javaType36);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer38);
        org.junit.Assert.assertNull(javaType46);
        org.junit.Assert.assertNull(objCollection47);
        org.junit.Assert.assertNull(objJsonDeserializer48);
        org.junit.Assert.assertNull(objJsonDeserializer49);
        org.junit.Assert.assertNull(typeDeserializer50);
        org.junit.Assert.assertNotNull(collectionDeserializer53);
        org.junit.Assert.assertNull(objectIdReader54);
        org.junit.Assert.assertNull(typeDeserializer55);
        org.junit.Assert.assertNull(wildcardClass56);
        org.junit.Assert.assertNull(objCollection57);
        org.junit.Assert.assertNull(objectIdReader58);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType7 = collectionDeserializer6.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator11 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer12 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType8, objJsonDeserializer9, typeDeserializer10, valueInstantiator11);
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer15 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer17 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer19 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType13, objJsonDeserializer14, typeDeserializer15, valueInstantiator16, objJsonDeserializer17, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer20 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer19);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer21 = collectionDeserializer20.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer22 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer20);
        com.fasterxml.jackson.databind.JavaType javaType23 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer24 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer25 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator26 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer27 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer29 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType23, objJsonDeserializer24, typeDeserializer25, valueInstantiator26, objJsonDeserializer27, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer30 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer29);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer31 = collectionDeserializer29.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer32 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer34 = collectionDeserializer12.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer20, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer29, typeDeserializer32, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader35 = collectionDeserializer29.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType36 = collectionDeserializer29.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer37 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer38 = collectionDeserializer29.unwrappingDeserializer(nameTransformer37);
        com.fasterxml.jackson.databind.JavaType javaType39 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer40 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer41 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator42 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer43 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer45 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType39, objJsonDeserializer40, typeDeserializer41, valueInstantiator42, objJsonDeserializer43, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType46 = collectionDeserializer45.getValueType();
        java.util.Collection<java.lang.Object> objCollection47 = collectionDeserializer45.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer48 = collectionDeserializer45._valueDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer49 = collectionDeserializer45._delegateDeserializer;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer50 = collectionDeserializer45._valueTypeDeserializer;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer51 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer53 = collectionDeserializer6.withResolved(objCollectionJsonDeserializer38, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer45, typeDeserializer51, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer54 = collectionDeserializer6._valueDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer55 = collectionDeserializer6.getContentDeserializer();
        java.util.Collection<java.lang.Object> objCollection56 = collectionDeserializer6.getEmptyValue();
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(objJsonDeserializer21);
        org.junit.Assert.assertNull(objJsonDeserializer31);
        org.junit.Assert.assertNotNull(collectionDeserializer34);
        org.junit.Assert.assertNull(objectIdReader35);
        org.junit.Assert.assertNull(javaType36);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer38);
        org.junit.Assert.assertNull(javaType46);
        org.junit.Assert.assertNull(objCollection47);
        org.junit.Assert.assertNull(objJsonDeserializer48);
        org.junit.Assert.assertNull(objJsonDeserializer49);
        org.junit.Assert.assertNull(typeDeserializer50);
        org.junit.Assert.assertNotNull(collectionDeserializer53);
        org.junit.Assert.assertNull(objJsonDeserializer54);
        org.junit.Assert.assertNull(objJsonDeserializer55);
        org.junit.Assert.assertNull(objCollection56);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = collectionDeserializer6.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = collectionDeserializer6._delegateDeserializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer10 = collectionDeserializer6.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer13 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer17 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType11, objJsonDeserializer12, typeDeserializer13, valueInstantiator14, objJsonDeserializer15, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType18 = collectionDeserializer17.getValueType();
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator19 = collectionDeserializer17._valueInstantiator;
        java.lang.Class<?> wildcardClass20 = collectionDeserializer17.handledType();
        boolean boolean21 = collectionDeserializer17.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType22 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer23 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer24 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator25 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer26 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer28 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType22, objJsonDeserializer23, typeDeserializer24, valueInstantiator25, objJsonDeserializer26, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer29 = collectionDeserializer28.getDelegatee();
        java.lang.Class<?> wildcardClass30 = collectionDeserializer28.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext31 = null;
        java.util.Collection<java.lang.Object> objCollection32 = collectionDeserializer28.getEmptyValue(deserializationContext31);
        com.fasterxml.jackson.databind.JavaType javaType33 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer34 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer35 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator36 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer37 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer39 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType33, objJsonDeserializer34, typeDeserializer35, valueInstantiator36, objJsonDeserializer37, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer40 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer39);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer41 = collectionDeserializer40.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer42 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer40);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer43 = collectionDeserializer42._valueTypeDeserializer;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer44 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer42);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer45 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer44);
        com.fasterxml.jackson.databind.JavaType javaType46 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer47 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer48 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator49 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer50 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType46, objJsonDeserializer47, typeDeserializer48, valueInstantiator49);
        com.fasterxml.jackson.databind.JavaType javaType51 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer52 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer53 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator54 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer55 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer57 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType51, objJsonDeserializer52, typeDeserializer53, valueInstantiator54, objJsonDeserializer55, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer58 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer57);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer59 = collectionDeserializer58.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer60 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer58);
        com.fasterxml.jackson.databind.JavaType javaType61 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer62 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer63 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator64 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer65 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer67 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType61, objJsonDeserializer62, typeDeserializer63, valueInstantiator64, objJsonDeserializer65, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer68 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer67);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer69 = collectionDeserializer67.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer70 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer72 = collectionDeserializer50.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer58, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer67, typeDeserializer70, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator73 = collectionDeserializer72._valueInstantiator;
        com.fasterxml.jackson.databind.JavaType javaType74 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer75 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer76 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator77 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer78 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType74, objJsonDeserializer75, typeDeserializer76, valueInstantiator77);
        com.fasterxml.jackson.databind.JavaType javaType79 = collectionDeserializer78.getValueType();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer80 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer81 = collectionDeserializer45.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer72, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer78, typeDeserializer80);
        com.fasterxml.jackson.databind.JavaType javaType82 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer83 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer84 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator85 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer86 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer88 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType82, objJsonDeserializer83, typeDeserializer84, valueInstantiator85, objJsonDeserializer86, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer89 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer88);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer90 = collectionDeserializer89.getContentDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer91 = collectionDeserializer89.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer92 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer94 = collectionDeserializer28.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer45, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer89, typeDeserializer92, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer95 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer96 = collectionDeserializer6.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer17, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer28, typeDeserializer95);
        java.lang.Class<?> wildcardClass97 = collectionDeserializer6.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType98 = collectionDeserializer6.getValueType();
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer10);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNull(valueInstantiator19);
        org.junit.Assert.assertNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer29);
        org.junit.Assert.assertNull(wildcardClass30);
        org.junit.Assert.assertNull(objCollection32);
        org.junit.Assert.assertNull(objJsonDeserializer41);
        org.junit.Assert.assertNull(typeDeserializer43);
        org.junit.Assert.assertNull(objJsonDeserializer59);
        org.junit.Assert.assertNull(objJsonDeserializer69);
        org.junit.Assert.assertNotNull(collectionDeserializer72);
        org.junit.Assert.assertNull(valueInstantiator73);
        org.junit.Assert.assertNull(javaType79);
        org.junit.Assert.assertNotNull(collectionDeserializer81);
        org.junit.Assert.assertNull(objJsonDeserializer90);
        org.junit.Assert.assertNull(objJsonDeserializer91);
        org.junit.Assert.assertNotNull(collectionDeserializer94);
        org.junit.Assert.assertNotNull(collectionDeserializer96);
        org.junit.Assert.assertNull(wildcardClass97);
        org.junit.Assert.assertNull(javaType98);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType7 = collectionDeserializer6.getValueType();
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator8 = collectionDeserializer6._valueInstantiator;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = collectionDeserializer6.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = collectionDeserializer6._delegateDeserializer;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = collectionDeserializer6._valueTypeDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer14 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer18 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType12, objJsonDeserializer13, typeDeserializer14, valueInstantiator15, objJsonDeserializer16, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer19 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer18);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer20 = collectionDeserializer19.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer21 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer19);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer22 = collectionDeserializer21._valueTypeDeserializer;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer23 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer21);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer24 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer23);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer25 = collectionDeserializer24.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType26 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer27 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer28 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator29 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer30 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType26, objJsonDeserializer27, typeDeserializer28, valueInstantiator29);
        com.fasterxml.jackson.databind.JavaType javaType31 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer32 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer33 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator34 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer35 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer37 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType31, objJsonDeserializer32, typeDeserializer33, valueInstantiator34, objJsonDeserializer35, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer38 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer37);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer39 = collectionDeserializer38.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer40 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer38);
        com.fasterxml.jackson.databind.JavaType javaType41 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer42 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer43 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator44 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer45 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer47 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType41, objJsonDeserializer42, typeDeserializer43, valueInstantiator44, objJsonDeserializer45, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer48 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer47);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer49 = collectionDeserializer47.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer50 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer52 = collectionDeserializer30.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer38, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer47, typeDeserializer50, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer53 = collectionDeserializer30._delegateDeserializer;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer54 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer56 = collectionDeserializer6.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer24, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer30, typeDeserializer54, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer57 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer30);
        java.util.Collection<java.lang.Object> objCollection58 = collectionDeserializer30.getKnownPropertyNames();
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(valueInstantiator8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(objJsonDeserializer10);
        org.junit.Assert.assertNull(typeDeserializer11);
        org.junit.Assert.assertNull(objJsonDeserializer20);
        org.junit.Assert.assertNull(typeDeserializer22);
        org.junit.Assert.assertNull(wildcardJsonDeserializer25);
        org.junit.Assert.assertNull(objJsonDeserializer39);
        org.junit.Assert.assertNull(objJsonDeserializer49);
        org.junit.Assert.assertNotNull(collectionDeserializer52);
        org.junit.Assert.assertNull(objJsonDeserializer53);
        org.junit.Assert.assertNotNull(collectionDeserializer56);
        org.junit.Assert.assertNull(objCollection58);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer4 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer11 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType5, objJsonDeserializer6, typeDeserializer7, valueInstantiator8, objJsonDeserializer9, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer12 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer11);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = collectionDeserializer12.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer14 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer12);
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer17 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer21 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType15, objJsonDeserializer16, typeDeserializer17, valueInstantiator18, objJsonDeserializer19, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer22 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer21);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer23 = collectionDeserializer21.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer24 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer26 = collectionDeserializer4.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer12, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer21, typeDeserializer24, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader27 = collectionDeserializer21.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType28 = collectionDeserializer21._collectionType;
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertNull(objJsonDeserializer23);
        org.junit.Assert.assertNotNull(collectionDeserializer26);
        org.junit.Assert.assertNull(objectIdReader27);
        org.junit.Assert.assertNull(javaType28);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = collectionDeserializer7.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer9 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer7);
        java.lang.Class<?> wildcardClass10 = collectionDeserializer7.handledType();
        java.lang.Class<?> wildcardClass11 = collectionDeserializer7.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer14 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer18 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType12, objJsonDeserializer13, typeDeserializer14, valueInstantiator15, objJsonDeserializer16, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer19 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer18);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer20 = collectionDeserializer19.getContentDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer21 = collectionDeserializer19.getContentDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType22 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer23 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer24 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator25 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer26 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer28 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType22, objJsonDeserializer23, typeDeserializer24, valueInstantiator25, objJsonDeserializer26, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType29 = collectionDeserializer28.getValueType();
        java.util.Collection<java.lang.Object> objCollection30 = collectionDeserializer28.getKnownPropertyNames();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer31 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer33 = collectionDeserializer7.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer19, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer28, typeDeserializer31, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer34 = collectionDeserializer19.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType35 = collectionDeserializer19._collectionType;
        java.util.Collection<java.lang.Object> objCollection36 = collectionDeserializer19.getKnownPropertyNames();
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertNull(objJsonDeserializer20);
        org.junit.Assert.assertNull(objJsonDeserializer21);
        org.junit.Assert.assertNull(javaType29);
        org.junit.Assert.assertNull(objCollection30);
        org.junit.Assert.assertNotNull(collectionDeserializer33);
        org.junit.Assert.assertNull(wildcardJsonDeserializer34);
        org.junit.Assert.assertNull(javaType35);
        org.junit.Assert.assertNull(objCollection36);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer4 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer11 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType5, objJsonDeserializer6, typeDeserializer7, valueInstantiator8, objJsonDeserializer9, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer12 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer11);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = collectionDeserializer12.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer14 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer12);
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer17 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer21 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType15, objJsonDeserializer16, typeDeserializer17, valueInstantiator18, objJsonDeserializer19, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer22 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer21);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer23 = collectionDeserializer21.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer24 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer26 = collectionDeserializer4.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer12, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer21, typeDeserializer24, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer27 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer21);
        com.fasterxml.jackson.databind.JavaType javaType28 = collectionDeserializer21.getValueType();
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator29 = collectionDeserializer21._valueInstantiator;
        java.util.Collection<java.lang.Object> objCollection30 = collectionDeserializer21.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext31 = null;
        java.util.Collection<java.lang.Object> objCollection32 = collectionDeserializer21.getEmptyValue(deserializationContext31);
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertNull(objJsonDeserializer23);
        org.junit.Assert.assertNotNull(collectionDeserializer26);
        org.junit.Assert.assertNull(javaType28);
        org.junit.Assert.assertNull(valueInstantiator29);
        org.junit.Assert.assertNull(objCollection30);
        org.junit.Assert.assertNull(objCollection32);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = collectionDeserializer7.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer9 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer7);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = collectionDeserializer9._valueTypeDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer13 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer17 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType11, objJsonDeserializer12, typeDeserializer13, valueInstantiator14, objJsonDeserializer15, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer18 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer17);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = collectionDeserializer18.getContentDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer20 = collectionDeserializer18.getContentDeserializer();
        java.lang.Class<?> wildcardClass21 = collectionDeserializer18.handledType();
        com.fasterxml.jackson.databind.JavaType javaType22 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer23 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer24 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator25 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer26 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer28 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType22, objJsonDeserializer23, typeDeserializer24, valueInstantiator25, objJsonDeserializer26, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer29 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer28);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer30 = collectionDeserializer29.getContentDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer31 = collectionDeserializer29.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer32 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer33 = collectionDeserializer9.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer18, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer29, typeDeserializer32);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer34 = collectionDeserializer29._valueTypeDeserializer;
        java.util.Collection<java.lang.Object> objCollection35 = collectionDeserializer29.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection36 = collectionDeserializer29.getEmptyValue();
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator37 = collectionDeserializer29._valueInstantiator;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty39 = collectionDeserializer29.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: container deserializer of type com.fasterxml.jackson.databind.deser.std.CollectionDeserializer returned null for 'getContentDeserializer()'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(typeDeserializer10);
        org.junit.Assert.assertNull(objJsonDeserializer19);
        org.junit.Assert.assertNull(objJsonDeserializer20);
        org.junit.Assert.assertNull(wildcardClass21);
        org.junit.Assert.assertNull(objJsonDeserializer30);
        org.junit.Assert.assertNull(objJsonDeserializer31);
        org.junit.Assert.assertNotNull(collectionDeserializer33);
        org.junit.Assert.assertNull(typeDeserializer34);
        org.junit.Assert.assertNull(objCollection35);
        org.junit.Assert.assertNull(objCollection36);
        org.junit.Assert.assertNull(valueInstantiator37);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer6 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator7 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer8 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType4, objJsonDeserializer5, typeDeserializer6, valueInstantiator7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer15 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType9, objJsonDeserializer10, typeDeserializer11, valueInstantiator12, objJsonDeserializer13, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer16 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer15);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer17 = collectionDeserializer16.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer18 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer16);
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer20 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer21 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator22 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer23 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType19, objJsonDeserializer20, typeDeserializer21, valueInstantiator22, objJsonDeserializer23, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer25);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer27 = collectionDeserializer25.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer28 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer30 = collectionDeserializer8.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer16, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer25, typeDeserializer28, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator31 = collectionDeserializer30._valueInstantiator;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer32 = collectionDeserializer30._valueDeserializer;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer33 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator34 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer35 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType3, objJsonDeserializer32, typeDeserializer33, valueInstantiator34);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer36 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator37 = null;
        com.fasterxml.jackson.databind.JavaType javaType38 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer39 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer40 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator41 = null;
        com.fasterxml.jackson.databind.JavaType javaType42 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer43 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer44 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator45 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer46 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer48 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType42, objJsonDeserializer43, typeDeserializer44, valueInstantiator45, objJsonDeserializer46, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer49 = collectionDeserializer48.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer50 = collectionDeserializer48._delegateDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType51 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer52 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer53 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator54 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer55 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer57 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType51, objJsonDeserializer52, typeDeserializer53, valueInstantiator54, objJsonDeserializer55, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer58 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer57);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer59 = collectionDeserializer58.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer60 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer58);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer61 = collectionDeserializer60._valueTypeDeserializer;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer62 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer60);
        com.fasterxml.jackson.databind.JavaType javaType63 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer64 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer65 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator66 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer67 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer69 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType63, objJsonDeserializer64, typeDeserializer65, valueInstantiator66, objJsonDeserializer67, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer70 = collectionDeserializer69.getDelegatee();
        java.lang.Class<?> wildcardClass71 = collectionDeserializer69.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer72 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer73 = collectionDeserializer69.unwrappingDeserializer(nameTransformer72);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer74 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer76 = collectionDeserializer48.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer62, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer69, typeDeserializer74, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator77 = collectionDeserializer76._valueInstantiator;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer78 = collectionDeserializer76.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer80 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType38, objJsonDeserializer39, typeDeserializer40, valueInstantiator41, objJsonDeserializer78, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer82 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType2, objJsonDeserializer32, typeDeserializer36, valueInstantiator37, objJsonDeserializer78, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer83 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator84 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer85 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType1, objJsonDeserializer32, typeDeserializer83, valueInstantiator84);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer86 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator87 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer88 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer32, typeDeserializer86, valueInstantiator87);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer89 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer88);
        boolean boolean90 = collectionDeserializer88.isCachable();
        org.junit.Assert.assertNull(objJsonDeserializer17);
        org.junit.Assert.assertNull(objJsonDeserializer27);
        org.junit.Assert.assertNotNull(collectionDeserializer30);
        org.junit.Assert.assertNull(valueInstantiator31);
        org.junit.Assert.assertNotNull(objJsonDeserializer32);
        org.junit.Assert.assertNull(wildcardJsonDeserializer49);
        org.junit.Assert.assertNull(objJsonDeserializer50);
        org.junit.Assert.assertNull(objJsonDeserializer59);
        org.junit.Assert.assertNull(typeDeserializer61);
        org.junit.Assert.assertNull(wildcardJsonDeserializer70);
        org.junit.Assert.assertNull(wildcardClass71);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer73);
        org.junit.Assert.assertNotNull(collectionDeserializer76);
        org.junit.Assert.assertNull(valueInstantiator77);
        org.junit.Assert.assertNotNull(objJsonDeserializer78);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer4 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3);
        java.util.Collection<java.lang.Object> objCollection5 = collectionDeserializer4.getNullValue();
        java.lang.Class<?> wildcardClass6 = collectionDeserializer4.handledType();
        java.util.Collection<java.lang.Object> objCollection7 = collectionDeserializer4.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty9 = collectionDeserializer4.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: container deserializer of type com.fasterxml.jackson.databind.deser.std.CollectionDeserializer returned null for 'getContentDeserializer()'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNull(objCollection7);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = collectionDeserializer6.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = collectionDeserializer6._delegateDeserializer;
        java.lang.Boolean boolean9 = collectionDeserializer6._unwrapSingle;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = collectionDeserializer6.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator11 = collectionDeserializer6._valueInstantiator;
        java.util.Collection<java.lang.Object> objCollection12 = collectionDeserializer6.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection13 = collectionDeserializer6.getKnownPropertyNames();
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(objJsonDeserializer10);
        org.junit.Assert.assertNull(valueInstantiator11);
        org.junit.Assert.assertNull(objCollection12);
        org.junit.Assert.assertNull(objCollection13);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType7 = collectionDeserializer6.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator11 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer12 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType8, objJsonDeserializer9, typeDeserializer10, valueInstantiator11);
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer15 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer17 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer19 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType13, objJsonDeserializer14, typeDeserializer15, valueInstantiator16, objJsonDeserializer17, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer20 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer19);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer21 = collectionDeserializer20.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer22 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer20);
        com.fasterxml.jackson.databind.JavaType javaType23 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer24 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer25 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator26 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer27 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer29 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType23, objJsonDeserializer24, typeDeserializer25, valueInstantiator26, objJsonDeserializer27, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer30 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer29);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer31 = collectionDeserializer29.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer32 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer34 = collectionDeserializer12.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer20, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer29, typeDeserializer32, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader35 = collectionDeserializer29.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType36 = collectionDeserializer29.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer37 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer38 = collectionDeserializer29.unwrappingDeserializer(nameTransformer37);
        com.fasterxml.jackson.databind.JavaType javaType39 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer40 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer41 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator42 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer43 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer45 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType39, objJsonDeserializer40, typeDeserializer41, valueInstantiator42, objJsonDeserializer43, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType46 = collectionDeserializer45.getValueType();
        java.util.Collection<java.lang.Object> objCollection47 = collectionDeserializer45.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer48 = collectionDeserializer45._valueDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer49 = collectionDeserializer45._delegateDeserializer;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer50 = collectionDeserializer45._valueTypeDeserializer;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer51 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer53 = collectionDeserializer6.withResolved(objCollectionJsonDeserializer38, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer45, typeDeserializer51, (java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass54 = collectionDeserializer45.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader55 = collectionDeserializer45.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection56 = collectionDeserializer45.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer57 = collectionDeserializer45._delegateDeserializer;
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(objJsonDeserializer21);
        org.junit.Assert.assertNull(objJsonDeserializer31);
        org.junit.Assert.assertNotNull(collectionDeserializer34);
        org.junit.Assert.assertNull(objectIdReader35);
        org.junit.Assert.assertNull(javaType36);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer38);
        org.junit.Assert.assertNull(javaType46);
        org.junit.Assert.assertNull(objCollection47);
        org.junit.Assert.assertNull(objJsonDeserializer48);
        org.junit.Assert.assertNull(objJsonDeserializer49);
        org.junit.Assert.assertNull(typeDeserializer50);
        org.junit.Assert.assertNotNull(collectionDeserializer53);
        org.junit.Assert.assertNull(wildcardClass54);
        org.junit.Assert.assertNull(objectIdReader55);
        org.junit.Assert.assertNull(objCollection56);
        org.junit.Assert.assertNull(objJsonDeserializer57);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = collectionDeserializer6.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator8 = collectionDeserializer6._valueInstantiator;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator9 = collectionDeserializer6._valueInstantiator;
        java.util.Collection<java.lang.Object> objCollection10 = collectionDeserializer6.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass11 = collectionDeserializer6.getValueClass();
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(valueInstantiator8);
        org.junit.Assert.assertNull(valueInstantiator9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(wildcardClass11);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = collectionDeserializer7.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer9 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer7);
        java.util.Collection<java.lang.Object> objCollection10 = collectionDeserializer7.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.util.Collection<java.lang.Object> objCollection12 = collectionDeserializer7.getNullValue(deserializationContext11);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = collectionDeserializer7._delegateDeserializer;
        java.lang.Boolean boolean14 = collectionDeserializer7._unwrapSingle;
        java.util.Collection<java.lang.Object> objCollection15 = collectionDeserializer7.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader16 = collectionDeserializer7.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection17 = collectionDeserializer7.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer18 = collectionDeserializer7._valueDeserializer;
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(objCollection12);
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(objCollection15);
        org.junit.Assert.assertNull(objectIdReader16);
        org.junit.Assert.assertNull(objCollection17);
        org.junit.Assert.assertNull(objJsonDeserializer18);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer14 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType8, objJsonDeserializer9, typeDeserializer10, valueInstantiator11, objJsonDeserializer12, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer15 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer14);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = collectionDeserializer15.getContentDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer18 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer19 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator20 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer21 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer23 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType17, objJsonDeserializer18, typeDeserializer19, valueInstantiator20, objJsonDeserializer21, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer24 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer23);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer25 = collectionDeserializer24.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer24);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer27 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer28 = collectionDeserializer6.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer15, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer24, typeDeserializer27);
        com.fasterxml.jackson.databind.JavaType javaType29 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer30 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer31 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator32 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer33 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer35 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType29, objJsonDeserializer30, typeDeserializer31, valueInstantiator32, objJsonDeserializer33, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType36 = collectionDeserializer35.getValueType();
        java.util.Collection<java.lang.Object> objCollection37 = collectionDeserializer35.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer38 = collectionDeserializer35._valueDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer39 = collectionDeserializer35._delegateDeserializer;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer40 = collectionDeserializer35._valueTypeDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType41 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer42 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer43 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator44 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer45 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer47 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType41, objJsonDeserializer42, typeDeserializer43, valueInstantiator44, objJsonDeserializer45, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer48 = collectionDeserializer47.getContentDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer49 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer50 = collectionDeserializer47.unwrappingDeserializer(nameTransformer49);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer51 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer53 = collectionDeserializer6.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer35, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer47, typeDeserializer51, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer54 = collectionDeserializer47.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType55 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer56 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer57 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator58 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer59 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer61 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType55, objJsonDeserializer56, typeDeserializer57, valueInstantiator58, objJsonDeserializer59, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer62 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer61);
        com.fasterxml.jackson.databind.JavaType javaType63 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer64 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer65 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator66 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer67 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer69 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType63, objJsonDeserializer64, typeDeserializer65, valueInstantiator66, objJsonDeserializer67, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer70 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer69);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer71 = collectionDeserializer70.getContentDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType72 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer73 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer74 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator75 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer76 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer78 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType72, objJsonDeserializer73, typeDeserializer74, valueInstantiator75, objJsonDeserializer76, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer79 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer78);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer80 = collectionDeserializer79.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer81 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer79);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer82 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer83 = collectionDeserializer61.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer70, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer79, typeDeserializer82);
        boolean boolean84 = collectionDeserializer79.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType85 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer86 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer87 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator88 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer89 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType85, objJsonDeserializer86, typeDeserializer87, valueInstantiator88);
        com.fasterxml.jackson.databind.JavaType javaType90 = collectionDeserializer89.getValueType();
        java.util.Collection<java.lang.Object> objCollection91 = collectionDeserializer89.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader92 = collectionDeserializer89.getObjectIdReader();
        java.lang.Class<?> wildcardClass93 = collectionDeserializer89.getValueClass();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer94 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer96 = collectionDeserializer47.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer79, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer89, typeDeserializer94, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer97 = collectionDeserializer96._delegateDeserializer;
        java.util.Collection<java.lang.Object> objCollection98 = collectionDeserializer96.getKnownPropertyNames();
        org.junit.Assert.assertNull(objJsonDeserializer16);
        org.junit.Assert.assertNull(objJsonDeserializer25);
        org.junit.Assert.assertNotNull(collectionDeserializer28);
        org.junit.Assert.assertNull(javaType36);
        org.junit.Assert.assertNull(objCollection37);
        org.junit.Assert.assertNull(objJsonDeserializer38);
        org.junit.Assert.assertNull(objJsonDeserializer39);
        org.junit.Assert.assertNull(typeDeserializer40);
        org.junit.Assert.assertNull(objJsonDeserializer48);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer50);
        org.junit.Assert.assertNotNull(collectionDeserializer53);
        org.junit.Assert.assertNull(wildcardJsonDeserializer54);
        org.junit.Assert.assertNull(objJsonDeserializer71);
        org.junit.Assert.assertNull(objJsonDeserializer80);
        org.junit.Assert.assertNotNull(collectionDeserializer83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNull(javaType90);
        org.junit.Assert.assertNull(objCollection91);
        org.junit.Assert.assertNull(objectIdReader92);
        org.junit.Assert.assertNull(wildcardClass93);
        org.junit.Assert.assertNotNull(collectionDeserializer96);
        org.junit.Assert.assertNotNull(objJsonDeserializer97);
        org.junit.Assert.assertNull(objCollection98);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = collectionDeserializer7.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer9 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer7);
        java.util.Collection<java.lang.Object> objCollection10 = collectionDeserializer9.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = collectionDeserializer9.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer12 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer9);
        com.fasterxml.jackson.databind.JavaType javaType13 = collectionDeserializer9.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType14 = collectionDeserializer9._collectionType;
        com.fasterxml.jackson.databind.JavaType javaType15 = collectionDeserializer9.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = collectionDeserializer9._delegateDeserializer;
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(objJsonDeserializer11);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertNull(objJsonDeserializer16);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer8 = collectionDeserializer6.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.util.Collection<java.lang.Object> objCollection10 = objCollectionJsonDeserializer8.getNullValue(deserializationContext9);
        java.util.Collection<java.lang.Object> objCollection11 = objCollectionJsonDeserializer8.getEmptyValue();
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer8);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(objCollection11);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = collectionDeserializer7.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer9 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer7);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = collectionDeserializer9._valueTypeDeserializer;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer11 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer9);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer12 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer11);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = collectionDeserializer12.getDelegatee();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer14 = collectionDeserializer12._valueTypeDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        java.util.Collection<java.lang.Object> objCollection16 = collectionDeserializer12.getEmptyValue(deserializationContext15);
        java.util.Collection<java.lang.Object> objCollection17 = collectionDeserializer12.getNullValue();
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(typeDeserializer10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer13);
        org.junit.Assert.assertNull(typeDeserializer14);
        org.junit.Assert.assertNull(objCollection16);
        org.junit.Assert.assertNull(objCollection17);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer5 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator6 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType3, objJsonDeserializer4, typeDeserializer5, valueInstantiator6);
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer14 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType8, objJsonDeserializer9, typeDeserializer10, valueInstantiator11, objJsonDeserializer12, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer15 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer14);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = collectionDeserializer15.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer17 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer15);
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer20 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator21 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer22 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer24 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType18, objJsonDeserializer19, typeDeserializer20, valueInstantiator21, objJsonDeserializer22, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer24);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer26 = collectionDeserializer24.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer27 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer29 = collectionDeserializer7.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer15, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer24, typeDeserializer27, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator30 = collectionDeserializer29._valueInstantiator;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer31 = collectionDeserializer29._valueDeserializer;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer32 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator33 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer34 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType2, objJsonDeserializer31, typeDeserializer32, valueInstantiator33);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer35 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator36 = null;
        com.fasterxml.jackson.databind.JavaType javaType37 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer38 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer39 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator40 = null;
        com.fasterxml.jackson.databind.JavaType javaType41 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer42 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer43 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator44 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer45 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer47 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType41, objJsonDeserializer42, typeDeserializer43, valueInstantiator44, objJsonDeserializer45, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer48 = collectionDeserializer47.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer49 = collectionDeserializer47._delegateDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType50 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer51 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer52 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator53 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer54 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer56 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType50, objJsonDeserializer51, typeDeserializer52, valueInstantiator53, objJsonDeserializer54, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer57 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer56);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer58 = collectionDeserializer57.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer59 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer57);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer60 = collectionDeserializer59._valueTypeDeserializer;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer61 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer59);
        com.fasterxml.jackson.databind.JavaType javaType62 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer63 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer64 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator65 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer66 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer68 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType62, objJsonDeserializer63, typeDeserializer64, valueInstantiator65, objJsonDeserializer66, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer69 = collectionDeserializer68.getDelegatee();
        java.lang.Class<?> wildcardClass70 = collectionDeserializer68.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer71 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer72 = collectionDeserializer68.unwrappingDeserializer(nameTransformer71);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer73 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer75 = collectionDeserializer47.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer61, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer68, typeDeserializer73, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator76 = collectionDeserializer75._valueInstantiator;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer77 = collectionDeserializer75.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer79 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType37, objJsonDeserializer38, typeDeserializer39, valueInstantiator40, objJsonDeserializer77, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer81 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType1, objJsonDeserializer31, typeDeserializer35, valueInstantiator36, objJsonDeserializer77, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer82 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator83 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer84 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer77, typeDeserializer82, valueInstantiator83);
        java.lang.Class<?> wildcardClass85 = collectionDeserializer84.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer86 = collectionDeserializer84.getContentDeserializer();
        java.lang.Class<?> wildcardClass87 = collectionDeserializer84.handledType();
        org.junit.Assert.assertNull(objJsonDeserializer16);
        org.junit.Assert.assertNull(objJsonDeserializer26);
        org.junit.Assert.assertNotNull(collectionDeserializer29);
        org.junit.Assert.assertNull(valueInstantiator30);
        org.junit.Assert.assertNotNull(objJsonDeserializer31);
        org.junit.Assert.assertNull(wildcardJsonDeserializer48);
        org.junit.Assert.assertNull(objJsonDeserializer49);
        org.junit.Assert.assertNull(objJsonDeserializer58);
        org.junit.Assert.assertNull(typeDeserializer60);
        org.junit.Assert.assertNull(wildcardJsonDeserializer69);
        org.junit.Assert.assertNull(wildcardClass70);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer72);
        org.junit.Assert.assertNotNull(collectionDeserializer75);
        org.junit.Assert.assertNull(valueInstantiator76);
        org.junit.Assert.assertNotNull(objJsonDeserializer77);
        org.junit.Assert.assertNull(wildcardClass85);
        org.junit.Assert.assertNotNull(objJsonDeserializer86);
        org.junit.Assert.assertNull(wildcardClass87);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = collectionDeserializer6.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = collectionDeserializer6._delegateDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer15 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType9, objJsonDeserializer10, typeDeserializer11, valueInstantiator12, objJsonDeserializer13, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer16 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer15);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer17 = collectionDeserializer16.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer18 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer16);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer19 = collectionDeserializer18._valueTypeDeserializer;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer20 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer18);
        com.fasterxml.jackson.databind.JavaType javaType21 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer22 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer23 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator24 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer25 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer27 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType21, objJsonDeserializer22, typeDeserializer23, valueInstantiator24, objJsonDeserializer25, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer28 = collectionDeserializer27.getDelegatee();
        java.lang.Class<?> wildcardClass29 = collectionDeserializer27.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer30 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer31 = collectionDeserializer27.unwrappingDeserializer(nameTransformer30);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer32 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer34 = collectionDeserializer6.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer20, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer27, typeDeserializer32, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer35 = collectionDeserializer34.getContentDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer36 = collectionDeserializer34.getContentDeserializer();
        java.lang.Class<?> wildcardClass37 = collectionDeserializer34.getValueClass();
        java.util.Collection<java.lang.Object> objCollection38 = collectionDeserializer34.getNullValue();
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objJsonDeserializer17);
        org.junit.Assert.assertNull(typeDeserializer19);
        org.junit.Assert.assertNull(wildcardJsonDeserializer28);
        org.junit.Assert.assertNull(wildcardClass29);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer31);
        org.junit.Assert.assertNotNull(collectionDeserializer34);
        org.junit.Assert.assertNotNull(objJsonDeserializer35);
        org.junit.Assert.assertNotNull(objJsonDeserializer36);
        org.junit.Assert.assertNull(wildcardClass37);
        org.junit.Assert.assertNull(objCollection38);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator5 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType2, objJsonDeserializer3, typeDeserializer4, valueInstantiator5);
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer13 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType7, objJsonDeserializer8, typeDeserializer9, valueInstantiator10, objJsonDeserializer11, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer14 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer13);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = collectionDeserializer14.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer16 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer14);
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer18 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer19 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator20 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer21 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer23 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType17, objJsonDeserializer18, typeDeserializer19, valueInstantiator20, objJsonDeserializer21, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer24 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer23);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer25 = collectionDeserializer23.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer26 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer28 = collectionDeserializer6.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer14, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer23, typeDeserializer26, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator29 = collectionDeserializer28._valueInstantiator;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator30 = collectionDeserializer28._valueInstantiator;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator31 = collectionDeserializer28._valueInstantiator;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator32 = collectionDeserializer28._valueInstantiator;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext33 = null;
        java.util.Collection<java.lang.Object> objCollection34 = collectionDeserializer28.getNullValue(deserializationContext33);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer35 = collectionDeserializer28._delegateDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer36 = collectionDeserializer28._delegateDeserializer;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer37 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator38 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer39 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType1, objJsonDeserializer36, typeDeserializer37, valueInstantiator38);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer40 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator41 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer42 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer36, typeDeserializer40, valueInstantiator41);
        org.junit.Assert.assertNull(objJsonDeserializer15);
        org.junit.Assert.assertNull(objJsonDeserializer25);
        org.junit.Assert.assertNotNull(collectionDeserializer28);
        org.junit.Assert.assertNull(valueInstantiator29);
        org.junit.Assert.assertNull(valueInstantiator30);
        org.junit.Assert.assertNull(valueInstantiator31);
        org.junit.Assert.assertNull(valueInstantiator32);
        org.junit.Assert.assertNull(objCollection34);
        org.junit.Assert.assertNotNull(objJsonDeserializer35);
        org.junit.Assert.assertNotNull(objJsonDeserializer36);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer4 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer11 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType5, objJsonDeserializer6, typeDeserializer7, valueInstantiator8, objJsonDeserializer9, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer12 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer11);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = collectionDeserializer12.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer14 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer12);
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer17 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer21 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType15, objJsonDeserializer16, typeDeserializer17, valueInstantiator18, objJsonDeserializer19, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer22 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer21);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer23 = collectionDeserializer21.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer24 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer26 = collectionDeserializer4.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer12, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer21, typeDeserializer24, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader27 = collectionDeserializer21.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType28 = collectionDeserializer21.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer29 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer30 = collectionDeserializer21.unwrappingDeserializer(nameTransformer29);
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator31 = collectionDeserializer21._valueInstantiator;
        com.fasterxml.jackson.databind.JavaType javaType32 = collectionDeserializer21.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer33 = collectionDeserializer21._delegateDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer34 = collectionDeserializer21._valueDeserializer;
        java.lang.Class<?> wildcardClass35 = collectionDeserializer21.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer36 = collectionDeserializer21.getDelegatee();
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertNull(objJsonDeserializer23);
        org.junit.Assert.assertNotNull(collectionDeserializer26);
        org.junit.Assert.assertNull(objectIdReader27);
        org.junit.Assert.assertNull(javaType28);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer30);
        org.junit.Assert.assertNull(valueInstantiator31);
        org.junit.Assert.assertNull(javaType32);
        org.junit.Assert.assertNull(objJsonDeserializer33);
        org.junit.Assert.assertNull(objJsonDeserializer34);
        org.junit.Assert.assertNull(wildcardClass35);
        org.junit.Assert.assertNull(wildcardJsonDeserializer36);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = collectionDeserializer7.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer9 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer7);
        java.util.Collection<java.lang.Object> objCollection10 = collectionDeserializer7.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.util.Collection<java.lang.Object> objCollection12 = collectionDeserializer7.getNullValue(deserializationContext11);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = collectionDeserializer7._delegateDeserializer;
        java.lang.Boolean boolean14 = collectionDeserializer7._unwrapSingle;
        java.util.Collection<java.lang.Object> objCollection15 = collectionDeserializer7.getEmptyValue();
        java.lang.Class<?> wildcardClass16 = collectionDeserializer7.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType17 = collectionDeserializer7.getContentType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(objCollection12);
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(objCollection15);
        org.junit.Assert.assertNull(wildcardClass16);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = collectionDeserializer6.getDelegatee();
        java.lang.Class<?> wildcardClass8 = collectionDeserializer6.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.util.Collection<java.lang.Object> objCollection10 = collectionDeserializer6.getEmptyValue(deserializationContext9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer12 = collectionDeserializer6.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.databind.JavaType javaType13 = collectionDeserializer6.getValueType();
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer12);
        org.junit.Assert.assertNull(javaType13);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer4 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer11 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType5, objJsonDeserializer6, typeDeserializer7, valueInstantiator8, objJsonDeserializer9, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer12 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer11);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = collectionDeserializer12.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer14 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer12);
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer17 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer21 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType15, objJsonDeserializer16, typeDeserializer17, valueInstantiator18, objJsonDeserializer19, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer22 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer21);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer23 = collectionDeserializer21.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer24 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer26 = collectionDeserializer4.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer12, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer21, typeDeserializer24, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer27 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer21);
        com.fasterxml.jackson.databind.JavaType javaType28 = collectionDeserializer21.getValueType();
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator29 = collectionDeserializer21._valueInstantiator;
        com.fasterxml.jackson.databind.JavaType javaType30 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer31 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer32 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator33 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer34 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType30, objJsonDeserializer31, typeDeserializer32, valueInstantiator33);
        com.fasterxml.jackson.databind.JavaType javaType35 = collectionDeserializer34.getValueType();
        java.util.Collection<java.lang.Object> objCollection36 = collectionDeserializer34.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader37 = collectionDeserializer34.getObjectIdReader();
        java.lang.Class<?> wildcardClass38 = collectionDeserializer34.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer39 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer40 = collectionDeserializer34.unwrappingDeserializer(nameTransformer39);
        com.fasterxml.jackson.databind.JavaType javaType41 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer42 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer43 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator44 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer45 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer47 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType41, objJsonDeserializer42, typeDeserializer43, valueInstantiator44, objJsonDeserializer45, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer48 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer47);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer49 = collectionDeserializer48.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer50 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer48);
        java.lang.Class<?> wildcardClass51 = collectionDeserializer48.handledType();
        java.lang.Class<?> wildcardClass52 = collectionDeserializer48.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType53 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer54 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer55 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator56 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer57 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer59 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType53, objJsonDeserializer54, typeDeserializer55, valueInstantiator56, objJsonDeserializer57, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer60 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer59);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer61 = collectionDeserializer60.getContentDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer62 = collectionDeserializer60.getContentDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType63 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer64 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer65 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator66 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer67 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer69 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType63, objJsonDeserializer64, typeDeserializer65, valueInstantiator66, objJsonDeserializer67, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType70 = collectionDeserializer69.getValueType();
        java.util.Collection<java.lang.Object> objCollection71 = collectionDeserializer69.getKnownPropertyNames();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer72 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer74 = collectionDeserializer48.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer60, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer69, typeDeserializer72, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType75 = collectionDeserializer60._collectionType;
        java.util.Collection<java.lang.Object> objCollection76 = collectionDeserializer60.getEmptyValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer77 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer79 = collectionDeserializer21.withResolved(objCollectionJsonDeserializer40, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer60, typeDeserializer77, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader80 = collectionDeserializer60.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType81 = collectionDeserializer60.getValueType();
        boolean boolean82 = collectionDeserializer60.isCachable();
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertNull(objJsonDeserializer23);
        org.junit.Assert.assertNotNull(collectionDeserializer26);
        org.junit.Assert.assertNull(javaType28);
        org.junit.Assert.assertNull(valueInstantiator29);
        org.junit.Assert.assertNull(javaType35);
        org.junit.Assert.assertNull(objCollection36);
        org.junit.Assert.assertNull(objectIdReader37);
        org.junit.Assert.assertNull(wildcardClass38);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer40);
        org.junit.Assert.assertNull(objJsonDeserializer49);
        org.junit.Assert.assertNull(wildcardClass51);
        org.junit.Assert.assertNull(wildcardClass52);
        org.junit.Assert.assertNull(objJsonDeserializer61);
        org.junit.Assert.assertNull(objJsonDeserializer62);
        org.junit.Assert.assertNull(javaType70);
        org.junit.Assert.assertNull(objCollection71);
        org.junit.Assert.assertNotNull(collectionDeserializer74);
        org.junit.Assert.assertNull(javaType75);
        org.junit.Assert.assertNull(objCollection76);
        org.junit.Assert.assertNotNull(collectionDeserializer79);
        org.junit.Assert.assertNull(objectIdReader80);
        org.junit.Assert.assertNull(javaType81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer14 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType8, objJsonDeserializer9, typeDeserializer10, valueInstantiator11, objJsonDeserializer12, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer15 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer14);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = collectionDeserializer15.getContentDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer18 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer19 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator20 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer21 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer23 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType17, objJsonDeserializer18, typeDeserializer19, valueInstantiator20, objJsonDeserializer21, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer24 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer23);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer25 = collectionDeserializer24.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer24);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer27 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer28 = collectionDeserializer6.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer15, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer24, typeDeserializer27);
        com.fasterxml.jackson.databind.JavaType javaType29 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer30 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer31 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator32 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer33 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer35 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType29, objJsonDeserializer30, typeDeserializer31, valueInstantiator32, objJsonDeserializer33, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType36 = collectionDeserializer35.getValueType();
        java.util.Collection<java.lang.Object> objCollection37 = collectionDeserializer35.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer38 = collectionDeserializer35._valueDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer39 = collectionDeserializer35._delegateDeserializer;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer40 = collectionDeserializer35._valueTypeDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType41 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer42 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer43 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator44 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer45 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer47 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType41, objJsonDeserializer42, typeDeserializer43, valueInstantiator44, objJsonDeserializer45, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer48 = collectionDeserializer47.getContentDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer49 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer50 = collectionDeserializer47.unwrappingDeserializer(nameTransformer49);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer51 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer53 = collectionDeserializer6.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer35, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer47, typeDeserializer51, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer54 = collectionDeserializer47._valueTypeDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer55 = collectionDeserializer47._delegateDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer56 = collectionDeserializer47._valueDeserializer;
        java.lang.Class<?> wildcardClass57 = collectionDeserializer47.getValueClass();
        org.junit.Assert.assertNull(objJsonDeserializer16);
        org.junit.Assert.assertNull(objJsonDeserializer25);
        org.junit.Assert.assertNotNull(collectionDeserializer28);
        org.junit.Assert.assertNull(javaType36);
        org.junit.Assert.assertNull(objCollection37);
        org.junit.Assert.assertNull(objJsonDeserializer38);
        org.junit.Assert.assertNull(objJsonDeserializer39);
        org.junit.Assert.assertNull(typeDeserializer40);
        org.junit.Assert.assertNull(objJsonDeserializer48);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer50);
        org.junit.Assert.assertNotNull(collectionDeserializer53);
        org.junit.Assert.assertNull(typeDeserializer54);
        org.junit.Assert.assertNull(objJsonDeserializer55);
        org.junit.Assert.assertNull(objJsonDeserializer56);
        org.junit.Assert.assertNull(wildcardClass57);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer14 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType8, objJsonDeserializer9, typeDeserializer10, valueInstantiator11, objJsonDeserializer12, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer15 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer14);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = collectionDeserializer15.getContentDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer18 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer19 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator20 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer21 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer23 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType17, objJsonDeserializer18, typeDeserializer19, valueInstantiator20, objJsonDeserializer21, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer24 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer23);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer25 = collectionDeserializer24.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer24);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer27 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer28 = collectionDeserializer6.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer15, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer24, typeDeserializer27);
        com.fasterxml.jackson.databind.JavaType javaType29 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer30 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer31 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator32 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer33 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType29, objJsonDeserializer30, typeDeserializer31, valueInstantiator32);
        com.fasterxml.jackson.databind.JavaType javaType34 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer35 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer36 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator37 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer38 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer40 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType34, objJsonDeserializer35, typeDeserializer36, valueInstantiator37, objJsonDeserializer38, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer41 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer40);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer42 = collectionDeserializer41.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer43 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer41);
        com.fasterxml.jackson.databind.JavaType javaType44 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer45 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer46 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator47 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer48 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer50 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType44, objJsonDeserializer45, typeDeserializer46, valueInstantiator47, objJsonDeserializer48, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer51 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer50);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer52 = collectionDeserializer50.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer53 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer55 = collectionDeserializer33.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer41, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer50, typeDeserializer53, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader56 = collectionDeserializer50.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType57 = collectionDeserializer50.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer58 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer59 = collectionDeserializer50.unwrappingDeserializer(nameTransformer58);
        com.fasterxml.jackson.databind.JavaType javaType60 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer61 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer62 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator63 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer64 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer66 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType60, objJsonDeserializer61, typeDeserializer62, valueInstantiator63, objJsonDeserializer64, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer67 = collectionDeserializer66.getDelegatee();
        java.lang.Class<?> wildcardClass68 = collectionDeserializer66.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer69 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer70 = collectionDeserializer66.unwrappingDeserializer(nameTransformer69);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader71 = collectionDeserializer66.getObjectIdReader();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer72 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer74 = collectionDeserializer24.withResolved(objCollectionJsonDeserializer59, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer66, typeDeserializer72, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType75 = collectionDeserializer24._collectionType;
        org.junit.Assert.assertNull(objJsonDeserializer16);
        org.junit.Assert.assertNull(objJsonDeserializer25);
        org.junit.Assert.assertNotNull(collectionDeserializer28);
        org.junit.Assert.assertNull(objJsonDeserializer42);
        org.junit.Assert.assertNull(objJsonDeserializer52);
        org.junit.Assert.assertNotNull(collectionDeserializer55);
        org.junit.Assert.assertNull(objectIdReader56);
        org.junit.Assert.assertNull(javaType57);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer59);
        org.junit.Assert.assertNull(wildcardJsonDeserializer67);
        org.junit.Assert.assertNull(wildcardClass68);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer70);
        org.junit.Assert.assertNull(objectIdReader71);
        org.junit.Assert.assertNotNull(collectionDeserializer74);
        org.junit.Assert.assertNull(javaType75);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = collectionDeserializer6.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator8 = collectionDeserializer6._valueInstantiator;
        java.lang.Boolean boolean9 = collectionDeserializer6._unwrapSingle;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer13 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer17 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType11, objJsonDeserializer12, typeDeserializer13, valueInstantiator14, objJsonDeserializer15, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType18 = collectionDeserializer17.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer20 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer21 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator22 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer23 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType19, objJsonDeserializer20, typeDeserializer21, valueInstantiator22);
        com.fasterxml.jackson.databind.JavaType javaType24 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer25 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer26 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator27 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer28 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer30 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType24, objJsonDeserializer25, typeDeserializer26, valueInstantiator27, objJsonDeserializer28, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer31 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer30);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer32 = collectionDeserializer31.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer33 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer31);
        com.fasterxml.jackson.databind.JavaType javaType34 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer35 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer36 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator37 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer38 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer40 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType34, objJsonDeserializer35, typeDeserializer36, valueInstantiator37, objJsonDeserializer38, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer41 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer40);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer42 = collectionDeserializer40.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer43 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer45 = collectionDeserializer23.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer31, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer40, typeDeserializer43, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader46 = collectionDeserializer40.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType47 = collectionDeserializer40.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer48 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer49 = collectionDeserializer40.unwrappingDeserializer(nameTransformer48);
        com.fasterxml.jackson.databind.JavaType javaType50 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer51 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer52 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator53 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer54 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer56 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType50, objJsonDeserializer51, typeDeserializer52, valueInstantiator53, objJsonDeserializer54, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType57 = collectionDeserializer56.getValueType();
        java.util.Collection<java.lang.Object> objCollection58 = collectionDeserializer56.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer59 = collectionDeserializer56._valueDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer60 = collectionDeserializer56._delegateDeserializer;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer61 = collectionDeserializer56._valueTypeDeserializer;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer62 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer64 = collectionDeserializer17.withResolved(objCollectionJsonDeserializer49, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer56, typeDeserializer62, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer65 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer67 = collectionDeserializer6.withResolved(objCollectionJsonDeserializer10, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer17, typeDeserializer65, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator68 = collectionDeserializer17._valueInstantiator;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext69 = null;
        java.util.Collection<java.lang.Object> objCollection70 = collectionDeserializer17.getEmptyValue(deserializationContext69);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(valueInstantiator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNull(objJsonDeserializer32);
        org.junit.Assert.assertNull(objJsonDeserializer42);
        org.junit.Assert.assertNotNull(collectionDeserializer45);
        org.junit.Assert.assertNull(objectIdReader46);
        org.junit.Assert.assertNull(javaType47);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer49);
        org.junit.Assert.assertNull(javaType57);
        org.junit.Assert.assertNull(objCollection58);
        org.junit.Assert.assertNull(objJsonDeserializer59);
        org.junit.Assert.assertNull(objJsonDeserializer60);
        org.junit.Assert.assertNull(typeDeserializer61);
        org.junit.Assert.assertNotNull(collectionDeserializer64);
        org.junit.Assert.assertNotNull(collectionDeserializer67);
        org.junit.Assert.assertNull(valueInstantiator68);
        org.junit.Assert.assertNull(objCollection70);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = collectionDeserializer6.getContentDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType8 = collectionDeserializer6.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer15 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType9, objJsonDeserializer10, typeDeserializer11, valueInstantiator12, objJsonDeserializer13, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer16 = collectionDeserializer15.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext17 = null;
        java.util.Collection<java.lang.Object> objCollection18 = collectionDeserializer15.getEmptyValue(deserializationContext17);
        java.util.Collection<java.lang.Object> objCollection19 = collectionDeserializer15.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer20 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer21 = collectionDeserializer15.unwrappingDeserializer(nameTransformer20);
        com.fasterxml.jackson.databind.JavaType javaType22 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer23 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer24 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator25 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType22, objJsonDeserializer23, typeDeserializer24, valueInstantiator25);
        com.fasterxml.jackson.databind.JavaType javaType27 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer28 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer29 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator30 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer31 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer33 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType27, objJsonDeserializer28, typeDeserializer29, valueInstantiator30, objJsonDeserializer31, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer34 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer33);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer35 = collectionDeserializer34.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer36 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer34);
        com.fasterxml.jackson.databind.JavaType javaType37 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer38 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer39 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator40 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer41 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer43 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType37, objJsonDeserializer38, typeDeserializer39, valueInstantiator40, objJsonDeserializer41, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer44 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer43);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer45 = collectionDeserializer43.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer46 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer48 = collectionDeserializer26.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer34, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer43, typeDeserializer46, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader49 = collectionDeserializer43.getObjectIdReader();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer50 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer51 = collectionDeserializer6.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer15, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer43, typeDeserializer50);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer52 = collectionDeserializer51._delegateDeserializer;
        java.util.Collection<java.lang.Object> objCollection53 = collectionDeserializer51.getNullValue();
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer16);
        org.junit.Assert.assertNull(objCollection18);
        org.junit.Assert.assertNull(objCollection19);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer21);
        org.junit.Assert.assertNull(objJsonDeserializer35);
        org.junit.Assert.assertNull(objJsonDeserializer45);
        org.junit.Assert.assertNotNull(collectionDeserializer48);
        org.junit.Assert.assertNull(objectIdReader49);
        org.junit.Assert.assertNotNull(collectionDeserializer51);
        org.junit.Assert.assertNotNull(objJsonDeserializer52);
        org.junit.Assert.assertNull(objCollection53);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer8 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType2, objJsonDeserializer3, typeDeserializer4, valueInstantiator5, objJsonDeserializer6, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = collectionDeserializer8.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = collectionDeserializer8._delegateDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer13 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer17 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType11, objJsonDeserializer12, typeDeserializer13, valueInstantiator14, objJsonDeserializer15, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer18 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer17);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = collectionDeserializer18.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer20 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer18);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer21 = collectionDeserializer20._valueTypeDeserializer;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer22 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer20);
        com.fasterxml.jackson.databind.JavaType javaType23 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer24 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer25 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator26 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer27 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer29 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType23, objJsonDeserializer24, typeDeserializer25, valueInstantiator26, objJsonDeserializer27, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer30 = collectionDeserializer29.getDelegatee();
        java.lang.Class<?> wildcardClass31 = collectionDeserializer29.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer32 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer33 = collectionDeserializer29.unwrappingDeserializer(nameTransformer32);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer34 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer36 = collectionDeserializer8.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer22, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer29, typeDeserializer34, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator37 = collectionDeserializer36._valueInstantiator;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer38 = collectionDeserializer36.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer39 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator40 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer41 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType1, objJsonDeserializer38, typeDeserializer39, valueInstantiator40);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer42 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator43 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer44 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer38, typeDeserializer42, valueInstantiator43);
        java.util.Collection<java.lang.Object> objCollection45 = collectionDeserializer44.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer46 = collectionDeserializer44.getContentDeserializer();
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNull(objJsonDeserializer10);
        org.junit.Assert.assertNull(objJsonDeserializer19);
        org.junit.Assert.assertNull(typeDeserializer21);
        org.junit.Assert.assertNull(wildcardJsonDeserializer30);
        org.junit.Assert.assertNull(wildcardClass31);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer33);
        org.junit.Assert.assertNotNull(collectionDeserializer36);
        org.junit.Assert.assertNull(valueInstantiator37);
        org.junit.Assert.assertNotNull(objJsonDeserializer38);
        org.junit.Assert.assertNull(objCollection45);
        org.junit.Assert.assertNotNull(objJsonDeserializer46);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer8 = collectionDeserializer6.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer10 = collectionDeserializer6.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = collectionDeserializer6.getObjectIdReader();
        java.lang.Class<?> wildcardClass12 = collectionDeserializer6.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = collectionDeserializer6._delegateDeserializer;
        java.util.Collection<java.lang.Object> objCollection14 = collectionDeserializer6.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer8);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer10);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertNull(objCollection14);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType7 = collectionDeserializer6.getValueType();
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator8 = collectionDeserializer6._valueInstantiator;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = collectionDeserializer6.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = collectionDeserializer6._delegateDeserializer;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = collectionDeserializer6._valueTypeDeserializer;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = typeDeserializer11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(valueInstantiator8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(objJsonDeserializer10);
        org.junit.Assert.assertNull(typeDeserializer11);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer8 = collectionDeserializer6.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.JavaType javaType9 = collectionDeserializer6._collectionType;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer12 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer16 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType10, objJsonDeserializer11, typeDeserializer12, valueInstantiator13, objJsonDeserializer14, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer17 = collectionDeserializer16.getDelegatee();
        java.lang.Class<?> wildcardClass18 = collectionDeserializer16.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer19 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer20 = collectionDeserializer16.unwrappingDeserializer(nameTransformer19);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer21 = collectionDeserializer16.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType22 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer23 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer24 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator25 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer26 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer28 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType22, objJsonDeserializer23, typeDeserializer24, valueInstantiator25, objJsonDeserializer26, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer29 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer28);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer30 = collectionDeserializer29.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer31 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer29);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer32 = collectionDeserializer31._valueTypeDeserializer;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer33 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer31);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer34 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer33);
        java.util.Collection<java.lang.Object> objCollection35 = collectionDeserializer33.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection36 = collectionDeserializer33.getKnownPropertyNames();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer37 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer39 = collectionDeserializer6.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer16, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer33, typeDeserializer37, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer40 = collectionDeserializer39._delegateDeserializer;
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer17);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer20);
        org.junit.Assert.assertNull(wildcardJsonDeserializer21);
        org.junit.Assert.assertNull(objJsonDeserializer30);
        org.junit.Assert.assertNull(typeDeserializer32);
        org.junit.Assert.assertNull(objCollection35);
        org.junit.Assert.assertNull(objCollection36);
        org.junit.Assert.assertNotNull(collectionDeserializer39);
        org.junit.Assert.assertNotNull(objJsonDeserializer40);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = collectionDeserializer7.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer9 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer7);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = collectionDeserializer9._valueTypeDeserializer;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer11 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer9);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer12 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer11);
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer15 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator16 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer17 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType13, objJsonDeserializer14, typeDeserializer15, valueInstantiator16);
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer20 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator21 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer22 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer24 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType18, objJsonDeserializer19, typeDeserializer20, valueInstantiator21, objJsonDeserializer22, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer24);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer26 = collectionDeserializer25.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer27 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer25);
        com.fasterxml.jackson.databind.JavaType javaType28 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer29 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer30 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator31 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer32 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer34 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType28, objJsonDeserializer29, typeDeserializer30, valueInstantiator31, objJsonDeserializer32, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer35 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer34);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer36 = collectionDeserializer34.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer37 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer39 = collectionDeserializer17.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer25, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer34, typeDeserializer37, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator40 = collectionDeserializer39._valueInstantiator;
        com.fasterxml.jackson.databind.JavaType javaType41 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer42 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer43 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator44 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer45 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType41, objJsonDeserializer42, typeDeserializer43, valueInstantiator44);
        com.fasterxml.jackson.databind.JavaType javaType46 = collectionDeserializer45.getValueType();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer47 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer48 = collectionDeserializer12.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer39, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer45, typeDeserializer47);
        java.lang.Class<?> wildcardClass49 = collectionDeserializer48.getValueClass();
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator50 = collectionDeserializer48._valueInstantiator;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext51 = null;
        java.util.Collection<java.lang.Object> objCollection52 = collectionDeserializer48.getNullValue(deserializationContext51);
        com.fasterxml.jackson.databind.JavaType javaType53 = collectionDeserializer48.getValueType();
        java.lang.Class<?> wildcardClass54 = collectionDeserializer48.getValueClass();
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(typeDeserializer10);
        org.junit.Assert.assertNull(objJsonDeserializer26);
        org.junit.Assert.assertNull(objJsonDeserializer36);
        org.junit.Assert.assertNotNull(collectionDeserializer39);
        org.junit.Assert.assertNull(valueInstantiator40);
        org.junit.Assert.assertNull(javaType46);
        org.junit.Assert.assertNotNull(collectionDeserializer48);
        org.junit.Assert.assertNull(wildcardClass49);
        org.junit.Assert.assertNull(valueInstantiator50);
        org.junit.Assert.assertNull(objCollection52);
        org.junit.Assert.assertNull(javaType53);
        org.junit.Assert.assertNull(wildcardClass54);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer5 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer9 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType3, objJsonDeserializer4, typeDeserializer5, valueInstantiator6, objJsonDeserializer7, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer10 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer9);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = collectionDeserializer10.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer12 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer10);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer13 = collectionDeserializer12._valueTypeDeserializer;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer14 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer12);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer15 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer14);
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer17 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer18 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator19 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer20 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType16, objJsonDeserializer17, typeDeserializer18, valueInstantiator19);
        com.fasterxml.jackson.databind.JavaType javaType21 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer22 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer23 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator24 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer25 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer27 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType21, objJsonDeserializer22, typeDeserializer23, valueInstantiator24, objJsonDeserializer25, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer28 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer27);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer29 = collectionDeserializer28.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer30 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer28);
        com.fasterxml.jackson.databind.JavaType javaType31 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer32 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer33 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator34 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer35 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer37 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType31, objJsonDeserializer32, typeDeserializer33, valueInstantiator34, objJsonDeserializer35, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer38 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer37);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer39 = collectionDeserializer37.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer40 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer42 = collectionDeserializer20.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer28, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer37, typeDeserializer40, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator43 = collectionDeserializer42._valueInstantiator;
        com.fasterxml.jackson.databind.JavaType javaType44 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer45 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer46 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator47 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer48 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType44, objJsonDeserializer45, typeDeserializer46, valueInstantiator47);
        com.fasterxml.jackson.databind.JavaType javaType49 = collectionDeserializer48.getValueType();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer50 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer51 = collectionDeserializer15.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer42, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer48, typeDeserializer50);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer52 = collectionDeserializer42._valueDeserializer;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer53 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator54 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer55 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType2, objJsonDeserializer52, typeDeserializer53, valueInstantiator54);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer56 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator57 = null;
        com.fasterxml.jackson.databind.JavaType javaType58 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer59 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer60 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator61 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer62 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType58, objJsonDeserializer59, typeDeserializer60, valueInstantiator61);
        com.fasterxml.jackson.databind.JavaType javaType63 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer64 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer65 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator66 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer67 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer69 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType63, objJsonDeserializer64, typeDeserializer65, valueInstantiator66, objJsonDeserializer67, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer70 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer69);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer71 = collectionDeserializer70.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer72 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer70);
        com.fasterxml.jackson.databind.JavaType javaType73 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer74 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer75 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator76 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer77 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer79 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType73, objJsonDeserializer74, typeDeserializer75, valueInstantiator76, objJsonDeserializer77, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer80 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer79);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer81 = collectionDeserializer79.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer82 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer84 = collectionDeserializer62.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer70, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer79, typeDeserializer82, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator85 = collectionDeserializer84._valueInstantiator;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer86 = collectionDeserializer84._valueDeserializer;
        boolean boolean87 = collectionDeserializer84.isCachable();
        java.util.Collection<java.lang.Object> objCollection88 = collectionDeserializer84.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType89 = collectionDeserializer84.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType90 = collectionDeserializer84.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer91 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer92 = collectionDeserializer84.unwrappingDeserializer(nameTransformer91);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer93 = collectionDeserializer84.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer95 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType1, objJsonDeserializer52, typeDeserializer56, valueInstantiator57, objJsonDeserializer93, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer96 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator97 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer98 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer52, typeDeserializer96, valueInstantiator97);
        org.junit.Assert.assertNull(objJsonDeserializer11);
        org.junit.Assert.assertNull(typeDeserializer13);
        org.junit.Assert.assertNull(objJsonDeserializer29);
        org.junit.Assert.assertNull(objJsonDeserializer39);
        org.junit.Assert.assertNotNull(collectionDeserializer42);
        org.junit.Assert.assertNull(valueInstantiator43);
        org.junit.Assert.assertNull(javaType49);
        org.junit.Assert.assertNotNull(collectionDeserializer51);
        org.junit.Assert.assertNotNull(objJsonDeserializer52);
        org.junit.Assert.assertNull(objJsonDeserializer71);
        org.junit.Assert.assertNull(objJsonDeserializer81);
        org.junit.Assert.assertNotNull(collectionDeserializer84);
        org.junit.Assert.assertNull(valueInstantiator85);
        org.junit.Assert.assertNotNull(objJsonDeserializer86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNull(objCollection88);
        org.junit.Assert.assertNull(javaType89);
        org.junit.Assert.assertNull(javaType90);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer92);
        org.junit.Assert.assertNotNull(objJsonDeserializer93);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = collectionDeserializer7.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer9 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer7);
        java.lang.Class<?> wildcardClass10 = collectionDeserializer7.handledType();
        java.lang.Class<?> wildcardClass11 = collectionDeserializer7.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer14 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer18 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType12, objJsonDeserializer13, typeDeserializer14, valueInstantiator15, objJsonDeserializer16, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer19 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer18);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer20 = collectionDeserializer19.getContentDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer21 = collectionDeserializer19.getContentDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType22 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer23 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer24 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator25 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer26 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer28 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType22, objJsonDeserializer23, typeDeserializer24, valueInstantiator25, objJsonDeserializer26, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType29 = collectionDeserializer28.getValueType();
        java.util.Collection<java.lang.Object> objCollection30 = collectionDeserializer28.getKnownPropertyNames();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer31 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer33 = collectionDeserializer7.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer19, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer28, typeDeserializer31, (java.lang.Boolean) true);
        boolean boolean34 = collectionDeserializer19.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext35 = null;
        java.util.Collection<java.lang.Object> objCollection36 = collectionDeserializer19.getEmptyValue(deserializationContext35);
        com.fasterxml.jackson.databind.JavaType javaType37 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer38 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer39 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator40 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer41 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer43 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType37, objJsonDeserializer38, typeDeserializer39, valueInstantiator40, objJsonDeserializer41, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer44 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer43);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer45 = collectionDeserializer44.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer46 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer44);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer47 = collectionDeserializer46._valueTypeDeserializer;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer48 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer46);
        com.fasterxml.jackson.databind.JavaType javaType49 = collectionDeserializer48._collectionType;
        com.fasterxml.jackson.databind.JavaType javaType50 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer51 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer52 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator53 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer54 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType50, objJsonDeserializer51, typeDeserializer52, valueInstantiator53);
        com.fasterxml.jackson.databind.JavaType javaType55 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer56 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer57 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator58 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer59 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer61 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType55, objJsonDeserializer56, typeDeserializer57, valueInstantiator58, objJsonDeserializer59, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer62 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer61);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer63 = collectionDeserializer62.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer64 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer62);
        com.fasterxml.jackson.databind.JavaType javaType65 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer66 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer67 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator68 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer69 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer71 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType65, objJsonDeserializer66, typeDeserializer67, valueInstantiator68, objJsonDeserializer69, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer72 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer71);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer73 = collectionDeserializer71.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer74 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer76 = collectionDeserializer54.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer62, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer71, typeDeserializer74, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext77 = null;
        java.util.Collection<java.lang.Object> objCollection78 = collectionDeserializer76.getEmptyValue(deserializationContext77);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer79 = collectionDeserializer76._valueTypeDeserializer;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer80 = collectionDeserializer76._valueTypeDeserializer;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer81 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer83 = collectionDeserializer19.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer48, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer76, typeDeserializer81, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer84 = collectionDeserializer83._delegateDeserializer;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty86 = collectionDeserializer83.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: container deserializer of type com.fasterxml.jackson.databind.deser.std.CollectionDeserializer returned null for 'getContentDeserializer()'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertNull(objJsonDeserializer20);
        org.junit.Assert.assertNull(objJsonDeserializer21);
        org.junit.Assert.assertNull(javaType29);
        org.junit.Assert.assertNull(objCollection30);
        org.junit.Assert.assertNotNull(collectionDeserializer33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(objCollection36);
        org.junit.Assert.assertNull(objJsonDeserializer45);
        org.junit.Assert.assertNull(typeDeserializer47);
        org.junit.Assert.assertNull(javaType49);
        org.junit.Assert.assertNull(objJsonDeserializer63);
        org.junit.Assert.assertNull(objJsonDeserializer73);
        org.junit.Assert.assertNotNull(collectionDeserializer76);
        org.junit.Assert.assertNull(objCollection78);
        org.junit.Assert.assertNull(typeDeserializer79);
        org.junit.Assert.assertNull(typeDeserializer80);
        org.junit.Assert.assertNotNull(collectionDeserializer83);
        org.junit.Assert.assertNotNull(objJsonDeserializer84);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = collectionDeserializer7.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer9 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer7);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer10 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer12 = collectionDeserializer10.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer14 = collectionDeserializer10.unwrappingDeserializer(nameTransformer13);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer15 = collectionDeserializer10._valueTypeDeserializer;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator16 = collectionDeserializer10._valueInstantiator;
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer12);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer14);
        org.junit.Assert.assertNull(typeDeserializer15);
        org.junit.Assert.assertNull(valueInstantiator16);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = collectionDeserializer7.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer9 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer7);
        java.util.Collection<java.lang.Object> objCollection10 = collectionDeserializer7.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.util.Collection<java.lang.Object> objCollection12 = collectionDeserializer7.getNullValue(deserializationContext11);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = collectionDeserializer7._delegateDeserializer;
        java.lang.Boolean boolean14 = collectionDeserializer7._unwrapSingle;
        java.util.Collection<java.lang.Object> objCollection15 = collectionDeserializer7.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        java.util.Collection<java.lang.Object> objCollection17 = collectionDeserializer7.getNullValue(deserializationContext16);
        java.lang.Class<?> wildcardClass18 = collectionDeserializer7.handledType();
        boolean boolean19 = collectionDeserializer7.isCachable();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer20 = collectionDeserializer7._valueTypeDeserializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer21 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer22 = collectionDeserializer7.unwrappingDeserializer(nameTransformer21);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(objCollection12);
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(objCollection15);
        org.junit.Assert.assertNull(objCollection17);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(typeDeserializer20);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer22);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = collectionDeserializer6.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = collectionDeserializer6._delegateDeserializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer10 = collectionDeserializer6.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer13 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer17 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType11, objJsonDeserializer12, typeDeserializer13, valueInstantiator14, objJsonDeserializer15, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType18 = collectionDeserializer17.getValueType();
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator19 = collectionDeserializer17._valueInstantiator;
        java.lang.Class<?> wildcardClass20 = collectionDeserializer17.handledType();
        boolean boolean21 = collectionDeserializer17.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType22 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer23 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer24 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator25 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer26 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer28 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType22, objJsonDeserializer23, typeDeserializer24, valueInstantiator25, objJsonDeserializer26, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer29 = collectionDeserializer28.getDelegatee();
        java.lang.Class<?> wildcardClass30 = collectionDeserializer28.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext31 = null;
        java.util.Collection<java.lang.Object> objCollection32 = collectionDeserializer28.getEmptyValue(deserializationContext31);
        com.fasterxml.jackson.databind.JavaType javaType33 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer34 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer35 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator36 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer37 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer39 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType33, objJsonDeserializer34, typeDeserializer35, valueInstantiator36, objJsonDeserializer37, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer40 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer39);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer41 = collectionDeserializer40.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer42 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer40);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer43 = collectionDeserializer42._valueTypeDeserializer;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer44 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer42);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer45 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer44);
        com.fasterxml.jackson.databind.JavaType javaType46 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer47 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer48 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator49 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer50 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType46, objJsonDeserializer47, typeDeserializer48, valueInstantiator49);
        com.fasterxml.jackson.databind.JavaType javaType51 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer52 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer53 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator54 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer55 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer57 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType51, objJsonDeserializer52, typeDeserializer53, valueInstantiator54, objJsonDeserializer55, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer58 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer57);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer59 = collectionDeserializer58.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer60 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer58);
        com.fasterxml.jackson.databind.JavaType javaType61 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer62 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer63 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator64 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer65 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer67 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType61, objJsonDeserializer62, typeDeserializer63, valueInstantiator64, objJsonDeserializer65, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer68 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer67);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer69 = collectionDeserializer67.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer70 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer72 = collectionDeserializer50.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer58, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer67, typeDeserializer70, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator73 = collectionDeserializer72._valueInstantiator;
        com.fasterxml.jackson.databind.JavaType javaType74 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer75 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer76 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator77 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer78 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType74, objJsonDeserializer75, typeDeserializer76, valueInstantiator77);
        com.fasterxml.jackson.databind.JavaType javaType79 = collectionDeserializer78.getValueType();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer80 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer81 = collectionDeserializer45.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer72, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer78, typeDeserializer80);
        com.fasterxml.jackson.databind.JavaType javaType82 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer83 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer84 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator85 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer86 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer88 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType82, objJsonDeserializer83, typeDeserializer84, valueInstantiator85, objJsonDeserializer86, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer89 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer88);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer90 = collectionDeserializer89.getContentDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer91 = collectionDeserializer89.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer92 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer94 = collectionDeserializer28.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer45, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer89, typeDeserializer92, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer95 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer96 = collectionDeserializer6.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer17, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer28, typeDeserializer95);
        com.fasterxml.jackson.databind.JavaType javaType97 = collectionDeserializer96._collectionType;
        java.util.Collection<java.lang.Object> objCollection98 = collectionDeserializer96.getNullValue();
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer10);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNull(valueInstantiator19);
        org.junit.Assert.assertNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer29);
        org.junit.Assert.assertNull(wildcardClass30);
        org.junit.Assert.assertNull(objCollection32);
        org.junit.Assert.assertNull(objJsonDeserializer41);
        org.junit.Assert.assertNull(typeDeserializer43);
        org.junit.Assert.assertNull(objJsonDeserializer59);
        org.junit.Assert.assertNull(objJsonDeserializer69);
        org.junit.Assert.assertNotNull(collectionDeserializer72);
        org.junit.Assert.assertNull(valueInstantiator73);
        org.junit.Assert.assertNull(javaType79);
        org.junit.Assert.assertNotNull(collectionDeserializer81);
        org.junit.Assert.assertNull(objJsonDeserializer90);
        org.junit.Assert.assertNull(objJsonDeserializer91);
        org.junit.Assert.assertNotNull(collectionDeserializer94);
        org.junit.Assert.assertNotNull(collectionDeserializer96);
        org.junit.Assert.assertNull(javaType97);
        org.junit.Assert.assertNull(objCollection98);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = collectionDeserializer7.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer9 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer7);
        boolean boolean10 = collectionDeserializer7.isCachable();
        java.lang.Class<?> wildcardClass11 = collectionDeserializer7.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer13 = collectionDeserializer7.unwrappingDeserializer(nameTransformer12);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer13);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = collectionDeserializer7.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer9 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer7);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = collectionDeserializer9._valueTypeDeserializer;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer11 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer9);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer12 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer11);
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer15 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator16 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer17 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType13, objJsonDeserializer14, typeDeserializer15, valueInstantiator16);
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer20 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator21 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer22 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer24 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType18, objJsonDeserializer19, typeDeserializer20, valueInstantiator21, objJsonDeserializer22, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer24);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer26 = collectionDeserializer25.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer27 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer25);
        com.fasterxml.jackson.databind.JavaType javaType28 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer29 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer30 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator31 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer32 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer34 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType28, objJsonDeserializer29, typeDeserializer30, valueInstantiator31, objJsonDeserializer32, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer35 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer34);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer36 = collectionDeserializer34.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer37 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer39 = collectionDeserializer17.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer25, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer34, typeDeserializer37, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator40 = collectionDeserializer39._valueInstantiator;
        com.fasterxml.jackson.databind.JavaType javaType41 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer42 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer43 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator44 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer45 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType41, objJsonDeserializer42, typeDeserializer43, valueInstantiator44);
        com.fasterxml.jackson.databind.JavaType javaType46 = collectionDeserializer45.getValueType();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer47 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer48 = collectionDeserializer12.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer39, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer45, typeDeserializer47);
        java.lang.Boolean boolean49 = collectionDeserializer12._unwrapSingle;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer50 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer51 = collectionDeserializer12.unwrappingDeserializer(nameTransformer50);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(typeDeserializer10);
        org.junit.Assert.assertNull(objJsonDeserializer26);
        org.junit.Assert.assertNull(objJsonDeserializer36);
        org.junit.Assert.assertNotNull(collectionDeserializer39);
        org.junit.Assert.assertNull(valueInstantiator40);
        org.junit.Assert.assertNull(javaType46);
        org.junit.Assert.assertNotNull(collectionDeserializer48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer51);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = collectionDeserializer7.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer9 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer7);
        java.lang.Class<?> wildcardClass10 = collectionDeserializer7.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = collectionDeserializer7.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = collectionDeserializer7._delegateDeserializer;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer13 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer7);
        com.fasterxml.jackson.databind.JavaType javaType14 = collectionDeserializer7.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = collectionDeserializer7._valueDeserializer;
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
        org.junit.Assert.assertNull(objJsonDeserializer12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNull(objJsonDeserializer15);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer4 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer11 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType5, objJsonDeserializer6, typeDeserializer7, valueInstantiator8, objJsonDeserializer9, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer12 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer11);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = collectionDeserializer12.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer14 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer12);
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer17 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer21 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType15, objJsonDeserializer16, typeDeserializer17, valueInstantiator18, objJsonDeserializer19, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer22 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer21);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer23 = collectionDeserializer21.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer24 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer26 = collectionDeserializer4.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer12, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer21, typeDeserializer24, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator27 = collectionDeserializer26._valueInstantiator;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator28 = collectionDeserializer26._valueInstantiator;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext29 = null;
        java.util.Collection<java.lang.Object> objCollection30 = collectionDeserializer26.getNullValue(deserializationContext29);
        com.fasterxml.jackson.databind.JavaType javaType31 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer32 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer33 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator34 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer35 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType31, objJsonDeserializer32, typeDeserializer33, valueInstantiator34);
        com.fasterxml.jackson.databind.JavaType javaType36 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer37 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer38 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator39 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer40 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer42 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType36, objJsonDeserializer37, typeDeserializer38, valueInstantiator39, objJsonDeserializer40, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer43 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer42);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer44 = collectionDeserializer43.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer45 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer43);
        com.fasterxml.jackson.databind.JavaType javaType46 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer47 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer48 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator49 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer50 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer52 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType46, objJsonDeserializer47, typeDeserializer48, valueInstantiator49, objJsonDeserializer50, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer53 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer52);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer54 = collectionDeserializer52.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer55 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer57 = collectionDeserializer35.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer43, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer52, typeDeserializer55, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer58 = collectionDeserializer43._valueDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType59 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer60 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer61 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator62 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer63 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer65 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType59, objJsonDeserializer60, typeDeserializer61, valueInstantiator62, objJsonDeserializer63, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer66 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer65);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer67 = collectionDeserializer66.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer68 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer66);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer69 = collectionDeserializer68._valueTypeDeserializer;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer70 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer68);
        com.fasterxml.jackson.databind.JavaType javaType71 = collectionDeserializer70._collectionType;
        com.fasterxml.jackson.databind.JavaType javaType72 = collectionDeserializer70.getValueType();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer73 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer75 = collectionDeserializer26.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer43, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer70, typeDeserializer73, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.JavaType javaType76 = collectionDeserializer26.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader77 = collectionDeserializer26.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer78 = collectionDeserializer26.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer79 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer26);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer80 = collectionDeserializer79._delegateDeserializer;
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertNull(objJsonDeserializer23);
        org.junit.Assert.assertNotNull(collectionDeserializer26);
        org.junit.Assert.assertNull(valueInstantiator27);
        org.junit.Assert.assertNull(valueInstantiator28);
        org.junit.Assert.assertNull(objCollection30);
        org.junit.Assert.assertNull(objJsonDeserializer44);
        org.junit.Assert.assertNull(objJsonDeserializer54);
        org.junit.Assert.assertNotNull(collectionDeserializer57);
        org.junit.Assert.assertNull(objJsonDeserializer58);
        org.junit.Assert.assertNull(objJsonDeserializer67);
        org.junit.Assert.assertNull(typeDeserializer69);
        org.junit.Assert.assertNull(javaType71);
        org.junit.Assert.assertNull(javaType72);
        org.junit.Assert.assertNotNull(collectionDeserializer75);
        org.junit.Assert.assertNull(javaType76);
        org.junit.Assert.assertNull(objectIdReader77);
        org.junit.Assert.assertNull(wildcardJsonDeserializer78);
        org.junit.Assert.assertNotNull(objJsonDeserializer80);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType7 = collectionDeserializer6.getValueType();
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator8 = collectionDeserializer6._valueInstantiator;
        java.lang.Class<?> wildcardClass9 = collectionDeserializer6.handledType();
        boolean boolean10 = collectionDeserializer6.isCachable();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = collectionDeserializer6._valueTypeDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType12 = collectionDeserializer6.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty14 = collectionDeserializer6.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: container deserializer of type com.fasterxml.jackson.databind.deser.std.CollectionDeserializer returned null for 'getContentDeserializer()'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(valueInstantiator8);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(typeDeserializer11);
        org.junit.Assert.assertNull(javaType12);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer4 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer11 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType5, objJsonDeserializer6, typeDeserializer7, valueInstantiator8, objJsonDeserializer9, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer12 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer11);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = collectionDeserializer12.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer14 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer12);
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer17 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer21 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType15, objJsonDeserializer16, typeDeserializer17, valueInstantiator18, objJsonDeserializer19, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer22 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer21);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer23 = collectionDeserializer21.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer24 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer26 = collectionDeserializer4.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer12, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer21, typeDeserializer24, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader27 = collectionDeserializer21.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType28 = collectionDeserializer21.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer29 = collectionDeserializer21._valueDeserializer;
        boolean boolean30 = collectionDeserializer21.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext31 = null;
        java.util.Collection<java.lang.Object> objCollection32 = collectionDeserializer21.getNullValue(deserializationContext31);
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator33 = collectionDeserializer21._valueInstantiator;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType34 = collectionDeserializer21.getContentType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertNull(objJsonDeserializer23);
        org.junit.Assert.assertNotNull(collectionDeserializer26);
        org.junit.Assert.assertNull(objectIdReader27);
        org.junit.Assert.assertNull(javaType28);
        org.junit.Assert.assertNull(objJsonDeserializer29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(objCollection32);
        org.junit.Assert.assertNull(valueInstantiator33);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = collectionDeserializer6.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = collectionDeserializer6._delegateDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer15 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType9, objJsonDeserializer10, typeDeserializer11, valueInstantiator12, objJsonDeserializer13, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer16 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer15);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer17 = collectionDeserializer16.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer18 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer16);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer19 = collectionDeserializer18._valueTypeDeserializer;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer20 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer18);
        com.fasterxml.jackson.databind.JavaType javaType21 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer22 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer23 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator24 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer25 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer27 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType21, objJsonDeserializer22, typeDeserializer23, valueInstantiator24, objJsonDeserializer25, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer28 = collectionDeserializer27.getDelegatee();
        java.lang.Class<?> wildcardClass29 = collectionDeserializer27.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer30 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer31 = collectionDeserializer27.unwrappingDeserializer(nameTransformer30);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer32 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer34 = collectionDeserializer6.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer20, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer27, typeDeserializer32, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer35 = collectionDeserializer34.getContentDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer36 = collectionDeserializer34.getContentDeserializer();
        java.lang.Class<?> wildcardClass37 = collectionDeserializer34.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext38 = null;
        java.util.Collection<java.lang.Object> objCollection39 = collectionDeserializer34.getEmptyValue(deserializationContext38);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objJsonDeserializer17);
        org.junit.Assert.assertNull(typeDeserializer19);
        org.junit.Assert.assertNull(wildcardJsonDeserializer28);
        org.junit.Assert.assertNull(wildcardClass29);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer31);
        org.junit.Assert.assertNotNull(collectionDeserializer34);
        org.junit.Assert.assertNotNull(objJsonDeserializer35);
        org.junit.Assert.assertNotNull(objJsonDeserializer36);
        org.junit.Assert.assertNull(wildcardClass37);
        org.junit.Assert.assertNull(objCollection39);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = collectionDeserializer7.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer9 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer7);
        com.fasterxml.jackson.databind.JavaType javaType10 = collectionDeserializer7._collectionType;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator11 = collectionDeserializer7._valueInstantiator;
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(valueInstantiator11);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer3 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer5 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType1, objJsonDeserializer2, typeDeserializer3, valueInstantiator4);
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer12 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType6, objJsonDeserializer7, typeDeserializer8, valueInstantiator9, objJsonDeserializer10, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer13 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer12);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = collectionDeserializer13.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer15 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer13);
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer17 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer18 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator19 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer20 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer22 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType16, objJsonDeserializer17, typeDeserializer18, valueInstantiator19, objJsonDeserializer20, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer23 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer22);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer24 = collectionDeserializer22.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer25 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer27 = collectionDeserializer5.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer13, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer22, typeDeserializer25, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator28 = collectionDeserializer27._valueInstantiator;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer29 = collectionDeserializer27._valueDeserializer;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer30 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator31 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer32 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer29, typeDeserializer30, valueInstantiator31);
        com.fasterxml.jackson.core.JsonParser jsonParser33 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Object> objCollection35 = collectionDeserializer32.deserialize(jsonParser33, deserializationContext34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objJsonDeserializer14);
        org.junit.Assert.assertNull(objJsonDeserializer24);
        org.junit.Assert.assertNotNull(collectionDeserializer27);
        org.junit.Assert.assertNull(valueInstantiator28);
        org.junit.Assert.assertNotNull(objJsonDeserializer29);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer4 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer11 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType5, objJsonDeserializer6, typeDeserializer7, valueInstantiator8, objJsonDeserializer9, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer12 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer11);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = collectionDeserializer12.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer14 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer12);
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer17 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer21 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType15, objJsonDeserializer16, typeDeserializer17, valueInstantiator18, objJsonDeserializer19, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer22 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer21);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer23 = collectionDeserializer21.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer24 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer26 = collectionDeserializer4.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer12, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer21, typeDeserializer24, (java.lang.Boolean) true);
        java.util.Collection<java.lang.Object> objCollection27 = collectionDeserializer4.getKnownPropertyNames();
        boolean boolean28 = collectionDeserializer4.isCachable();
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertNull(objJsonDeserializer23);
        org.junit.Assert.assertNotNull(collectionDeserializer26);
        org.junit.Assert.assertNull(objCollection27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer4 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer11 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType5, objJsonDeserializer6, typeDeserializer7, valueInstantiator8, objJsonDeserializer9, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer12 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer11);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = collectionDeserializer12.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer14 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer12);
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer17 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer21 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType15, objJsonDeserializer16, typeDeserializer17, valueInstantiator18, objJsonDeserializer19, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer22 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer21);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer23 = collectionDeserializer21.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer24 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer26 = collectionDeserializer4.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer12, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer21, typeDeserializer24, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext27 = null;
        java.util.Collection<java.lang.Object> objCollection28 = collectionDeserializer26.getEmptyValue(deserializationContext27);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer29 = collectionDeserializer26._valueTypeDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer30 = collectionDeserializer26._delegateDeserializer;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty32 = collectionDeserializer26.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: container deserializer of type com.fasterxml.jackson.databind.deser.std.CollectionDeserializer returned null for 'getContentDeserializer()'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertNull(objJsonDeserializer23);
        org.junit.Assert.assertNotNull(collectionDeserializer26);
        org.junit.Assert.assertNull(objCollection28);
        org.junit.Assert.assertNull(typeDeserializer29);
        org.junit.Assert.assertNotNull(objJsonDeserializer30);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = collectionDeserializer6.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.util.Collection<java.lang.Object> objCollection9 = collectionDeserializer6.getEmptyValue(deserializationContext8);
        java.util.Collection<java.lang.Object> objCollection10 = collectionDeserializer6.getNullValue();
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNull(objCollection10);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = collectionDeserializer7.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer9 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer7);
        java.util.Collection<java.lang.Object> objCollection10 = collectionDeserializer7.getKnownPropertyNames();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = collectionDeserializer7._valueTypeDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = collectionDeserializer7._valueDeserializer;
        java.lang.Class<?> wildcardClass13 = collectionDeserializer7.getValueClass();
        java.lang.Class<?> wildcardClass14 = collectionDeserializer7.getValueClass();
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(typeDeserializer11);
        org.junit.Assert.assertNull(objJsonDeserializer12);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertNull(wildcardClass14);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer14 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType8, objJsonDeserializer9, typeDeserializer10, valueInstantiator11, objJsonDeserializer12, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer15 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer14);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = collectionDeserializer15.getContentDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer18 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer19 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator20 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer21 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer23 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType17, objJsonDeserializer18, typeDeserializer19, valueInstantiator20, objJsonDeserializer21, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer24 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer23);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer25 = collectionDeserializer24.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer24);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer27 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer28 = collectionDeserializer6.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer15, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer24, typeDeserializer27);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer29 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer30 = collectionDeserializer15.unwrappingDeserializer(nameTransformer29);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer31 = objCollectionJsonDeserializer30.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection32 = objCollectionJsonDeserializer30.getEmptyValue();
        org.junit.Assert.assertNull(objJsonDeserializer16);
        org.junit.Assert.assertNull(objJsonDeserializer25);
        org.junit.Assert.assertNotNull(collectionDeserializer28);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer30);
        org.junit.Assert.assertNull(wildcardJsonDeserializer31);
        org.junit.Assert.assertNull(objCollection32);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) false);
        java.util.Collection<java.lang.Object> objCollection7 = collectionDeserializer6.getEmptyValue();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = collectionDeserializer6._valueTypeDeserializer;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = collectionDeserializer6.deserializeWithType(jsonParser9, deserializationContext10, typeDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNull(typeDeserializer8);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer4 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3);
        com.fasterxml.jackson.databind.JavaType javaType5 = collectionDeserializer4.getValueType();
        java.util.Collection<java.lang.Object> objCollection6 = collectionDeserializer4.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = collectionDeserializer4.getObjectIdReader();
        java.lang.Class<?> wildcardClass8 = collectionDeserializer4.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer15 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType9, objJsonDeserializer10, typeDeserializer11, valueInstantiator12, objJsonDeserializer13, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer17 = collectionDeserializer15.unwrappingDeserializer(nameTransformer16);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer19 = collectionDeserializer15.unwrappingDeserializer(nameTransformer18);
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer21 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer22 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator23 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer24 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType20, objJsonDeserializer21, typeDeserializer22, valueInstantiator23);
        com.fasterxml.jackson.databind.JavaType javaType25 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer26 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer27 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator28 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer29 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer31 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType25, objJsonDeserializer26, typeDeserializer27, valueInstantiator28, objJsonDeserializer29, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer32 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer31);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer33 = collectionDeserializer32.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer34 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer32);
        com.fasterxml.jackson.databind.JavaType javaType35 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer36 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer37 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator38 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer39 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer41 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType35, objJsonDeserializer36, typeDeserializer37, valueInstantiator38, objJsonDeserializer39, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer42 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer41);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer43 = collectionDeserializer41.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer44 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer46 = collectionDeserializer24.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer32, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer41, typeDeserializer44, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader47 = collectionDeserializer41.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType48 = collectionDeserializer41.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer49 = collectionDeserializer41._valueDeserializer;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer50 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer52 = collectionDeserializer4.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer15, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer41, typeDeserializer50, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.JavaType javaType53 = collectionDeserializer52._collectionType;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer54 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer55 = collectionDeserializer52.unwrappingDeserializer(nameTransformer54);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer56 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer57 = collectionDeserializer52.unwrappingDeserializer(nameTransformer56);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext58 = null;
        java.util.Collection<java.lang.Object> objCollection59 = collectionDeserializer52.getEmptyValue(deserializationContext58);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer17);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer19);
        org.junit.Assert.assertNull(objJsonDeserializer33);
        org.junit.Assert.assertNull(objJsonDeserializer43);
        org.junit.Assert.assertNotNull(collectionDeserializer46);
        org.junit.Assert.assertNull(objectIdReader47);
        org.junit.Assert.assertNull(javaType48);
        org.junit.Assert.assertNull(objJsonDeserializer49);
        org.junit.Assert.assertNotNull(collectionDeserializer52);
        org.junit.Assert.assertNull(javaType53);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer55);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer57);
        org.junit.Assert.assertNull(objCollection59);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer3 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer5 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType1, objJsonDeserializer2, typeDeserializer3, valueInstantiator4);
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer12 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType6, objJsonDeserializer7, typeDeserializer8, valueInstantiator9, objJsonDeserializer10, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer13 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer12);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = collectionDeserializer13.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer15 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer13);
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer17 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer18 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator19 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer20 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer22 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType16, objJsonDeserializer17, typeDeserializer18, valueInstantiator19, objJsonDeserializer20, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer23 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer22);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer24 = collectionDeserializer22.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer25 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer27 = collectionDeserializer5.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer13, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer22, typeDeserializer25, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext28 = null;
        java.util.Collection<java.lang.Object> objCollection29 = collectionDeserializer27.getEmptyValue(deserializationContext28);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer30 = collectionDeserializer27._valueTypeDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer31 = collectionDeserializer27.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer32 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator33 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer34 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer31, typeDeserializer32, valueInstantiator33);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader35 = collectionDeserializer34.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer36 = collectionDeserializer34.getContentDeserializer();
        java.lang.Class<?> wildcardClass37 = collectionDeserializer34.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer38 = collectionDeserializer34._delegateDeserializer;
        org.junit.Assert.assertNull(objJsonDeserializer14);
        org.junit.Assert.assertNull(objJsonDeserializer24);
        org.junit.Assert.assertNotNull(collectionDeserializer27);
        org.junit.Assert.assertNull(objCollection29);
        org.junit.Assert.assertNull(typeDeserializer30);
        org.junit.Assert.assertNotNull(objJsonDeserializer31);
        org.junit.Assert.assertNull(objectIdReader35);
        org.junit.Assert.assertNotNull(objJsonDeserializer36);
        org.junit.Assert.assertNull(wildcardClass37);
        org.junit.Assert.assertNull(objJsonDeserializer38);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer6);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = collectionDeserializer7.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer9 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer7);
        java.lang.Class<?> wildcardClass10 = collectionDeserializer7.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = collectionDeserializer7.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection12 = collectionDeserializer7.getEmptyValue();
        java.lang.Boolean boolean13 = collectionDeserializer7._unwrapSingle;
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
        org.junit.Assert.assertNull(objCollection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = collectionDeserializer6.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = collectionDeserializer6._delegateDeserializer;
        java.lang.Boolean boolean9 = collectionDeserializer6._unwrapSingle;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = collectionDeserializer6.getContentDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer13 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator14 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer15 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType11, objJsonDeserializer12, typeDeserializer13, valueInstantiator14);
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer17 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer18 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator19 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer20 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer22 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType16, objJsonDeserializer17, typeDeserializer18, valueInstantiator19, objJsonDeserializer20, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer23 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer22);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer24 = collectionDeserializer23.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer23);
        com.fasterxml.jackson.databind.JavaType javaType26 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer27 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer28 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator29 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer30 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer32 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType26, objJsonDeserializer27, typeDeserializer28, valueInstantiator29, objJsonDeserializer30, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer33 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer32);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer34 = collectionDeserializer32.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer35 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer37 = collectionDeserializer15.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer23, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer32, typeDeserializer35, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType38 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer39 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer40 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator41 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer42 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer44 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType38, objJsonDeserializer39, typeDeserializer40, valueInstantiator41, objJsonDeserializer42, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer45 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer44);
        com.fasterxml.jackson.databind.JavaType javaType46 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer47 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer48 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator49 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer50 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer52 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType46, objJsonDeserializer47, typeDeserializer48, valueInstantiator49, objJsonDeserializer50, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer53 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer52);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer54 = collectionDeserializer53.getContentDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType55 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer56 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer57 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator58 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer59 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer61 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType55, objJsonDeserializer56, typeDeserializer57, valueInstantiator58, objJsonDeserializer59, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer62 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer61);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer63 = collectionDeserializer62.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer64 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer62);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer65 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer66 = collectionDeserializer44.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer53, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer62, typeDeserializer65);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer67 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer68 = collectionDeserializer6.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer15, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer66, typeDeserializer67);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer69 = collectionDeserializer15._delegateDeserializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer70 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>> objCollectionJsonDeserializer71 = collectionDeserializer15.unwrappingDeserializer(nameTransformer70);
        java.util.Collection<java.lang.Object> objCollection72 = collectionDeserializer15.getKnownPropertyNames();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer73 = collectionDeserializer15._valueTypeDeserializer;
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(objJsonDeserializer10);
        org.junit.Assert.assertNull(objJsonDeserializer24);
        org.junit.Assert.assertNull(objJsonDeserializer34);
        org.junit.Assert.assertNotNull(collectionDeserializer37);
        org.junit.Assert.assertNull(objJsonDeserializer54);
        org.junit.Assert.assertNull(objJsonDeserializer63);
        org.junit.Assert.assertNotNull(collectionDeserializer66);
        org.junit.Assert.assertNotNull(collectionDeserializer68);
        org.junit.Assert.assertNull(objJsonDeserializer69);
        org.junit.Assert.assertNotNull(objCollectionJsonDeserializer71);
        org.junit.Assert.assertNull(objCollection72);
        org.junit.Assert.assertNull(typeDeserializer73);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer6 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3, objJsonDeserializer4, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType7 = collectionDeserializer6.getValueType();
        java.util.Collection<java.lang.Object> objCollection8 = collectionDeserializer6.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator9 = collectionDeserializer6._valueInstantiator;
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.util.Collection<java.lang.Object> objCollection12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Object> objCollection13 = collectionDeserializer6.deserialize(jsonParser10, deserializationContext11, objCollection12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNull(valueInstantiator9);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer3 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer7 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType1, objJsonDeserializer2, typeDeserializer3, valueInstantiator4, objJsonDeserializer5, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer8 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer7);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = collectionDeserializer8.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer10 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer8);
        java.lang.Class<?> wildcardClass11 = collectionDeserializer8.handledType();
        java.lang.Class<?> wildcardClass12 = collectionDeserializer8.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer15 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer17 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer19 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType13, objJsonDeserializer14, typeDeserializer15, valueInstantiator16, objJsonDeserializer17, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer20 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer19);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer21 = collectionDeserializer20.getContentDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer22 = collectionDeserializer20.getContentDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType23 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer24 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer25 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator26 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer27 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer29 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType23, objJsonDeserializer24, typeDeserializer25, valueInstantiator26, objJsonDeserializer27, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType30 = collectionDeserializer29.getValueType();
        java.util.Collection<java.lang.Object> objCollection31 = collectionDeserializer29.getKnownPropertyNames();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer32 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer34 = collectionDeserializer8.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer20, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer29, typeDeserializer32, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.JavaType javaType35 = collectionDeserializer34.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType36 = collectionDeserializer34.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer37 = collectionDeserializer34._valueDeserializer;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer38 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator39 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer40 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer37, typeDeserializer38, valueInstantiator39);
        java.lang.Class<?> wildcardClass41 = collectionDeserializer40.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer42 = collectionDeserializer40._delegateDeserializer;
        java.lang.Class<?> wildcardClass43 = collectionDeserializer40.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType44 = collectionDeserializer40.getContentType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objJsonDeserializer9);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNull(objJsonDeserializer21);
        org.junit.Assert.assertNull(objJsonDeserializer22);
        org.junit.Assert.assertNull(javaType30);
        org.junit.Assert.assertNull(objCollection31);
        org.junit.Assert.assertNotNull(collectionDeserializer34);
        org.junit.Assert.assertNull(javaType35);
        org.junit.Assert.assertNull(javaType36);
        org.junit.Assert.assertNotNull(objJsonDeserializer37);
        org.junit.Assert.assertNull(wildcardClass41);
        org.junit.Assert.assertNull(objJsonDeserializer42);
        org.junit.Assert.assertNull(wildcardClass43);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer2 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator3 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer4 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType0, objJsonDeserializer1, typeDeserializer2, valueInstantiator3);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer5 = collectionDeserializer4._valueTypeDeserializer;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = collectionDeserializer4.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = collectionDeserializer4._delegateDeserializer;
        java.util.Collection<java.lang.Object> objCollection8 = collectionDeserializer4.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator12 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer13 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType9, objJsonDeserializer10, typeDeserializer11, valueInstantiator12);
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer16 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator17 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer18 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer20 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType14, objJsonDeserializer15, typeDeserializer16, valueInstantiator17, objJsonDeserializer18, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer21 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer20);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer22 = collectionDeserializer21.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer23 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer21);
        com.fasterxml.jackson.databind.JavaType javaType24 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer25 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer26 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator27 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer28 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer30 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType24, objJsonDeserializer25, typeDeserializer26, valueInstantiator27, objJsonDeserializer28, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer31 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer30);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer32 = collectionDeserializer30.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer33 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer35 = collectionDeserializer13.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer21, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer30, typeDeserializer33, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader36 = collectionDeserializer30.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType37 = collectionDeserializer30.getValueType();
        java.util.Collection<java.lang.Object> objCollection38 = collectionDeserializer30.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType39 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer40 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer41 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator42 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer43 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType39, objJsonDeserializer40, typeDeserializer41, valueInstantiator42);
        com.fasterxml.jackson.databind.JavaType javaType44 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer45 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer46 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator47 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer48 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer50 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType44, objJsonDeserializer45, typeDeserializer46, valueInstantiator47, objJsonDeserializer48, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer51 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer50);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer52 = collectionDeserializer51.getContentDeserializer();
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer53 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer51);
        com.fasterxml.jackson.databind.JavaType javaType54 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer55 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer56 = null;
        com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator57 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer58 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer60 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(javaType54, objJsonDeserializer55, typeDeserializer56, valueInstantiator57, objJsonDeserializer58, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer61 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer60);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer62 = collectionDeserializer60.getContentDeserializer();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer63 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer65 = collectionDeserializer43.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer51, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer60, typeDeserializer63, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer66 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(collectionDeserializer60);
        boolean boolean67 = collectionDeserializer60.isCachable();
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer68 = null;
        com.fasterxml.jackson.databind.deser.std.CollectionDeserializer collectionDeserializer70 = collectionDeserializer4.withResolved((com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer30, (com.fasterxml.jackson.databind.JsonDeserializer<java.util.Collection<java.lang.Object>>) collectionDeserializer60, typeDeserializer68, (java.lang.Boolean) true);
        java.util.Collection<java.lang.Object> objCollection71 = collectionDeserializer60.getNullValue();
        java.util.Collection<java.lang.Object> objCollection72 = collectionDeserializer60.getEmptyValue();
        org.junit.Assert.assertNull(typeDeserializer5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNull(objJsonDeserializer22);
        org.junit.Assert.assertNull(objJsonDeserializer32);
        org.junit.Assert.assertNotNull(collectionDeserializer35);
        org.junit.Assert.assertNull(objectIdReader36);
        org.junit.Assert.assertNull(javaType37);
        org.junit.Assert.assertNull(objCollection38);
        org.junit.Assert.assertNull(objJsonDeserializer52);
        org.junit.Assert.assertNull(objJsonDeserializer62);
        org.junit.Assert.assertNotNull(collectionDeserializer65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(collectionDeserializer70);
        org.junit.Assert.assertNull(objCollection71);
        org.junit.Assert.assertNull(objCollection72);
    }
}

