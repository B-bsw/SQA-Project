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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = deserializerCache0.findConvertingDeserializer(deserializationContext1, annotated2, objJsonDeserializer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = deserializerCache0._createDeserializer(deserializationContext1, deserializerFactory2, javaType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext2, annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = deserializerCache0._createDeserializer2(deserializationContext3, deserializerFactory4, javaType5, beanDescription6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = deserializerCache0._createDeserializer(deserializationContext4, deserializerFactory5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.lang.Class<?> wildcardClass4 = deserializerCache0.getClass();
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = deserializerCache0._handleUnknownValueDeserializer(deserializationContext2, javaType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer6 = deserializerCache0.findKeyDeserializer(deserializationContext3, deserializerFactory4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = deserializerCache0._findCachedDeserializer(javaType4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext1, deserializerFactory2, javaType3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Class<?> wildcardClass3 = deserializerCache0.getClass();
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer7 = deserializerCache0.findKeyDeserializer(deserializationContext4, deserializerFactory5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = deserializerCache0._findCachedDeserializer(javaType4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = deserializerCache0._handleUnknownValueDeserializer(deserializationContext4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = deserializerCache0._handleUnknownValueDeserializer(deserializationContext4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = deserializerCache0.hasValueDeserializerFor(deserializationContext6, deserializerFactory7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = deserializerCache0._createDeserializer2(deserializationContext4, deserializerFactory5, javaType6, beanDescription7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = deserializerCache0.hasValueDeserializerFor(deserializationContext1, deserializerFactory2, javaType3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = deserializerCache0._createDeserializer2(deserializationContext5, deserializerFactory6, javaType7, beanDescription8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer8 = deserializerCache0.findKeyDeserializer(deserializationContext5, deserializerFactory6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = deserializerCache0.hasValueDeserializerFor(deserializationContext4, deserializerFactory5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0._createAndCache2(deserializationContext5, deserializerFactory6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter3 = deserializerCache0.findConverter(deserializationContext1, annotated2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0.findValueDeserializer(deserializationContext5, deserializerFactory6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer6 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = deserializerCache0._createAndCache2(deserializationContext4, deserializerFactory5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext2, deserializerFactory3, javaType4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0.findConvertingDeserializer(deserializationContext5, annotated6, objJsonDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = deserializerCache0.findConvertingDeserializer(deserializationContext3, annotated4, objJsonDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext3, deserializerFactory4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = deserializerCache0.hasValueDeserializerFor(deserializationContext4, deserializerFactory5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer7 = deserializerCache0.findKeyDeserializer(deserializationContext4, deserializerFactory5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0.findValueDeserializer(deserializationContext5, deserializerFactory6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer6 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Class<?> wildcardClass3 = javaTypeMap2.getClass();
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = deserializerCache0.findValueDeserializer(deserializationContext4, deserializerFactory5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = deserializerCache0.findValueDeserializer(deserializationContext3, deserializerFactory4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = deserializerCache0._createDeserializer2(deserializationContext6, deserializerFactory7, javaType8, beanDescription9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer8 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0._createDeserializer(deserializationContext6, deserializerFactory7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = deserializerCache0.hasValueDeserializerFor(deserializationContext3, deserializerFactory4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = deserializerCache0._createDeserializer2(deserializationContext5, deserializerFactory6, javaType7, beanDescription8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer5 = deserializerCache0.findKeyDeserializer(deserializationContext2, deserializerFactory3, javaType4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = deserializerCache0.hasValueDeserializerFor(deserializationContext6, deserializerFactory7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext3, annotated4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = deserializerCache0.findValueDeserializer(deserializationContext3, deserializerFactory4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = deserializerCache0._createDeserializer2(deserializationContext8, deserializerFactory9, javaType10, beanDescription11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = deserializerCache0._createAndCache2(deserializationContext3, deserializerFactory4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter8 = deserializerCache0.findConverter(deserializationContext6, annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = deserializerCache0._createDeserializer(deserializationContext3, deserializerFactory4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = deserializerCache0._createDeserializer2(deserializationContext4, deserializerFactory5, javaType6, beanDescription7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = deserializerCache0._createDeserializer2(deserializationContext1, deserializerFactory2, javaType3, beanDescription4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = deserializerCache0._createAndCache2(deserializationContext3, deserializerFactory4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0._createDeserializer(deserializationContext5, deserializerFactory6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = deserializerCache0.findValueDeserializer(deserializationContext4, deserializerFactory5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext3, annotated4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0._createAndCache2(deserializationContext6, deserializerFactory7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = deserializerCache0._createAndCache2(deserializationContext3, deserializerFactory4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = deserializerCache0._createAndCache2(deserializationContext4, deserializerFactory5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0.findValueDeserializer(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0._handleUnknownValueDeserializer(deserializationContext7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext6, annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer8 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer6 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer8 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer8 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0._createAndCache2(deserializationContext5, deserializerFactory6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter7 = deserializerCache0.findConverter(deserializationContext5, annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer9 = deserializerCache0.findKeyDeserializer(deserializationContext6, deserializerFactory7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Class<?> wildcardClass1 = deserializerCache0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0._createDeserializer(deserializationContext6, deserializerFactory7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0.findConvertingDeserializer(deserializationContext7, annotated8, objJsonDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = deserializerCache0._createDeserializer(deserializationContext3, deserializerFactory4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = deserializerCache0.hasValueDeserializerFor(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0.findValueDeserializer(deserializationContext6, deserializerFactory7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = deserializerCache0.hasValueDeserializerFor(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.lang.Class<?> wildcardClass5 = deserializerCache0.getClass();
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0._handleUnknownValueDeserializer(deserializationContext7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = deserializerCache0.hasValueDeserializerFor(deserializationContext3, deserializerFactory4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext5, annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._handleUnknownValueDeserializer(deserializationContext9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = deserializerCache0._createDeserializer2(deserializationContext5, deserializerFactory6, javaType7, beanDescription8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = deserializerCache0._createAndCache2(deserializationContext4, deserializerFactory5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0._createDeserializer(deserializationContext9, deserializerFactory10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = deserializerCache0._findCachedDeserializer(javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer8 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = deserializerCache0.hasValueDeserializerFor(deserializationContext4, deserializerFactory5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext6, deserializerFactory7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer10 = deserializerCache0.findKeyDeserializer(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.lang.Class<?> wildcardClass9 = deserializerCache0.getClass();
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0.findValueDeserializer(deserializationContext5, deserializerFactory6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer6 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = deserializerCache0.hasValueDeserializerFor(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0._createAndCache2(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = deserializerCache0.hasValueDeserializerFor(deserializationContext2, deserializerFactory3, javaType4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = deserializerCache0._findCachedDeserializer(javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0._createAndCache2(deserializationContext9, deserializerFactory10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0.findValueDeserializer(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer10 = deserializerCache0.findKeyDeserializer(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0._handleUnknownValueDeserializer(deserializationContext7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0.findConvertingDeserializer(deserializationContext7, annotated8, objJsonDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer10 = deserializerCache0.findKeyDeserializer(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer9 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer6 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0._createAndCache2(deserializationContext6, deserializerFactory7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter12 = deserializerCache0.findConverter(deserializationContext10, annotated11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0.findConvertingDeserializer(deserializationContext5, annotated6, objJsonDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = deserializerCache0._handleUnknownValueDeserializer(deserializationContext3, javaType4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = deserializerCache0.findValueDeserializer(deserializationContext4, deserializerFactory5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0._findCachedDeserializer(javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.lang.Class<?> wildcardClass7 = javaTypeMap6.getClass();
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter11 = deserializerCache0.findConverter(deserializationContext9, annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer9 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = deserializerCache0._createDeserializer2(deserializationContext6, deserializerFactory7, javaType8, beanDescription9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = deserializerCache0._createDeserializer2(deserializationContext8, deserializerFactory9, javaType10, beanDescription11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = deserializerCache0._handleUnknownValueDeserializer(deserializationContext4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = deserializerCache0._findCachedDeserializer(javaType3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = deserializerCache0._findCachedDeserializer(javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Class<?> wildcardClass10 = deserializerCache0.getClass();
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer9 = deserializerCache0.findKeyDeserializer(deserializationContext6, deserializerFactory7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0.findValueDeserializer(deserializationContext9, deserializerFactory10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = deserializerCache0._findCachedDeserializer(javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = deserializerCache0._findCachedDeserializer(javaType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.lang.Class<?> wildcardClass8 = javaTypeMap7.getClass();
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        int int6 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0._createAndCache2(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer8 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0._createDeserializer(deserializationContext5, deserializerFactory6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0._createAndCache2(deserializationContext5, deserializerFactory6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = deserializerCache0._createAndCache2(deserializationContext4, deserializerFactory5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer11 = deserializerCache0.findKeyDeserializer(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext5, deserializerFactory6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0._handleUnknownValueDeserializer(deserializationContext6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0._findCachedDeserializer(javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = deserializerCache0.hasValueDeserializerFor(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0._createDeserializer(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        int int6 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter9 = deserializerCache0.findConverter(deserializationContext7, annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = deserializerCache0.hasValueDeserializerFor(deserializationContext9, deserializerFactory10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = deserializerCache0._findCachedDeserializer(javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter8 = deserializerCache0.findConverter(deserializationContext6, annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = deserializerCache0._findCachedDeserializer(javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0._findCachedDeserializer(javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext7, annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0.findConvertingDeserializer(deserializationContext8, annotated9, objJsonDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0._handleUnknownValueDeserializer(deserializationContext10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.lang.Class<?> wildcardClass10 = deserializerCache0.getClass();
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0.findValueDeserializer(deserializationContext6, deserializerFactory7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0.findConvertingDeserializer(deserializationContext7, annotated8, objJsonDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext5, deserializerFactory6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext5, annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter8 = deserializerCache0.findConverter(deserializationContext6, annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.lang.Class<?> wildcardClass7 = deserializerCache0.getClass();
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer8 = deserializerCache0.findKeyDeserializer(deserializationContext5, deserializerFactory6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer7 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0._createDeserializer(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = deserializerCache0._findCachedDeserializer(javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0.findValueDeserializer(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = deserializerCache0.findConvertingDeserializer(deserializationContext4, annotated5, objJsonDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0.findValueDeserializer(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer10 = deserializerCache0.findKeyDeserializer(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = deserializerCache0._createAndCache2(deserializationContext10, deserializerFactory11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = deserializerCache0._createDeserializer(deserializationContext4, deserializerFactory5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer11 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = deserializerCache0._createDeserializer2(deserializationContext7, deserializerFactory8, javaType9, beanDescription10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = deserializerCache0._createDeserializer2(deserializationContext2, deserializerFactory3, javaType4, beanDescription5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = deserializerCache0.hasValueDeserializerFor(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.lang.Class<?> wildcardClass6 = javaTypeMap5.getClass();
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0.findValueDeserializer(deserializationContext5, deserializerFactory6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer4 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext2, javaType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext8, annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer11 = deserializerCache0.findKeyDeserializer(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = deserializerCache0._createAndCache2(deserializationContext4, deserializerFactory5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0.findValueDeserializer(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = deserializerCache0.hasValueDeserializerFor(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        int int11 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = deserializerCache0._createDeserializer(deserializationContext12, deserializerFactory13, javaType14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        int int11 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = deserializerCache0.findConvertingDeserializer(deserializationContext12, annotated13, objJsonDeserializer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int10 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext11, annotated12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0._handleUnknownValueDeserializer(deserializationContext7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0._createDeserializer(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = deserializerCache0._createDeserializer2(deserializationContext4, deserializerFactory5, javaType6, beanDescription7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0.findConvertingDeserializer(deserializationContext5, annotated6, objJsonDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0._createAndCache2(deserializationContext9, deserializerFactory10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0._createAndCache2(deserializationContext5, deserializerFactory6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap4);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0.findValueDeserializer(deserializationContext6, deserializerFactory7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = deserializerCache0._createAndCache2(deserializationContext10, deserializerFactory11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        int int7 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0.findConvertingDeserializer(deserializationContext8, annotated9, objJsonDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter8 = deserializerCache0.findConverter(deserializationContext6, annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext9, annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext4, annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer9 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0.findValueDeserializer(deserializationContext6, deserializerFactory7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = deserializerCache0.findConvertingDeserializer(deserializationContext4, annotated5, objJsonDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int10 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = deserializerCache0._createAndCache2(deserializationContext11, deserializerFactory12, javaType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter4 = deserializerCache0.findConverter(deserializationContext2, annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0.findConvertingDeserializer(deserializationContext5, annotated6, objJsonDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer9 = deserializerCache0.findKeyDeserializer(deserializationContext6, deserializerFactory7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0._createAndCache2(deserializationContext5, deserializerFactory6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = deserializerCache0.findValueDeserializer(deserializationContext4, deserializerFactory5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext5, annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = deserializerCache0._createDeserializer(deserializationContext11, deserializerFactory12, javaType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        int int3 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext4, deserializerFactory5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext6, annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = deserializerCache0._handleUnknownValueDeserializer(deserializationContext3, javaType4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._createDeserializer(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.lang.Class<?> wildcardClass9 = deserializerCache0.getClass();
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0.findConvertingDeserializer(deserializationContext8, annotated9, objJsonDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        int int6 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0._createDeserializer(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int5 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer8 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter4 = deserializerCache0.findConverter(deserializationContext2, annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer7 = deserializerCache0.findKeyDeserializer(deserializationContext4, deserializerFactory5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = deserializerCache0.findValueDeserializer(deserializationContext1, deserializerFactory2, javaType3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.lang.Class<?> wildcardClass5 = deserializerCache0.getClass();
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj11 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext12, deserializerFactory13, javaType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = deserializerCache0.hasValueDeserializerFor(deserializationContext11, deserializerFactory12, javaType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer13 = deserializerCache0.findKeyDeserializer(deserializationContext10, deserializerFactory11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer11 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0._findCachedDeserializer(javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Class<?> wildcardClass6 = deserializerCache0.getClass();
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = deserializerCache0.findConvertingDeserializer(deserializationContext4, annotated5, objJsonDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0.findValueDeserializer(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj11 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = deserializerCache0.findValueDeserializer(deserializationContext12, deserializerFactory13, javaType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = deserializerCache0.findConvertingDeserializer(deserializationContext2, annotated3, objJsonDeserializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0.findConvertingDeserializer(deserializationContext5, annotated6, objJsonDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter8 = deserializerCache0.findConverter(deserializationContext6, annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = deserializerCache0.findConvertingDeserializer(deserializationContext3, annotated4, objJsonDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0._handleUnknownValueDeserializer(deserializationContext8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.lang.Class<?> wildcardClass10 = javaTypeMap9.getClass();
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._createDeserializer(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext8, annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext11, deserializerFactory12, javaType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        int int6 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = deserializerCache0.hasValueDeserializerFor(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj11 = deserializerCache0.writeReplace();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = deserializerCache0._createDeserializer2(deserializationContext9, deserializerFactory10, javaType11, beanDescription12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        int int11 = deserializerCache0.cachedDeserializersCount();
        int int12 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext13, annotated14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0._handleUnknownValueDeserializer(deserializationContext7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Class<?> wildcardClass6 = deserializerCache0.getClass();
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        int int11 = deserializerCache0.cachedDeserializersCount();
        int int12 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer16 = deserializerCache0.findKeyDeserializer(deserializationContext13, deserializerFactory14, javaType15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int10 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = deserializerCache0.findConvertingDeserializer(deserializationContext11, annotated12, objJsonDeserializer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._createAndCache2(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext4, annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        int int10 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter13 = deserializerCache0.findConverter(deserializationContext11, annotated12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext6, annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext4, deserializerFactory5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._createDeserializer(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = deserializerCache0._findCachedDeserializer(javaType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter7 = deserializerCache0.findConverter(deserializationContext5, annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        int int10 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer14 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext12, javaType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap11);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0.findConvertingDeserializer(deserializationContext8, annotated9, objJsonDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = deserializerCache0._createDeserializer2(deserializationContext8, deserializerFactory9, javaType10, beanDescription11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter7 = deserializerCache0.findConverter(deserializationContext5, annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0._findCachedDeserializer(javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0._handleUnknownValueDeserializer(deserializationContext8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0._createAndCache2(deserializationContext5, deserializerFactory6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Class<?> wildcardClass6 = deserializerCache0.getClass();
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext7, annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = deserializerCache0._handleUnknownValueDeserializer(deserializationContext11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer9 = deserializerCache0.findKeyDeserializer(deserializationContext6, deserializerFactory7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0.findConvertingDeserializer(deserializationContext8, annotated9, objJsonDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0._createDeserializer(deserializationContext5, deserializerFactory6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = deserializerCache0._createDeserializer2(deserializationContext9, deserializerFactory10, javaType11, beanDescription12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer7 = deserializerCache0.findKeyDeserializer(deserializationContext4, deserializerFactory5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0._createAndCache2(deserializationContext6, deserializerFactory7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer10 = deserializerCache0.findKeyDeserializer(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj9 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext10, annotated11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = deserializerCache0._handleUnknownValueDeserializer(deserializationContext2, javaType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer13 = deserializerCache0.findKeyDeserializer(deserializationContext10, deserializerFactory11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0._findCachedDeserializer(javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer11 = deserializerCache0.findKeyDeserializer(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int10 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer13 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter9 = deserializerCache0.findConverter(deserializationContext7, annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter10 = deserializerCache0.findConverter(deserializationContext8, annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = deserializerCache0._handleUnknownValueDeserializer(deserializationContext5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = deserializerCache0._createDeserializer2(deserializationContext8, deserializerFactory9, javaType10, beanDescription11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext6, deserializerFactory7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer5 = deserializerCache0.findKeyDeserializer(deserializationContext2, deserializerFactory3, javaType4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0.findValueDeserializer(deserializationContext5, deserializerFactory6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.lang.Class<?> wildcardClass7 = deserializerCache0.getClass();
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = deserializerCache0.findConvertingDeserializer(deserializationContext4, annotated5, objJsonDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer10 = deserializerCache0.findKeyDeserializer(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0.findConvertingDeserializer(deserializationContext7, annotated8, objJsonDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer7 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = deserializerCache0._createDeserializer2(deserializationContext7, deserializerFactory8, javaType9, beanDescription10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0.findConvertingDeserializer(deserializationContext9, annotated10, objJsonDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext8, annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer12 = deserializerCache0.findKeyDeserializer(deserializationContext9, deserializerFactory10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.lang.Class<?> wildcardClass10 = deserializerCache0.getClass();
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext9, deserializerFactory10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0._createDeserializer(deserializationContext9, deserializerFactory10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        int int11 = deserializerCache0.cachedDeserializersCount();
        int int12 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer17 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext14, deserializerFactory15, javaType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = deserializerCache0._createDeserializer2(deserializationContext8, deserializerFactory9, javaType10, beanDescription11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0._findCachedDeserializer(javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext2, deserializerFactory3, javaType4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter6 = deserializerCache0.findConverter(deserializationContext4, annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0.findValueDeserializer(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer13 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = deserializerCache0._createAndCache2(deserializationContext11, deserializerFactory12, javaType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0._createAndCache2(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        int int10 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext12, deserializerFactory13, javaType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap11);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = deserializerCache0.hasValueDeserializerFor(deserializationContext11, deserializerFactory12, javaType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = deserializerCache0._findCachedDeserializer(javaType4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0._createAndCache2(deserializationContext6, deserializerFactory7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter12 = deserializerCache0.findConverter(deserializationContext10, annotated11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter4 = deserializerCache0.findConverter(deserializationContext2, annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer9 = deserializerCache0.findKeyDeserializer(deserializationContext6, deserializerFactory7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj11 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = deserializerCache0._handleUnknownValueDeserializer(deserializationContext12, javaType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int5 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext6, annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int10 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = deserializerCache0.hasValueDeserializerFor(deserializationContext11, deserializerFactory12, javaType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = deserializerCache0._createDeserializer2(deserializationContext7, deserializerFactory8, javaType9, beanDescription10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = deserializerCache0._createDeserializer2(deserializationContext11, deserializerFactory12, javaType13, beanDescription14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj9 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer13 = deserializerCache0.findKeyDeserializer(deserializationContext10, deserializerFactory11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0.findValueDeserializer(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj11 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = deserializerCache0.findConvertingDeserializer(deserializationContext12, annotated13, objJsonDeserializer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0.findConvertingDeserializer(deserializationContext9, annotated10, objJsonDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0.findValueDeserializer(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._createDeserializer(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        int int11 = deserializerCache0.cachedDeserializersCount();
        int int12 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer17 = deserializerCache0._createAndCache2(deserializationContext14, deserializerFactory15, javaType16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = deserializerCache0._findCachedDeserializer(javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext10, deserializerFactory11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0._createAndCache2(deserializationContext6, deserializerFactory7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0._createDeserializer(deserializationContext5, deserializerFactory6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = deserializerCache0.hasValueDeserializerFor(deserializationContext5, deserializerFactory6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0._createDeserializer(deserializationContext9, deserializerFactory10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = deserializerCache0._createDeserializer2(deserializationContext3, deserializerFactory4, javaType5, beanDescription6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = deserializerCache0._createAndCache2(deserializationContext11, deserializerFactory12, javaType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = deserializerCache0._handleUnknownValueDeserializer(deserializationContext4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        int int10 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = deserializerCache0.hasValueDeserializerFor(deserializationContext12, deserializerFactory13, javaType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap11);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj9 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._findCachedDeserializer(javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer11 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = deserializerCache0.hasValueDeserializerFor(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0.findValueDeserializer(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0._createDeserializer(deserializationContext9, deserializerFactory10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = deserializerCache0.findConvertingDeserializer(deserializationContext10, annotated11, objJsonDeserializer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext6, annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = deserializerCache0.hasValueDeserializerFor(deserializationContext3, deserializerFactory4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0._createAndCache2(deserializationContext6, deserializerFactory7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        int int10 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._cachedDeserializers;
        int int12 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext13, annotated14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        int int3 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext4, annotated5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = deserializerCache0._handleUnknownValueDeserializer(deserializationContext11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0.findValueDeserializer(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter10 = deserializerCache0.findConverter(deserializationContext8, annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = deserializerCache0.hasValueDeserializerFor(deserializationContext6, deserializerFactory7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        int int3 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = deserializerCache0._findCachedDeserializer(javaType4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        int int5 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext6, annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = deserializerCache0.hasValueDeserializerFor(deserializationContext9, deserializerFactory10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        int int7 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer11 = deserializerCache0.findKeyDeserializer(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.lang.Class<?> wildcardClass3 = javaTypeMap2.getClass();
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0._createDeserializer(deserializationContext9, deserializerFactory10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext6, annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.lang.Class<?> wildcardClass6 = deserializerCache0.getClass();
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int10 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = deserializerCache0._handleUnknownValueDeserializer(deserializationContext11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0._findCachedDeserializer(javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        int int6 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0.findConvertingDeserializer(deserializationContext7, annotated8, objJsonDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = deserializerCache0._handleUnknownValueDeserializer(deserializationContext12, javaType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(javaTypeMap11);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = deserializerCache0.hasValueDeserializerFor(deserializationContext2, deserializerFactory3, javaType4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = deserializerCache0.findValueDeserializer(deserializationContext10, deserializerFactory11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0._createDeserializer(deserializationContext9, deserializerFactory10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer7 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj9 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = deserializerCache0.findConvertingDeserializer(deserializationContext10, annotated11, objJsonDeserializer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer12 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer10 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = deserializerCache0._createDeserializer2(deserializationContext8, deserializerFactory9, javaType10, beanDescription11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer11 = deserializerCache0.findKeyDeserializer(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj9 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext10, deserializerFactory11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = deserializerCache0.findValueDeserializer(deserializationContext3, deserializerFactory4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext2, deserializerFactory3, javaType4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0._createDeserializer(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter13 = deserializerCache0.findConverter(deserializationContext11, annotated12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext8, annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._createDeserializer(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer7 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext8, annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        int int5 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer9 = deserializerCache0.findKeyDeserializer(deserializationContext6, deserializerFactory7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = deserializerCache0.hasValueDeserializerFor(deserializationContext9, deserializerFactory10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj10 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer14 = deserializerCache0.findKeyDeserializer(deserializationContext11, deserializerFactory12, javaType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0.findValueDeserializer(deserializationContext9, deserializerFactory10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = deserializerCache0._createDeserializer2(deserializationContext10, deserializerFactory11, javaType12, beanDescription13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = deserializerCache0._handleUnknownValueDeserializer(deserializationContext5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer14 = deserializerCache0.findKeyDeserializer(deserializationContext11, deserializerFactory12, javaType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext5, deserializerFactory6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = deserializerCache0._handleUnknownValueDeserializer(deserializationContext5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap4);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0._createAndCache2(deserializationContext6, deserializerFactory7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._findCachedDeserializer(javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter7 = deserializerCache0.findConverter(deserializationContext5, annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj10 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = deserializerCache0._handleUnknownValueDeserializer(deserializationContext11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter5 = deserializerCache0.findConverter(deserializationContext3, annotated4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        int int11 = deserializerCache0.cachedDeserializersCount();
        int int12 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer15 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext13, javaType14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer5 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext3, javaType4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = deserializerCache0.findValueDeserializer(deserializationContext12, deserializerFactory13, javaType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = deserializerCache0._findCachedDeserializer(javaType4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._createDeserializer(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._createAndCache2(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer13 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0._createDeserializer(deserializationContext9, deserializerFactory10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj10 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer13 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = deserializerCache0._findCachedDeserializer(javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0._createDeserializer(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext10, deserializerFactory11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = deserializerCache0.hasValueDeserializerFor(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj9 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext10, deserializerFactory11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        int int10 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._cachedDeserializers;
        int int12 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer17 = deserializerCache0._createDeserializer2(deserializationContext13, deserializerFactory14, javaType15, beanDescription16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        int int5 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0.findConvertingDeserializer(deserializationContext6, annotated7, objJsonDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer8 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0.findValueDeserializer(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj10 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = deserializerCache0.hasValueDeserializerFor(deserializationContext12, deserializerFactory13, javaType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer13 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.lang.Object obj9 = deserializerCache0.writeReplace();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0.findConvertingDeserializer(deserializationContext9, annotated10, objJsonDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = deserializerCache0.findValueDeserializer(deserializationContext10, deserializerFactory11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter9 = deserializerCache0.findConverter(deserializationContext7, annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0._createDeserializer(deserializationContext6, deserializerFactory7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = deserializerCache0.hasValueDeserializerFor(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj11 = deserializerCache0.writeReplace();
        java.lang.Object obj12 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext13, annotated14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0._createDeserializer(deserializationContext6, deserializerFactory7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext8, annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0._createDeserializer(deserializationContext5, deserializerFactory6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        int int5 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = deserializerCache0._createDeserializer2(deserializationContext6, deserializerFactory7, javaType8, beanDescription9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = deserializerCache0._findCachedDeserializer(javaType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = deserializerCache0.hasValueDeserializerFor(deserializationContext5, deserializerFactory6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext5, deserializerFactory6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = deserializerCache0._handleUnknownValueDeserializer(deserializationContext4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = deserializerCache0._createDeserializer2(deserializationContext8, deserializerFactory9, javaType10, beanDescription11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        int int5 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = deserializerCache0._createDeserializer2(deserializationContext6, deserializerFactory7, javaType8, beanDescription9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer4 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext2, javaType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0._createDeserializer(deserializationContext9, deserializerFactory10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = deserializerCache0.hasValueDeserializerFor(deserializationContext5, deserializerFactory6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        int int7 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0._findCachedDeserializer(javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        int int7 = deserializerCache0.cachedDeserializersCount();
        int int8 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = deserializerCache0._createDeserializer2(deserializationContext9, deserializerFactory10, javaType11, beanDescription12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = deserializerCache0._createDeserializer2(deserializationContext9, deserializerFactory10, javaType11, beanDescription12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = deserializerCache0.findConvertingDeserializer(deserializationContext10, annotated11, objJsonDeserializer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        int int10 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0._findCachedDeserializer(javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        int int9 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = deserializerCache0._createDeserializer(deserializationContext10, deserializerFactory11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        int int3 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer7 = deserializerCache0.findKeyDeserializer(deserializationContext4, deserializerFactory5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._createAndCache2(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.lang.Class<?> wildcardClass8 = javaTypeMap7.getClass();
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0._findCachedDeserializer(javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext10, annotated11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0._findCachedDeserializer(javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = deserializerCache0.findValueDeserializer(deserializationContext4, deserializerFactory5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.lang.Class<?> wildcardClass4 = deserializerCache0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = deserializerCache0._createDeserializer2(deserializationContext6, deserializerFactory7, javaType8, beanDescription9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = deserializerCache0._createDeserializer(deserializationContext4, deserializerFactory5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = deserializerCache0.findValueDeserializer(deserializationContext10, deserializerFactory11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        int int7 = deserializerCache0.cachedDeserializersCount();
        int int8 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter11 = deserializerCache0.findConverter(deserializationContext9, annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = deserializerCache0._createDeserializer2(deserializationContext9, deserializerFactory10, javaType11, beanDescription12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = deserializerCache0._createDeserializer2(deserializationContext7, deserializerFactory8, javaType9, beanDescription10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj9 = deserializerCache0.writeReplace();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext4, deserializerFactory5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.lang.Class<?> wildcardClass8 = deserializerCache0.getClass();
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._findCachedDeserializer(javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0.findValueDeserializer(deserializationContext6, deserializerFactory7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        int int10 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._cachedDeserializers;
        int int12 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = deserializerCache0.hasValueDeserializerFor(deserializationContext13, deserializerFactory14, javaType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0._createAndCache2(deserializationContext9, deserializerFactory10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj10 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext11, deserializerFactory12, javaType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._cachedDeserializers;
        java.lang.Class<?> wildcardClass12 = deserializerCache0.getClass();
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(javaTypeMap11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0._createAndCache2(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = deserializerCache0._createDeserializer(deserializationContext12, deserializerFactory13, javaType14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(javaTypeMap11);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = deserializerCache0.hasValueDeserializerFor(deserializationContext10, deserializerFactory11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = deserializerCache0.hasValueDeserializerFor(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer7 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._handleUnknownValueDeserializer(deserializationContext9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._createAndCache2(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj11 = deserializerCache0.writeReplace();
        java.lang.Object obj12 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer16 = deserializerCache0.findKeyDeserializer(deserializationContext13, deserializerFactory14, javaType15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0._findCachedDeserializer(javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext6, deserializerFactory7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj9 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = deserializerCache0._createAndCache2(deserializationContext10, deserializerFactory11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Class<?> wildcardClass6 = deserializerCache0.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        int int10 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = deserializerCache0._createAndCache2(deserializationContext11, deserializerFactory12, javaType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0._createDeserializer(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter10 = deserializerCache0.findConverter(deserializationContext8, annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer7 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0.findConvertingDeserializer(deserializationContext6, annotated7, objJsonDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter13 = deserializerCache0.findConverter(deserializationContext11, annotated12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        int int5 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0._createDeserializer(deserializationContext6, deserializerFactory7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        int int10 = deserializerCache0.cachedDeserializersCount();
        int int11 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = deserializerCache0.findValueDeserializer(deserializationContext13, deserializerFactory14, javaType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap12);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        int int11 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = deserializerCache0.hasValueDeserializerFor(deserializationContext12, deserializerFactory13, javaType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext10, annotated11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer7 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = deserializerCache0.hasValueDeserializerFor(deserializationContext4, deserializerFactory5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0.findConvertingDeserializer(deserializationContext6, annotated7, objJsonDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        int int11 = deserializerCache0.cachedDeserializersCount();
        int int12 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = deserializerCache0.findValueDeserializer(deserializationContext13, deserializerFactory14, javaType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = deserializerCache0.findValueDeserializer(deserializationContext2, deserializerFactory3, javaType4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        int int10 = deserializerCache0.cachedDeserializersCount();
        int int11 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap13 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer18 = deserializerCache0._createDeserializer2(deserializationContext14, deserializerFactory15, javaType16, beanDescription17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap12);
        org.junit.Assert.assertNotNull(javaTypeMap13);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext2, annotated3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter13 = deserializerCache0.findConverter(deserializationContext11, annotated12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        int int10 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._cachedDeserializers;
        int int12 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = deserializerCache0.findConvertingDeserializer(deserializationContext13, annotated14, objJsonDeserializer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }
}

